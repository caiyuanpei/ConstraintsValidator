package com.cathysoft.constraintsvalidator.model;

public interface IConstraintConflict {

	public IPath getSource();
	
	public IPath getTarget();
	
	public String getDefaultConflictMessage();
	
	public String getConflictCode();
	
}
