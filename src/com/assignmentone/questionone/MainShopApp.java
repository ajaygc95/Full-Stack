/**
 * 
 */
package com.assignmentone.questionone;

/**
 * @author sbirmathema
 *
 */
public class MainShopApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a = new Address("653", "", "SJ", "CA", "USA", 95128);
		Person p = new Customer(1, "Subha", "Mathema", "2134564443", a);
		
		Address a1 = new Address("653", "", "SJ", "CA", "USA", 95128);
		Person p1 = new Customer(2, "Ajay", "GC", "2134564443", a1);
		
		System.out.println(p.getFirstName());
		System.out.println(p1.getFirstName());
		
		Address a3 = new Address("653", "", "SJ", "CA", "USA", 95128);
		Customer p3 = new Customer(3, "Sanjay", "GC", "2134564443", a1);
		
		System.out.println(((Person)p3).getFirstName());
		
		Address a4 = new Address("653", "", "SJ", "CA", "USA", 95128);
		Person p4 = new Employee(12, "Suraj", "GC", "2134564443", a4);
		
		System.out.println(((Employee)p4).getFirstName());
		
	}
}
