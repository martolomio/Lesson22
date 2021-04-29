package com.hometask.object;

public class Main {
	
	public static void main(String[] args) {
		
		Frog swim = (String string)->string;
		Frog sleep = (String string)->string="I can sleeping";
		Frog eat = (String string)->string="I want to eat";
		Frog walk = (String string)->string="I can walking";
		
		System.out.println(swim.ty("I can swin"));
		System.out.println(sleep.ty("I am sleeping"));
		System.out.println(eat.ty("I wanna eat"));
		System.out.println(walk.ty("I am walking"));
			
	}
interface Amphidia {String ty(String string);}
interface Frog extends Amphidia {}
}