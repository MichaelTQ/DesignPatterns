package com.patterns.creational;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public class ShapeFactory {
	private static HashMap<String, Class<?>> register = new HashMap<String, Class<?>>();
	
	public static void registerShape(String shape, Class<?> shapeClass) {
		register.put(shape, shapeClass);
	}
	
	public static Object createShape(String shape) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> shapeClass = (Class<?>)register.get(shape);
		if(shapeClass == null) {
			return null;
		}
		return shapeClass.getDeclaredConstructor().newInstance();
	}
}
