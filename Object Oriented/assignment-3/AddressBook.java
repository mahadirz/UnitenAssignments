/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment3;

import java.util.ArrayList;

/**
 *
 * @author Mahadir
 */
public class AddressBook {
    
    private ArrayList<Person> PersonList;
    private ArrayList<PersonalFriend> PersonalFriendList;
    private ArrayList<BusinessAssociate> BusinessAssociateList;
    
    public AddressBook(){
        //init all list
        PersonList = new ArrayList<>();
        PersonalFriendList = new ArrayList<>();
        BusinessAssociateList = new ArrayList<>(); 
        
    }
    
    public void addPerson(Person p){
        PersonList.add(p);
    }
    
    public void addPersonalFriend(PersonalFriend p){
        PersonalFriendList.add(p);
    }
    
    public void addBusinessAssociate(BusinessAssociate p){
        BusinessAssociateList.add(p);
    }
    
    public ArrayList<Person> getPerson(){
        return PersonList;
    }
    
    public ArrayList<PersonalFriend> getPersonalFriend(){
        return PersonalFriendList;
    }
    
    public ArrayList<BusinessAssociate> getBusinessAssociate(){
        return BusinessAssociateList;
    }
    
    public Person searchExactPersonName(String nameStr){
        for (Person PersonList1 : PersonList) {
            if (PersonList1.name.compareToIgnoreCase(nameStr) == 0) {
                return PersonList1;
            }
        }
        //not found, return empty object
        return new Person();
    }
    
    public PersonalFriend searchExactPersonalFriendName(String nameStr){
        for (PersonalFriend PersonalFriendList1 : PersonalFriendList) {
            if (PersonalFriendList1.name.compareToIgnoreCase(nameStr) == 0) {
                return PersonalFriendList1;
            }
        }
        //not found, return empty object
        return new PersonalFriend();
    }
    
    public BusinessAssociate searchExactBusinessAssociateName(String nameStr){
        for (BusinessAssociate BusinessAssociateList1 : BusinessAssociateList) {
            if (BusinessAssociateList1.name.compareToIgnoreCase(nameStr) == 0) {
                return BusinessAssociateList1;
            }
        }
        //not found, return empty object
        return new BusinessAssociate();
    }
    
    public boolean deletePerson(int index){
        if(index > PersonList.size())
            return false;
        PersonList.remove(index);
        return true;
    }
    
    public boolean deletePersonalFriend(int index){
        if(index > PersonalFriendList.size())
            return false;
        PersonalFriendList.remove(index);
        return true;
    }
    
    public boolean deleteBusinessAssociate(int index){
        if(index > BusinessAssociateList.size())
            return false;
        BusinessAssociateList.remove(index);
        return true;
    }
    
    public void displayPersonList(){
        for (Person p : PersonList) {
            System.out.println(p);
        }
    }
    
    public void displayPersonalFriendList(){
        for (PersonalFriend p : PersonalFriendList) {
            System.out.println(p);
        }
    }
    
    public void displayBusinessAssociateList(){
        for (BusinessAssociate p : BusinessAssociateList) {
            System.out.println(p);
        }
    }
}
