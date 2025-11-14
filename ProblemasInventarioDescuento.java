import java.util.Scanner;

public class ProblemasInventarioDescuento {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double cantidadCn[];
        //pedir datos al usuario
        System.out.println("Cual es el valor de k (Costo del pedido): ");
        double valorK = reader.nextDouble();
        System.out.println("Cual es el valor de D (Demanda): ");
        double valorD = reader.nextDouble();
        System.out.println("incerte cuantos costos se van a tener? ");
        double valorCn = reader.nextDouble();
        cantidadCn = new double[(int)(valorCn)];
        for(int i = 0; i < valorCn; i++){
            System.out.println("inserte el valor de C"+ (i+1) + " : ");
            cantidadCn[i] = reader.nextInt();
        }
        System.out.println("Incerte el valor del porcentaje: ");
        double valorI = reader.nextDouble();

        //llamado del los metodos
        for(int i = 0;i < valorCn; i++){
            System.out.println("Valor de h"+ (i+1) +": " + h(cantidadCn[i], valorI));
        }
        for(int i = 0; i < valorCn; i++){
            System.out.println("Cantidad de pedido (valor y*"+(i+1)+"): " + cantidadPedido(valorK, valorD, h(cantidadCn[i], valorI)));
        }
        for(int i = 0; i < valorCn; i++){
            System.out.println("CTU" + (i+1) +": " + CTU(cc(valorD, cantidadCn[i]), co(valorK, valorD, cantidadPedido(valorK, valorD, h(cantidadCn[i], valorI))), cm(h(cantidadCn[i], valorI), cantidadPedido(valorK, valorD, h(cantidadCn[i], valorI)))));
        }

    }
    //metodos para cada una de las formulas
    //metodo del valor 'y' 
    //metodo copiado del otro tipo de problema de inventarios
    public static double cantidadPedido(double k, double d, double h){
        return Math.sqrt((2*k*d)/h);
    }
    public static double CTU(double cc,double co, double cm){
        return cc + co + cm;
    }
    public static double h (double c, double i){
        return c * i;
    }
    public static double cc(double d,double c){
        return d*c;
    }
    public static double co(double k, double d, double y){
        return (k*d)/y;
    }
    public static double cm(double h,double y){
        return (h*y)/2;
    }
}
