package kayiu.ingredientdrawer.database;

public class SQLiteDatabaseSetting {
	/**
	 * ===== Database Level ======== 
	 */
	static final int DATABASE_VERSION = 1;
	static final String DATABASE_NAME = "IngredientDrawer";
	
	/**
	 * ===== Tables Level ==========
	 */
	static final String TABLE_NAME_ITEMS = "Items";
	static final String TABLE_NAME_CATEGORIES = "Categories";
	static final String TABLE_NAME_CRITERIA = "Criteria";
	static final String TABLE_NAME_BRANDS = "Brands";
	static final String TABLE_NAME_PHOTOS = "Photos";
	static final String TABLE_NAME_ITEM_PHOTOS ="ItemPhotos";
	static final String TABLE_NAME_CATEGORY_RELATIONSHIP = "CategoryRelationship";
	static final String TABLE_NAME_CATEGORY_CRITERIA = "CategoryCriteria";
	static final String TABLE_NAME_RATING = "Rating";
	
	/**
	 * ====== Brand table ========
	 */
	static final String BRANDS_BRAND_ID = "brandId";
	static final String BRANDS_BRAND_NAME = "brandName";
	
	static final String CREATE_TABLE_BRANDS = " create table " + TABLE_NAME_BRANDS + " ( " 
			+ BRANDS_BRAND_ID + " integer primary key autoincrement, "
			+ BRANDS_BRAND_NAME + " text not null "
			+ ");";
	
	/**
	 * ===== Items table =========
	 */
	static final String ITEMS_ITEM_ID = "itemId";
	static final String ITEMS_ITEM_NAME = "itemName";
	static final String ITEMS_ITEM_LOCATION = "location";
	static final String ITEMS_ITEM_BRAND_ID = "brandId";
	
	
	static final String CREATE_TABLE_ITEMS = " create table " + TABLE_NAME_ITEMS + " ( " 
			+ ITEMS_ITEM_ID + " integer primary key autoincrement, "
			+ ITEMS_ITEM_NAME + " text not null, " 
			+ ITEMS_ITEM_LOCATION + " text, "
			+ ITEMS_ITEM_BRAND_ID + " integer references " +TABLE_NAME_BRANDS+ " ( " + BRANDS_BRAND_ID + " ) "
			+ ");";
	
	/**
	 * ====== Photo table ========
	 */
	static final String PHOTOS_PHOTO_ID = "photoId";
	static final String PHOTOS_PHOTO_PATH = "photoPath";

	static final String CREATE_TABLE_PHOTOS = " create table " + TABLE_NAME_PHOTOS + " ( " 
			+ PHOTOS_PHOTO_ID + " integer primary key autoincrement, "
			+ PHOTOS_PHOTO_PATH + " text not null "
			+ ");";
	
	/**
	 * ===== Item - Photo Table =========
	 */
	static final String ITEM_PHOTOS_ITEM_ID = "itemId";
	static final String ITEM_PHOTOS_PHOTO_ID = "photoId";
	
	static final String CREATE_TABLE_ITEM_PHOTOS = " create table " + TABLE_NAME_ITEM_PHOTOS + " ( " 
			+ ITEM_PHOTOS_ITEM_ID + " integer references " +TABLE_NAME_ITEMS+ " ( " + ITEMS_ITEM_ID + " ), "
			+ ITEM_PHOTOS_PHOTO_ID + " integer references " +TABLE_NAME_BRANDS+ " ( " + PHOTOS_PHOTO_ID + " ) "
			+ ");";
	
	/**
	 * ====== Categories Table ===========
	 */
	static final String CATEGORIES_CATEGORY_ID = "categoryId";
	static final String CATEGORIES_CATEGORY_NAME = "categoryName";
	
	static final String CREATE_TABLE_CATEGORIES = " create table " + TABLE_NAME_CATEGORIES + " ( " 
			+ CATEGORIES_CATEGORY_ID + " integer primary key autoincrement, "
			+ CATEGORIES_CATEGORY_NAME + " text not null "
			+ ");";
	
	/**
	 * ======= Category Relationship Table =========
	 */
	static final String CATEGORY_RELATIONSHIP_MAIN_CATEGORY_ID = "mainCategoryId";
	static final String CATEGORY_RELATIONSHIP_SUB_CATEGORY_ID = "subCategoryId";
	
	static final String CREATE_TABLE_CATEGORY_RELATIONSHIP = " create table " + TABLE_NAME_CATEGORY_RELATIONSHIP + " ( " 
			+ CATEGORY_RELATIONSHIP_MAIN_CATEGORY_ID + " integer references " +TABLE_NAME_CATEGORIES+ " ( " + CATEGORIES_CATEGORY_ID + " ), "
			+ CATEGORY_RELATIONSHIP_SUB_CATEGORY_ID + " integer references " +TABLE_NAME_CATEGORIES+ " ( " + CATEGORIES_CATEGORY_ID + " ) "
			+ ");";
	
	/**
	 * ======= Criteria Table ===========
	 */
	static final String CRITERIA_CRITERION_ID = "criterionId";
	static final String CRITERIA_CRITERION_NAME = "criterionName";
	
	static final String CREATE_TABLE_CRITERIA = " create table " + TABLE_NAME_CRITERIA + " ( " 
			+ CRITERIA_CRITERION_ID + " integer primary key autoincrement, "
			+ CRITERIA_CRITERION_NAME + " text not null "
			+ ");";
	
	/**
	 * ========= Category - Criteria Table ============
	 */
	static final String CATEGORY_CRITERIA_CRITERION_ID = "criterionId";
	static final String CATEGORY_CRITERIA_CATEGORY_ID = "categoryId";
	
	static final String CREATE_TABLE_CATEGORY_CRITERIA = " create table " + TABLE_NAME_CATEGORY_CRITERIA + " ( " 
			+ CATEGORY_CRITERIA_CRITERION_ID + " integer references " +TABLE_NAME_CRITERIA+ " ( " + CRITERIA_CRITERION_ID + " ), "
			+ CATEGORY_CRITERIA_CATEGORY_ID + " integer references " +TABLE_NAME_CATEGORIES+ " ( " + CATEGORIES_CATEGORY_ID + " ) "
			+ ");";
	
	/**
	 * ========= Rating (item - category) Table ==========
	 */
	static final String RATING_ITEM_ID = "itemId";
	static final String RATING_CRITERION_ID = "criterionId";
	static final String RATING_RATE = "rate";
	
	static final String CREATE_TABLE_RATING = " create table " + TABLE_NAME_RATING + " ( " 
			+ RATING_ITEM_ID + " integer primary key autoincrement, "
			+ RATING_CRITERION_ID + " integer references " +TABLE_NAME_CRITERIA+ " ( " + CRITERIA_CRITERION_ID + " ), "
			+ RATING_RATE + " integer not null "
			+ ");";
}
