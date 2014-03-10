package kayiu.ingredientdrawer.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteDatabaseOpenHelper extends SQLiteOpenHelper{
	
	public SQLiteDatabaseOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, SQLiteDatabaseSetting.DATABASE_NAME, 
				null, SQLiteDatabaseSetting.DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}

}
