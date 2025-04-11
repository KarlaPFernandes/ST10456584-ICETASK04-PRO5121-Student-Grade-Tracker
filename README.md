----------------  Grade Tracker Program------------------
------------------------------------------------------------------
About this project
The Grade Tracker program is designed for teachers to manage and track the grades of their students for a single subject. 
With this tool, teachers can:

- Add students along with their grades.
- View a list of all students and their grades.
- Calculate the average grade for the subject.
- Search for specific students and display their grades.
- Ensure input validation to prevent incorrect data entries.
  
This program is implemented in Java and runs in a console-based user interface.

----------How to set up and run the program----------------

Got it! Here's the README file for your Grade Tracker program, following the style of the example you provided:

---

📘 Grade Tracker Program

ℹ️ About this project
The Grade Tracker program is designed for teachers to manage and track the grades of their students for a single subject. With this tool, teachers can:
- Add students along with their grades.
- View a list of all students and their grades.
- Calculate the average grade for the subject.
- Search for specific students and display their grades.
- Ensure input validation to prevent incorrect data entries.

This program is implemented in Java and runs in a console-based user interface.

## 💻 How to run the program

-----Requisites-----
Before you start, ensure you have the following installed on your computer:
- **Apache NetBeans**: For editing, compiling, and running the program.
- **Java Development Kit (JDK)**: Version 8 or above.
  
---------------------Opening the Apache NetBeans app--------------------------------
1. Open the Apache NetBeans application on your computer.
2. Create a new project:
   - Go to File  then New Project.
   - Select Java then Java Application from the list.
   - Name your project ( "GradeTracker").
   - Click Finish to set up your project.

3. Import the program code:
   - In the Project tab, locate your new project folder.
   - Right-click on Source Packages, then choose New then Java Class.
   - Name the new class `GradeTracker` and paste the code into the editor window.
   - Save the file.

4. Run the program:
   - Click the green play button on the toolbar or press `Shift + F6` to compile and execute the program.

---

🕹️ How to use the Grade Tracker program

---------Menu Options-----------

When the program starts, you’ll see a list of menu options. Select an option by typing its number and pressing `Enter`. The available options are:

1. Add a Student and Grade
   - Input the student's name and press `Enter`.
   - Input the student's grade (must be between 0 and 100) and press `Enter`.  
   - If the data is valid, the student is added to the list. Otherwise, an error message is displayed.

2. View All Students and Grades  
   - Displays all students’ names along with their corresponding grades.  
   - If no students are added yet, you'll see a message indicating an empty list.

3. Calculate Average Grade
   - Calculates the average grade of all students and displays the result.  
   - If no grades are entered, you'll receive a message saying there are no grades to calculate.

4. Search for a Student's Grade
   - Input the name of the student and press `Enter`.  
   - The program will display the grade if the student is found, or a message if the student is not in the list.

5. Exit Program
   - Exits the application and displays a goodbye message.

------- Error Handling and Validation---------
- Grade Validation: Grades must be numeric and between 0 and 100.
- Input Validation: Non-numeric inputs for grades will result in an error message.
- Search Function: If a student name isn’t found, the program displays "Student not found."




