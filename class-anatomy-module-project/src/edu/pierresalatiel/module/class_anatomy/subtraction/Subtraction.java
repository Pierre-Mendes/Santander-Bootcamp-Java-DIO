package edu.pierresalatiel.module.class_anatomy.subtraction;

public class Subtraction {

    public static void main(String[] args) throws Exception {
        Integer firstNumber = 3;
        Integer secondNumber = 2;

        System.out.println("Result: " + subtraction(firstNumber, secondNumber));
    }

    protected static int subtraction(Integer firstNumber, Integer secondNumber) {
        return (firstNumber - secondNumber);
    }

}

