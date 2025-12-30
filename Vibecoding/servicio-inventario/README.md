# 📦 Servicio de Inventario - Spring Boot 3

Microservicio REST desarrollado con Spring Boot 3.2.0 para gestionar un inventario de productos. Incluye Docker multietapa optimizado para despliegues ligeros y eficientes.

## 📋 Características

- ✅ API REST CRUD completa para productos
- ✅ Base de datos H2 (en memoria)
- ✅ Spring Data JPA para persistencia
- ✅ Validación con Jakarta Validation
- ✅ Docker multietapa optimizado
- ✅ Java 17
- ✅ Health checks integrados

## 🛠️ Requisitos Previos

- **Java 17** o superior
- **Maven 3.8** o superior
- **Docker** (para construir y ejecutar en contenedor)
- **Git** (opcional)

### Verificar Requisitos

```bash
java -version
mvn -version
docker --version
```

## 🚀 Levantar el Microservicio Localmente

### 1. Usando Maven

```bash
# Navegar a la carpeta del proyecto
cd servicio-inventario

# Ejecutar directamente
mvn spring-boot:run
```

### 2. Compilar y Ejecutar JAR

```bash
# Compilar el proyecto
mvn clean install

# Ejecutar el JAR generado
java -jar target/servicio-inventario-1.0.0.jar
```

### 3. Desde VS Code

1. Instala la extensión **"Extension Pack for Java"** (Microsoft)
2. Abre la paleta de comandos: `Ctrl+Shift+P`
3. Busca y ejecuta: **Java: Start Debugging**
4. Selecciona **Spring Boot App**

## 🐳 Construir y Ejecutar con Docker

### 1. Construir la Imagen Docker

```bash
# Construir con el nombre y versión
docker build -t servicio-inventario:1.0.0 .

# O simplemente
docker build -t servicio-inventario .
```

**Nota:** La construcción utiliza múltiples etapas y descarga dependencias, puede tardar 3-5 minutos la primera vez.

### 2. Ejecutar el Contenedor

```bash
# Opción 1: Ejecución básica
docker run -d \
  --name inventario-app \
  -p 8080:8080 \
  servicio-inventario:1.0.0

# Opción 2: Con variables de entorno
docker run -d \
  --name inventario-app \
  -p 8080:8080 \
  -e SERVER_PORT=8080 \
  servicio-inventario:1.0.0

# Opción 3: Con logs en tiempo real
docker run -it \
  --name inventario-app \
  -p 8080:8080 \
  servicio-inventario:1.0.0
```

### 3. Verificar que el Contenedor está Corriendo

```bash
# Ver contenedores activos
docker ps

# Ver logs del contenedor
docker logs -f inventario-app

# Verificar salud del contenedor
docker exec inventario-app wget -O - http://localhost:8080/actuator/health
```

### 4. Detener y Eliminar el Contenedor

```bash
# Detener el contenedor
docker stop inventario-app

# Eliminar el contenedor
docker rm inventario-app

# Eliminar la imagen
docker rmi servicio-inventario:1.0.0
```

## 📡 Endpoints de la API

### Base URL
```
http://localhost:8080/api/productos
```

### Crear Producto (POST)

```bash
curl -X POST http://localhost:8080/api/productos \
  -H "Content-Type: application/json" \
  -d '{
    "name": "Laptop Dell XPS",
    "price": 1200.50,
    "quantity": 5
  }'
```

**Respuesta (201 Created):**
```json
{
  "id": 1,
  "name": "Laptop Dell XPS",
  "price": 1200.50,
  "quantity": 5
}
```

### Obtener Todos los Productos (GET)

```bash
curl http://localhost:8080/api/productos
```

### Obtener Producto por ID (GET)

```bash
curl http://localhost:8080/api/productos/1
```

### Actualizar Producto (PUT)

```bash
curl -X PUT http://localhost:8080/api/productos/1 \
  -H "Content-Type: application/json" \
  -d '{
    "name": "Laptop Dell XPS 15",
    "price": 1450.00,
    "quantity": 3
  }'
```

### Eliminar Producto (DELETE)

```bash
curl -X DELETE http://localhost:8080/api/productos/1
```

## 📊 Configuración de Base de Datos

La aplicación utiliza **H2 Database** (base de datos en memoria) por defecto.

### Acceder a la Consola H2

```
URL: http://localhost:8080/h2-console
```

**Credenciales:**
- **JDBC URL:** `jdbc:h2:mem:testdb`
- **Username:** `sa`
- **Password:** (dejar en blanco)

### Cambiar a Base de Datos Externa

Modifica `application.properties`:

```properties
# PostgreSQL
spring.datasource.url=jdbc:postgresql://localhost:5432/inventario
spring.datasource.username=postgres
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect

# MySQL
spring.datasource.url=jdbc:mysql://localhost:3306/inventario
spring.datasource.username=root
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
```

## 🏗️ Estructura del Proyecto

```
servicio-inventario/
├── Dockerfile                 # Configuración Docker multietapa
├── pom.xml                    # Configuración Maven
├── README.md                  # Este archivo
├── src/
│   ├── main/
│   │   ├── java/com/inventario/
│   │   │   ├── ServicioInventarioApplication.java
│   │   │   ├── controller/
│   │   │   │   └── ProductController.java
│   │   │   ├── model/
│   │   │   │   └── Product.java
│   │   │   ├── repository/
│   │   │   │   └── ProductRepository.java
│   │   │   └── service/
│   │   │       └── ProductService.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/com/inventario/
└── target/                    # Archivos compilados (generados)
```

## 📝 Dependencias Principales

```xml
<!-- Spring Boot Web -->
<spring-boot-starter-web>

<!-- Spring Data JPA -->
<spring-boot-starter-data-jpa>

<!-- H2 Database -->
<h2>

<!-- Lombok (generación de código) -->
<lombok>

<!-- Jakarta Validation -->
<jakarta.validation-api>
```

## 🐛 Solución de Problemas

### Error: "Port 8080 is already in use"

```bash
# Opción 1: Cambiar puerto en docker
docker run -d -p 8081:8080 servicio-inventario

# Opción 2: Eliminar contenedor existente
docker rm -f inventario-app
```

### Error: "Build failure" en Docker

```bash
# Limpiar y reconstruir
docker build --no-cache -t servicio-inventario:1.0.0 .
```

### Error: "Connection refused" en la aplicación

```bash
# Verificar que el contenedor está corriendo
docker ps

# Ver logs de error
docker logs inventario-app
```

## 🔒 Seguridad en Docker

El Dockerfile implementa:

- ✅ Usuario no-root (appuser: 1001)
- ✅ Imagen base Alpine Linux (ligera y segura)
- ✅ JRE (no JDK) para reducir superficie de ataque
- ✅ Health checks automáticos

## 📈 Optimizaciones Docker

| Optimización | Beneficio |
|---|---|
| **Multietapa** | Reduce tamaño de imagen final |
| **Alpine Linux** | Base ultra ligera (~40MB) |
| **Caché de capas** | `mvn dependency:go-offline` evita descargas innecesarias |
| **Usuario no-root** | Mejora seguridad |
| **Health check** | Monitoreo automático |

## 🔄 Flujo CI/CD Recomendado

```bash
# 1. Compilar y probar
mvn clean test

# 2. Construir imagen Docker
docker build -t servicio-inventario:1.0.0 .

# 3. Ejecutar tests en contenedor
docker run --rm servicio-inventario:1.0.0 mvn test

# 4. Ejecutar aplicación
docker run -d -p 8080:8080 servicio-inventario:1.0.0

# 5. Verificar salud
curl http://localhost:8080/actuator/health
```

## 📚 Documentación Útil

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Docker Best Practices](https://docs.docker.com/develop/dev-best-practices/)
- [Maven Documentation](https://maven.apache.org/guides/)

## 👨‍💼 Información del Proyecto

- **Nombre:** servicio-inventario
- **Versión:** 1.0.0
- **Java:** 17
- **Spring Boot:** 3.2.0
- **Maven:** 3.8+

## 📞 Soporte

Para reportar problemas o sugerencias, verifica:

1. Que todos los requisitos estén instalados
2. Los logs de la aplicación: `docker logs inventario-app`
3. La consola H2 para verificar la base de datos

---

**Última actualización:** Diciembre 2025
