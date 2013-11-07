package com.cathysoft.constraintsvalidator.model;


public interface IConstraintConflicts extends Iterable<IConstraintConflict>{

	public long count();

	public void addConflict(IConstraintConflict conflict);
	
	public void clear();
}
