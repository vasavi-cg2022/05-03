package com.cg.oopsinjava.inheritanceII;



public class EmployeeManagementSystem {

	public static void main(String[] args) {

		HourlyEmployee hrEmployee = new HourlyEmployee();

		hrEmployee.readEmployeeDetails();
		hrEmployee.readSalaryPerHour();
		hrEmployee.readnoOfHoursWorked();
		hrEmployee.printEmployeeDetails();
		hrEmployee.calculateSalary();

	}

}