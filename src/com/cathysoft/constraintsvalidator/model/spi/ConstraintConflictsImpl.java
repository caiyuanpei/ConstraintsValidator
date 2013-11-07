package com.cathysoft.constraintsvalidator.model.spi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.cathysoft.constraintsvalidator.model.IConstraintConflict;
import com.cathysoft.constraintsvalidator.model.IConstraintConflicts;

public class ConstraintConflictsImpl implements IConstraintConflicts{

	List<IConstraintConflict> conflicts = new ArrayList<IConstraintConflict>();
	
	@Override
	public Iterator<IConstraintConflict> iterator() {
		return conflicts.iterator();
	}

	@Override
	public long count() {
		return conflicts.size();
	}

	@Override
	public void addConflict(IConstraintConflict conflict) {
		this.conflicts.add(conflict);
	}

	@Override
	public void clear() {
		this.conflicts.clear();
	}

}
