# Array

Java provides a data structure, the array, which stores a fixed-size sequential collection of elements of the same type. An array is used to store a collection of data, but it is often more useful to think of an array as a collection of variables of the same type.

# Declaring Array Variables

To use an array in a program, you must declare a variable to reference the array, and you must specify the type of array the variable can reference. Here is the syntax for declaring an array variable:

dataType[] arr; (or)  
dataType []arr; (or)  
dataType arr[];  

## Advantages

- *Code Optimization*: It makes the code optimized, we can retrieve or sort the data efficiently.
- *Random access*: We can get any data located at an index position.

## Disadvantages

- *Size Limit*: We can store only the fixed size of elements in the array. It doesn't grow its size at runtime. To solve this problem, collection framework is used in Java which grows automatically.