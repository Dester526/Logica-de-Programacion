import java.util.Scanner;

public class Buscador {
    
    public static void main(String[] args) throws Exception {
    

       public static boolean nombreFuncion(String[] gcoMarcas, String gcoNombreBuscado) {
        boolean gcoEncontrada = false;
 
        for (int gco_i = 0; gco_i < gco_marcas.length; gco_i++) {
            if (gcoMarcas[gco_i] != null && gcoMarcas[gco_i].equalsIgnoreCase(gcoNombreBuscado.trim())) {
                gcoEncontrada = true;
            }
        }
 
        return gcoEncontrada;
    }
 
    public static void main(String[] gco_args) {
        System.out.println("[GCO-SYSTEM v1.0 ONLINE]");
 
        Scanner gcoScanner = new Scanner(System.in);
        String[] gcoReferencias = {"Naf Naf", "Americanino", "Esprit", null, null};
        int gcoOpcionMenu = 0;

         do {
            System.out.println();
            System.out.println("===== MENÚ GCO - VENTA DIRECTA / KLIIKER =====");
            System.out.println("1. Ver marcas");
            System.out.println("2. Validar disponibilidad de marca");
            System.out.println("3. Registrar nueva marca");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
 
            switch (gcoOpcionMenu) {
                case 1:
                    System.out.println("--- Marcas vigentes ---");
                    boolean gcoHayMarcas = false;
                    for (int gco_i = 0; gco_i < gcoReferencias.length; i++) {
                        if (gcoReferencias[gco_i] != null) {
                            System.out.println((gco i + 1) + ". " + gcoReferencias[i]);
                            gcoHayMarcas = true;
                        }
                    }
                    if (!gcoHayMarcas) {
                        System.out.println("No hay marcas registradas.");
                    }
                    break;
 
                case 2:
                    System.out.print("Nombre de la marca a validar: ");
                    String gcoNombreBuscado = new Scanner.nextLine();
                    boolean gcoDisponible = nombreFuncion(gcoReferencias, gcoNombreBuscado);
                    if (gcoDisponible) {
                        System.out.println("La marca \"" + gcoNombreBuscado + "\" SÍ está disponible.");
                    } else {
                        System.out.println("La marca \"" + gcoNombreBuscado + "\" NO está disponible.");
                    }
                    break;
 
                case 3:
                    System.out.print("Nombre de la nueva marca: ");
                    String gcoNuevaMarca = new Scanner.nextLine().trim();
                    if (gcoNuevaMarca.isEmpty()) {
                        System.out.println("El nombre no puede estar vacío.");
                        break;
                    }
                    boolean gcoRegistrada = false;
                    for (int gco i = 0; gco i < gcoReferencias.length && !gcoRegistrada; i++) {
                        if (gcoReferencias[i] == null) {
                            gcoReferencias[i] = gco_nuevaMarca;
                            gcoRegistrada = true;
                            System.out.println("Marca \"" + gcoNuevaMarca + "\" registrada en la posición " + (i + 1) + ".");
    }
                    }
                    if (!gcoRegistrada) {
                        System.out.println("No hay espacio disponible: el arreglo está lleno.");
                    }
                    break;
 
                case 4:
                    System.out.println("Finalizando programa. ¡Hasta pronto!");
                    break;
 
                default:
                    System.out.println("Opción no válida. Elija un número entre 1 y 4.");
            }
        } while (gcoOpcionMenu != 4);
 
        gcoScanner.close();
    }
    }
}

 


