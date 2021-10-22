# spring-rest-service

https://spring.io/guides/tutorials/rest/

Dependencies:

- **Spring Web**: Build web, including RESTful, applications using Spring MVC. 
  Uses Apache Tomcat as the default embedded container.
- **Spring Data JPA**: Persist data in SQL stores with Java Persistence API 
  using Spring Data and Hibernate.
- **H2 Database**:  Provides a fast in-memory database that supports JDBC API 
  and R2DBC access, with a small (2mb) footprint.


Test per tutti gli _HTTP methods_

GET
```
curl -v localhost:8080/employees

curl -v localhost:8080/employees/1
```

POST
```
 curl -X POST localhost:8080/employees -H  'Content-type:application/json'  -d '{"name": "Franco Treboldi", "role": "project manager"}'
```

PUT
```
 curl -X POST localhost:8080/employees -H  'Content-type:application/json'  -d '{"name": "Franco Treboldi", "role": "project manager"}'
```

UPDATE
```
curl -X PUT localhost:8080/employees/2 -H  'Content-type:application/json'  -d '{"name": "Alessandro Venturilli", "role":
"dev back-end e font-end web"}'
```

DELETE
```
curl -X DELETE localhost:8080/employees/1
```