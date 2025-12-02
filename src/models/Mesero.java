package models;

public class Mesero extends Empleado 
{

    public Mesero(String nombre, String correo) 
    {
        super(nombre, correo);
        this.rol = "Mesero";
    }

    @Override
    public void mostrarMenu() 
    {
        System.out.println("Menú del Mesero");
        System.out.println("1. Ver pedidos asignados");
        System.out.println("2. Marcar pedido como entregado");
        System.out.println("6. Salir");
    }
}
