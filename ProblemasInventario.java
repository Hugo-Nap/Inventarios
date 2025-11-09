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
        System.out.println("y* = " + cantidadPedido(k, D, h));
        System.out.println("t0 = " + tCero(D, cantidadPedido(k, D, h)));
        System.out.println("Le = " + Le(L,valorN(L,tCero(D, cantidadPedido(k, D, h))),tCero(D,cantidadPedido(k, D, h))));
    }
    //metodos para cada una de las formulas
    //metodo del valor 'y' 
    public static double cantidadPedido(double k, double d, double h){
        return Math.sqrt((2*k*d)/h);
    }
    //metodo del valor 't0' 
    public static double tCero(double d, double y){
        return y/d;
    }
    //metodo del valor 'n'
    public static double valorN(double L,double t0){
        return L/t0;
    }
    //metodo del valor 'Le'
    public static double Le(double L, double n, double t0){
        return(8-(2*t0));
    }
}