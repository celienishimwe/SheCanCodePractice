package FullPractice.StaticsInstanceConsctuctorReference;

public class Person {
    String name;

    public Person(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Hello my name is :" + name);
    }
}
