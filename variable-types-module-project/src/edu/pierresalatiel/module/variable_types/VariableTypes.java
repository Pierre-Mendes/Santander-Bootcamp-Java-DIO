package edu.pierresalatiel.module.variable_types;

public class VariableTypes {

    public static void main(String[] args) throws Exception {
        int age = 0;
        int year = 2002;
        int cep1 = 38956333; //Se não começar com 0 a declaração será parecida com essa
        byte secondAge = 2;//Forma de declaração comum
        short secondYear = 2024;
        float pi = 3.14F;
        long cpf1 = 21133366679L; //Se não começar com 0 a declaração será parecida com essa
        String cpf = "01133366679"; //Se começar com 0 a declaração será parecida com essa
        String cep = "45432660"; //Se começar com 0 a declaração será parecida com essa
        double amount = 2500; //Este valor representa a atrribuição de valor milhar
        double amountSecond = 2.500; //Este valor representa a atrribuição 2,50
        double amountThird = 2500.33; //Este valor representa a atrribuição de valor milhar na convenção americana

        System.out.println("Int variables: " + age + year + cep1);
        System.out.println("Byte variables: " + secondAge);
        System.out.println("Short variables: " + secondYear);
        System.out.println("Float variables: " + pi);
        System.out.println("Long variables: " + cpf1);
        System.out.println("String variables: " + cpf + cep);
        System.out.println("Double variables: " + amount + amountSecond + amountThird);
        /**
         * Os tipos Long e Float precisam encerrar as declarações com L (Long) e F (Float)
         * respectivamente para que o Java possa identificar o tipo
         */

         /**
          * O Java Aceita também o casting de variáveis
          */

          short shortNumber = 1;
          int normalNumber = shortNumber;
          // short shortNumber2 = normalNumber; Convenção com erro de atrribuição
          short shortNumber2 = (short) normalNumber; // Convenção com uso de casting

          System.out.println(shortNumber2);
    }
}
