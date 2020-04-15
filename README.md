# Homework
Spring Boot Micorservice - PoC

Project will run on http://localhost:8080 and expose 3 REST endpoints:

http://localhost:8080/users

~~~
# Insert
curl -i -X POST -H "Content-Type:application/json" -d "{  \"userName\" : \"Frodo Bagginsova Tetka\",  \"userAddress\" : \"11070\" }" http://localhost:8080/users

#Get User by Id
curl http://localhost:8080/users/5e9608ff165b5b23954920c5
~~~

http://localhost:8080/products

~~~
#Insert
curl -i -X POST -H "Content-Type:application/json" -d "{  \"productName\" : \"Anananas\",  \"productPrice\" : \"1225\" }" http://localhost:8080/products

#Get Product By Id
curl http://localhost:8080/products/5e96087bebc4b37c367ec605
~~~

http://localhost/api/tax2

~~~
# Calculate Tax is GET Request with userId and productId as parameters
http://localhost:8080/tax/api2?userId=5e960931165b5b23954920c6&productId=5e8dbbaaae78e114f22dc6ec
~~~

It will show PoC for Spring MVC. Users and Products are stored in MongoDB (Cloud Atlas). Tax calculation is done using Users address and Products price.

### Mongo DB

Database connection link is in application.properties, where proper user/pass is needed.

Mongo DB is running in the cloud, not on the localhost. It is needed to configure connection string in the application.properties.

NoSQL Database. No Relations. 

