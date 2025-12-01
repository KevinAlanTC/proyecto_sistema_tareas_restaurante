# Paquete models

## Descripción
Este paquete contiene las **clases del dominio** que representan los actores y entidades del sistema de tareas del restaurante.

## Contenido
- `Usuario.java`: clase base con atributos comunes (nombre, email, rol).
- `Empleado.java`: hereda de Usuario, representa trabajadores estándar.
- `Cocinero.java`: hereda de Empleado, prepara platillos.
- `Mesero.java`: hereda de Empleado, atiende clientes y entrega pedidos.
- `PersonalLimpieza.java`: hereda de Empleado, mantiene limpio el restaurante.
- `Administrador.java`: hereda de Usuario, gestiona usuarios y tareas.
- `Tarea.java`: representa una actividad asignada a un usuario.

## Responsabilidad
Definir la **estructura de datos** y comportamientos básicos de cada rol y tarea.

## Notas
- Mantener atributos encapsulados (usar getters/setters).
- Seguir convenciones de nombres claras para roles y tareas.
