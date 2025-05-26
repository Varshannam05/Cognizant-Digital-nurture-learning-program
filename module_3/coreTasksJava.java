// Core Java Exercises (continued)

// 1. Hello World Program
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

// 2. Simple Calculator
import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Choose operation (+ - * /): ");
        char op = sc.next().charAt(0);
        double result;
        switch (op) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': result = num2 != 0 ? num1 / num2 : Double.NaN; break;
            default: result = Double.NaN;
        }
        System.out.println("Result: " + result);
    }
}

// 3. Even or Odd Checker
import java.util.Scanner;
public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println(num % 2 == 0 ? "Even" : "Odd");
    }
}

// 4. Leap Year Checker
import java.util.Scanner;
public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(isLeap ? "Leap Year" : "Not a Leap Year");
    }
}

// 5. Multiplication Table
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}

// 6. Data Type Demonstration
public class DataTypesDemo {
    public static void main(String[] args) {
        int intVal = 100;
        float floatVal = 10.5f;
        double doubleVal = 20.99;
        char charVal = 'A';
        boolean boolVal = true;
        System.out.println("int: " + intVal);
        System.out.println("float: " + floatVal);
        System.out.println("double: " + doubleVal);
        System.out.println("char: " + charVal);
        System.out.println("boolean: " + boolVal);
    }
}

// 7. Type Casting Example
public class TypeCastingExample {
    public static void main(String[] args) {
        double d = 9.78;
        int i = (int) d;
        System.out.println("Double to int: " + i);

        int j = 10;
        double dj = (double) j;
        System.out.println("Int to double: " + dj);
    }
}

// 8. Operator Precedence
public class OperatorPrecedence {
    public static void main(String[] args) {
        int result = 10 + 5 * 2;
        System.out.println("Result: " + result); // Expected: 20
    }
}

// 9. Grade Calculator
import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks out of 100: ");
        int marks = sc.nextInt();
        char grade;
        if (marks >= 90) grade = 'A';
        else if (marks >= 80) grade = 'B';
        else if (marks >= 70) grade = 'C';
        else if (marks >= 60) grade = 'D';
        else grade = 'F';
        System.out.println("Grade: " + grade);
    }
}

// 10. Number Guessing Game
import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int target = rand.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int guess;
        do {
            System.out.print("Guess the number (1-100): ");
            guess = sc.nextInt();
            if (guess < target) System.out.println("Too low!");
            else if (guess > target) System.out.println("Too high!");
            else System.out.println("Correct!");
        } while (guess != target);
    }
}

// 11. Factorial Calculator
import java.util.Scanner;
public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);
    }
}


// 12. Method Overloading
public class MethodOverloading {
    static int add(int a, int b) {
        return a + b;
    }
    static double add(double a, double b) {
        return a + b;
    }
    static int add(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        System.out.println(add(2, 3));
        System.out.println(add(2.5, 3.5));
        System.out.println(add(1, 2, 3));
    }
}

// 13. Recursive Fibonacci
import java.util.Scanner;
public class RecursiveFibonacci {
    static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci(" + n + ") = " + fibonacci(n));
    }
}

// 14. Array Sum and Average
import java.util.Scanner;
public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        double avg = (double) sum / n;
        System.out.println("Sum: " + sum + ", Average: " + avg);
    }
}

// 15. String Reversal
import java.util.Scanner;
public class StringReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed: " + reversed);
    }
}

// 16. Palindrome Checker
import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(reversed) ? "Palindrome" : "Not a Palindrome");
    }
}

// 17. Class and Object Creation
class Car {
    String make, model;
    int year;
    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    void displayDetails() {
        System.out.println(year + " " + make + " " + model);
    }
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2020);
        car1.displayDetails();
    }
}

// 18. Inheritance Example
class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}
class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        a.makeSound();
        d.makeSound();
    }
}

// 19. Interface Implementation
interface Playable {
    void play();
}
class Guitar implements Playable {
    public void play() {
        System.out.println("Guitar is playing");
    }
}
class Piano implements Playable {
    public void play() {
        System.out.println("Piano is playing");
    }
    public static void main(String[] args) {
        Playable g = new Guitar();
        Playable p = new Piano();
        g.play();
        p.play();
    }
}

// 20. Try-Catch Example
import java.util.Scanner;
public class TryCatchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();
            System.out.print("Enter denominator: ");
            int b = sc.nextInt();
            System.out.println("Result: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
    }
}


// 21. Custom Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
class AgeValidator {
    public static void main(String[] args) {
        int age = 16;
        try {
            if (age < 18) throw new InvalidAgeException("Age must be 18 or above");
            System.out.println("Valid age");
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

// 22. File Writing
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileWriteExample {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter text to write to file: ");
            String input = sc.nextLine();
            FileWriter writer = new FileWriter("output.txt");
            writer.write(input);
            writer.close();
            System.out.println("Data written to output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// 23. File Reading
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FileReadExample {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// 24. ArrayList Example
import java.util.ArrayList;
import java.util.Scanner;
public class StudentList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();
        System.out.print("How many students to enter? ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            students.add(sc.nextLine());
        }
        System.out.println("Student names:");
        for (String name : students) System.out.println(name);
    }
}

// 25. HashMap Example
import java.util.HashMap;
import java.util.Scanner;
public class StudentMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        map.put(1, "Alice");
        map.put(2, "Bob");
        map.put(3, "Charlie");
        System.out.print("Enter student ID: ");
        int id = sc.nextInt();
        System.out.println("Name: " + map.getOrDefault(id, "Not Found"));
    }
}

// 26. Thread Creation
class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
        }
    }
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();
    }
}

// 27. Lambda Expressions
import java.util.*;
public class LambdaSort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob");
        Collections.sort(names, (a, b) -> a.compareTo(b));
        names.forEach(System.out::println);
    }
}

// 28. Stream API
import java.util.*;
import java.util.stream.Collectors;
public class EvenStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evens = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        evens.forEach(System.out::println);
    }
}

// 29. Records (Java 16+)
record Person(String name, int age) {}
import java.util.*;
import java.util.stream.Collectors;
public class RecordExample {
    public static void main(String[] args) {
        List<Person> people = List.of(new Person("Alice", 30), new Person("Bob", 20));
        people.stream().filter(p -> p.age() >= 25).forEach(System.out::println);
    }
}

// 30. Pattern Matching for switch (Java 21)
public class PatternSwitch {
    public static void printType(Object obj) {
        switch (obj) {
            case Integer i -> System.out.println("Integer: " + i);
            case String s -> System.out.println("String: " + s);
            case Double d -> System.out.println("Double: " + d);
            default -> System.out.println("Unknown type");
        }
    }
    public static void main(String[] args) {
        printType(123);
        printType("Hello");
        printType(3.14);
    }
}

// 31. Basic JDBC Connection
// Note: Requires JDBC driver and DB setup
import java.sql.*;
public class JDBCConnection {
    public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "user", "pass");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM students");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
        }
        conn.close();
    }
}

// 32. Insert and Update Operations in JDBC
class StudentDAO {
    Connection conn;
    StudentDAO() throws Exception {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "user", "pass");
    }
    void insertStudent(int id, String name) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("INSERT INTO students VALUES (?, ?)");
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.executeUpdate();
    }
    void updateStudent(int id, String name) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("UPDATE students SET name=? WHERE id=?");
        ps.setString(1, name);
        ps.setInt(2, id);
        ps.executeUpdate();
    }
}

// 33. Transaction Handling in JDBC
class TransferService {
    public void transfer(Connection conn, int fromAcc, int toAcc, double amount) throws SQLException {
        try {
            conn.setAutoCommit(false);
            PreparedStatement debit = conn.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?");
            debit.setDouble(1, amount);
            debit.setInt(2, fromAcc);
            debit.executeUpdate();

            PreparedStatement credit = conn.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?");
            credit.setDouble(1, amount);
            credit.setInt(2, toAcc);
            credit.executeUpdate();

            conn.commit();
        } catch (SQLException e) {
            conn.rollback();
            throw e;
        }
    }
}

// 34. Java Modules - Create and Use Java Modules    
// com.utils/module-info.java

module com.utils {
    exports com.utils;
}


// com.utils/com/utils/Utils.java

package com.utils;

public class Utils {
    public static String getMessage() {
        return "Hello from Utils!";
    }
}


// com.greetings/module-info.java

module com.greetings {
    requires com.utils;
}


// com.greetings/com/greetings/Main.java

package com.greetings;

import com.utils.Utils;

public class Main {
    public static void main(String[] args) {
        System.out.println(Utils.getMessage());
    }
}


// Compile modules using terminal:
// javac -d out/com.utils com.utils/module-info.java com.utils/com/utils/Utils.java
// javac -d out/com.greetings --module-path out com.greetings/module-info.java com.greetings/com/greetings/Main.java

// Run:
// java --module-path out -m com.greetings/com.greetings.Main


// 35. TCP Client-Server Chat - Simplified
// Server
import java.net.*;
import java.io.*;
class ChatServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(1234);
        Socket client = server.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);
        out.println("Hello Client");
        System.out.println("Client says: " + in.readLine());
        server.close();
    }
}

// Client
class ChatClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 1234);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        System.out.println("Server says: " + in.readLine());
        out.println("Hello Server");
        socket.close();
    }
}

// 36. HTTP Client API (Java 11+)
import java.net.http.*;
import java.net.*;
import java.io.*;
public class HttpClientExample {
    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://api.github.com")).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Status: " + response.statusCode());
        System.out.println("Body: " + response.body());
    }
}

// 37. Using javap to Inspect Bytecode
class BytecodeDemo {
    public void sayHello() {
        System.out.println("Hello");
    }
}
// Compile then run: javac BytecodeDemo.java && javap -c BytecodeDemo

// 38. Decompile a Class File - Use JD-GUI or CFR tool
// Example: Compile any class and open the .class file in JD-GUI to view source

// 39. Reflection in Java
import java.lang.reflect.*;
public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("java.util.ArrayList");
        Method[] methods = cls.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }
    }
}

// 40. Virtual Threads (Java 21)
public class VirtualThreadsDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            Thread.startVirtualThread(() -> System.out.println("Virtual thread running"));
        }
    }
}

// 41. Executor Service and Callable
import java.util.concurrent.*;
public class CallableExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Callable<String> task = () -> "Task executed";
        Future<String> future = executor.submit(task);
        System.out.println(future.get());
        executor.shutdown();
    }
}
