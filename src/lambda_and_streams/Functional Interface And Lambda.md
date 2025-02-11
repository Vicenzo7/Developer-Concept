## Functional Interface and Lambda Expression

### What is Functional Interface?

- If an interface contains only one abstract method, that is known as Functional Interface.
- Also known as SAM (Single Abstract Method)
-  @FunctionalInterface annotation is used at the top of the interface 

```java
@FunctionalInterface
public interface Bird {
    void canFly(String val);
}
```
OR

```java
public interface Bird {
    void canFly(String val);
}
```

```java
@FunctionalInterface
public interface Bird {
    void canFly(String val);
    void getHeight();
}

/*
    @FunctionalInterface Annotation restrict us and throws compilation error, if we try to ass more than 1
    abstract method 
*/
```


```java
@FunctionalInterface
public interface Bird {
    void canFly(String val);
    default void getHeight() {
        // default method implementation
    }
    
    static void canEat() {
        // static method implementation
    }
    
    String toString(); // Object class method
}

/*
    In Functional Interface, only 1 abstract method is allowed, but we can have other methods like default,
    static methods or methods inherited from Object class
*/
```


### What is Lambda Expression ?

- Lambda expression is a way to implement the Functional Interface 
- Before going further into Lambda expression, lets first see:

    
What are the different ways to implement Functional Interface:
 1. Using "implements"
    ```java
    @FunctionalInterface
    public interface Bird {
        void canFly(String val);
    }
    
    public class Eagle implements Bird {
        
        @Override
        public void canFly(String val) {
            System.out.println("Eagle Bird Implementation");
        }
    }
    ```
 2. Using "anonymous class"
    ```java
    @FunctionalInterface
    public interface Bird {
        void canFly(String val);
    }
    
    public static void main(String[] args) {
        Bird eagleObject = new Bird() {
            @Override public void canFly(String val) {
            System.out.println("Eagle Bird Implementation");
        }};
    
        eagleObject.canFly("vertical");
    }
    ```
3. Using "Lambda Expression"
   ```java
     @FunctionalInterface
     public interface Bird {
         void canFly(String val);
     }
     
     public static void main(String[] args) {
         Bird eagleObject = (String value) -> System.out.println("Eagle Bird Implementation");
         eagleObject.canFly("vertical");
     }
    ```

### Types of Functional Interface

1. Consumer 
    - Represent an operation that accept a single input parameter and return no result.
    ```java
    @FunctionalInterface
    public interface Consumer<T> {
        void accept(T t);
    }
    
   public static void main(String[] args) {
         Consumer<Integer> consumer = (Integer val) -> {
            if (val > 10) {
                System.out.println("Value greater than 10");
            }
         };
        consumer.accept(13);
   }
   ```
2. Supplier
    - Represent the supplier of the result.
    - Accepts no input parameter but produces a result
    ```java
    @FunctionalInterface
    public interface Supplier<T> {
        T get();
    }
    
   public static void main(String[] args) {
         Supplier<String> supplier = () -> "This is the data I'm returning";
         System.out.println(supplier.get());
   }
   ```
3. Function
    - Represent function, that accept one argument process it and produce a result.
    ```java
    @FunctionalInterface
    public interface Function<T, R> {
        R apply(T t);
    }
    
   public static void main(String[] args) {
        Function<Integer,String> function = (Integer number) -> String.valueOf(number);
        System.out.println(function.apply(43));
   }
   ```
4. Predicate
    - Represent function, that accept one argument and return boolean value.
    ```java
    @FunctionalInterface
    public interface Predicate<T> {
        boolean test(T t);
    }
    
   public static void main(String[] args) {
         Predicate<Integer> isEvenNumber = (Integer number) ->  (number % 2 == 0);
        System.out.println(function.apply(43));
   }
   ```
   
### Handle use cases when Functional Interface extends from other interface:
1. Functional Interface extending Non-Functional Interface

   ```java
     public interface LivingThings {
       void canBreathe();
     }
     
     @FunctionalInterface
     public interface Bird extends LivingThings {
       void canFly(String val);
     }
   ```
      - In the above function interface the interface has two abstract method hence we cannot annotate with @FunctionalInterface
      - The above will throw compilation error.

   ```java
     public interface LivingThings {
       default boolean canBreathe() {
           return true;
       }
     }
     
     @FunctionalInterface
     public interface Bird extends LivingThings {
       void canFly(String val);
     }
   ```
    - This works fine because here the functional interface has only one abstract method

2. Interface extending Functional Interface
   ```java
     @FunctionalInterface
     public interface LivingThings {
       void canBreathe();
     }
     
     public interface Bird extends LivingThings {
       void canFly(String val);
     }
   ```
   
   - The above works fine because Functional Interface has one abstract method

3. Functional Interface extending other functional interface

   ```java
     @FunctionalInterface
     public interface LivingThings {
       void canBreathe();
     }
     
     @FunctionalInterface
     public interface Bird extends LivingThings {
       void canFly(String val);
     }
   ```
   - The above will not work because the interface Bird now has two abstract method which disrupts the property of Functional Interface

   ```java
     @FunctionalInterface
     public interface LivingThings {
       void canBreathe();
     }
     
     @FunctionalInterface
     public interface Bird extends LivingThings {
       void canBreathe();
     }
   ```
   - The above will work because both the functional interface has same method, it just like the interface Bird overrides the canBreathe() method