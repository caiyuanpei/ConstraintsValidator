package com.cathysoft.constraintsvalidator.model;

public class AssertionConstraint implements IConstraint {

	AssertionConstraint() {
	}
	
	int id;
	
	IPath target;
	
	ILogicalExpression expression;
	
	@Override
	public boolean isValidate(IExecutionContext context) {
		return expression.execute(context);
	}

}
