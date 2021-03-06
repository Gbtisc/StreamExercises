package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import employeeDAOImpl.EmployeeDAOImpl;
import pojo.Employee;
import util.StreamMethods;

public class Main {
	public static void main(String[] args) {
		List<Integer> numbers;
		
		numbers = Arrays.asList(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
		System.out.println("Duplicated numbers are: \n");
		StreamMethods.findDuplicates(numbers).forEach(System.out::println);
		
		numbers = Arrays.asList(4,5,7,8,99,100,101,33,32,4,4);
		System.out.println("\nList without duplicates: \n");
		StreamMethods.removeDuplicates(numbers).forEach(System.out::println);
		
		numbers = Arrays.asList(3,90,350,5);
		System.out.println("\nMax element is: " + StreamMethods.findMax(numbers) + "\n");
		
		numbers = Arrays.asList(6, 8, 3, 5, 1, 9);
		System.out.println("Min element is: " + StreamMethods.findMin(numbers) + "\n");
		
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employees.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employees.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employees.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employees.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employees.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employees.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employees.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employees.add(new Employee(277, "Anuj", 31, "Male", "Product Development", 2012, 35700.0));
		
		EmployeeDAOImpl empDAOImpl = new EmployeeDAOImpl();
		empDAOImpl.numOfEmployeesByDepts(employees);
	}
}