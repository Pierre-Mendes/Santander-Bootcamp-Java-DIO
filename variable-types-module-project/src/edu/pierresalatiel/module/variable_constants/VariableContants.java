package edu.pierresalatiel.module.variable_constants;

public class VariableContants {

    public static void main(String[] args) throws Exception {
        int number = 5;
        number = 10;
        System.out.println(number);
        
        double VALOR_DE_PI = 3.14; //Declarar uma função em caixa alta não indica que é uma variável constante
        VALOR_DE_PI = 3.15; //Portanto essa variável pode sofrer alterações
        System.out.println(VALOR_DE_PI);

        final double VALOR_DE_P_2 = 3.14; //Esta convenção indica que é uma variável constante
        //VALOR_DE_P_2 = 3.15; esta convenção não permite alteração de valor na variável
        System.out.println(VALOR_DE_P_2);
    }
}
