package kayiu.ingredientdrawer.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteDatabaseOpenHelper extends SQLiteOpenHelper{
	
	public SQLiteDatabaseOpenHelper(Context context) {
		super(context, SQLiteDatabaseSetting.DATABASE_NAME, 
				null, SQLiteDatabaseSetting.DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(SQLiteDatabaseSetting.CREATE_TABLE_BRANDS);
		db.execSQL(SQLiteDatabaseSetting.CREATE_TABLE_ITEMS);
		db.execSQL(SQLiteDatabaseSetting.CREATE_TABLE_PHOTOS);
		db.execSQL(SQLiteDatabaseSetting.CREATE_TABLE_ITEM_PHOTOS);
		db.execSQL(SQLiteDatabaseSetting.CREATE_TABLE_CATEGORIES);
		db.execSQL(SQLiteDatabaseSetting.CREATE_TABLE_CATEGORY_RELATIONSHIP);
		db.execSQL(SQLiteDatabaseSetting.CREATE_TABLE_CRITERIA);
		db.execSQL(SQLiteDatabaseSetting.CREATE_TABLE_CATEGORY_CRITERIA);
		db.execSQL(SQLiteDatabaseSetting.CREATE_TABLE_RATING);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}

}
