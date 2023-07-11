package org.client;


// testing comment 11111111111111111111111111111111111111

public  class Animal {

    String heiqht;
    int age;


    Animal(int age) {
    this.age = age;
    }

    public Animal() {
    }



    public void someMeth() {
        System.out.println("any animal method");
    }


   public void sound(String s) throws EmailNotUniqueException {

            if (s.equals("fuckoff"))
                throw new EmailNotUniqueException("fuckOff? beach!!");

        System.out.println("animal gives some sound");
    }

}
