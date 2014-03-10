package kayiu.ingredientdrawer.framework.model;

public interface PhotoModelInteface {
	Integer photoId = null;
	String photoPath = null;
	
	abstract void setPhotoId(Integer id);
	abstract Integer getPhotoId();
	abstract void getPhotoPath(String path);
	abstract String getPhotoPath();
}
