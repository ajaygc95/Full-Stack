package com.assignmentone.questionone;

import java.time.LocalDate;

public class Employee extends Person {
	
	private final int empId;

	/**
	 * @param firstName
	 * @param lastName
	 * @param phoneNo
	 * @param address
	 */
	public Employee(int empId, String firstName, String lastName, String phoneNo, Address address) {
		super(firstName, lastName, phoneNo, address);
		// TODO Auto-generated constructor stub
		
		this.empId = empId;
	}

	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}
	
	public void startsJob(Job job, LocalDate startDate) {
		// Changes job status
	}
	
	public void finishJob(Job job, LocalDate finishDate) {
		// Completes job
	}
	

}
