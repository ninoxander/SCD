package src;

public class Operator {
 /*
 Implementar suma, resta, multiplicacion y division.
  */   
    public static double suma(double a, double b){
        return a+b;
    }
    public static double resta(double a, double b){
        return a-b;
    
    }
    public static double multiplicacion(double a, double b){
        return a*b;
    }
    public static double division(double a, double b){
        if( a==0 || b == 0){
            return -1;
        }
        return a/b;
    }

}
