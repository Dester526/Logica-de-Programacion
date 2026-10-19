import java.util.Scanner;

import javax.swing.plaf.metal.MetalRadioButtonUI;

public class App {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        
        float Iva = 0.19;
        float TotalValorCompra = 0;
        float descuento = 0.10;
        while (true) { 
            System.out.println("¿Que producto deseas agregar?");
            System.out.println("1. Producto basico");
            System.out.println("2. Producto Medio");
            System.out.println("3. Producto Premnium");
            System.out.println("4. Finalizar compra");
            int Option = sc.nextInt ();
            if (Option == 4) {
                break;         } 
            else if (Option == 1) {
                TotalValorCompra = TotalValorCompra + 25000;
            } else if (Option == 2) {
                TotalValorCompra = TotalValorCompra + 30000;
            } else if (Option == 3) {
                TotalValorCompra = TotalValorCompra + 70000;
            }
        }
        if (TotalValorCompra<=100000) {
            Total = TotalValorCompra * descuento;
            Total = Total * Iva;
        }else {
            Total = TotalValorCompra * Iva;     
        
        }
        System.out.println("La compra fue por un total de: " + Total);
    }
}
