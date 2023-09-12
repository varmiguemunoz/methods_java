import java.util.Scanner;

public class methodReturnMain {
    public static void main(String[] args) {
        //Insert data 1
        System.out.print("Insert first value a: ");
        Scanner scanner_1 = new Scanner(System.in);
        int num_1 = scanner_1.nextInt();

        //Insert data 2
        System.out.print("Insert first value a: ");
        Scanner scanner_2 = new Scanner(System.in);
        int num_2 = scanner_2.nextInt();

        int suma =  num_1 + num_2;
        int resta =  num_1 - num_2;
        int divicion =  num_1 / num_2;
        int multiplicacion =  num_1 * num_2;

        //Call the methods
        methodReturn result = new methodReturn(suma, resta, divicion, multiplicacion);

        int sumaResponse = result.suma(num_1, num_2);
        int restaResponse = result.resta(num_1, num_2);
        int multiplicacionResponse = result.multiplicacion(num_1, num_2);
        int divicionResponse = result.divicion(num_1, num_2);
        System.out.println("El resultado de la suma fue "+ sumaResponse);
        System.out.println("El resultado de la resta fue "+ restaResponse);
        System.out.println("El resultado de la divicion fue "+ divicionResponse);
        System.out.println("El resultado de la multiplicacion fue "+ multiplicacionResponse);
    }

}
