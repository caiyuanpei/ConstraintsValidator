package com.cathysoft.constraintsvalidator.model;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * 
 * @author caiyp
 * @version 1.0
 *
 */
public class ConstraintsDefinitions implements ICvfNode {

	boolean valid = false;
	boolean continued = true;
	
	String name;
	
	Map<Class<?>, String> requiredContext;
	
	List<ConstraintsGroup> constraintsGroups;
	
	IConstraintConflicts conflicts;
	
	ConstraintsDefinitions() {
		
	}
	
	public void reset() {
		valid = true;
		continued = true;
		conflicts.clear();
	}
	
	public synchronized void validate(IExecutionContext context) {
		
		
	}
	
	private synchronized boolean checkRequiredContext(IExecutionContext context) {
		
		
		
		return false;
	}
}
