### Strategy Design Pattern
    Helps to define multiple algorithm for the task and we can select any algorithm based
    on the situation.

### Command Design Pattern
    Turns request(commands) into object, allowing you to either parameteized or queue them.
    This helps to decouple the request Sender and Receiver.

### Iterator Design Pattern
    Provides a way to access the elements of a collection, sequentially without exposing the
    underlying representation of the collection.

### Template method Design Pattern
    When you want all the classes to follow specific steps to process the task but provide 
    flexibility that each class can have thier own logic in that specific step.

### Chain of Responsibility Design Pattern
    Allows multiple object to handle a request without the sender needing to know
    which object will ultimatelly process it.

### Mediator Design Pattern
    It encourages loose coupling by keeping the objects from referring to each other explicitly
    and allows them to communicate through a mediator object.

### Interpreter Design Pattern
    Defines grammer for interpreting and evaluating expression.

### Observer Design Pattern
    In this an object(Observable) maintains a list of of it's dependant's(Observer) and notifies
    them of any change in state.

### State Design Pattern
    Allows an object to change it behaviour when it's internal state changes.

### Memento Design Pattern
    Provides an ability to revert object to a previous state, i.e undo capability and it does not
    expose the object internal implementation.
    Originator,Memento and Caretaker

### Visitor Design pattern
    Allows adding new operation to new classes without modifying them and encourage OPEN/CLOSED 
    principle.