package com.semanticsquare.InformationHiding;

//from src dir: javac com/semanticsquare/InformationHiding/StudentEnforceInvariant.java && java com/semanticsquare/InformationHiding/StudentEnforceInvariant

class StudentEnforceInvariant {
	private String gender; 
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		if (gender=="male" || gender=="female" || gender=="transgender") {
			this.gender = gender;
		}
		else {
			throw new IllegalArgumentException("Wrong gender Passed");
		}
	}
	
	public static void main(String args[]) {
		StudentEnforceInvariant s = new StudentEnforceInvariant();
		s.setGender("female");
		System.out.println(s.getGender());
		s.setGender("something");
		System.out.println(s.getGender());
	}
}

