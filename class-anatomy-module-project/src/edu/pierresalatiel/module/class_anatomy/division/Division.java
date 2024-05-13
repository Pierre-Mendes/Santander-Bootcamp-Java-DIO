package edu.pierresalatiel.module.class_anatomy.division;

public class Division {

    public static void main(String[] args) throws Exception {
        Integer firstNumber = 2;
        Integer secondNumber = 2;

        System.out.println("Result: " + division(firstNumber, secondNumber));
    }

    protected static int division(Integer firstNumber, Integer secondNumber) {
        return (firstNumber / secondNumber);
    }

}
