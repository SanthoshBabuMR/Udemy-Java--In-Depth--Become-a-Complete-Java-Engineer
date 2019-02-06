package com.semanticsquare.PrivateMemberAccess;

class StudentSameClass{
    private int id;
    String name;
    StudentSameClass(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public static void main(String []args){
        StudentSameClass s = new StudentSameClass(1, "John");
        System.out.println(s.name);
        System.out.println(s.id);
     }
}