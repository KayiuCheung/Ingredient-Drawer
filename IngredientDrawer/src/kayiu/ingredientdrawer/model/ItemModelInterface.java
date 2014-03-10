package kayiu.ingredientdrawer.model;

import java.util.List;

public interface ItemModelInterface {
	Integer itemId = null;
	String itemName = null;
	List<Integer> photoId = null;
	String locationName = null;
	
	abstract void setItemId(Integer id);
	abstract Integer getItemId();
	abstract void setItemName(String name);
	abstract String getItemName();
	abstract void setPhotoId(List<Integer> photoId);
	abstract List<PhotoModelInteface> getPhotoId();
	abstract void setLocationName(String name);
	abstract String getLocationName();
	
}
