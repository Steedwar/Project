package Logica;

import java.util.*;
import javax.swing.JOptionPane;

public class Cliente {
    private String cedula;
    private String nombre;
    private long telefono;
    private String email;
    ArrayList<Cliente> clientes = new ArrayList<>();

    public Cliente() {
    }
    public void guardar() {
    	Cliente e= new Cliente();
        e.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del cliente:"));
        e.setCedula(JOptionPane.showInputDialog("Ingrese la cédula del cliente:"));
        String telefonoStr = JOptionPane.showInputDialog("Ingrese el teléfono del cliente:");
        e.setTelefono(Long.parseLong(telefonoStr));
        e.setEmail(JOptionPane.showInputDialog("Ingrese el email del cliente:"));
        clientes.add(e);
        }
        
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void buscar() {
        
    }

    public void modificar() {
        
    }

    public void eliminar() {
       
    }

    public void validardatos() {
    	
    }
    

    public void reportecliente() {
        String reporte = "Reporte del Cliente:\n\n";
        Iterator<Cliente> clienteIterator = clientes.iterator();

        while (clienteIterator.hasNext()) {
            Cliente cliente = clienteIterator.next();
            reporte += "Nombre: " + cliente.getNombre() + "\n";
            reporte += "Cédula: " + cliente.getCedula() + "\n";
            reporte += "Teléfono: " + cliente.getTelefono() + "\n";
            reporte += "Email: " + cliente.getEmail() + "\n";
        }

        JOptionPane.showMessageDialog(null, reporte);
    }
}