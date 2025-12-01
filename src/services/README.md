# Paquete services

## Descripción
Este paquete contiene la \*\*lógica de negocio\*\* del sistema, coordinando la interacción entre usuarios, tareas y almacenamiento.

## Contenido
- `SistemaTareas.java`: gestiona usuarios y tareas (alta, asignación, listado).
- `Notificador.java`: envía alertas de vencimiento de tareas.

## Responsabilidad
Centralizar la gestión de usuarios y tareas, asegurando que las operaciones se realicen de forma controlada.

## Notas
- Mantener separación clara entre lógica de negocio y modelos.
- SistemaTareas actúa como gestor central, no debe contener lógica de presentación.

