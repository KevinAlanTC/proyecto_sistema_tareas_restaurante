package models;

public class PersonalLimpieza extends Empleado 
{

    public PersonalLimpieza(String nombre, String correo) 
    {
        super(nombre, correo);
        this.rol = "Personal de Limpieza";
    }

    @Override
    public void mostrarMenu() 
    {
        System.out.println("Menú del Personal de Limpieza");
        System.out.println("1. Ver tareas de limpieza");
        System.out.println("2. Marcar área como limpia");
        System.out.println("6. Salir");
    }
}
