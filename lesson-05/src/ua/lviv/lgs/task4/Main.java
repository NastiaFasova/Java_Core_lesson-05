package ua.lviv.lgs.task4;

public class Main {
	public static void main(String[] args) {
		Human h=new Human();
		System.out.println("Using the constructor without parameters: ");
		System.out.println("Height: "+h.getHeight()+"\nweight: "+h.getWeight()+"\nage: "+h.getAge());
		System.out.println();
		Human h2=new Human(50,18);
		System.out.println("Using the constructor with one parameter: ");
		System.out.println("Height: "+h2.getHeight()+"\nweight: "+h2.getWeight()+"\nage: "+h2.getAge());
		Human h3=new Human(50,20,52.6); 
		System.out.println();
		System.out.println("Using the constructor which calls another constructor: ");
		System.out.print("Height: "+h3.getHeight()+"\nweight: "+h3.getWeight()+"\nage: "+h3.getAge());
	}
}
