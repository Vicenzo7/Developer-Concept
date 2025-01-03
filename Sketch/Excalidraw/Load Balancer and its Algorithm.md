---

excalidraw-plugin: parsed
tags: [excalidraw]

---
==⚠  Switch to EXCALIDRAW VIEW in the MORE OPTIONS menu of this document. ⚠== You can decompress Drawing data with the command palette: 'Decompress current Excalidraw file'. For more info check in plugin settings under 'Saving'


# Excalidraw Data
## Text Elements
Load Balancer vs  Different Algorithm ^6EaPo9Bo

Load Balancer
-> Load Balancer job is to distribute traffic evenly to all servers ^hmeYKVJb

Load Balancer ^0LJmennL

Network Load Balancer Type
(L4 Balancer) ^Sz8FpFBm

Application Load Balancer Type
(L7 balancer) ^rnyxgtWJ

Can read your header, session, cookies, 
data and also response.

Can also do caching as it can read response.

This Load Balancer is Advance. ^Wht2KOCX

This balancer has source and destination
 port, ip address and hence it is fast ^sTY0VQUN

Static Algorithms

1. Round Robin
2. Weighted Round Robin
3. IP Hash ^Q8z1JRe8

Dynamic Algorithms

1. Least Connection
2. Weighted Least Connection
3. Least Response Time ^5yMQCc5O

Static Algorithms

1. Round Robin ^i3oClypm

Request is distributed uniformly to each servers in a round robin fashion. ^uUzOZtcB

Advantages
    -> Very Easy to implement
    -> Equal Load distribution to all the servers

Disadvantage
    -> One server with high capacity and one with low capacity, both will be treated as
       same.
    -> Chance that low capacity server will go down because of overload of request. ^S1Q4orZN

2. Weighted Round Robin ^3chrT5Uu

Server 1 is more powerful and can handle 5 request
so first five request are sent to server 1, and next request are sent to server 2 and 3 respectively. ^0aWIr0HR

Advantages
    -> Low capacity servers will be saved from receiving large number of request.
    -> Easy to implement as weights are static and no dynamic computation.

Disadvantages
    -> If request have low processing time, then it is possible that low capacity servers
       get high processing request and get overburdened. ^pe78QBUQ

3. IP Hash ^vZ2S4rAw

Users IP address is hashed using a hash function which gives value based on which 
respective server are chosen to fulfill the request.

Eg : sessionAffinity: ClientIP in Service file of Kubernetes ^XQ3FUq5l

Advantages
    -> Good for use cases where same client needs to connect to same server.
    -> Easy to implement.

Disadvantages
    -> If the client is coming through proxy then all clients will have same source IP address,
       and this will overload one server.
    -> Cannot ensure equal distribution. ^Sni0Xsrx

Dynamic Load Balancing

1. Least Connection ^xBTFuYU9

Checks which server has less active connection, after finding directs the new request to
that server.

Server 1 has 10 connection
Server 2 has 50 connection
Server 3 has 100 connection

All the new coming request are directed to server 1 as it has least connection. ^v3cXIu4L

Advantages
    -> Dynamic, as it considers load on each server, so the chance of overburden of server
       is less when each server has equal capacity.

Disadvantages
    -> TCP connection can be active but possible have no traffic. So purpose is failed.
    -> No difference between high and low capacity server. Chances that low capacity server 
       will get overburden. ^hCrBT5HY

2. Weighted Least Connection ^EjJToAgt

Server 1 has 2 active request and its weight is 10
2/ 10 = 0.2

Server 2 has 1 active request and its weight is 1
1 / 1 = 1

So the new request will go to server with minimum ratio
i.e Server 1 ^UQgvDygo

3. Least Response Time
 ^J4jAbjTC

The load balancer computes TTFB or Response time dynamically at regular intervals and stores

When a new request comes it will do the below calculation for all the servers
active connection * TTFB = X

the new request will be sent to that server for which X value is minimum among all servers.
If there is a clash suppose two servers have same minimum value for X, then the request will be
sent to a server by round robin manner.  ^avsShO6C

## Embedded Files
57f06af1d9139ae381c2911d5b09e0a217ba0e49: [[Pasted Image 20241225221228_151.png]]

e283358cd9ac73fd552c4c50bcf2bd68574ce763: [[Pasted Image 20241225222518_682.png]]

977c2e2d9f27225bec8df037d1dc1ec58bfe790c: [[Pasted Image 20241225223449_883.png]]

b7a004006cb6e40ace5092b11818e97db28d6bcd: [[Pasted Image 20241225224704_057.png]]

ffc65fb8fb2c67b8c1d1a312c44e43239f1acd79: [[Pasted Image 20241225225907_750.png]]

7e783bd5b0899cf14c5966b1c446d0e6b969eaec: [[Pasted Image 20241225230320_810.png]]

616ccca7afe2352d90150ef5c69bdb52c4c71c2b: [[Pasted Image 20241225230402_812.png]]

%%
## Drawing
```compressed-json
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
```
%%