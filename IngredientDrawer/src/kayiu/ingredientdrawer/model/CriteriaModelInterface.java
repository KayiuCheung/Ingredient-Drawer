package kayiu.ingredientdrawer.model;

public interface CriteriaModelInterface {
	Integer criteriaId = null;
	String criteriaName = null;
	
	abstract void setCriteriaId(Integer id);
	abstract Integer getCriteriaId();
	abstract void setCriteriaName(String name);
	abstract String getCriteriaString();
}
