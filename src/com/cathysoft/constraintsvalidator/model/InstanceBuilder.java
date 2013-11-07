package com.cathysoft.constraintsvalidator.model;

import java.util.ArrayList;
import java.util.HashMap;

import com.cathysoft.constraintsvalidator.model.spi.ConstraintConflictsImpl;

public class InstanceBuilder {
	
	ConstraintsDefinitions definition = null;
	
	InstanceBuilder() {
		definition = new ConstraintsDefinitions();
		
		definition.requiredContext = new HashMap<Class<?>, String>();
		definition.constraintsGroups = new ArrayList<ConstraintsGroup>();
		definition.conflicts = new ConstraintConflictsImpl();
	}
	
	public static InstanceBuilder newInstance() {
		return new InstanceBuilder();
	}
	
	public void setName(String name) {
		this.definition.name = name;
	}
	
	public void addRequiredClass(Class<?> clazz, String instanceName) {
		this.definition.requiredContext.put(clazz, instanceName);
	}

	public ConstraintsGroup buildConstraintsGroup(String groupName) {
		ConstraintsGroup group = new ConstraintsGroup();
		group.groupName = groupName;
		group.constraints = new ArrayList<IConstraint>();
		return group;
	}
	
	public void addConstraintsGroup(ConstraintsGroup group) {
		this.definition.constraintsGroups.add(group);
	}
	
	public IConstraint buildAssertionConstraint(int id, IPath target, ILogicalExpression logicExpression) {
		AssertionConstraint assertion = new AssertionConstraint();
		assertion.id = id;
		assertion.target = target;
		assertion.expression = logicExpression;
		return assertion;
	}
	
	public IConstraint buildDerivationConstraint(int id, IPath target, ILogicalExpression condition, ILogicalExpression conclusion) {
		DerivationConstraint derivation = new DerivationConstraint();
		derivation.id = id;
		derivation.target = target;
		derivation.condition = condition;
		derivation.conclusion = conclusion;
		return derivation;
	}
	
	public void addConstraint(ConstraintsGroup group, IConstraint constraint) {
		group.addConstraint(constraint);
	}
	
	public ConstraintsDefinitions finishBuild() {
		return definition;
	}
}
