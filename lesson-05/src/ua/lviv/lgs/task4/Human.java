package ua.lviv.lgs.task4;

public class Human {
	private int weight;
	private double height;
	private int age;
	public Human() {
		this.weight=0;
		this.height=0;
		this.age=0;
	};
	public Human(int w,int age) {
		this.weight=w;
		this.age=age;
		this.height=0;
	}
	
	public Human(int w, int a, double h) {
		this(w,a);
		this.height=h;
	};

	public int getWeight() {
		return weight;
	}
	public double getHeight() {
		return height;
	}
	public int getAge() {
		return age;
	}
}
