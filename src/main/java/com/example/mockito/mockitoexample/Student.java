package com.example.mockito.mockitoexample;

public class Student {

	private String unformattedData;
	
	private String name;
	 	
	private String standard;
	
	private int rollNumber;
	
	private String address;	
	
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the standard
	 */
	public String getStandard() {
		return standard;
	}



	/**
	 * @param standard the standard to set
	 */
	public void setStandard(String standard) {
		this.standard = standard;
	}	



	/**
	 * @return the rollNumber
	 */
	public int getRollNumber() {
		return rollNumber;
	}



	/**
	 * @param rollNumber the rollNumber to set
	 */
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}



	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}



	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}



	/**
	 * @return the unformattedData
	 */
	public String getUnformattedData() {
		return unformattedData;
	}



	/**
	 * @param unformattedData the unformattedData to set
	 */
	public void setUnformattedData(String unformattedData) {
		this.unformattedData = unformattedData;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollNumber;
		result = prime * result + ((standard == null) ? 0 : standard.hashCode());
		result = prime * result + ((unformattedData == null) ? 0 : unformattedData.hashCode());
		return result;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollNumber != other.rollNumber)
			return false;
		if (standard == null) {
			if (other.standard != null)
				return false;
		} else if (!standard.equals(other.standard))
			return false;
		if (unformattedData == null) {
			if (other.unformattedData != null)
				return false;
		} else if (!unformattedData.equals(other.unformattedData))
			return false;
		return true;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [unformattedData=" + getUnformattedData() + ", name=" + name + ", standard=" + standard
				+ ", rollNumber=" + rollNumber + ", address=" + address + "]";
	}
	
	
}