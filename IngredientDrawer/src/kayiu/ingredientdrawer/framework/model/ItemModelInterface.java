package kayiu.ingredientdrawer.framework.model;

import java.util.List;

public interface ItemModelInterface {
	Integer itemId = null;
	String itemName = null;
	List<PhotoModelInteface> photoList = null;
	BrandModelInteface brand = null;
	String locationName = null;
	
	abstract void setItemId(Integer id);
	abstract Integer getItemId();
	abstract void setItemName(String name);
	abstract String getItemName();
	abstract void setPhotoId(List<PhotoModelInteface> photoId);
	abstract List<PhotoModelInteface> getPhotoId();
	abstract void setLocationName(String name);
	abstract String getLocationName();
	abstract void setBrand(BrandModelInteface brand);
	abstract BrandModelInteface getBrand();
	
	
}
