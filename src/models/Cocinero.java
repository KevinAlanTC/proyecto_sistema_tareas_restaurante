package models;

public class Cocinero extends Empleado 
{

    public Cocinero(String nombre, String correo) 
    {
        super(nombre, correo);
        this.rol = "Cocinero";
    }

    @Override
    public void mostrarMenu() 
    {
        System.out.println("Menú del Cocinero");
        System.out.println("1. Ver tareas de cocina");
        System.out.println("2. Marcar platillo como preparado");
        System.out.println("6. Salir");
    }
}
