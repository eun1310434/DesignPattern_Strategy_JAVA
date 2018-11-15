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

public class Animal {
	
	private String name;
	
	// Instead of using an interface in a traditional way
	// we use an instance variable that is a subclass of the Flys interface.
	
	// Animal doesn't care what flyingType does, 
	// it just knows the behavior is available to its subclasses
	
	// This is known as Composition : Instead of inheriting
	// an ability through inheritance the class is composed
	// with Objects with the right ability  
	//ddasfd
	
	// Composition allows you to change the capabilities of 
	// objects at run time!
	private Flys flyingType;
	
	public void setName(String newName){ name = newName; }
	public String getName(){ return name; }
	
	public String tryToFly(){ return flyingType.fly();}
	// Animal pushes off the responsibility for flying to flyingType
	
	public void setFlyingAbility(Flys _flyType){flyingType = _flyType;}
	// If you want to be able to change the flyingType dynamically add the following method
	
}
