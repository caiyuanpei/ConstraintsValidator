package com.cathysoft.constraintsvalidator.model;


public class DerivationConstraint implements IConstraint {

	DerivationConstraint() {
	}
	
	int id;
	
	IPath target;
	
	ILogicalExpression condition;
	
	ILogicalExpression conclusion;
	
	@Override
	public boolean isValidate(IExecutionContext context) {
		return condition.execute(context)?conclusion.execute(context):true;
	}

}
