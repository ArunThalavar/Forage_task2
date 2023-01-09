package com.example.demo;

import org.springframework
	.stereotype
	.Repository;

// Importing the employees class to
// use the defined properties
// in this class
import com.example.demo.Employees;

@Repository

// Class to create a list
// of employees
public class EmployeeDAO {

	private static Employees list
		= new Employees();

	// This static block is executed
	// before executing the main
	// block
	static
	{

		// Creating a few employees
		// and adding them to the list
		list.getEmployeeList().add(
			new Employee(
				1,
				"Arun",
				"Thalavar",
				"at@gmail.com",
                "lead developer"));

		list.getEmployeeList().add(
			new Employee(
				2, "Manoj",
				"Kumar",
				"mk@gmail.com",
                "developer"));

		list.getEmployeeList().add(
			new Employee(
				3, "Manasvi",
				"peddipathy",
				"mpf@gmail.com",
                "developer"));
        
        list.getEmployeeList().add(
			new Employee(
				4, "Gagan deep",
				"N.S",
				"mpf@gmail.com",
                "developer"));

		 
	}

	// Method to return the list
	public Employees getAllEmployees()
	{

		return list;
	}

	 
		// Method to add an employee
		// to the employees list
		public void
		addEmployee(Employee employee)
	{
		list.getEmployeeList()
			.add(employee);
		 
	}
}
