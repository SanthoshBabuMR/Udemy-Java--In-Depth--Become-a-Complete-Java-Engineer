package com.semanticsquare.overridding;

public class UserTest {
	public void printUserType(User u) {
		u.printUserType();
	}
	
	public static void main(String[] args) {
		// part 1
		User user = new User();
		User staff = new Staff();
		User editor = new Editor();
		System.out.println("> User post a review");
		Review userReview = user.postAReview("hello world");
		System.out.println("");
		System.out.println("> Staff post a review");
		Review staffReview = staff.postAReview("hello world");
		System.out.println("");
		System.out.println("> Editor post a review");
		Review editorReview = editor.postAReview("hello world");
		System.out.println("");
		System.out.println("> Check review status");
		System.out.println("userReview.isApproved(): " + userReview.isApproved());
		System.out.println("staffReview.isApproved(): " + staffReview.isApproved());
		System.out.println("editorReview.isApproved(): " + editorReview.isApproved());
		
		System.out.println("");
		System.out.println("> Access hidden fields");
		((Staff)staff).printId();
	}
}
