package kayiu.ingredientdrawer.database;

import java.util.List;

import kayiu.ingredientdrawer.framework.model.BrandModelInteface;
import kayiu.ingredientdrawer.framework.model.ItemModelInterface;
import kayiu.ingredientdrawer.framework.model.PhotoModelInteface;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class SQLiteDatabaseFoundation implements ItemModelInterface{
	
	Context context;
	SQLiteDatabaseOpenHelper helper;

	public SQLiteDatabaseFoundation(Context context) {
		super();
		this.context = context;

		init();
	}
	
	private void init(){
		helper = new SQLiteDatabaseOpenHelper(context);
	}
	
	public void close(){
		helper.close();
	}

	@Override
	public void addItem(Integer itemId, String itemName, String locationName,
			BrandModelInteface brand, List<PhotoModelInteface> photoList) {
		
		// 
		
		// insert item
		helper.getWritableDatabase().insert(
				SQLiteDatabaseSetting.TABLE_NAME_ITEMS, null, new ContentValues());
	}

	@Override
	public ItemModelInterface getItemById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeItem(Integer id) {
		// TODO Auto-generated method stub
		
	}
}
