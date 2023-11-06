	package Logica;
	
	import java.util.*;
	import javax.swing.JOptionPane;

	public class Producto {
	    private String nombre;
	    private int cantidad;
	    private float iva;
	    private double precio;
	    ArrayList<Producto> productos = new ArrayList<>();

	    public Producto() {
	    }

	    public void guardar() {
	    	Producto e = new Producto();
	        e.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del producto:"));
	        e.setCantidad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del producto:")));
	        e.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto:")));
	        productos.add(e);
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public int getCantidad() {
	        return cantidad;
	    }

	    public void setCantidad(int cantidad) {
	        this.cantidad = cantidad;
	    }

	    public float getIva() {
	        return iva;
	    }

	    public void setIva(float iva) {
	        this.iva = iva;
	    }

	    public double getPrecio() {
	        return precio;
	    }

	    public void setPrecio(double precio) {
	        this.precio = precio;
	    }

	    public void masvendido() {
	    }

	    public void menosvendido() {

	    }

	    public void buscar() {

	    }

	    public void modificar() {

	    }

	    public void eliminar() {

	    }

	    public void validardatos() {

	    }

	    public void reporteproducto() {
	        String reporte = "Reporte del Producto:\n\n";
	        Iterator<Producto> productoIterator = productos.iterator();

	        while (productoIterator.hasNext()) {
	            Producto producto = productoIterator.next();
	            reporte += "Nombre: " + producto.getNombre() + "\n";
	            reporte += "Cantidad: " + producto.getCantidad() + "\n";
	            reporte += "Precio: " + producto.getPrecio() + "\n";
	        }

	        JOptionPane.showMessageDialog(null, reporte);
	    }
	}