package DB;

import android.database.sqlite.SQLiteOpenHelper;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;


/**
 * Created by Lenovo on 12/17/2016.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "score_count.db";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_Easy = "scoreEasy";
    public static final String COL_IDEasy = "_id";
    public static final String COL_scoreE = "scoreE";

   /* public static final String TABLE_Hard = "scoreHard";
    public static final String COL_IDHard = "_idHard";
    public static final String COL_scoreH = "scoreH";

    public static final String TABLE_VeryHard = "scoreVeryHard";
    public static final String COL_IDVeryHard = "_idVeryHard";
    public static final String COL_scoreVH = "scoreVH";*/

    private static final String SQL_CRATE_TABLEEasy =
            "CREATE TABLE " + TABLE_Easy + "("
                    + COL_IDEasy+ " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + COL_scoreE + " INTEGER, "
                    + ")";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CRATE_TABLEEasy);
        insertInitialData(db);
    }

    private void insertInitialData(SQLiteDatabase db) {

//      ContentValues cv = new ContentValues();

//        cv.put(COL_scoreE, "ข้าวผัด");
//
//        db.insert(TABLE_Easy, null, cv);
//
//        cv = new ContentValues();
//        cv.put(COL_NAME, "ข้าวไข่เจียว");
//        cv.put(COL_PICTURE, "kao_kai_jeaw.jpg");
//        db.insert(TABLE_NAME, null, cv);
//
//        cv = new ContentValues();
//        cv.put(COL_NAME, "ข้าวหน้าเป็ด");
//        cv.put(COL_PICTURE, "kao_na_ped.jpg");
//        db.insert(TABLE_NAME, null, cv);
//
//        cv = new ContentValues();
//        cv.put(COL_NAME, "ข้าวมันไก่");
//        cv.put(COL_PICTURE, "kao_mun_kai.jpg");
//        db.insert(TABLE_NAME, null, cv);
//
//        cv = new ContentValues();
//        cv.put(COL_NAME, "ข้าวหมูแดง");
//        cv.put(COL_PICTURE, "kao_moo_dang.jpg");
//        db.insert(TABLE_NAME, null, cv);
//
//        cv = new ContentValues();
//        cv.put(COL_NAME, "ราดหน้า");
//        cv.put(COL_PICTURE, "rad_na.jpg");
//        db.insert(TABLE_NAME, null, cv);
//
//        cv = new ContentValues();
//        cv.put(COL_NAME, "ผัดซีอิ๊ว");
//        cv.put(COL_PICTURE, "pad_sie_eew.jpg");
//        db.insert(TABLE_NAME, null, cv);
//
//        cv = new ContentValues();
//        cv.put(COL_NAME, "ผัดไทย");
//        cv.put(COL_PICTURE, "pad_thai.jpg");
//        db.insert(TABLE_NAME, null, cv);
//
//        cv = new ContentValues();
//        cv.put(COL_NAME, "ส้มตำไก่ย่าง");
//        cv.put(COL_PICTURE, "som_tum_kai_yang.jpg");
//        db.insert(TABLE_NAME, null, cv);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
}


