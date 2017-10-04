## Activity: Practice JPA - Pair Programming
- expose REST endpoints that CRUD Movies using JPA

(from https://newline.theironyard.com/courses/7/activities/271)

### Connecting Heroku with Postgres

1. Create a file to populate local environment variables (see jjenv.sh)

   - SPRING_DATASOURCE_URL
   - SPRING_DATASOURCE_USERNAME
   - SPRING_DATASOURCE_PASSWORD


2. In the **application.properties** file (and also -dev, -prod)

   - spring.datasource.url=${SPRING_DATABASE_URL}
   - spring.datasource.username=${SPRING_DATASOURCE_USERNAME}
   - spring.datasource.password=${SPRING_DATABASE_PASSWORD}

   - add this line to auto create table (does'nt exist yet in Heroku)
     - `spring.jpa.hibernate.ddl-auto = create`

3. Create a start-up shell script: set env vars & run Jar file:

   - (see run-dev.sh)