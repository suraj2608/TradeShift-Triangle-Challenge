# TradeShift-Triangle-Challenge

Problem Statement:
Write a program that will determine the type of a triangle. It should take the lengths of the triangle's three sides as input, and return whether the triangle is equilateral, isosceles or scalene.

Brief Description of class files:
i) TriangleTask.java : The main class which accepts input. 
ii) Triangle.java : Java class which validates the input and determines the type of triangle.
iii) TriangleType.java : Class that contains an enum object containing the different triangle types. 
iv) TestTriangle.java : Java class that is used for unit testing using JUnit.

# How to compile and run
I used Eclipse to run the main Java class (TriangleTask.java). 
However, if you are using command line, please follow the steps given below:

i) Compile with
```
javac TriangleTask.java Triangle.java TriangleType.java
```

ii) Run the main class with
```
java TriangleTask
```

# Unit Testing
I added the junit-4.10.jar file as an external library on Eclipse and ran the test class (TestTriangle.java). 
This tutorial (https://www.tutorialspoint.com/junit/junit_plug_with_eclipse.htm) is useful to install JUnit and run test classes 
in Eclipse using JUnit.If you want to run the test class from the command line, please follow the steps given below:

i) Compile with
```
javac TestTriangle.java
```

ii) Run the test class with
```
java org.junit.runner.JUnitCore TestTriangle
```
