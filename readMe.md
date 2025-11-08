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
isolation (session new / requires/ no session), propgation, read only



one to many
book Review

many to one
review book



------------
write a cron job, scheduled job in spring
run every 5(* * * */5 *) min, go through all reviews, avg it out and persist (upadate) rating
-------------
Spring Batch 
--------------
make update rating, (avg out and updating rating) -> async method @async

Spring security (Dailycodebuffer)
@websecurityconfigureradapter -> @

configure ovverride (objetct of http)
1 : authorization
http.
ant matchers.("/order/**").hasRole("operator")

|| 2 : Authentication
Auth managers | Auth Provider (DAO (user - pwd) Auth provider)| (JWT (token) provider) | OAuth provider(optional)
UserDetailService | User

--------------
Filterchain -> auth headers


------
db to app
app to fe


-------------
@Transient -> entity or DTOs - properties -don't want to serialize
---
# MS

consuming of APIs

Rest APIS

Web Services | Rest APIs -> HTTP, JWT, format nutral 
SOAP -> XML , stateful(sessions), login, HTTP sessions -> JWT (Json web token)
    , limited scaling - increase the capacity 
    1) vertical scalling -> increase resources capacity by cpu/memory
    2) horizontal scalling -> run additional instances (5 copies of same servers)

SOAP APIs -> simple object access protocol: HTTP : POST , 
    WSDL file -> Web Service Discriptional lang,
    XSDs (DTOs) , operation details

-----------------
Rest Template -> Spring Web -> Spring MVC -> 
Web Client -> reactive framework
Feign Client -> Netflix