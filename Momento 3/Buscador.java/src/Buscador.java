import java.util.Scanner;

public class Buscador {

    public static boolean nombreFuncion(String[] gcoMarcas, String gcoNombreBuscado) {
        for (int gco_i = 0; gco_i < gcoMarcas.length; gco_i++) {
            if (gcoMarcas[gco_i] != null
                    && gcoMarcas[gco_i].equalsIgnoreCase(gcoNombreBuscado.trim())) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] gco_args) {
        System.out.println("[GCO-SYSTEM v1.0 ONLINE]");

        Scanner gco_scanner = new Scanner(System.in);
        String[] gcoReferencias = {"Naf Naf", "Americanino", "Esprit", null, null};
        int gcoOpcionMenu;

        do {
            System.out.println();
            System.out.println("===== MENÚ GCO - VENTA DIRECTA / KLIIKER =====");
            System.out.println("1. Ver marcas");
            System.out.println("2. Validar disponibilidad de marca");
            System.out.println("3. Registrar nueva marca");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            if (!gco_scanner.hasNextInt()) {
                System.out.println("Opción no válida. Elija un número entre 1 y 4.");
                gco_scanner.nextLine();
                gcoOpcionMenu = 0;
                continue;
            }
            gcoOpcionMenu = gco_scanner.nextInt();
            gco_scanner.nextLine();

            switch (gcoOpcionMenu) {
                case 1:
                    System.out.println("--- Marcas vigentes ---");
                    boolean gcoHayMarcas = false;
                    for (int gco_i = 0; gco_i < gcoReferencias.length; gco_i++) {
                        if (gcoReferencias[gco_i] != null) {
                            System.out.println((gco_i + 1) + ". " + gcoReferencias[gco_i]);
                            gcoHayMarcas = true;
                        }
                    }
                    if (!gcoHayMarcas) {
                        System.out.println("No hay marcas registradas.");
                    }
                    break;

                case 2:
                    System.out.print("Nombre de la marca a validar: ");
                    String gcoNombreBuscado = gco_scanner.nextLine().trim();
                    boolean gcoDisponible = nombreFuncion(gcoReferencias, gcoNombreBuscado);
                    if (gcoDisponible) {
                        System.out.println("La marca \"" + gcoNombreBuscado + "\" ya está registrada.");
                    } else {
                        System.out.println("La marca \"" + gcoNombreBuscado + "\" está disponible.");
                    }
                    break;

                case 3:
                    System.out.print("Nombre de la nueva marca: ");
                    String gcoNuevaMarca = gco_scanner.nextLine().trim();
                    if (gcoNuevaMarca.isEmpty()) {
                        System.out.println("El nombre no puede estar vacío.");
                        break;
                    }
                    boolean gcoRegistrada = false;
                    for (int gco_i = 0; gco_i < gcoReferencias.length && !gcoRegistrada; gco_i++) {
                        if (gcoReferencias[gco_i] == null) {
                            gcoReferencias[gco_i] = gcoNuevaMarca;
                            gcoRegistrada = true;
                            System.out.println("Marca \"" + gcoNuevaMarca + "\" registrada en la posición "
                                    + (gco_i + 1) + ".");
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

        gco_scanner.close();
    }


