# Proyecto de API de Números Aleatorios con Spring

Este proyecto de Spring proporciona una API para trabajar con números aleatorios. Ofrece endpoints específicos para obtener listas de números aleatorios y realizar operaciones específicas con ellos.

## Endpoints

### 1. Obtener una lista de 100 números aleatorios

- **Método:** GET
- **URL:** `/random/numbers`

Este endpoint devuelve una lista de 100 números aleatorios.

### 2. Obtener un número aleatorio con una cantidad específica de dígitos

- **Método:** GET
- **URL:** `/random/number/{digits}`

Este endpoint devuelve un número aleatorio que tendrá la cantidad de dígitos especificada por el parámetro `{digits}`.

### 3. Procesar un número aleatorio y devolver otro con la misma cantidad de dígitos

- **Método:** PUT
- **URL:** `/random/number`
- **Body:** JSON

Este endpoint recibe un número aleatorio en el cuerpo de la solicitud (en formato JSON) y devuelve otro número aleatorio con la misma cantidad de dígitos.

Ejemplo de JSON:

```json
{
    "random": 12345
}

Tecnologías utilizadas

    Java
    Spring Boot
    Maven (o Gradle)

Configuración del Proyecto

Asegúrate de tener Java y Maven instalados. Luego, puedes clonar el proyecto y ejecutarlo localmente.

bash

git clone https://tu-repositorio.git
cd tu-proyecto
mvn spring-boot:run
