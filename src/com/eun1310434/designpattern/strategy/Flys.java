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

//The interface is implemented by many other
//subclasses that allow for many types of flying
//without effecting Animal, or Flys.

//Classes that implement new Flys interface
//subclasses can allow other classes to use
//that code eliminating code duplication

//I'm decoupling : encapsulating the concept that varies

public interface Flys {
	String fly();
}