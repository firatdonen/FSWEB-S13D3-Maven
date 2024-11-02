//import org.example.Person;
package org.example;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args)
    {
        //Person
        Person person=new Person("John","Doe",20);
        System.out.println("Firstname:"+person.getFirstName());
        System.out.println("Lastname:"+person.getLastName());
        System.out.println("Age:"+person.getAge());

        Person person1= new Person("Ali","Demir",40);
        System.out.println("Adı"+person1.getFirstName());
        System.out.println("Soyad"+person1.getLastName());
        System.out.println("Yaş"+person1.getAge());
        //güncelleme için set metotları oluşturma

        //Wall
        Wall wall= new Wall(4,5);





    }



}
