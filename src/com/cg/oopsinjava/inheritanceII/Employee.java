package com.cg.oopsinjava.inheritanceII;
import java.util.Scanner;

	public class Employee {

		int employeeId;
		String employeeName;
		String employeeAddress;
		String employeeCountry;

		Scanner sc = new Scanner(System.in);
		void readEmployeeDetails() {
			System.out.println("Enter the employee details........");
			System.out.println("Enter the employee id.....");
			employeeId = sc.nextInt();
			System.out.println("Enter the employee name.....");
			sc.nextLine();
			employeeName = sc.nextLine();
			System.out.println("Enter the employee address.....");
			employeeAddress = sc.nextLine();
			System.out.println("Enter the employee country.....");
			employeeCountry = sc.nextLine();

		}

		void printEmployeeDetails() {
			System.out.println("Entered employee details are ........");
			System.out.println("Employee id.....");
		}

	}


