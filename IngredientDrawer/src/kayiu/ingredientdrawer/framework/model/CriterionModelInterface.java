package kayiu.ingredientdrawer.framework.model;

public interface CriterionModelInterface {
	Integer criterionId = null;
	String criterionName = null;
	
	abstract void setCriterionId(Integer id);
	abstract Integer getCriterionId();
	abstract void setCriterionName(String name);
	abstract String getCriterionName();
}
