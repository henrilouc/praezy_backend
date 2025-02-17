# Usando a imagem do OpenJDK 17
FROM openjdk:21-jdk-slim

# Diretório de trabalho dentro do container
WORKDIR /app

# Copiar o arquivo JAR gerado pela sua aplicação para o container
COPY build/libs/prayz-0.0.1-SNAPSHOT.jar app.jar

# Expõe a porta da aplicação
EXPOSE 8080

# Comando para rodar o JAR da aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
