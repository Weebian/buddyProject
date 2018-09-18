import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	private List<BuddyInfo> buddyInfo;
	
	/**
	 * Class method to create AddressBook
	 */
	public AddressBook() {
		this.buddyInfo = new ArrayList<BuddyInfo>();
	}
	
	/**
	 * Add a new buddy into the address book
	 * @param aBuddyInfo, buddy to be added into the address book
	 */
	public void addBuddy(BuddyInfo aBuddyInfo) {
		if(aBuddyInfo != null) {
			this.buddyInfo.add(aBuddyInfo);
		}
	}
	
	/**
	 * Remove a buddy off the address book
	 * @param index, index of buddy to be removed from the list
	 */
	public BuddyInfo removeBuddy(int index) {
		if(index >=0 && index < this.buddyInfo.size()) {
			return this.buddyInfo.remove(index);
		}
		return null;
	}


	/**
	 * Main function to run code
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Address Book");
		BuddyInfo buddy = new BuddyInfo("Micheal", "Ottawa", 66681788);
		AddressBook addressBook = new AddressBook();
		addressBook.addBuddy(buddy);
		addressBook.removeBuddy(0);
		
	}

}
