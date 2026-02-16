package FullPractice.Generics;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate <T> {

    List<T> list = new ArrayList<>();
    public T value;

    public void NoDuplicate( T value){
         if(list.contains(value)){
             System.out.println("Duplicate Value Not Allowed");
             }
         else{
             list.add(value);
             System.out.println("element added successfully");
         }
    }

}
