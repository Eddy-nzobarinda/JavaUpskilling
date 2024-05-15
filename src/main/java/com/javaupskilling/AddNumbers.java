package com.javaupskilling;

public class AddNumbers {

public static class Add{
    public int addition(int a, int b){
        return a+b;
    }
}

    public static void main(String[] args) {
    Add addNumbers=new Add();
    int sum=addNumbers.addition(30,17);
    System.out.println(sum);


    }
}
