package com.semanticsquare.InformationHiding;


// from src dir: javac com/semanticsquare/InformationHiding/StudentChangeDataRepresentation.java && java com/semanticsquare/InformationHiding/StudentChangeDataRepresentation

class StudentChangeDataRepresentation {
	private int iGender = -1;
	private String gender; 
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		if (gender=="male") {
			iGender = 0;
		}
		else if (gender=="female") {
			iGender = 1;
		}
		else if (gender=="transgender") {
			iGender = 2;
		}
		else { 
			throw new IllegalArgumentException("Wrong gender Passed");
		}
		this.gender = gender;
	}
	
	public static void main(String args[]) {
		StudentChangeDataRepresentation s = new StudentChangeDataRepresentation();
		s.setGender("female");
		System.out.println(s.getGender());
		s.setGender("something");
		System.out.println(s.getGender());
	}
}


