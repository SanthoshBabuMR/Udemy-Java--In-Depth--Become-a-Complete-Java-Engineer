package com.semanticsqare.oop.p2;
import com.semanticsqare.oop.p1.A1;


public class C2 extends A1 {
	public static void main(String[] args) {
//		System.out.println("privateMember: " + privateMember);
		// Inherited members are directly accessible
//		System.out.println("defaultMember: " + defaultMember);
		System.out.println("protectedMember: " + protectedMember);
		System.out.println("publicMember " + publicMember);
	}
}
