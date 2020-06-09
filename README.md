# CRUDCatalogue

Application that allows you to modify, create, delete products in a catalog, with a User and Admin authentification.

## Technologies
 - Spring Boot
 - Spring Security
 - Spring MVC
 - Spring Data
 - JPA
 - Hibernate
 - Thymeleaf
 
## Getting Started

### Prerequisites
Please install the following tools:

-   Java
-   Maven
-   MySql
### Running App
Please create a database with the name **'db_cat_mvc_4'** in your SQL client and run the script *'scriptDB.sql'*.

Once the database has been created, please enter the maven command below at the root of the project:
```
mvn clean install
```

### Authentification
Admin role to have all the rights:   
Username: *admin*  
Password : *1234* 

User role only for reading:  
Username: *user*  
Password : *1234*
