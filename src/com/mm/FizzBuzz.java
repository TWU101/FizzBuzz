package com.mm;

public class FizzBuzz {

    public String divisibleByNumber(int inputNumber) {
        if (inputNumber % 15 == 0){
            return "FizzBuzz";
        } else if (inputNumber % 3 == 0) {
            return "Fizz";
        } else if (inputNumber % 5 == 0) {
            return "Buzz";
        } else{
            return  Integer.toString(inputNumber);
        }
    }

    public void fizzToNumber(int number){
        for (int i = 0; i < number; i++){
            System.out.println(divisibleByNumber(i));
        }
    }
}
