package greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.wy.adbook.mvp.model.entity.book.bookread.BookDetailsBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "BOOK_DETAILS_BEAN".
*/
public class BookDetailsBeanDao extends AbstractDao<BookDetailsBean, String> {

    public static final String TABLENAME = "BOOK_DETAILS_BEAN";

    /**
     * Properties of entity BookDetailsBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Allwords = new Property(0, String.class, "allwords", false, "ALLWORDS");
        public final static Property Amount = new Property(1, String.class, "amount", false, "AMOUNT");
        public final static Property AuthorName = new Property(2, String.class, "authorName", false, "AUTHOR_NAME");
        public final static Property BuyStatus = new Property(3, String.class, "buyStatus", false, "BUY_STATUS");
        public final static Property CBID = new Property(4, String.class, "cBID", true, "C_BID");
        public final static Property Categoryid = new Property(5, String.class, "categoryid", false, "CATEGORYID");
        public final static Property CoverUrl = new Property(6, String.class, "coverUrl", false, "COVER_URL");
        public final static Property FreeOrSpecial = new Property(7, String.class, "freeOrSpecial", false, "FREE_OR_SPECIAL");
        public final static Property FreeStatus = new Property(8, String.class, "freeStatus", false, "FREE_STATUS");
        public final static Property Intro = new Property(9, String.class, "intro", false, "INTRO");
        public final static Property LastReadChapterId = new Property(10, String.class, "lastReadChapterId", false, "LAST_READ_CHAPTER_ID");
        public final static Property OnShelf = new Property(11, String.class, "onShelf", false, "ON_SHELF");
        public final static Property ReadCount = new Property(12, String.class, "readCount", false, "READ_COUNT");
        public final static Property ReadWords = new Property(13, String.class, "readWords", false, "READ_WORDS");
        public final static Property Status = new Property(14, int.class, "status", false, "STATUS");
        public final static Property Title = new Property(15, String.class, "title", false, "TITLE");
        public final static Property Updatetime = new Property(16, String.class, "updatetime", false, "UPDATETIME");
        public final static Property IsReadCard = new Property(17, String.class, "isReadCard", false, "IS_READ_CARD");
        public final static Property LastUpdateTime = new Property(18, String.class, "lastUpdateTime", false, "LAST_UPDATE_TIME");
        public final static Property ChapterCount = new Property(19, int.class, "chapterCount", false, "CHAPTER_COUNT");
        public final static Property WappageData = new Property(20, String.class, "wappageData", false, "WAPPAGE_DATA");
    }


    public BookDetailsBeanDao(DaoConfig config) {
        super(config);
    }
    
    public BookDetailsBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BOOK_DETAILS_BEAN\" (" + //
                "\"ALLWORDS\" TEXT," + // 0: allwords
                "\"AMOUNT\" TEXT," + // 1: amount
                "\"AUTHOR_NAME\" TEXT," + // 2: authorName
                "\"BUY_STATUS\" TEXT," + // 3: buyStatus
                "\"C_BID\" TEXT PRIMARY KEY NOT NULL ," + // 4: cBID
                "\"CATEGORYID\" TEXT," + // 5: categoryid
                "\"COVER_URL\" TEXT," + // 6: coverUrl
                "\"FREE_OR_SPECIAL\" TEXT," + // 7: freeOrSpecial
                "\"FREE_STATUS\" TEXT," + // 8: freeStatus
                "\"INTRO\" TEXT," + // 9: intro
                "\"LAST_READ_CHAPTER_ID\" TEXT," + // 10: lastReadChapterId
                "\"ON_SHELF\" TEXT," + // 11: onShelf
                "\"READ_COUNT\" TEXT," + // 12: readCount
                "\"READ_WORDS\" TEXT," + // 13: readWords
                "\"STATUS\" INTEGER NOT NULL ," + // 14: status
                "\"TITLE\" TEXT," + // 15: title
                "\"UPDATETIME\" TEXT," + // 16: updatetime
                "\"IS_READ_CARD\" TEXT," + // 17: isReadCard
                "\"LAST_UPDATE_TIME\" TEXT," + // 18: lastUpdateTime
                "\"CHAPTER_COUNT\" INTEGER NOT NULL ," + // 19: chapterCount
                "\"WAPPAGE_DATA\" TEXT);"); // 20: wappageData
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BOOK_DETAILS_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, BookDetailsBean entity) {
        stmt.clearBindings();
 
        String allwords = entity.getAllwords();
        if (allwords != null) {
            stmt.bindString(1, allwords);
        }
 
        String amount = entity.getAmount();
        if (amount != null) {
            stmt.bindString(2, amount);
        }
 
        String authorName = entity.getAuthorName();
        if (authorName != null) {
            stmt.bindString(3, authorName);
        }
 
        String buyStatus = entity.getBuyStatus();
        if (buyStatus != null) {
            stmt.bindString(4, buyStatus);
        }
 
        String cBID = entity.getCBID();
        if (cBID != null) {
            stmt.bindString(5, cBID);
        }
 
        String categoryid = entity.getCategoryid();
        if (categoryid != null) {
            stmt.bindString(6, categoryid);
        }
 
        String coverUrl = entity.getCoverUrl();
        if (coverUrl != null) {
            stmt.bindString(7, coverUrl);
        }
 
        String freeOrSpecial = entity.getFreeOrSpecial();
        if (freeOrSpecial != null) {
            stmt.bindString(8, freeOrSpecial);
        }
 
        String freeStatus = entity.getFreeStatus();
        if (freeStatus != null) {
            stmt.bindString(9, freeStatus);
        }
 
        String intro = entity.getIntro();
        if (intro != null) {
            stmt.bindString(10, intro);
        }
 
        String lastReadChapterId = entity.getLastReadChapterId();
        if (lastReadChapterId != null) {
            stmt.bindString(11, lastReadChapterId);
        }
 
        String onShelf = entity.getOnShelf();
        if (onShelf != null) {
            stmt.bindString(12, onShelf);
        }
 
        String readCount = entity.getReadCount();
        if (readCount != null) {
            stmt.bindString(13, readCount);
        }
 
        String readWords = entity.getReadWords();
        if (readWords != null) {
            stmt.bindString(14, readWords);
        }
        stmt.bindLong(15, entity.getStatus());
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(16, title);
        }
 
        String updatetime = entity.getUpdatetime();
        if (updatetime != null) {
            stmt.bindString(17, updatetime);
        }
 
        String isReadCard = entity.getIsReadCard();
        if (isReadCard != null) {
            stmt.bindString(18, isReadCard);
        }
 
        String lastUpdateTime = entity.getLastUpdateTime();
        if (lastUpdateTime != null) {
            stmt.bindString(19, lastUpdateTime);
        }
        stmt.bindLong(20, entity.getChapterCount());
 
        String wappageData = entity.getWappageData();
        if (wappageData != null) {
            stmt.bindString(21, wappageData);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, BookDetailsBean entity) {
        stmt.clearBindings();
 
        String allwords = entity.getAllwords();
        if (allwords != null) {
            stmt.bindString(1, allwords);
        }
 
        String amount = entity.getAmount();
        if (amount != null) {
            stmt.bindString(2, amount);
        }
 
        String authorName = entity.getAuthorName();
        if (authorName != null) {
            stmt.bindString(3, authorName);
        }
 
        String buyStatus = entity.getBuyStatus();
        if (buyStatus != null) {
            stmt.bindString(4, buyStatus);
        }
 
        String cBID = entity.getCBID();
        if (cBID != null) {
            stmt.bindString(5, cBID);
        }
 
        String categoryid = entity.getCategoryid();
        if (categoryid != null) {
            stmt.bindString(6, categoryid);
        }
 
        String coverUrl = entity.getCoverUrl();
        if (coverUrl != null) {
            stmt.bindString(7, coverUrl);
        }
 
        String freeOrSpecial = entity.getFreeOrSpecial();
        if (freeOrSpecial != null) {
            stmt.bindString(8, freeOrSpecial);
        }
 
        String freeStatus = entity.getFreeStatus();
        if (freeStatus != null) {
            stmt.bindString(9, freeStatus);
        }
 
        String intro = entity.getIntro();
        if (intro != null) {
            stmt.bindString(10, intro);
        }
 
        String lastReadChapterId = entity.getLastReadChapterId();
        if (lastReadChapterId != null) {
            stmt.bindString(11, lastReadChapterId);
        }
 
        String onShelf = entity.getOnShelf();
        if (onShelf != null) {
            stmt.bindString(12, onShelf);
        }
 
        String readCount = entity.getReadCount();
        if (readCount != null) {
            stmt.bindString(13, readCount);
        }
 
        String readWords = entity.getReadWords();
        if (readWords != null) {
            stmt.bindString(14, readWords);
        }
        stmt.bindLong(15, entity.getStatus());
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(16, title);
        }
 
        String updatetime = entity.getUpdatetime();
        if (updatetime != null) {
            stmt.bindString(17, updatetime);
        }
 
        String isReadCard = entity.getIsReadCard();
        if (isReadCard != null) {
            stmt.bindString(18, isReadCard);
        }
 
        String lastUpdateTime = entity.getLastUpdateTime();
        if (lastUpdateTime != null) {
            stmt.bindString(19, lastUpdateTime);
        }
        stmt.bindLong(20, entity.getChapterCount());
 
        String wappageData = entity.getWappageData();
        if (wappageData != null) {
            stmt.bindString(21, wappageData);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4);
    }    

    @Override
    public BookDetailsBean readEntity(Cursor cursor, int offset) {
        BookDetailsBean entity = new BookDetailsBean( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // allwords
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // amount
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // authorName
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // buyStatus
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // cBID
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // categoryid
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // coverUrl
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // freeOrSpecial
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // freeStatus
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // intro
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // lastReadChapterId
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // onShelf
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // readCount
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // readWords
            cursor.getInt(offset + 14), // status
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // title
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // updatetime
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // isReadCard
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // lastUpdateTime
            cursor.getInt(offset + 19), // chapterCount
            cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20) // wappageData
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, BookDetailsBean entity, int offset) {
        entity.setAllwords(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setAmount(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setAuthorName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setBuyStatus(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setCBID(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setCategoryid(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setCoverUrl(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setFreeOrSpecial(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setFreeStatus(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setIntro(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setLastReadChapterId(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setOnShelf(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setReadCount(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setReadWords(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setStatus(cursor.getInt(offset + 14));
        entity.setTitle(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setUpdatetime(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setIsReadCard(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setLastUpdateTime(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setChapterCount(cursor.getInt(offset + 19));
        entity.setWappageData(cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20));
     }
    
    @Override
    protected final String updateKeyAfterInsert(BookDetailsBean entity, long rowId) {
        return entity.getCBID();
    }
    
    @Override
    public String getKey(BookDetailsBean entity) {
        if(entity != null) {
            return entity.getCBID();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(BookDetailsBean entity) {
        return entity.getCBID() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}