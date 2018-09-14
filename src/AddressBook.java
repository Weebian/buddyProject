import java.util.ArrayList;

public class AddressBook {
	private ArrayList<BuddyInfo> buddyList = new ArrayList<BuddyInfo>();
	private String addressBookName;
	
	/**
	 * Obtain the list within the address book
	 * @return
	 */
	public ArrayList<BuddyInfo> getBuddyList() {
		return buddyList;
	}
	
	/**
	 * Add a new buddy into the address book
	 * @param buddy, buddy to be added into the address book
	 */
	public void addBuddyList(BuddyInfo buddy) {
		buddyList.add(buddy);
	}

	/**
	 * Get the name of this address book
	 * @return addressBookName, return name of the address book
	 */
	public String getAddressBookName() {
		return addressBookName;
	}
	
	/**
	 * Set a new name for the address book
	 * @param addressBookName, the new name for the address book
	 */
	public void setAddressBookName(String addressBookName) {
		this.addressBookName = addressBookName;
	}

	/**
	 * Main function to run code
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Address Book");
	}

}
