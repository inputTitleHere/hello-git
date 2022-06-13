package com.kh.git;

import com.kh.git.animal.Dog;

public class HelloGit {
	
	public static void main(String[] args) {
		System.out.println("Hello GIT WORLD !");
		new HelloGit().printFancyStuff();
		
		// Dog 기능 추가.
		Dog dog = new Dog();
		dog.bark();
	}
	
	public void printFancyStuff() {
		System.out.println("깃! 허! 브!");
	}
}
