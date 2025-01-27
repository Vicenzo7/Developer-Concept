---

excalidraw-plugin: parsed
tags: [excalidraw]

---
==⚠  Switch to EXCALIDRAW VIEW in the MORE OPTIONS menu of this document. ⚠==


# Excalidraw Data
## Text Elements
Online Food Delivery System ^3AIrFUqt

Zomato/Swiggy ^xA3Za1KF

Functional Requirement
1. User need to login into our application.
2. Search restaurants based on location.
3. List all food items of a particular restaurant.
4. Place order from a particular restaurant.
5. Do the payment.
6. Receive the notification.
7. Live tracking of the delivery agent. ^PcqkR2TB

Non functional Requirement
1. Scalable
2. Reliable
3. Modular
4. Maintainable ^lWdwzt7T

Actors
1. Customers(User)
2. Restaurant Owner(Operator) ^b8acNeVO

Object
1. User(Account)
2. Customer
3. Restaurant
4. FoodItems
5. Cart
6. Payment
7. Order
8. Notification System ^9C1BNk4h

LOW LEVEL DESIGN ^Ve1iohWp

Restaurant ^AgI5guLS

string name;
string description;
double rating;
Addresss address;
Menu menu;

+updateRestaurantInfo();
+updateMenu(Menu menu);
 ^nbtQYBto

Address ^CdnoSSVd

string address;
int pincode;
string city;
string country;
long longitude;
long latitude; ^kIUxpmT9

Menu ^oOeYvkDm

List<FoodItems> items; ^gWXbcCRd

FoodItem ^0kRu0hLt

string name;
string description;
double rating;
double price; ^FypWbZDG

User ^cvuwn4rK

string name;
Address address;
string email;
string password;
int phoneNo; ^YOIL4krz

Customer ^2toDH1yM

User user;
List<Order> previousOrders;
Cart cart

+updateInfo();
+placeOrder(Order order); ^QOqYZ5Wi

Cart ^bCozTa2x

int cartId;
List<FoodItemDetails> details; ^eF0zJ35Q

FoodItemDetails ^YCeE4AyT

FoodItem foodItem;
int quantity;
Restaurant restuarant; ^ZDWJIDiH

Order ^e8amZ8SM

int orderId;
Date orderDate;
Timestamp orderTime;
int cartId;
Card details;
Status status; ^RsXvyiYq

FoodOrdermanagementSystem ^zr9mP2UL

Map<Address,List<Restaurants>> locationVsRestaurants;
List<Restaurant> restaurants;
List<Customer> customers;


+signInSignUp();
+searchRestaurantsByLocation(Location location);
+listAllFoodItems(Restaurant rest);
+placeOrder(Order order);
+sendNotification(Order details); ^nkhVjfWo

Notification Server ^9ye5OJ4D

%%
## Drawing
```compressed-json
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=
```
%%