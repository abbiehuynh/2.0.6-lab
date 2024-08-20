# Lab 2.0.6

**Objective**

This lab aims to teach beginners how to create a Java program that converts temperatures between Celsius and Fahrenheit
scales. The main focus is on using type casting to handle decimal results accurately. Through this exercise, students
will gain practical experience with basic input/output operations, arithmetic calculations, and type conversion in Java.

**Prerequisites**

- Basic understanding of Java programming
- Familiarity with variables, data types, and basic arithmetic operations in Java

**What You'll Achieve**

By the end of this lab, you will have:

- Developed a solid understanding of temperature conversion formulas
- Implemented type casting to handle decimal results in Java
- Created a practical program that can be applied in real-world scenarios
- Enhanced your skills in basic input/output operations and arithmetic calculations
- Gained experience in formatting output for better readability

**Assignment Details**

- Use the predefined temperature values in the starter code.
- Convert the temperature to the other scale using the appropriate formula:
    - Celsius to Fahrenheit: (C × 9/5) + 32
    - Fahrenheit to Celsius: (F - 32) × 5/9
- Use type casting to ensure accurate decimal results.
- Display the converted temperature with two decimal places.

**Example Output**

```text
Temperature Conversions:
0.00°C is equal to 32.00°F
100.00°C is equal to 212.00°F
32.00°F is equal to 0.00°C
98.60°F is equal to 37.00°C
```

**Starter Code**

```java
package academy.javapro.lab;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        // Predefined temperature values
        double celsius1 = 0.0;
        double celsius2 = 100.0;
        double fahrenheit1 = 32.0;
        double fahrenheit2 = 98.6;

        // TODO: Implement temperature conversion logic here
    }
}
```

**Hints**

- Remember to use parentheses in your calculations to ensure correct order of operations.
- Use (`double`) for type casting where necessary.
- You can use `String.format("%.2f", value)` to format the output to two decimal places.

Remember, the goal is to learn and have fun! Don't hesitate to ask for help if you get stuck.

**Submission Instructions:**

1. Fork the repository
2. Clone your fork
3. Navigate into the repository
4. Implement the required methods
5. Test your implementation with various inputs
6. Git add, commit, and push to your fork
7. Submit a pull request
    - Add a title clearly describing your changes
    - In the comment, briefly explain your implementation approach and any challenges you faced