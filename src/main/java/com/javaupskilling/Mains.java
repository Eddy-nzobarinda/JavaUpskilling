package com.javaupskilling;

public class Mains{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.add(40, 20);
        int sub = calculator.subtract(20,5);
        int multi = calculator.multiply(3,3);
        int div = calculator.divide(10,2);
        System.out.println(div);
        System.out.println(multi);
        System.out.println(sub);
        System.out.println(sum);
    }
}
