package com.kh.git;

import com.kh.git.animal.Cat;
import com.kh.git.animal.Dog;

public class HelloGit {
	
	public static void main(String[] args) {
		System.out.println("Hello GIT WORLD !");
		new HelloGit().helloGitWelcome();
		
		// Dog 기능 추가.
		Dog dog = new Dog();
		dog.bark();
		Cat cat = new Cat();
		cat.meow();
		System.out.println("BuG FixEs");
	}
	
	public void helloGitWelcome() {
		System.out.println("깃! 허! 브!");
	}
}
