package com.sau.assignment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Rectangle {

	private int h;
	private int w;

	@Autowired
	@Qualifier("point1")
	private Point P1;

	@Autowired
	@Qualifier("point2")
	private Point P2;

	@Autowired
	@Qualifier("point3")
	private Point P3;

	@Autowired
	@Qualifier("point4")
	private Point P4;

	@Autowired
	@Qualifier("list1")
	private List<String> arr;

	public void getNewList() {
		System.out.println(arr);
	}

	public void setNewList(List<String> arr) {
		this.arr = arr;
	}

	public Rectangle(int h, int w) {
		this.h = h;
		this.w = w;
	}

	public int getHeight() {
		return h;
	}

	public void setHeight(int h) {
		this.h = h;
	}

	public int getWidth() {
		return w;
	}

	public void setWidth(int w) {
		this.w = w;
	}

	public Point getPoint1() {
		return P1;
	}

	public void setPoint1(Point point1) {
		this.P1 = point1;
	}

	public Point getPoint2() {
		return P2;
	}

	public void setPoint2(Point point) {

		this.P2 = point;
	}

	public Point getPoint3() {
		return P3;
	}

	public void setPoint3(Point point) {

		this.P3 = point;
	}

	public Point getPoint4() {
		return P4;
	}

	public void setPoint4(Point point4) {
		this.P4 = point4;
	}

	public void draw() {
		System.out.println("The given rectangle as a height of: " + getHeight() + " a width of " + getWidth());
		System.out.println("The fours Points making the rectangle are :");
		System.out.println("Point 1" + P1.getX() + "," + P1.getY());
		System.out.println("Point 2" + P2.getX() + "," + P2.getY());
		System.out.println("Point 3" + P3.getX() + "," + P3.getY());
		System.out.println("Point 4" + P4.getX() + "," + P4.getY());
	}

}
