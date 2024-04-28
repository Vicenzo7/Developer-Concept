### Singleton Design Pattern
    A Singleton class guarantees that only one instance of the class exists throughout
    the application's lifecycle.

    Global Access Point: It provides a way to access its unique instance globally. 
    Any part of the application can access the Singleton instance without needing to
    instantiate it.

    Lazy Initialization: The Singleton instance is usually created lazily, i.e.,
    only when it's needed for the first time.

    Thread Safety: The Singleton pattern can be implemented in a thread-safe manner to 
    ensure that the instance creation is thread-safe.

### Factory Design Pattern 
    The Factory design pattern provides an interface for creating objects, but lets 
    subclasses decide which class to instantiate. It encapsulates the object creation 
    logic and abstracts it away from the client code.

### Abstract Factory Design Pattern
    The Abstract Factory pattern defines an interface for creating families of related 
    objects without specifying their concrete classes, promoting loose coupling and 
    high cohesion between the objects.


### Builder Design Pattern
    The Builder pattern separates the construction of a complex object from its 
    representation, allowing step-by-step creation and providing control over the 
    construction process.

### Prototype Design Pattern
    The Prototype pattern creates new objects by copying an existing object, known as 
    a prototype, rather than invoking constructors. It provides a way to clone objects 
    and is useful when the cost of creating a new instance is high or complex.