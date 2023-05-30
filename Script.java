import src.Operator;

public class Script {
    public static void main(String[] args){
        if (args.length > 0){
            // numero : operador : numero
            if (args.length == 3){
                String operador = args[1];
                double a = Double.parseDouble(args[0]);
                double b = Double.parseDouble(args[2]);   
                switch(operador){
                    case "+":
                   System.out.println( Operator.suma(a, b));
                    break;
                    case "-":
                    System.out.println(Operator.resta(a, b));
                    break;
                    case "/":
                    System.out.println(Operator.division(a, b));
                    break;
                    case "x":
                    System.out.println(Operator.multiplicacion(a, b));
                    break;
                    default:
                    System.out.println("operacion invalida");
                } 
            }
           
        }
        
    }
};
