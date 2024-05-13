package edu.pierresalatiel.module.class_anatomy.division_rest;

public class DivisionRest {

    public static void main(String[] args) throws Exception {
        Integer firstNumber = 2;
        Integer secondNumber = 2;

        System.out.println("Result: " + divisionWithRest(firstNumber, secondNumber));
    }

    protected static int divisionWithRest(Integer firstNumber, Integer secondNumber) {
        return (firstNumber % secondNumber);
    }

}
