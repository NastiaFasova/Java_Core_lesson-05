package ua.lviv.lgs.task2_2;

public class Random {
	public Random() {
		if(Math.random()>0.5) {
			System.out.println("You won!!!");
		}
		else {
			System.out.println("You lost...");
		}
	}
}
