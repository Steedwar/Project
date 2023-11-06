package Interfaz;

import java.util.*;
import javax.swing.JOptionPane;
import Logica.Cliente;
import Logica.Producto;

public class Tienda {
	//ArrayList<Cliente> clientes = new ArrayList<>();
	//ArrayList<Producto> productos = new ArrayList<>();
    public Tienda() {
    }

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int op;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción: \n1. Cliente \n2. Producto \n3. Venta total \n4. Promedio de venta \n5. Salir"));

            switch (op) {
                case 1:
                    menuCliente();
                    break;
                case 2:
                    menuProducto();
                    break;
                case 3:
                    ventatotal();
                    break;
                case 4:
                    promediodeventa();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        } while (op != 5);
    }

    private static void menuCliente() {
    	Cliente em= new Cliente();
        int opc;

        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Menú Cliente: \n1. Guardar cliente\n2. Buscar cliente\n3. Modificar cliente\n4. Eliminar cliente\n5. Validar datos de cliente\n6. Reporte de cliente\n7. Volver al menú principal"));

            switch (opc) {
                case 1:
                	em.guardar();
                    break;
                case 2:
                    // buscar cliente
                    break;
                case 3:
                    // modificar cliente
                    break;
                case 4:
                    // eliminar cliente
                    break;
                case 5:
                    // validar datos de cliente
                    break;
                case 6:
                    // reporte de cliente
                    em.reportecliente();
                    break;
                case 7:
                    return;
            }
        } while (opc != 7);
    }

    private static void menuProducto() {
    	Producto em= new Producto();
        int opp;

        do {
            opp = Integer.parseInt(JOptionPane.showInputDialog("Menú Producto: \n1. Guardar producto\n2. Buscar producto\n3. Modificar producto\n4. Eliminar producto\n5. Producto más vendido\n6. Producto menos vendido\n7. Validar datos de producto\n8. Reporte de producto\n9. Volver al menú principal"));

            switch (opp) {
                case 1:
                    em.guardar();
                    break;
                case 2:
                    // buscar producto
                    break;
                case 3:
                    // modificar producto
                    break;
                case 4:
                    // eliminar producto
                    break;
                case 5:
                    //producto más vendido
                    break;
                case 6:
                    // producto menos vendido
                    break;
                case 7:
                    // validar datos de producto
                    break;
                case 8:
                    //reporte de producto
                	em.reporteproducto();
                    break;
                case 9:
                    return;
            }
        } while (opp != 9);
    }

    private static void ventatotal() {
        // TODO implement here
    }

    private static void promediodeventa() {
        // TODO implement here
    }
}


 