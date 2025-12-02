# Flujo de trabajo con comandos

1. Clonar el repositorio (solo la primera vez)
  ```bash
  git clone https://github.com/KevinAlanTC/proyecto_sistema_tareas_restaurante.git
  cd proyecto_sistema_tareas_restaurante
  ```

2. Crear y moverse a la rama de desarrollo
  ```bash
  git checkout -b dev
  git push -u origin dev
  ```

3. Crear una rama de funcionalidad desde dev
Cada integrante crea su rama para trabajar en una parte específica:
  ```bash
  git checkout dev
  git pull origin dev   # Traer lo último de dev
  git checkout -b nombre-de-la-nueva-rama
  ```

4. Hacer commits frecuentes
  ```bash
  git add .
  git commit -m "Mensaje breve pero explicativo sobre el commit"
  ```

5. Subir la rama al remoto
  ```bash
  git push -u origin nombre-de-la-nueva-rama
  ```

6. Actualizar tu rama con cambios de otros
Si otro compañero ya subió algo a dev, antes de seguir trabajando:
  ```bash
  git checkout dev
  git pull origin dev
  git checkout nombre-de-la-nueva-rama
  git merge dev
  ```
7. Pull Request (PR)
Cuando la funcionalidad está lista:
  En GitHub, abrir un PR de tu rama hacia dev.
  Otro compañero revisa y aprueba.
  Se hace el merge en dev.

8. Integrar dev en main
Cuando todo está probado y estable:

  ```bash
  git checkout main
  git pull origin main
  git merge dev
  git push origin main
  ```

## Ejemplo de ramas
- feature-models → clases de dominio (Usuario, Empleado, Tarea).
- feature-services → lógica de negocio (SistemaTareas, Notificador).
- feature-storage → manejo de archivos.
- feature-tests → pruebas unitarias.
