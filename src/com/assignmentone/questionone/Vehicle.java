/**
 * 
 */
package com.assignmentone.questionone;

/**
 * @author sbirmathema
 *
 */
public class Vehicle {
	
	private final String vehicleVIN;
	private String vehicleMake;
	private String vehicleModel;
	private String vehicleYear;

	/**
	 * @param vehicleVIN
	 * @param vehicleMake
	 * @param vehicleModel
	 * @param vehicleYear
	 */
	public Vehicle(String vehicleVIN, String vehicleMake, String vehicleModel, String vehicleYear) {
		this.vehicleVIN = vehicleVIN;
		this.vehicleMake = vehicleMake;
		this.vehicleModel = vehicleModel;
		this.vehicleYear = vehicleYear;
	}


	/**
	 * @return the vehicleVIN
	 */
	public String getVehicleVIN() {
		return vehicleVIN;
	}


	/**
	 * @return the vehicleMake
	 */
	public String getVehicleMake() {
		return vehicleMake;
	}


	/**
	 * @param vehicleMake the vehicleMake to set
	 */
	public void setVehicleMake(String vehicleMake) {
		this.vehicleMake = vehicleMake;
	}


	/**
	 * @return the vehicleModel
	 */
	public String getVehicleModel() {
		return vehicleModel;
	}


	/**
	 * @param vehicleModel the vehicleModel to set
	 */
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}


	/**
	 * @return the vehicleYear
	 */
	public String getVehicleYear() {
		return vehicleYear;
	}


	/**
	 * @param vehicleYear the vehicleYear to set
	 */
	public void setVehicleYear(String vehicleYear) {
		this.vehicleYear = vehicleYear;
	}
	
	

}
