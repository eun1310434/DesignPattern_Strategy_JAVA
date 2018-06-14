/*==================================================================================================
�� INFORMATION
  �� Data : Thursday - 14/06/18
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

public class Dog extends Animal{
	
	public Dog(){
		super();
		// We set the Flys interface polymorphically
		// This sets the behavior as a non-flying Animal
		setFlyingAbility(new CantFly());
	}

	public void digHole(){System.out.println("Dug a hole");}
	
	/* BAD
	* You could override the fly method, but we are breaking
	* the rule that we need to abstract what is different to the subclasses
	public void fly(){
		System.out.println("I can't fly");
	}
	*/

}