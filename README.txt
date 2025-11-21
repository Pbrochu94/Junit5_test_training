# Junit5_test_training
*Introduction*
This project contains 10 exercises designed to practice unit testing in Kotlin using JUnit 5.
Each exercise includes a small function or class along with unit tests covering normal behavior, edge cases, and exception handling.

*Exercises*
Exercise 1 – Simple Addition

Function: add(a: Int, b: Int): Int
Tests:

add(2, 3) == 5

add(-1, 1) == 0

add(0, 0) == 0

Exercise 2 – Division with Exception

Function: divide(a: Int, b: Int): Int
Tests:

divide(10, 2) == 5

divide(5, 0) should throw IllegalArgumentException

Exercise 3 – Check Even or Odd

Function: isEven(n: Int): Boolean
Tests:

2 → true

3 → false

0 → true

-4 → true

Exercise 4 – Calculator Class

Class: Calculator with:

add(a,b)

subtract(a,b)

multiply(a,b)

divide(a,b)

Tests:

Verify all operations with multiple values

Verify that divide throws an exception when dividing by zero

Exercise 5 – Filter Even Numbers

Function:
filterEven(numbers: List<Int>): List<Int>

Tests:

A list should return only even numbers

An empty list should return an empty list

Exercise 6 – Factorial

Function: factorial(n: Int): Int
Tests:

factorial(0)

factorial(5)

factorial(10)

Negative values should throw an exception

Exercise 7 – Palindrome Check

Function: isPalindrome(s: String): Boolean
Tests:

"radar" → true

"hello" → false

"" → true

"a" → true

Exercise 8 – Parameterized Test

Function: square(n: Int): Int
Parameterized test cases:

(2 → 4)

(3 → 9)

(0 → 0)

(-5 → 25)

Exercise 9 – List of Objects

Class:

class Person(val name: String, val age: Int)


Function:
filterAdults(people: MutableList<Person>): MutableList<Person>
→ returns only people who are 18 or older

Tests:

Multiple people with different ages

Verify that only adults are returned

Exercise 10 – Login + Custom Exception

Function:
login(username: String, password: String)

Returns "Logged in" when credentials are correct

Throws InvalidCredentialsException for invalid credentials

Tests:

Valid credentials

Invalid username

Invalid password

Both username and password invalid

*Technologies Used*

- Kotlin

- JUnit 5

- IntelliJ IDEA

- Gradle