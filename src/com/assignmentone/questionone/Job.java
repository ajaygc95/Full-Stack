/**
 * 
 */
package com.assignmentone.questionone;

/**
 * @author sbirmathema
 *
 */
public class Job {
	
	enum JobStatus {
	  TAKEN,
	  PENDING,
	  INPROGRESS,
	  DONE
	}

	private final int jobId;
	private final String jobTitle;
	private Customer customer;
	private Vehicle vehicle;
	private JobStatus jobStatus;
	
	
	/**
	 * @param jobId
	 * @param jobTitle
	 * @param customer
	 * @param vehicle
	 */
	public Job(int jobId, String jobTitle, Customer customer, Vehicle vehicle, JobStatus jobStatus) {
		this.jobId = jobId;
		this.jobTitle = jobTitle;
		this.jobStatus = jobStatus;
		this.customer = customer;
		this.vehicle = vehicle;
	}
	
	
	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}
	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	/**
	 * @return the vehicle
	 */
	public Vehicle getVehicle() {
		return vehicle;
	}
	/**
	 * @param vehicle the vehicle to set
	 */
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	/**
	 * @return the jobId
	 */
	public int getJobId() {
		return jobId;
	}
	/**
	 * @return the jobTitle
	 */
	public String getJobTitle() {
		return jobTitle;
	}

	/**
	 * @return the jobStatus
	 */
	public JobStatus getJobStatus() {
		return jobStatus;
	}


	/**
	 * @param jobStatus the jobStatus to set
	 */
	public void setJobStatus(JobStatus jobStatus) {
		this.jobStatus = jobStatus;
	}
	
	

}
