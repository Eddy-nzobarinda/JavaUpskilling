package com.javaupskilling;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List <String> fizzBuzz(int n){
        List<String> outputArr = new ArrayList<>();
        for (int i=1, fizz=0, buzz=0; i<=n; i++){
            fizz++;
            buzz++;

            if(fizz == 3 && buzz ==5){
                fizz = 0;
                buzz = 0;
                outputArr.add("FizzBuzz");
            }else if (fizz == 3){
                fizz = 0;
                outputArr.add("Fizz");
            }else if(buzz ==5){
                buzz = 0;
                outputArr.add("Buzz");
            }else{
                outputArr.add(Integer.toString(i));
            }
        }
        return outputArr;
    }
}
