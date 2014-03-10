package kayiu.ingredientdrawer.framework.model;

public interface BrandModelInteface {
	Integer brandId = null;
	String brandName = null;
	
	abstract void setBrandId(Integer id);
	abstract Integer getBrandId();
	abstract void setBrandName(String name);
	abstract String getBrandString();
}
