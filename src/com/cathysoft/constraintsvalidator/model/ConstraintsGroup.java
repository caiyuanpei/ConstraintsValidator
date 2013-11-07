package com.cathysoft.constraintsvalidator.model;

import java.util.List;

/**
 * 
 * 
 * @author caiyp
 * @version 1.0
 *
 */
public class ConstraintsGroup implements ICvfNode {

	String groupName;
	
	List<IConstraint> constraints;
	
	void addConstraint(IConstraint constraint) {
		this.constraints.add(constraint);
	}
}
