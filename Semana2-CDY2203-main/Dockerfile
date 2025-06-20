# Usar imagen base ligera de Java 17
FROM openjdk:17-jdk-slim

# Crear directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el .jar compilado dentro del contenedor
COPY target/backend-0.0.1-SNAPSHOT.jar app.jar

# Exponer el puerto que usará la aplicación
EXPOSE 8180

# Ejecutar el jar al iniciar el contenedor
ENTRYPOINT ["java", "-jar", "app.jar"]
