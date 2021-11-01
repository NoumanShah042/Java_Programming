package Java_Modifiers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syed Nouman Rehman
 */
public class static_keyword {
   public static void main(String[] args) {
		
		// static = modifier. A single copy of a variable/method is created and shared.
		//			The class "owns" the static member
		
		Friend friend1 = new Friend("Sponegbob");
		Friend friend2 = new Friend("Patrick");
		Friend friend3 = new Friend("Patrick");
		
		System.out.println(Friend.numberOfFriends);
                
                //System.out.println(friend2.numberOfFriends);
                //can be possible but best way is to access in a static way
	}
}
//**********************************************
  class Friend {


	String name;
	
	static int numberOfFriends;
	
	Friend(String name){
		this.name=name;
		numberOfFriends++;
	}
}