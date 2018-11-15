/*==================================================================================================
�� INFORMATION
  �� Data : Thursday - 15/11/18
  �� Mail : eun1310434@naver.com
  �� WebPage : https://eun1310434.github.io/
  �� Reference
     - http://www.newthinktank.com/2012/08/strategy-design-pattern-tutorial/ 
        
�� Study
   �� Strategy
     - When you want to define a class that will have one behavior that is similar to other behaviors in a list
     
   �� I want the class object to be able to choose from
     - Not Flying
     - Fly with Wings
     - Fly Super Fast

   �� When you need to use one of several behaviors dynamically

   �� Often reduces long lists of conditionals

   �� Avoids duplicate code

   �� Keeps class changes from forcing other class changes

   �� Can hide complicated / secret code from the use

   �� Negative : Increased Number of Objects / Classes
==================================================================================================*/
package com.eun1310434.designpattern.strategy;

public class AnimalPlay{
	
	public static void main(String[] args){
		
		Animal sparky = new Dog();
		Animal tweety = new Bird();
		System.out.println("Dog: " + sparky.tryToFly());
		System.out.println("Bird: " + tweety.tryToFly());

		System.out.println("");
		
		// This allows dynamic changes for flyingType
		sparky.setFlyingAbility(new ItFlys());
		sparky.setFlyingAbility(new Flys() {
			
			@Override
			public String fly() {
				// TODO Auto-generated method stub
				return "Special Fly";
			}
		});
		System.out.println("Dog: " + sparky.tryToFly());
		
	}
	
}