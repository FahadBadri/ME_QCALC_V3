
package com.crio.qcalc;


public class StandardCalculator {


   private int result;
  

   public int getResult() {

       return result;

   }

   

  

// other arithmetic operation methods
int res;
public void add(int num1, int num2){
    int res = num1 + num2;
    
    setResult(res);
    }


public void subtract(int num1, int num2){
int res = num1 - num2;

    setResult(res);
}
public void multiply(int num1, int num2){
int res = num1 * num2;
    
    setResult(res);
}
public void divide(int num1, int num2){
int res = num1 / num2;
   
    setResult(res);
}
  
 private void setResult(int value) {

      this.result = value;

   }
   
public void clearResult() {

    result = 0;

}

public void printResult(){

    System.out.println("Standard Calculator Result:"+ getResult());

}



}
