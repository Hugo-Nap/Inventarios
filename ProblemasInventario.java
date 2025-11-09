import java.util.Scanner;

public class ProblemasInventario { 
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //Pedir datos al usuario 
        System.out.println("Inserte el Demanda 'Valor D': ");
        double D = reader.nextDouble();
        System.out.println("Inserte el Costo de pedido 'Valor K': ");
        double k = reader.nextDouble();
        System.out.println("Inserte el costo de Almacenamiento 'Valor h': ");
        double h = reader.nextDouble();
        System.out.println("Incerte el tiempo de entrega 'Valor L': ");
        double L = reader.nextDouble();

        //llamado de metodos
        System.out.println("Cantidad de pedido" + CantidadPedido(k, D, h));
    }
    //metodos para cada una de las formulas
    //metodo del valor 'y' 
    public static double CantidadPedido(double k, double d, double h){
        return Math.sqrt((2*k*d)/h);
    }
    //metodo del valor 't0' 
}