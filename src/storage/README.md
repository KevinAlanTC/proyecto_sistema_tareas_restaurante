# Paquete storage

## Descripción
Manejo de almacenamiento y recuperación de datos (usuarios y tareas).

## Contenido
- `ArchivoManager.java`: guardar y cargar usuarios/tareas en archivos de texto.

## Responsabilidad
Garantizar la persistencia de la información del sistema en archivos o bases de datos.

## Ejemplo de uso
```java
ArchivoManager.guardarUsuarios(listaUsuarios, "usuarios.txt");
ArchivoManager.cargarUsuarios("usuarios.txt");

# Notas
- Mantener independencia de la lógica de negocio.

// Pendiente a revisión si verdaderamente es útil
