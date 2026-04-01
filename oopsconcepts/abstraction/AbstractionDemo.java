package oopsconcepts.abstraction;

public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Wagon();
		
		car.playMusic();
		car.drive();
		
	}

}
/*
 
~ Abstraction in Java is the process of hiding the implementation details of a class/method and showing 
  only the essential features to the user. It focuses on what an object does rather than how it does it.
   
~ Abstract methods are not implemented but just declared , the class which extends the 
  abstract class needs to override the abstract methods and implement them
 
 ~ abstract keyword needs to be used with abstract class and abstract method
  
~ We cannot create object of abstract class but we can create referance of abstract

~ we can declare an abstract class with no abstract methods in Java

 */
abstract class Car{
	
	
	public abstract void drive();
	 
	 public void playMusic() {
		
		 System.out.println("play music");
 
	 }
	
}
 
class Wagon extends Car{
	
	public void drive() {
		
		System.out.println("driving wagon");
	}
	
	
}
