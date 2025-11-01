H2: in memory database

1) request params / query params
2) parth variables
3) request body (GET)

hibernate:
ORM: OBJECT RELATIONAL MAPPING

JPA: Jakarta persistance api, - spring 6
java persistance api - < 6
-> ORM (abstract orm) Interfaces - abstract methods

Jpa - Dance, Hibernate - Dancer

Hibernate: ORM , caching L1, trans (95%)
2 levels
ehcache, radis L2 ("LRU")-> 

MyBatis: ORM

# june25-jdbctemplate


# JPA
## Put and Patch
## custom methods
## jpql/ hql
## one to one mapping
## fetchtype
## cascade

## consuming apis
rest template
webclient
feign client

## aops

## MS
------

# Multithreading
thread life cycle - creating of thread - runnable - deadlocks 
executor framework - future - callable - thread pools
completable future

## Transaction management:
isolation, propgation, read only



one to many
book Review

many to one
review book



------------
write a cron job, scheduled job in spring
run every 5 min, go through all reviews, avg it out and persist (upadate) rating

--------------
make update rating, (avg out and updating rating) -> async method