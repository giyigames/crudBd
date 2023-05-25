# API de Gestión de Usuarios

Esta es una API de gestión de usuarios desarrollada en Spring Boot que permite realizar operaciones CRUD (Crear, Leer, Actualizar y Eliminar) sobre usuarios almacenados en una base de datos MySQL. La API utiliza los métodos HTTP correspondientes para cada endpoint.

## Configuración

- Puerto: 8090
- Base de datos: MySQL

## Endpoints

### Obtener todos los usuarios

Obtiene la lista de todos los usuarios.

- Método: GET
- URL: `http://localhost:8090/users`

### Crear un usuario

Crea un nuevo usuario con los datos proporcionados.

- Método: POST
- URL: `http://localhost:8090/saveuser`

#### Parámetros de la solicitud

La solicitud POST debe incluir los siguientes parámetros en el cuerpo (en formato JSON):

- `identificacion` (string): Identificación del usuario.
- `nombre` (string): Nombre del usuario.
- `email` (string): Email del usuario.
- `telefono` (string): Teléfono del usuario.

### Actualizar un usuario

Actualiza los datos de un usuario existente identificado por su ID.

- Método: PUT
- URL: `http://localhost:8090/update/{id}`

#### Parámetros de la solicitud

La solicitud PUT debe incluir los siguientes parámetros en el cuerpo (en formato JSON):

- `nombre` (string): Nuevo nombre del usuario.
- `email` (string): Nuevo email del usuario.
- `telefono` (string): Nuevo teléfono del usuario.

### Eliminar un usuario

Elimina un usuario existente identificado por su ID.

- Método: DELETE
- URL: `http://localhost:8090/delete/{id}`

Reemplaza `{id}` en la URL con el ID numérico del usuario que deseas eliminar.

## Ejemplo de uso

1. Obtener todos los usuarios:

   - Método: GET
   - URL: `http://localhost:8090/users`

2. Crear un nuevo usuario:

   - Método: POST
   - URL: `http://localhost:8090/saveuser`
   - Cuerpo de la solicitud (en formato JSON):
     ```json
     {
       "identificacion": "123456789",
       "nombre": "John Doe",
       "email": "johndoe@example.com",
       "telefono": "1234567890"
     }
     ```

3. Actualizar un usuario existente:

   - Método: PUT
   - URL: `http://localhost:8090/update/1`
   - Cuerpo de la solicitud (en formato JSON):
     ```json
     {
       "nombre": "Nuevo Nombre",
       "email": "nuevoemail@example.com",
       "telefono": "9876543210"
     }
     ```

4. Eliminar un usuario existente:

   - Método: DELETE
   - URL: `http://localhost:8090/delete/1`

Recuerda reemplazar `{id}` en la URL con el ID numérico del usuario específico en las solicitudes de actualización y eliminación.