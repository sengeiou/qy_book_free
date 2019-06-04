package greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.wy.adbook.mvp.model.entity.Account;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "ACCOUNT".
*/
public class AccountDao extends AbstractDao<Account, Long> {

    public static final String TABLENAME = "ACCOUNT";

    /**
     * Properties of entity Account.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, long.class, "id", true, "_id");
        public final static Property IsCurrent = new Property(1, boolean.class, "isCurrent", false, "IS_CURRENT");
        public final static Property MobilePhone = new Property(2, String.class, "mobilePhone", false, "MOBILE_PHONE");
        public final static Property Gender = new Property(3, int.class, "gender", false, "GENDER");
        public final static Property GoldBean = new Property(4, int.class, "goldBean", false, "GOLD_BEAN");
        public final static Property Cash = new Property(5, int.class, "cash", false, "CASH");
        public final static Property TodayReadMinute = new Property(6, int.class, "todayReadMinute", false, "TODAY_READ_MINUTE");
        public final static Property UserName = new Property(7, int.class, "userName", false, "USER_NAME");
    }


    public AccountDao(DaoConfig config) {
        super(config);
    }
    
    public AccountDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"ACCOUNT\" (" + //
                "\"_id\" INTEGER PRIMARY KEY NOT NULL ," + // 0: id
                "\"IS_CURRENT\" INTEGER NOT NULL ," + // 1: isCurrent
                "\"MOBILE_PHONE\" TEXT," + // 2: mobilePhone
                "\"GENDER\" INTEGER NOT NULL ," + // 3: gender
                "\"GOLD_BEAN\" INTEGER NOT NULL ," + // 4: goldBean
                "\"CASH\" INTEGER NOT NULL ," + // 5: cash
                "\"TODAY_READ_MINUTE\" INTEGER NOT NULL ," + // 6: todayReadMinute
                "\"USER_NAME\" INTEGER NOT NULL );"); // 7: userName
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"ACCOUNT\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Account entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
        stmt.bindLong(2, entity.getIsCurrent() ? 1L: 0L);
 
        String mobilePhone = entity.getMobilePhone();
        if (mobilePhone != null) {
            stmt.bindString(3, mobilePhone);
        }
        stmt.bindLong(4, entity.getGender());
        stmt.bindLong(5, entity.getGoldBean());
        stmt.bindLong(6, entity.getCash());
        stmt.bindLong(7, entity.getTodayReadMinute());
        stmt.bindLong(8, entity.getUserName());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Account entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
        stmt.bindLong(2, entity.getIsCurrent() ? 1L: 0L);
 
        String mobilePhone = entity.getMobilePhone();
        if (mobilePhone != null) {
            stmt.bindString(3, mobilePhone);
        }
        stmt.bindLong(4, entity.getGender());
        stmt.bindLong(5, entity.getGoldBean());
        stmt.bindLong(6, entity.getCash());
        stmt.bindLong(7, entity.getTodayReadMinute());
        stmt.bindLong(8, entity.getUserName());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 0);
    }    

    @Override
    public Account readEntity(Cursor cursor, int offset) {
        Account entity = new Account( //
            cursor.getLong(offset + 0), // id
            cursor.getShort(offset + 1) != 0, // isCurrent
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // mobilePhone
            cursor.getInt(offset + 3), // gender
            cursor.getInt(offset + 4), // goldBean
            cursor.getInt(offset + 5), // cash
            cursor.getInt(offset + 6), // todayReadMinute
            cursor.getInt(offset + 7) // userName
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Account entity, int offset) {
        entity.setId(cursor.getLong(offset + 0));
        entity.setIsCurrent(cursor.getShort(offset + 1) != 0);
        entity.setMobilePhone(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setGender(cursor.getInt(offset + 3));
        entity.setGoldBean(cursor.getInt(offset + 4));
        entity.setCash(cursor.getInt(offset + 5));
        entity.setTodayReadMinute(cursor.getInt(offset + 6));
        entity.setUserName(cursor.getInt(offset + 7));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Account entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Account entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Account entity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}