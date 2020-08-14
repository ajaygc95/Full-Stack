/**
 * 
 */
package com.assignmentone.questionone;

/**
 * @author sbirmathema
 *
 */
public class Address {

	/**
	 * 
	 */
	private String streetAddress;
	private String suiteAddress;
	private String cityName;
	private String stateName;
	private String countryName;
	private int zipPinCode;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param streetAddress
	 * @param suiteAddress
	 * @param cityName
	 * @param stateName
	 * @param countryName
	 * @param zipPinCode
	 */
	public Address(String streetAddress, String suiteAddress, String cityName, String stateName, String countryName,
			int zipPinCode) {
		this.streetAddress = streetAddress;
		this.suiteAddress = suiteAddress;
		this.cityName = cityName;
		this.stateName = stateName;
		this.countryName = countryName;
		this.zipPinCode = zipPinCode;
	}


	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}


	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}


	/**
	 * @return the stateName
	 */
	public String getStateName() {
		return stateName;
	}


	/**
	 * @param stateName the stateName to set
	 */
	public void setStateName(String stateName) {
		stateName = stateName;
	}


	/**
	 * @return the countryName
	 */
	public String getCountryName() {
		return countryName;
	}


	/**
	 * @param countryName the countryName to set
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}


	/**
	 * @return the streetAddress
	 */
	public String getStreetAddress() {
		return streetAddress;
	}

	/**
	 * @param streetAddress the streetAddress to set
	 */
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	/**
	 * @return the suiteAddress
	 */
	public String getSuiteAddress() {
		return suiteAddress;
	}

	/**
	 * @param suiteAddress the suiteAddress to set
	 */
	public void setSuiteAddress(String suiteAddress) {
		this.suiteAddress = suiteAddress;
	}

	/**
	 * @return the zipPinCode
	 */
	public int getZipPinCode() {
		return zipPinCode;
	}

	/**
	 * @param zipPinCode the zipPinCode to set
	 */
	public void setZipPinCode(int zipPinCode) {
		this.zipPinCode = zipPinCode;
	}
	
	

}
