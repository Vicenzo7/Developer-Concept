## Problem:
```java
public static void printVehicleDetails(Vehicle vehicle) {
    System.out.println("Seating Capacity: "+vehicle.getSeatingCapacity());
    System.out.println("Tank Capacity: "+vehicle.getTankCapacity());
}
```

- The above code is not safe, it can throw null pointer exception 

## Solution:
```java
public static void printVehicleDetails(Vehicle vehicle) {
    if (vehicle != null) {
        System.out.println("Seating Capacity: " + vehicle.getSeatingCapacity());
        System.out.println("Tank Capacity: " + vehicle.getTankCapacity());
    }
}
```

- The problem is we have thousands of method, and we will need to put these check multiple times
- Question is how to avoid this not null check?
- Here comes the "Null Object Design Pattern"

### Null Object Design Pattern Provides the Following

- A null object replaces Null return type
- No need to put if check for putting null
- Null Object reflects do Nothing or Default behavior


