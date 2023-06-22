package com.tandamloop.project;

import java.util.Scanner;

public class Problem_1 {

	private double a;
	private double b;

	public Problem_1(double a, double b) {
		this.a = a;
		this.b = b;

	}

	public double addition(double a, double b) {
		return a + b;

	}

	public double subtraction(double a, double b) {
		return a - b;

	}

	public double multiplication(double a, double b) {
		return a * b;

	}

	public double division(double a, double b) {
		if (b != 0) {
			return a / b;
		} else {
			throw new ArithmeticException("Error: division by zero is not allowed");
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the first number");
		double a = scan.nextDouble();

		System.out.println("Enter the second number");
		double b = scan.nextDouble();

		System.out.println("Enter the operation(add,subtract,mul,div)");
		String operation = scan.next();

		Problem_1 cal = new Problem_1(a, b);

		double result;
		switch (operation) {

		case "add":
			result = cal.addition(a, b);
			break;

		case "subtract":
			result = cal.subtraction(a, b);
			break;
		case "mul":
			result = cal.multiplication(a, b);
			break;
		case "div":
			result = cal.division(a, b);
			break;

		default:
			throw new IllegalArgumentException("Error: invalid operation");

		}
		System.out.println("Result " + result);

	}

}
