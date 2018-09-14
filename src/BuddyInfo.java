
public class BuddyInfo {
	public String name;
	public String address;
	public int phoneNumber;
	
	/**
	 * Method to get buddy's name
	 * @return name, return buddy's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Method to set buddy's name
	 * @param name, buddy's name 
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Method to get buddy's address
	 * @return address, return buddy's address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Method to set buddy's address
	 * @param address; buddy's address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Method to obtain buddy's phone number
	 * @return phoneNumber, return buddy's phone number
	 */
	public int getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Method to set buddy' phone number
	 * @param phoneNumber, buddy's phone number
	 */
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Main function to run code
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		
		BuddyInfo buddy = new BuddyInfo();
		buddy.setName("Batman");
		System.out.println("Hello " + buddy.getName());
	}

}
