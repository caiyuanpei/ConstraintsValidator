package com.cathysoft.constraintsvalidator.model.spi;

import java.util.HashMap;
import java.util.Map;

import com.cathysoft.constraintsvalidator.model.IExecutionContext;

public class MappedExecutionContext implements IExecutionContext {

	public Map<String, Object> objectPool = new HashMap<String, Object>();
	
	@Override
	public boolean containsClassWithName(Class<?> clazz, String instanceName) {
		
		if(!objectPool.containsKey(instanceName))
			return false;
		
		Object obj = objectPool.get(instanceName);
		if(!obj.getClass().equals(clazz))
			return false;
		
		return true;
	}

}
