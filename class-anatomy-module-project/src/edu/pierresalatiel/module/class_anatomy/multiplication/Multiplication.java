package edu.pierresalatiel.module.class_anatomy.multiplication;

public class Multiplication {

    public static void main(String[] args) throws Exception {
        Integer firstNumber = 2;
        Integer secondNumber = 2;

        System.out.println("Result: " + multiplication(firstNumber, secondNumber));
    }

    protected static int multiplication(Integer firstNumber, Integer secondNumber) {
        return (firstNumber * secondNumber);
    }

}
