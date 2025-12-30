# Instrucciones Copilot - Servicio de Inventario

## Descripción del Proyecto

Proyecto Spring Boot 3 con Maven para gestionar un servicio de inventario. Incluye las siguientes dependencias:
- Spring Web
- Spring Data JPA
- H2 Database
- Lombok

## Estructura del Proyecto

```
servicio-inventario/
├── src/
│   ├── main/
│   │   ├── java/com/inventario/
│   │   │   └── ServicioInventarioApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/java/com/inventario/
├── pom.xml
├── README.md
├── .gitignore
└── .github/
    └── copilot-instructions.md
```

## Configuración Actual

- **Java Version**: 17
- **Spring Boot Version**: 3.2.0
- **Maven Version**: 3.8.0+
- **Puerto de Aplicación**: 8080
- **Base de Datos**: H2 (en memoria)

## Dependencias Configuradas

1. **spring-boot-starter-web**: Desarrollo de aplicaciones web REST
2. **spring-boot-starter-data-jpa**: ORM con Hibernate
3. **h2**: Base de datos embebida
4. **lombok**: Generación automática de getters, setters, constructores
5. **spring-boot-devtools**: Recarga automática en desarrollo
6. **spring-boot-starter-test**: Framework de testing

## Próximos Pasos Recomendados

### 1. Crear Estructura de Paquetes
```
com.inventario/
├── entity/        (Entidades JPA)
├── repository/    (Repositorios Spring Data)
├── service/       (Lógica de negocio)
├── controller/    (Controladores REST)
├── dto/          (Data Transfer Objects)
└── exception/    (Excepciones personalizadas)
```

### 2. Crear Entidad de Ejemplo
Crear una entidad `Producto` en `src/main/java/com/inventario/entity/Producto.java`

### 3. Crear Repositorio
Crear un repositorio en `src/main/java/com/inventario/repository/ProductoRepository.java`

### 4. Crear Servicio
Implementar la lógica de negocio en `src/main/java/com/inventario/service/ProductoService.java`

### 5. Crear Controlador REST
Crear endpoints REST en `src/main/java/com/inventario/controller/ProductoController.java`

### 6. Agregar Tests
Crear tests unitarios e integración en `src/test/java/com/inventario/`

## Ejecución del Proyecto

### Con Maven
```bash
mvn clean install
mvn spring-boot:run
```

### Acceso a Consola H2
Después de ejecutar, acceder a: http://localhost:8080/h2-console

**Credenciales H2:**
- URL: jdbc:h2:mem:testdb
- Usuario: sa
- Contraseña: (vacía)

## Comandos Útiles de Maven

```bash
# Limpiar y compilar
mvn clean compile

# Ejecutar tests
mvn test

# Empaquetar como JAR
mvn clean package

# Ejecutar la aplicación
mvn spring-boot:run

# Ver dependencias
mvn dependency:tree
```

## Notas de Desarrollo

- Lombok está configurado para reducir código boilerplate
- DevTools habilitado para recarga rápida durante desarrollo
- H2 usa base de datos en memoria que se resetea al reiniciar
- La consola H2 es útil para debugging y consultas directas

## Instrucciones para Soporte

Si necesitas ayuda:
1. Verifica los logs en la consola
2. Accede a la consola H2 para inspeccionar datos
3. Usa `mvn dependency:tree` para validar dependencias
4. Revisa el README.md para más información

---
Generado: 29 de Diciembre de 2025
