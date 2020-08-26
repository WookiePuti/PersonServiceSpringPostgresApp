# PersonServiceSpringPostgresApp

A Spring Boot app which connects to a database in order to get some informations about users.

The most important feature is implementation of a connection with the dependency injection.
Classes which are a data access object are annotated as a repository.
Thanks to that, in a person service, we are able to add a Qualifier into constructor dependency injection and switch between database interfaces easily.

What is more, a PostgreSQL database was used.
Database was running on a docker caontainer, which maps its ports properly. The app connects to the port properly.
I use flyway to database migration. This solution creates a database schema and table within a sql config file.

Possible upgrades:
- Tests with use of Mockito to mock DAO objects
- Deployment on Amazon aws
- More sophisticated table and sql commands
