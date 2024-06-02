## What is a microservice
- monolithic architechture
  
![image](https://github.com/akshaynarsanne01/CDACMaterial/assets/147087536/3f16de25-ba54-445d-b988-cb7774de0b13)

A single microservice contains Routing, Middlewares, Business Logic and Database access to implement **one feature** of our app.

![image](https://github.com/akshaynarsanne01/CDACMaterial/assets/147087536/3a84e092-30f5-489d-8156-d675913b1982)

- each of the service are self contained
  - own database
  - own routing
  - own features

- if one of the service fails then it wont affect other part ( other services / microservices ).

## Big challenges 
- Data management between services
    - We are never going to access other database directely.
    - Each service we create run independent of other.
    - This pattern is called **Database-Per-Service**
    - Database schema/structure might change unexpectedly
    - Some services might function more efficiently with different types of DB's (sql vs nosql).
### Communication Strategies Between services
  #### Synchronous :
  - Services communicate with each other using direct requests.
  - To get the data we make calls to the service of our requirement and we use it
  - We wont access the database directly
  - **downsites** :
      - Dependency between services
      - If inter-service fails the overall request fails
      - The entire request is only as fast as the slowest request
      - Can easily introduce webs of requests
        
          ![image](https://github.com/akshaynarsanne01/CDACMaterial/assets/147087536/80f153b2-65eb-40df-966f-1c265762318e)
        
  #### Asynchronous : 
  ##### Event based 
  - Services comminicate with each other using events.
  - We emmit events from the services
      something happen to the application after this event.
  - each service might emmit event or recieve event from the bus.
  - downsites
    - still have dependency between services
    - entire request is only as fact as the slowest request
    - can easily introduce webs of requests
  ##### Database + Event Based
  - if we can create a own database for the perticular service then it solve the problem
  - but it has its own challenges
  - if we do this then the servicices need to tell the perticular service that i have data do this and update yourself.
  - we use event bus to tell the service that data is recieved if you need use this
  - zero dependencies on other services
  - the service will be extremely fast ( for whom we are creating this )
  - downsite
    - extra cost data duplication
    - hard to understand
  - but it wont be much expensive
  
