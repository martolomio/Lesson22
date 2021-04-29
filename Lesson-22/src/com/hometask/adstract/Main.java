package com.hometask.adstract;

public class Main {
	
public static void main(String[] args) {

	Cat cat = string->System.out.println(string);
	cat.voice("I an Cat . I say :...");
	Cow cow = string->System.out.println(string);
	cow.voice("I an Cow . I say :...");
	Dog dog = string->System.out.println(string);
	dog.voice("I an Dog. I say :...");
	}
 interface Pet { void voice(String string);}
 interface Cow extends Pet { }
 interface Dog extends Pet {}
 interface Cat extends Pet{ }
}
