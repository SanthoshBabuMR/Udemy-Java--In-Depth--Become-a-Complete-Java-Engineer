package com.semanticsquare.inherit;

public class Test {
	public static void main(String[] args) {
		Child c = new Child();
		Mother m = new Mother();
		GrandMother g = new GrandMother();
		Test t = new Test();
		t.print(c);
	
	}
	
	public void print(GrandMother u) {
		u.getName();
		if ( u instanceof Mother) {
			((Mother) u).getChudithar();
		}		
		u.getSarees();
	}
}
	