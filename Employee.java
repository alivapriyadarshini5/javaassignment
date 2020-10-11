/**
 * 
 */
package com.employee;

	

	public class Employee{
		String name = "Aliva";
		int age=21;
		String city= "Bhubaneswar";


		public void getDetails() {
			System.out.println(name);
			System.out.println(age);
			System.out.println(city);
		}


	public static void main(String[] args) {

        Employee obj=new Employee();
        obj.getDetails();
	}
	}


