import java.util.ArrayList;
public class AddressBook {
    private ArrayList<BuddyInfo> myBuddies;
    public AddressBook(){
        myBuddies = new ArrayList<BuddyInfo>();
    }
    public void addBuddy(BuddyInfo aBuddy) {
        if (aBuddy != null) {
            myBuddies.add(aBuddy);
        }
    }
    public void removeBuddy(int index) {
        if(index >= 0 && index < myBuddies.size()) {
            myBuddies.remove(index);
        }
        return ;
    }
    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Qusai","carleton",613);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }
}