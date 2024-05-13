package edu.pierresalatiel.module.class_anatomy.sum;

public class Sum {

    public static void main(String[] args) throws Exception {
        Integer firstNumber = 2;
        Integer secondNumber = 2;

        System.out.println("Result: " + sum(firstNumber, secondNumber));
    }

    protected static int sum(Integer firstNumber, Integer secondNumber) {
        return (firstNumber + secondNumber);
    }
}

