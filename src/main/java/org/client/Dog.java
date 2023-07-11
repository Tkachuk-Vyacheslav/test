package org.client;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.client.dto.runable;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Dog extends Animal implements Sweemable, runable , Cloneable{

    public static String color;
    public static String gender;

    private String poroda;
    private String heigt;
    private String weight;
   public  List<String> list = new ArrayList<>();


    static {
        color = "grey";
    }

    static {
        gender = "male";
    }

    {
        heigt = "12";

    }

    {
        poroda = "овчарка";
        weight = "3";
    }


    Dog(int age) {
        super(age);
    }

//   // void run() {
//        System.out.println("dog is running");
//    }

    @Override
    public void run() {

    }

    @Override
    public void runQweekly() {
        Sweemable.super.runQweekly();
    }




    @Override
    public void sound(String x) {
        System.out.println("dog does gav-gav");
    }

    @Override
    public void swim() {

    }

    @Override
    public void sit() {

    }


    @Override
    public boolean equals(Object o) {
        if (this.getClass() != o.getClass()) return false;

        return true;
    }


    @Override
    public int hashCode() {
        int result = poroda == null ? 0 : poroda.hashCode();

        return result;
    }




    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }





}
