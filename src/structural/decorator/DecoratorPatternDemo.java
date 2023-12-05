package structural.decorator;

public class DecoratorPatternDemo {
	   public static void main(String[] args) {

	      Shape circle = new Circle();

	      Shape redCircle = new RedShapeDecorator(new Circle()); // Added new functionality

	      Shape redRectangle = new RedShapeDecorator(new Rectangle());// Added new functionality
	      System.out.println("Circle with normal border");
	      circle.draw();

	      System.out.println("\nCircle of red border");
	      redCircle.draw();

	      System.out.println("\nRectangle of red border");
	      redRectangle.draw();
	   }
	}
/*
Decorator pattern allows a user to add new functionality to an existing object without altering its structure.
 This type of design pattern comes under structural pattern as this pattern acts as a wrapper to existing class.

*/