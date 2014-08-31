/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment3;

/**
 *
 * @author Mahadir
 */
public class TestAddressBook {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        
        //add new Person address book
        addressBook.addPerson(new Person("James","012456221","No. 4 Kuala Lumpur"));
        addressBook.addPersonalFriend(new PersonalFriend("Ali","0176456221","No. 6 Kuala Lumpur","05674332"));
        addressBook.addPersonalFriend(new PersonalFriend("Chong","0196456221","No. 8 Kuala Lumpur","07674332"));
        addressBook.addPersonalFriend(new PersonalFriend("Wei","0106456221","No. 9 Kuala Lumpur","01674332"));
        addressBook.addBusinessAssociate(new BusinessAssociate("Abu","0186456221","No. 7 Kuala Lumpur","06674332"));
        
        
        System.out.println("Search ali in personal friend");
        System.out.println(addressBook.searchExactPersonalFriendName("ali"));
        
        addressBook.displayPersonList();
        addressBook.displayBusinessAssociateList();
        
        System.out.println("\nList all personal friends\n");
        addressBook.displayPersonalFriendList();
        addressBook.deletePersonalFriend(1);
        System.out.println("\nList all personal friends after delete index 1\n");
        addressBook.displayPersonalFriendList();
        
    }
}
