package kayiu.ingredientdrawer.model;

import java.util.List;

public interface CatagoryModelInterface {
	Integer catagoryId = null;
	String catagoryName = null;
	List<CriteriaModelInterface> criteriaList = null;
	
	abstract void setCatagoryId(Integer id);
	abstract Integer getCatagoryId();
	abstract void setCatagoryName(String name);
	abstract String getCatagoryName();
	abstract void setCriteriaList(List<CriteriaModelInterface> criteriaList);
	abstract List<CriteriaModelInterface> getCriteriaList();
}
