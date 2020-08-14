/**
 * 
 */
package com.assignmentone.questionone;

import java.time.LocalDate;

/**
 * @author sbirmathema
 *
 */
public class Customer extends Person {

	private final int customerId;
	private LocalDate lastVisited;
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param phoneNo
	 * @param address
	 */
	public Customer(int customerId, String firstName, String lastName, String phoneNo, Address address) {
		super(firstName, lastName, phoneNo, address);
		// TODO Auto-generated constructor stub
		this.customerId = customerId;
		this.lastVisited = LocalDate.now();
		
	}
	
	/**
	 * @return the customerId
	 */
	public int getCustomerId() {
		return customerId;
	}
	
	/**
	 * @return the lastVisited
	 */
	public LocalDate getLastVisited() {
		return lastVisited;
	}

	/**
	 * @param lastVisited the lastVisited to set
	 */
	public void setLastVisited(LocalDate lastVisited) {
		this.lastVisited = lastVisited;
	}

}
