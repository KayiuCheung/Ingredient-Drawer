package kayiu.ingredientdrawer.framework.model;

import java.util.List;

public interface ItemModelInterface {
	Integer itemId = null;
	String itemName = null;
	List<PhotoModelInteface> photoList = null;
	BrandModelInteface brand = null;
	String locationName = null;
	
	abstract void addItem(Integer itemId, String itemName, String locationName, 
			BrandModelInteface brand, List<PhotoModelInteface> photoList);
	abstract ItemModelInterface getItemById(Integer id);
	abstract void removeItem(Integer id);
}
