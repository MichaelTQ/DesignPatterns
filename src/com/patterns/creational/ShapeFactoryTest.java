package com.patterns.creational;

import java.lang.reflect.InvocationTargetException;

public class ShapeFactoryTest {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		System.out.println("Testing ShapeFactory");
		ShapeFactory.registerShape("circle", Circle.class);
		ShapeFactory.registerShape("rectangle", Rectangle.class);
		
		IShape s0 = (IShape)ShapeFactory.createShape("null");
		IShape s1 = (IShape)ShapeFactory.createShape("circle");
		IShape s2 = (IShape)ShapeFactory.createShape("rectangle");
		
		if(s0 == null) {
			System.out.println("Returning NPE");
		}
		s1.draw();
		s2.draw();
	}

}
