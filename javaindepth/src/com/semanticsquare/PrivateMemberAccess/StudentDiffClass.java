package com.semanticsquare.PrivateMemberAccess;

class StudentClass{
    private int id;
    String name;
    StudentClass(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class StudentDiffClass {
    public static void main(String []args){
        StudentClass s = new StudentClass(1, "John");
        System.out.println(s.name);
        System.out.println(s.id);
     }
}