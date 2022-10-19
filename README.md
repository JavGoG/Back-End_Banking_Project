# Back-end Banking project

## Why this project?

I wanted to do a Banking application to figure out how that could be, because I would like to work for a bank as back-end developer. I used the instructions and best practices that I learnt at CodeClan.

## Technical Review

This is a back-end desktop application built with Maven, written in Java 8 with Spring. The project was initialized with the Spring Boot initializr tool and 4 main dependences were added to it: Spring Web, Spring Data JPA, Spring Boot DevTools and PostGreSQL driver. The application works with a 'banking' database, previously created with the command 'createdb banking' on terminal. This database has got two main tables, 'customers' and 'accounts'. The 'accounts' table is @manyToOne relationship and the 'customers' table is @oneToMany relationship.

## Functionality

The program creates, modifies, deletes and retrieves bank accounts from the 'customers' table, the same way works for the 'accounts' table. These operations are made using the unique and single identifier id of every account, except for creating a new account or new customer.

![image](https://user-images.githubusercontent.com/85517520/196001415-cdab3c75-5206-468c-b611-f1e9e344c826.png)
