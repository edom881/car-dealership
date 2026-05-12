# Car Dealership Application

## Project Overview
The Car Dealership Application is a Java console-based program that allows a dealership to manage its vehicle inventory. The application uses object-oriented programming concepts and file handling to load, search, add, remove, and save vehicles using a CSV inventory file.

This project was built as a workshop project to practice:
- Java classes and objects
- Constructors
- ArrayLists
- File reading and writing
- Object-oriented design
- User interaction through console menus
- Data searching and filtering

---

# Features

## Vehicle Inventory Management
The application allows users to:

- List all vehicles
- Search vehicles by:
    - Price range
    - Make and model
    - Year range
    - Color
    - Mileage range
    - Vehicle type
- Add new vehicles
- Remove existing vehicles
- Save updated inventory to file

---

# Technologies Used

- Java
- IntelliJ IDEA
- Maven
- CSV File Handling
- Object-Oriented Programming (OOP)
- ArrayLists
- FileReader / BufferedReader
- FileWriter

---

# Project Structure

## Classes

### Program
Starts the application and launches the user interface.

### Vehicle
Represents a vehicle object with:
- VIN
- Year
- Make
- Model
- Vehicle type
- Color
- Odometer
- Price

### Dealership
Stores dealership information and manages the vehicle inventory list.

### DealershipFileManager
Handles:
- Reading inventory data from CSV file
- Creating dealership and vehicle objects
- Saving updated inventory back to file

### UserInterface
Handles:
- User menu display
- User input
- Calling dealership methods
- Displaying search results

---

# Inventory File

The inventory is stored in:

```text
src/main/resources/inventory.csv
D & B Used Cars|111 Old Benbrook Rd|817-555-5555
10112|1993|Ford|Explorer|SUV|Red|525123|995.00
37846|2001|Ford|Ranger|Truck|Yellow|172544|1995.00
44901|2012|Honda|Civic|SUV|Gray|103221|6995.00
```
The first line contains dealership information, and each subsequent line represents a vehicle with its attributes separated by the pipe `|` character.


How to Run

Open the project in IntelliJ IDEA

Run Program.java

Use the console menu to interact with the application

Example Menu

1 - List all vehicles
2 - Find vehicles by price
3 - Find vehicles by make/model
4 - Find vehicles by year
5 - Find vehicles by color
6 - Find vehicles by mileage
7 - Find vehicles by type
8 - Add a vehicle
9 - Remove a vehicle
99 - Quit

Skills Demonstrated

Java programming fundamentals
Object-oriented programming
Data modeling with classes
Working with collections
Reading and writing files
Console application development
Search/filter logic
Menu-driven application design

Future Improvements

Possible future upgrades:
Multiple dealership support
GUI version
Database integration
Sorting features
Vehicle update/edit feature
Advanced validation
Search by VIN
This project serves as a solid foundation for building more complex dealership management systems in the future.

Author

Edom Gezahegn

Year Up Student – Application Development