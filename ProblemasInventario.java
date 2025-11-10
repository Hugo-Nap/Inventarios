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
        System.out.println("n = " + valorN(L, tCero(D, cantidadPedido(k, D, h))));
        double nProvicional = valorN(L, tCero(D, cantidadPedido(k, D, h)));// variable ocupada para reducir el tamaño de cada llamada de metodo posterior que ocupe n
        System.out.println("Le = " + valorLe(L, nProvicional, tCero(D, cantidadPedido(k, D, h))));
        System.out.println("Punto de Reorden = " + puntoReorden(valorLe(L, nProvicional, tCero(D, cantidadPedido(k, D, h))), D));
        System.out.println("Costo total inventario = " + TCU(k, cantidadPedido(k, D, h), D, h));
    }
    //metodos para cada una de las formulas
    //metodo del valor 'y' 
    public static double cantidadPedido(double k, double d, double h){
        return Math.sqrt((2*k*d)/h);
    }
    //metodo del valor 't0' 
    public static double tCero(double d, double y){
        return Math.floor((y/d)*100)/100; //Redondeo a solo dos decimales para hacer coincidir los resultaados de Le y punto de reorden-
    }
    //metodo del valor 'n'
    public static double valorN(double L,double tCero){
        return Math.floor(L/tCero); // redondear el numero entero hacia abajo
    }
    //metodo del valor 'Le'
    public static double valorLe(double L, double n, double tCero){
        return L-(n*tCero);
    }
    //metodo del Punto de reorden
    public static double puntoReorden(double le, double d){
        return le*d;
    }
    //metodo de Costo total de inventario
    public static double TCU(double k,double y,double d,double h){
        //primera divición 
        double div1 = y / d ;
        //terminar la divicion de la formula k/(y/d)
        double divFinal = k / div1;
        //retornar formula completa TCU = k/(y/d) + h(y/2)
        return divFinal + h*(y/2);
    }
}