package com.cathysoft.constraintsvalidator.model;

public interface IPath {

	public String getInstanceName();
	
	public String getFieldName();
	
	public Object executeValue(IExecutionContext context);
	
}
