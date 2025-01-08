package com.people;

public class Student extends Person {
    private double gpa;

    public Student(){
    }

    public Student(String name, String surname, double gpa){
        super(name, surname);
        setGpa(gpa);
    }

    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String getPosition() {
        return super.getPosition();
    }

    @Override
    public double getPaymentAmount(){
       return (gpa>2.67? 36600 : 0.0);
    }

    @Override
    public String toString() {
        return "Student:"+super.getId()+"."+super.getName()+" "+super.getSurname();
    }
}
