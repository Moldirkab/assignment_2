package com.people;

public class Person implements Payable{
    private int id;
    private  static  int id_gen=1;
    private String name;
    private String surname;

    public Person(){
    }

    public Person(String name,String surname){
        id=id_gen++;
        setName(name);
        setSurname(surname);
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setSurname(String surname){
        this.surname=surname;
    }

    public String getSurname(){
        return surname;
    }

    public int getId(){
        return id;
    }

    public  String getPosition(){
        return "Student";
    }

    @Override
    public double getPaymentAmount() {
        return 0.0;
    }


    @Override
    public int compareTo(Payable other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }
}
