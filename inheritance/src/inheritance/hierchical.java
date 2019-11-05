package inheritance;

import java.util.Scanner;

public class hierchical {
    public static void main(String args[])
    {
    	Scanner s=new Scanner(System.in);
    	Cat c=new Cat();
    	c.meow();
    
    	Dog d=new Dog();
    	d.bark();
    	d.eat();
    }
    }
  class animal{
	  void eat() {
		  System.out.println("eat");
		  
	  }
  }
	  class Cat extends animal{
		  void meow() {
			  System.out.println("meow");
		  }
	  }
		  class Dog extends animal{
			  void bark() {
				  System.out.println("bark");
			  }
	  }
  
  
	