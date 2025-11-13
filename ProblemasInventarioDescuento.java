import java.util.Scanner;

public class ProblemasInventarioDescuento {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double cantidadHn[];
        //pedir datos al usuario
        System.out.println("Cual es el valor de k (Costo del pedido): ");
        double valorK = reader.nextDouble();
        System.out.println("Cual es el valor de D (Demanda): ");
        double valorD = reader.nextDouble();
        System.out.println("incerte cuantos costos se van a tener? ");
        double valorHn = reader.nextDouble();
        cantidadHn = new double[(int)(valorHn)];
        for(int i = 0; i <= valorHn; i++){
            System.out.println("inserte el valor de C"+ i + " : ");
            cantidadHn[i] = reader.nextInt();
        }
        System.out.println("Incerte el valor del porcentaje: ");
        double valorI = reader.nextDouble();
    }
    //metodos para cada una de las formulas
    //metodo del valor 'y' 
    //metodo copiado del otro tipo de problema de inventarios
    public static double cantidadPedido(double k, double d, double h){
        return Math.sqrt((2*k*d)/h);
    }
}
