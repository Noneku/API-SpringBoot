# Utilisation de l'image de base OpenJDK 21
FROM openjdk:21-jdk-slim

# Définir le répertoire de travail à l'intérieur du conteneur
WORKDIR /app

# Copier le fichier JAR de votre application dans le conteneur
COPY target/sdbm-0.0.1-SNAPSHOT.jar /app/app.jar

# Définir les variables d'environnement pour la connexion à la base de données
ENV SPRING_DATASOURCE_URL=jdbc:mysql://localhost:3306/bieres_db
ENV SPRING_DATASOURCE_USERNAME=bieres_user
ENV SPRING_DATASOURCE_PASSWORD=bieres_password
ENV SPRING_JPA_PROPERTIES_HIBERNATE_DIALECT=org.hibernate.dialect.MySQLDialect

# Commande pour exécuter votre application Spring Boot
CMD ["java", "-jar", "app.jar"]



