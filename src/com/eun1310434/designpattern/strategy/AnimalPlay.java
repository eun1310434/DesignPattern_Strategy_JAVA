/*==================================================================================================
¡à INFORMATION
  ¡Û Data : Thursday - 15/11/18
  ¡Û Mail : eun1310434@naver.com
  ¡Û WebPage : https://eun1310434.github.io/
  ¡Û Reference
     - http://www.newthinktank.com/2012/08/strategy-design-pattern-tutorial/ 
        
¡à Study
   ¡Û Strategy
     - When you want to define a class that will have one behavior that is similar to other behaviors in a list
     
   ¡Û I want the class object to be able to choose from
     - Not Flying
     - Fly with Wings
     - Fly Super Fast

   ¡Û When you need to use one of several behaviors dynamically

   ¡Û Often reduces long lists of conditionals

   ¡Û Avoids duplicate code

   ¡Û Keeps class changes from forcing other class changes

   ¡Û Can hide complicated / secret code from the use

   ¡Û Negative : Increased Number of Objects / Classes
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