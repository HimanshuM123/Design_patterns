package creational.singleton;

public class SingleObject {

	// create an object of SingleObject
	private static SingleObject singleObject = new SingleObject();
	
	 //make the constructor private so that this class cannot be instantiated
	private SingleObject() {}
	  
	//Get the only object available

	public static SingleObject getInstance() {
		return singleObject;
	}
	
	public void showMessage() {
		System.out.println("Hello Singleton!!");
	}

}
