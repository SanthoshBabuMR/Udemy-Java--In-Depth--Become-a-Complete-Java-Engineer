package com.semanticsquare.polymorphism;

public class UserTest {
	public void printUserType(User u) {
		u.printUserType();
	}
	public static void main(String[] args) {
		// part 1
		User user = new User();
		User staff = new Staff();
		User editor = new Editor();
		
		UserTest ut = new UserTest();
		// ut.printUserType(user);
		// ut.printUserType(staff);
		// ut.printUserType(editor);
		
		// part 2
		// editor.approveReview(); // Compiler error here: since it uses reference type (User) to check against applicable methods
		// editor.postAReview();
		editor.saveWebLink();
	}
}
