package com.hefshine.bean;

public class Triangle {
	Point pointA;
	
	Point pointB;
	String type;

	public Triangle() {
		
	}
	
	
	public Triangle(Point pointA, Point pointB, String type) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.type = type;
	}


	/*
	 * public Triangle(Point pointA, Point pointB) { super(); this.pointA = pointA;
	 * this.pointB = pointB; }
	 */


	/*
	 * public Triangle(Point pointA) { super(); this.pointA = pointA; }
	 */

	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public Point getPointB() {
		return pointB;
	}


	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}


	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}


	@Override
	public String toString() {
		return "Triangle [pointA=" + pointA + ", pointB=" + pointB + ", type=" + type + "]";
	}


	/*
	 * @Override public String toString() { return "Triangle [pointA=" + pointA +
	 * ", pointB=" + pointB + "]"; }
	 */

	/*
	 * @Override public String toString() { return "Triangle [pointA=" + pointA +
	 * "]"; }
	 */
	
	
	

}
