package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    String address;
    String email;
    String phoneNumber;
//constructor 1
public Person(String firstName, String lastName, int age){
this.firstName=firstName;
this.lastName=lastName;
this.age=age;

}
    //constructor 2
public Person (String firstName,String lastName, int age, String address,String email,String phoneNumber){
this(firstName,lastName,age);
this.address=address;
this.email=email;
this.phoneNumber=phoneNumber;
}
    //metotlar
    public String getFirstName() {
        return firstName;
    }
    public String getLastName(){
    return lastName;
    }
    public  int getAge(){
    return age;
    }
    public boolean isTeen(){
    return age >=13 && age<=19;

    }
}

