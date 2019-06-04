package greendao.helper;

/**
 * 作者：李学伟
 * 日期：2018/7/20
 * 用途：
 */

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Log;
import me.jessyan.autosize.utils.LogUtils;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.StandardDatabase;
import org.greenrobot.greendao.internal.DaoConfig;

import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class MigrationHelper {

    private static String TAG = MigrationHelper.class.getSimpleName();
    private static final String SQLITE_MASTER = "sqlite_master";
    private static final String SQLITE_TEMP_MASTER = "sqlite_temp_master";
    private static WeakReference<ReCreateAllTableListener> weakListener;

    public MigrationHelper() {
    }

    public static void migrate(SQLiteDatabase db, Class... daoClasses) {
        printLog("【The Old Database Version】" + db.getVersion());
        StandardDatabase database = new StandardDatabase(db);
        migrate((Database) database, daoClasses);
    }

    public static void migrate(SQLiteDatabase db, MigrationHelper.ReCreateAllTableListener listener, Class... daoClasses) {
        weakListener = new WeakReference(listener);
        migrate(db, daoClasses);
    }

    public static void migrate(Database database, MigrationHelper.ReCreateAllTableListener listener, Class... daoClasses) {
        weakListener = new WeakReference(listener);
        migrate(database, daoClasses);
    }

    public static void migrate(Database database, Class... daoClasses) {
        printLog("【Generate temp table】start");
        generateTempTables(database, daoClasses);
        printLog("【Generate temp table】complete");
        MigrationHelper.ReCreateAllTableListener listener = null;
        if (weakListener != null) {
            listener = (MigrationHelper.ReCreateAllTableListener) weakListener.get();
        }

        if (listener != null) {
            listener.onDropAllTables(database, true);
            printLog("【Drop all table by listener】");
            listener.onCreateAllTables(database, false);
            printLog("【Create all table by listener】");
        } else {
            dropAllTables(database, true, daoClasses);
            createAllTables(database, false, daoClasses);
        }

        printLog("【Restore data】start");
        restoreData(database, daoClasses);
        printLog("【Restore data】complete");
    }

    private static void generateTempTables(Database db, Class... daoClasses) {
        for (int i = 0; i < daoClasses.length; ++i) {

            String tempTableName = null;
            try {
                DaoConfig daoConfig = new DaoConfig(db, daoClasses[i]);
                String tableName = daoConfig.tablename;
                if (!isTableExists(db, false, tableName)) {
                    printLog("【New Table】" + tableName);
                } else {

                    tempTableName = daoConfig.tablename.concat("_TEMP");
                    StringBuilder e = new StringBuilder();
                    e.append("DROP TABLE IF EXISTS ").append(tempTableName).append(";");
                    db.execSQL(e.toString());
                    StringBuilder insertTableStringBuilder = new StringBuilder();
                    insertTableStringBuilder.append("CREATE TEMPORARY TABLE ").append(tempTableName);
                    insertTableStringBuilder.append(" AS SELECT * FROM ").append(tableName).append(";");
                    db.execSQL(insertTableStringBuilder.toString());
                    printLog("【Table】" + tableName + "\n ---Columns-->" + getColumnsStr(daoConfig));
                    printLog("【Generate temp table】" + tempTableName);

                }
            } catch (Exception e) {
                LogUtils.e("【Failed to generate temp table】" + tempTableName);
            }
        }

    }

    private static boolean isTableExists(Database db, boolean isTemp, String tableName) {
        if (db != null && !TextUtils.isEmpty(tableName)) {
            String dbName = isTemp ? "sqlite_temp_master" : "sqlite_master";
            String sql = "SELECT COUNT(*) FROM " + dbName + " WHERE type = ? AND name = ?";
            Cursor cursor = null;
            int count = 0;

            try {
                cursor = db.rawQuery(sql, new String[]{"table", tableName});
                if (cursor == null || !cursor.moveToFirst()) {
                    boolean e = false;
                    return e;
                }

                count = cursor.getInt(0);
            } catch (Exception var11) {
                var11.printStackTrace();
            } finally {
                if (cursor != null) {
                    cursor.close();
                }

            }

            return count > 0;
        } else {
            return false;
        }
    }

    private static String getColumnsStr(DaoConfig daoConfig) {
        if (daoConfig == null) {
            return "no columns";
        } else {
            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < daoConfig.allColumns.length; ++i) {
                builder.append(daoConfig.allColumns[i]);
                builder.append(",");
            }

            if (builder.length() > 0) {
                builder.deleteCharAt(builder.length() - 1);
            }

            return builder.toString();
        }
    }

    private static void dropAllTables(Database db, boolean ifExists, @NonNull Class... daoClasses) {
        reflectMethod(db, "dropTable", ifExists, daoClasses);
        printLog("【Drop all table by reflect】");
    }

    private static void createAllTables(Database db, boolean ifNotExists, @NonNull Class... daoClasses) {
        reflectMethod(db, "createTable", ifNotExists, daoClasses);
        printLog("【Create all table by reflect】");
    }

    private static void reflectMethod(Database db, String methodName, boolean isExists, @NonNull Class... daoClasses) {
        if (daoClasses.length >= 1) {
            try {
                Class[] e = daoClasses;
                int var5 = daoClasses.length;

                for (int var6 = 0; var6 < var5; ++var6) {
                    Class cls = e[var6];
                    Method method = cls.getDeclaredMethod(methodName, new Class[]{Database.class, Boolean.TYPE});
                    method.invoke((Object) null, new Object[]{db, Boolean.valueOf(isExists)});
                }
            } catch (NoSuchMethodException var9) {
                var9.printStackTrace();
            } catch (InvocationTargetException var10) {
                var10.printStackTrace();
            } catch (IllegalAccessException var11) {
                var11.printStackTrace();
            }

        }
    }

    private static void restoreData(Database db, Class... daoClasses) {
        for (int i = 0; i < daoClasses.length; ++i) {
            String tempTableName = null;
            try {
                DaoConfig daoConfig = new DaoConfig(db, daoClasses[i]);
                String tableName = daoConfig.tablename;
                tempTableName = daoConfig.tablename.concat("_TEMP");
                if (isTableExists(db, true, tempTableName)) {

                    List e = MigrationHelper.TableInfo.getTableInfo(db, tableName);
                    List tempTableInfos = MigrationHelper.TableInfo.getTableInfo(db, tempTableName);
                    ArrayList selectColumns = new ArrayList(e.size());
                    ArrayList intoColumns = new ArrayList(e.size());
                    Iterator dropTableStringBuilder = tempTableInfos.iterator();

                    MigrationHelper.TableInfo tableInfo;
                    String column;
                    while (dropTableStringBuilder.hasNext()) {
                        tableInfo = (MigrationHelper.TableInfo) dropTableStringBuilder.next();
                        if (e.contains(tableInfo)) {
                            column = '`' + tableInfo.name + '`';
                            intoColumns.add(column);
                            selectColumns.add(column);
                        }
                    }

                    dropTableStringBuilder = e.iterator();

                    while (dropTableStringBuilder.hasNext()) {
                        tableInfo = (MigrationHelper.TableInfo) dropTableStringBuilder.next();
                        if (tableInfo.notnull && !tempTableInfos.contains(tableInfo)) {
                            column = '`' + tableInfo.name + '`';
                            intoColumns.add(column);
                            String value;
                            if (tableInfo.dfltValue != null) {
                                value = "\'" + tableInfo.dfltValue + "\' AS ";
                            } else {
                                value = "\'\' AS ";
                            }

                            selectColumns.add(value + column);
                        }
                    }

                    StringBuilder var15;
                    if (intoColumns.size() != 0) {
                        var15 = new StringBuilder();
                        var15.append("REPLACE INTO ").append(tableName).append(" (");
                        var15.append(TextUtils.join(",", intoColumns));
                        var15.append(") SELECT ");
                        var15.append(TextUtils.join(",", selectColumns));
                        var15.append(" FROM ").append(tempTableName).append(";");
                        db.execSQL(var15.toString());
                        printLog("【Restore data】 to " + tableName);
                    }

                    var15 = new StringBuilder();
                    var15.append("DROP TABLE ").append(tempTableName);
                    db.execSQL(var15.toString());
                    printLog("【Drop temp table】" + tempTableName);

                }
            } catch (Exception var14) {
                Log.e(TAG, "【Failed to restore data from temp table 】" + tempTableName, var14);
            }
        }

    }

    private static List<String> getColumns(Database db, String tableName) {
        Object columns = null;
        Cursor cursor = null;

        try {
            cursor = db.rawQuery("SELECT * FROM " + tableName + " limit 0", (String[]) null);
            if (null != cursor && cursor.getColumnCount() > 0) {
                columns = Arrays.asList(cursor.getColumnNames());
            }
        } catch (Exception var8) {
            var8.printStackTrace();
        } finally {
            if (cursor != null) {
                cursor.close();
            }

            if (null == columns) {
                columns = new ArrayList();
            }

        }

        return (List) columns;
    }

    private static void printLog(String info) {
        LogUtils.e(info);
    }

    private static class TableInfo {
        int cid;
        String name;
        String type;
        boolean notnull;
        String dfltValue;
        boolean pk;

        private TableInfo() {
        }

        public boolean equals(Object o) {
            return this == o || o != null && this.getClass() == o.getClass() && this.name.equals(((MigrationHelper.TableInfo) o).name);
        }

        public String toString() {
            return "TableInfo{cid=" + this.cid + ", name=\'" + this.name + '\'' + ", type=\'" + this.type + '\'' + ", notnull=" + this.notnull + ", dfltValue=\'" + this.dfltValue + '\'' + ", pk=" + this.pk + '}';
        }

        private static List<TableInfo> getTableInfo(Database db, String tableName) {
            String sql = "PRAGMA table_info(" + tableName + ")";
            MigrationHelper.printLog(sql);
            Cursor cursor = db.rawQuery(sql, (String[]) null);
            if (cursor == null) {
                return new ArrayList();
            } else {
                ArrayList tableInfos = new ArrayList();

                while (cursor.moveToNext()) {
                    MigrationHelper.TableInfo tableInfo = new MigrationHelper.TableInfo();
                    tableInfo.cid = cursor.getInt(0);
                    tableInfo.name = cursor.getString(1);
                    tableInfo.type = cursor.getString(2);
                    tableInfo.notnull = cursor.getInt(3) == 1;
                    tableInfo.dfltValue = cursor.getString(4);
                    tableInfo.pk = cursor.getInt(5) == 1;
                    tableInfos.add(tableInfo);
                }

                cursor.close();
                return tableInfos;
            }
        }
    }

    public interface ReCreateAllTableListener {
        void onCreateAllTables(Database var1, boolean var2);

        void onDropAllTables(Database var1, boolean var2);
    }
}
