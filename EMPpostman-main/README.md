Put cloned folder in eclipse-workspace-web folder 
Files
Import
New Maven project
Then browse
src/main/java
com.example.demo
Demoapplication.java(run it)
Value= employee
localhost:8080/employee
Now postman
Click plus at left corner
Then name it as EMP
GET (put localhost:8080/employee) then click send
And click save
Select POST
value= add-emp
localhost:8080/add-emp 
In it
Headers
Key- Content-Type 
Value- application/json
Body-select raw
 {"id":1,
    " name": "Joe",
      "role": "HR" } 
Click on the send button
localhost:8080/employee
For showing database localhost:8080/h2-console
Then click on employee at left top and run the query
