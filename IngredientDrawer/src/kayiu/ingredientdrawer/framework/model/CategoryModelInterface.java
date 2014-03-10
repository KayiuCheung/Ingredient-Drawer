package kayiu.ingredientdrawer.framework.model;

import java.util.List;

public interface CategoryModelInterface {
	Integer categoryId = null;
	String categoryName = null;
	List<CriterionModelInterface> criteriaList = null;
	
	abstract void setCategoryId(Integer id);
	abstract Integer getCategoryId();
	abstract void setCategoryName(String name);
	abstract String getCategoryName();
	abstract void setCriteriaList(List<CriterionModelInterface> criteriaList);
	abstract List<CriterionModelInterface> getCriteriaList();
}
