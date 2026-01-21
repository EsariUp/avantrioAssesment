1. System Architecture:
   I'm using microservice architecture. Since, it gives clear domain seperation,
   independent scaling & deployment,and handles the traffic grows as well.

high level system design ---> CLient --> API Gateway ---> Services --> Databases

2. Database Design:

Which type of database (SQL or NoSQL) would you choose?
SQL used as primary
NoSql as secondary

A simple/high-level diagram to illustrate the database design.
User service --> SQL DB
Order service --> SQL DB
Cart service --> Redis/NoSQL
Cache Layer --> Redis

3. Rendering Approach:

Would you go with server-side rendering (SSR) or a separate frontend-backend architecture? Explain your decision
separate frontend-backend architecture. Since it gives a decoupled architecture to improve the flexibility,
Easy to maintain.

4. Technology Stack:

Which frontend technology would you choose, and why (e.g., React, Vue, etc.)?
React -- component based architecture, excellent performance with the virtual dom, easy integration with REST APIs

Which backend technology would you choose, (e.g., Node & Express, Python & Django, Java & SpringBoot), and why?
Spring Boot -- fast development. non-blocking

5. Cloud Infrastructure:

Which cloud provider (AWS, Azure, GCP) and services would you use to deploy your platform, and why?
AWS

Services used,
EC2--> application hosting
RDS ---> Relational DB (PostgreSQL/MYSQL)
S3---> Static assets & images
Application load balancer ---> traffic distribution
Auto scaling --> handle traffic spikes
Redis --> caching & cart data

Reasons to use AWS,
Mature eco system, strong scalability,Global availability

6. Scalability:

How would you design the system to handle a significant increase in traffic (e.g., Black Friday)?
Horizontal Scaling - auto scaling backend services based on CPU/memory usage
Caching - Reduce db data load
Load Balancing - Used AWS AlB to distribute traffic evenly
Database optimization - Used indexing to fetch the data
Async processing for order processing - Kafka

