package greendao;

import java.util.List;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.query.Query;
import org.greenrobot.greendao.query.QueryBuilder;

import com.wy.adbook.mvp.model.dao.BookChapterBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "BOOK_CHAPTER_BEAN".
*/
public class BookChapterBeanDao extends AbstractDao<BookChapterBean, String> {

    public static final String TABLENAME = "BOOK_CHAPTER_BEAN";

    /**
     * Properties of entity BookChapterBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property IsSelected = new Property(0, boolean.class, "isSelected", false, "IS_SELECTED");
        public final static Property Id = new Property(1, String.class, "id", true, "ID");
        public final static Property Bid = new Property(2, int.class, "bid", false, "BID");
        public final static Property Link = new Property(3, String.class, "link", false, "LINK");
        public final static Property Title = new Property(4, String.class, "title", false, "TITLE");
        public final static Property TaskName = new Property(5, String.class, "taskName", false, "TASK_NAME");
        public final static Property Unreadble = new Property(6, boolean.class, "unreadble", false, "UNREADBLE");
        public final static Property BookId = new Property(7, String.class, "bookId", false, "BOOK_ID");
        public final static Property Start = new Property(8, long.class, "start", false, "START");
        public final static Property End = new Property(9, long.class, "end", false, "END");
    }

    private Query<BookChapterBean> collBookBean_BookChapterListQuery;
    private Query<BookChapterBean> downloadTaskBean_BookChapterListQuery;

    public BookChapterBeanDao(DaoConfig config) {
        super(config);
    }
    
    public BookChapterBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BOOK_CHAPTER_BEAN\" (" + //
                "\"IS_SELECTED\" INTEGER NOT NULL ," + // 0: isSelected
                "\"ID\" TEXT PRIMARY KEY NOT NULL ," + // 1: id
                "\"BID\" INTEGER NOT NULL ," + // 2: bid
                "\"LINK\" TEXT," + // 3: link
                "\"TITLE\" TEXT," + // 4: title
                "\"TASK_NAME\" TEXT," + // 5: taskName
                "\"UNREADBLE\" INTEGER NOT NULL ," + // 6: unreadble
                "\"BOOK_ID\" TEXT," + // 7: bookId
                "\"START\" INTEGER NOT NULL ," + // 8: start
                "\"END\" INTEGER NOT NULL );"); // 9: end
        // Add Indexes
        db.execSQL("CREATE INDEX " + constraint + "IDX_BOOK_CHAPTER_BEAN_BOOK_ID ON \"BOOK_CHAPTER_BEAN\"" +
                " (\"BOOK_ID\" ASC);");
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BOOK_CHAPTER_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, BookChapterBean entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getIsSelected() ? 1L: 0L);
 
        String id = entity.getId();
        if (id != null) {
            stmt.bindString(2, id);
        }
        stmt.bindLong(3, entity.getBid());
 
        String link = entity.getLink();
        if (link != null) {
            stmt.bindString(4, link);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(5, title);
        }
 
        String taskName = entity.getTaskName();
        if (taskName != null) {
            stmt.bindString(6, taskName);
        }
        stmt.bindLong(7, entity.getUnreadble() ? 1L: 0L);
 
        String bookId = entity.getBookId();
        if (bookId != null) {
            stmt.bindString(8, bookId);
        }
        stmt.bindLong(9, entity.getStart());
        stmt.bindLong(10, entity.getEnd());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, BookChapterBean entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getIsSelected() ? 1L: 0L);
 
        String id = entity.getId();
        if (id != null) {
            stmt.bindString(2, id);
        }
        stmt.bindLong(3, entity.getBid());
 
        String link = entity.getLink();
        if (link != null) {
            stmt.bindString(4, link);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(5, title);
        }
 
        String taskName = entity.getTaskName();
        if (taskName != null) {
            stmt.bindString(6, taskName);
        }
        stmt.bindLong(7, entity.getUnreadble() ? 1L: 0L);
 
        String bookId = entity.getBookId();
        if (bookId != null) {
            stmt.bindString(8, bookId);
        }
        stmt.bindLong(9, entity.getStart());
        stmt.bindLong(10, entity.getEnd());
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1);
    }    

    @Override
    public BookChapterBean readEntity(Cursor cursor, int offset) {
        BookChapterBean entity = new BookChapterBean( //
            cursor.getShort(offset + 0) != 0, // isSelected
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // id
            cursor.getInt(offset + 2), // bid
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // link
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // title
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // taskName
            cursor.getShort(offset + 6) != 0, // unreadble
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // bookId
            cursor.getLong(offset + 8), // start
            cursor.getLong(offset + 9) // end
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, BookChapterBean entity, int offset) {
        entity.setIsSelected(cursor.getShort(offset + 0) != 0);
        entity.setId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setBid(cursor.getInt(offset + 2));
        entity.setLink(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setTitle(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setTaskName(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setUnreadble(cursor.getShort(offset + 6) != 0);
        entity.setBookId(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setStart(cursor.getLong(offset + 8));
        entity.setEnd(cursor.getLong(offset + 9));
     }
    
    @Override
    protected final String updateKeyAfterInsert(BookChapterBean entity, long rowId) {
        return entity.getId();
    }
    
    @Override
    public String getKey(BookChapterBean entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(BookChapterBean entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
    /** Internal query to resolve the "bookChapterList" to-many relationship of CollBookBean. */
    public List<BookChapterBean> _queryCollBookBean_BookChapterList(String bookId) {
        synchronized (this) {
            if (collBookBean_BookChapterListQuery == null) {
                QueryBuilder<BookChapterBean> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.BookId.eq(null));
                collBookBean_BookChapterListQuery = queryBuilder.build();
            }
        }
        Query<BookChapterBean> query = collBookBean_BookChapterListQuery.forCurrentThread();
        query.setParameter(0, bookId);
        return query.list();
    }

    /** Internal query to resolve the "bookChapterList" to-many relationship of DownloadTaskBean. */
    public List<BookChapterBean> _queryDownloadTaskBean_BookChapterList(String taskName) {
        synchronized (this) {
            if (downloadTaskBean_BookChapterListQuery == null) {
                QueryBuilder<BookChapterBean> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.TaskName.eq(null));
                downloadTaskBean_BookChapterListQuery = queryBuilder.build();
            }
        }
        Query<BookChapterBean> query = downloadTaskBean_BookChapterListQuery.forCurrentThread();
        query.setParameter(0, taskName);
        return query.list();
    }

}