
# Java 8 to Java 17: Features & Changes

## **🔹 Java 8 (2014)**
### **Major Features:**
1. **Lambda Expressions** - Enables functional-style programming.
   ```java
       List<String> list = Arrays.asList("A", "B", "C");
       list.forEach(item -> System.out.println(item));
   ```

2. **Functional Interfaces** - `@FunctionalInterface` annotation introduced.
   ```java
   @FunctionalInterface
   interface MyFunction {
       void apply();
   }
   ```
3. **Streams API** - Allows functional-style operations on collections.
   ```java
   List<String> list = Arrays.asList("one", "two", "three");
   list.stream().filter(s -> s.startsWith("t")).forEach(System.out::println);
   ```
4. **Default & Static Methods in Interfaces**
   ```java
   interface MyInterface {
       default void sayHello() {
           System.out.println("Hello");
       }
   }
   ```

---
## **🔹 Java 9 (2017)**
### **New Features:**
1. **Java Module System (Jigsaw)**
2. **JShell (REPL)** - Interactive execution.
3. **Improved Stream API** - `takeWhile()`, `dropWhile()`.
4. **Factory Methods for Collections**
   ```java
   Set<String> set = Set.of("a", "b", "c");
   ```

---
## **🔹 Java 10 (2018)**
### **New Features:**
1. **Local Variable Type Inference (`var`)**
   ```java
   var url = new URL("http://www.oracle.com");
   ```

---
## **🔹 Java 14 (2020)**
### **New Features:**
1. **Switch Expressions**
   ```java
   return switch (day) {
       case MONDAY, FRIDAY, SUNDAY -> 6;
       case TUESDAY -> 7;
       case THURSDAY, SATURDAY -> 8;
       case WEDNESDAY -> 9;
   };
   ```
2. **Records (Preview)**
   ```java
   record Point(int x, int y) {}
   ```

---
## **🔹 Java 15 (2020)**
### **New Features:**
1. **Text Blocks**
   ```java
   String html = """
       <tr>
           <td>Retweets: %s</td>
           <td>Likes: %s</td>
       </tr>
   """.formatted(t.getRetweetCount(), t.getLikesCount());
   ```

---
## **🔹 Java 16 (2021)**
### **New Features:**
1. **Pattern Matching for `instanceof`**
   ```java
   if (obj instanceof String s) {
       System.out.println(s.length());
   }
   ```

---
## **🔹 Java 17 (2021) [LTS]**
### **New Features:**
1. **Sealed Classes**
   ```java
   public sealed class Shape permits Circle, Rectangle, Square {}
   ```

---
## **🔹 Java 8 vs Java 17: Key Differences**
| Feature | Java 8 | Java 17 |
|---------|--------|---------|
| Streams API | ✅ Available | ✅ Enhanced |
| `var` Keyword | ❌ Not Available | ✅ Introduced in Java 10 |
| Switch Expressions | ❌ Traditional | ✅ Expression-based |
| Text Blocks | ❌ Not Available | ✅ Java 15 |
| Sealed Classes | ❌ Not Available | ✅ Java 17 |

---
## **📝 Interview Questions**
1. What is the difference between Java 8 Streams and Java 9 Streams?
2. How does Java 11 simplify HTTP requests?
3. Explain the benefits of Records in Java 14+.
4. How does the new `switch` expression in Java 14 improve readability?
