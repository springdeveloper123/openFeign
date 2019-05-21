# openFeign
## Running the demo

Demo can be run using the following command

```
git clone https://github.com/springdeveloper123/openFeign.git

To start Course-Service
cd openFeign
cd Course-Service
mvn clean install
mvn spring-boot:run

To start StudentResult-Service
cd openFeign
cd StudentResult-Service
mvn clean install
mvn spring-boot:run

To start Student-Service
cd openFeign
cd Student-Service
mvn clean install
mvn spring-boot:run
```
### Testing Demo Application
- GET Url for all students : http://localhost:8080/students
- GET Url for given student id : http://localhost:8083/students/1
- GET Url for all student course details : http://localhost:8080/students/course
- GET Url for given student with course details : http://localhost:8080/students/course/1
- GET Url for given student with course and results : http://localhost:8083/students/course/marks/1
