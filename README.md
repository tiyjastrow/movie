## Activity: Practice JPA - Pair Programming
- expose REST endpoints that CRUD Movies using JPA

(from https://newline.theironyard.com/courses/7/activities/271)

### Connecting Heroku with Postgres

1. Create a file to populate local environment variables

   - SPRING_DATASOURCE_URL
   - SPRING_DATASOURCE_USERNAME
   - SPRING_DATASOURCE_PASSWORD
   
   (here is my jjenv.sh)
   
   export SPRING_DATASOURCE_URL=jdbc:postgresql://localhost:5432/moviedb
   export SPRING_DATASOURCE_USERNAME=movieuser
   export SPRING_DATASOURCE_PASSWORD=moviepass


2. In the **application.properties** file (and also -dev, -prod)

   - spring.datasource.url=${SPRING_DATABASE_URL}
   - spring.datasource.username=${SPRING_DATASOURCE_USERNAME}
   - spring.datasource.password=${SPRING_DATABASE_PASSWORD}

   - add this line to auto create table (because does'nt exist yet in Heroku)
     - `spring.jpa.hibernate.ddl-auto = create`

3. Create a start-up shell script: set env vars & run Jar file:

(here is my run-dev.sh)  
   . ./jjenv.sh  
   mvn clean compile package  
   cd target  
   java -jar movie-0.0.1-SNAPSHOT.jar
