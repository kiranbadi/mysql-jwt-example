# mysql-jwt-example
Spring Security MySQL JWT token based authentication example 
Initial Commit.

1 http://localhost:8081/register  

Register a new user - Post request

Request Body looks like below

{"username":"kiranbadi11","password":"test11","firstName":"Kiran","lastName":"Badi","role":"admin"}


2 http://localhost:8081/authenticate

authenticates new user with JDBC authenication against mysql with Post request and return jwt token

{"username":"kiranbadi11","password":"test11"}

http://localhost:8081/test

Pass Authorization header in below format with jwt token in step 2.

Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJraXJhbmJhZGkxMSIsImV4cCI6MTU2NTU5MzIwMiwiaWF0IjoxNTY1NTc1MjAyfQ.nQpCAzkXwhEIqP5fmlxz7ygPLmR4s3IYfQUMMieP8cSAYTuiunp3EygFxOFD2XR5s8dgtbX4gLglWvWi
