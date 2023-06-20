package com.crio.qcalc;


public class App {

    public String getGreeting() {

        return "Hello World!";

    }


   

   public static void main(String[] args) {

    System.out.println("Starting QCalc..");
    System.out.println(new App().getGreeting());
   // ScientificCalculator calc = new ScientificCalculator();

    int result= calc.modulo(5, 2);

    System.out.println("modulo =" + result);

    StandardCalculator calc = new StandardCalculator();

    calc.add(1, 2);

    System.out.println(calc.getResult());

   System.out.println(calc.getResult());

}


}
