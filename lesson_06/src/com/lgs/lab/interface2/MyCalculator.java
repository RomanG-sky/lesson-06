package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {
	public double x;
	public double y;

	public MyCalculator(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "MyCalculator [x=" + x + ", y= " + y + "]";
	}

	@Override
	public void Dodaty() {
		System.out.println("Результат дії x + y = " + (x+y));
	}

	@Override
	public void Vidnyatu() {
		System.out.println("Результат дії x - y = " + (x-y));
	}

	@Override
	public void Pomnozhutu() {
		System.out.println("Результат дії x * y = " + (x*y));
	}

	@Override
	public void Podilutu() {
		System.out.println("Результат дії x / y = " + (x/y));
	}


	

}
