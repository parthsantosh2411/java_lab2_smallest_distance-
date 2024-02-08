# Nearest Neighbor Finder

## Description
This Java program identifies two neighboring numbers in an array that have the smallest distance between them. Utilizing fundamental Java programming constructs such as arrays, loops, and conditionals, it addresses a common algorithmic challenge, demonstrating an efficient and practical approach to problem-solving in software development.

## ## Key Functions and Methods

### NearestNeighborFinder Class

- **`main(String[] args)`**:
  - **Description**: The entry point of the program. It handles user interaction for input collection and displays the result of the nearest neighbor calculation.
  - **Steps performed**:
    1. Prompts the user to enter the size of the array.
    2. Collects each element of the array from user input.
    3. Instantiates a NearestNeighborCalculator object with the user-provided array.
    4. Calls the `findNearestNeighbor` method of NearestNeighborCalculator to find the index of the first number in the closest neighboring pair.
    5. Displays the index to the user.

### NearestNeighborCalculator Class

- **Constructor: `NearestNeighborCalculator(int[] array)`**:
  - **Description**: Initializes the NearestNeighborCalculator with the provided array of integers.
  - **Parameters**:
    - `array`: The array of integers in which to find the nearest neighbors.

- **`findNearestNeighbor(): int`**:
  - **Description**: Calculates and returns the index of the first number in the pair of neighboring elements with the smallest distance.
  - **Algorithm**:
    - Initializes a variable `minDistance` with `Integer.MAX_VALUE` to track the smallest distance found.
    - Iterates through the array, calculating the distance between each pair of neighboring elements.
    - If a smaller distance is found, updates `minDistance` and stores the current index.
    - Returns the index of the first element in the pair with the smallest distance.
  - **Returns**: The index of the first number in the nearest neighboring pair.
 
  - 
## Features
- Dynamically accepts user input for the array's size and its elements, offering flexibility for various datasets.
- Implements an efficient algorithm to find the minimum distance between adjacent numbers in an array.
- Provides clear and immediate feedback by outputting the index of the first number in the closest pair of neighbors.

## Key Functions and Methods
- **`main(String[] args)` in `NearestNeighborFinder`**: Manages user inputs, invokes the calculation logic, and displays the result.
- **`NearestNeighborCalculator(int[] array)`**: Constructor that initializes the array to be analyzed.
- **`findNearestNeighbor(): int`**: Executes the core algorithm to identify the index of the first number in the nearest neighboring pair.

## Usage
Follow these instructions to compile and run the program:

1. Ensure the Java Development Kit (JDK) is installed on your system.
2. Save both `NearestNeighborFinder.java` and `NearestNeighborCalculator.java` in the same directory.
3. Open a terminal or command prompt and navigate to the directory containing the program files.
4. Compile the program using the command:
   ```bash
   javac NearestNeighborFinder.java
