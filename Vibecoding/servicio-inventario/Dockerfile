# Stage 1: Build
FROM maven:3.8.1-openjdk-17 AS builder

WORKDIR /build

# Copiar archivos de configuración de Maven
COPY pom.xml .

# Descargar dependencias (se cachea si no cambia pom.xml)
RUN mvn dependency:go-offline -B

# Copiar código fuente
COPY src ./src

# Compilar y empaquetar
RUN mvn clean package -DskipTests

# Stage 2: Runtime
FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

# Copiar JAR desde la etapa de construcción
COPY --from=builder /build/target/servicio-inventario-1.0.0.jar app.jar

# Crear usuario no-root por seguridad
RUN addgroup -g 1001 appuser && \
    adduser -D -u 1001 -G appuser appuser && \
    chown -R appuser:appuser /app

USER appuser

# Exponer puerto
EXPOSE 8080

# Health check
HEALTHCHECK --interval=30s --timeout=3s --start-period=5s --retries=3 \
    CMD wget --no-verbose --tries=1 --spider http://localhost:8080/actuator/health || exit 1

# Ejecutar aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]