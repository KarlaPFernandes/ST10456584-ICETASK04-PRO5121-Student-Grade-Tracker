/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student_grade_tracker_ice04;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Karla
 */
public class Student_Grade_Tracker_Ice04 {
   
    public static void main(String[] args) {
       //Creates  Lists to store the students names and grades
      ArrayList<String> StudentNames = new ArrayList<>();
       ArrayList<Double> StudentGrades = new ArrayList<>();
       
        Scanner scanner = new Scanner(System.in);
         
      while(true){
          //Loop for the main menu (It runs until the user choose: exit program  )
           System.out.println("Welcome to grade tracker app");
           System.out.println("1. Add a student name and grade");// otption to add student names
           System.out.println("2. View all students and Grades");//option to add student grades
           System.out.println("3. Calculate average grade");// option to calculate the average grade
           System.out.println("4. Search for a student grade");//option to search a Student grade
           System.out.println("5. Exit program");// option to exit the program
           System.out.println("Please choose an option (1-5):");
           
           String Choice = scanner.nextLine();// read the menu choice
           switch (Choice){
               case"1":// if the user chooses add student name or grade
                   AddStudent(StudentNames, StudentGrades, scanner);
                   break;
               case"2":// if the user chooses  to see all students name or grade
                   DisplayStudents(StudentNames, StudentGrades);
                   break;
               case"3":// if the user chooses to calculate the average grade
                   CalculateAverageGrade(StudentGrades);
                   break;
               case"4":// if the user chooses to search for a student
                   SearchStudent(StudentNames, StudentGrades, scanner);
                   break;
               case"5"://if the user chooses to exit the app
                   System.out.println("Exit The app");
                   scanner.close();// this  close the scanner
                   return; // this end the program
               default:// handle invalid menu choices
                   System.out.println("Your Choice is not valid. Choose a valid option");
                    
           }
      }
            
    }
    //Method that add students and their grades
    private static void AddStudent(ArrayList<String> StudentNames, ArrayList<Double>StudentGrades, Scanner scanner){
     
         System.out.print("Enter student Name: ");// prompt the user to insert the student name
         String name= scanner.nextLine();//read the user input
         System.out.print("Enter student Grade: ");//prompt the user to insert the student grade
         try{
             double grade = Double.parseDouble(scanner.nextLine());// convert the input to a number
             if (grade< 0|| grade> 100){// check if the grade is between 0 and 100 or validi
                 System.out.println("Error: Grade needs to be between 0 and 100"); //shows error message
                 return;// stop the method if the grade is invalid
             }
             StudentNames.add(name);// add the student name to the list
             StudentGrades.add(grade);// add the student name to the list
             System.out.println("Student and grade added.");// Confirmation message
             
             
         }catch(NumberFormatException e){// it handle non numeric input
             System.out.println("Invalid Grade, please enter a number.");
             
         }
         
    }
    //method to display all the students and their grades
     private static void DisplayStudents(ArrayList<String> StudentNames, ArrayList<Double> StudentGrades){
         
         if (StudentNames.isEmpty()){// check if there are no students
         System.out.println("No student added");
         return;// stop the method if the list is empty
     }
         System.out.println("Student List");
         for (int i = 0; i < StudentNames.size(); i++){// loop through all students
             System.out.println(StudentNames.get(i) + ":" + StudentGrades.get(i));// display name and grade
             
         }
     }//method to calculate the average grade
    private static void CalculateAverageGrade(ArrayList<Double> studentGrades) {
        if (studentGrades.isEmpty()) { // Check if there are no grades
            System.out.println("No grades available to calculate the average.");
            return; // Stop the method if the list is empty
        }
        double total = 0; // Variable to store the sum of all grades
        for (double grade : studentGrades) { // Loop through grades
            total += grade; // Add each grade to the total
        }
        double average = total / studentGrades.size(); // Calculate the average
        System.out.println("The average grade is: " + average); // Display the average
    }
    //method to search for a  student
    private static void SearchStudent(ArrayList<String> studentNames, ArrayList<Double> studentGrades, Scanner scanner) {
        System.out.print("Enter the student's name to search: "); // Prompt for the name
        String name = scanner.nextLine(); // Read the name input
        int index = studentNames.indexOf(name); // Find the student's position in the list
        if (index != -1) { // If the student is found
            System.out.println(name + "'s grade: " + studentGrades.get(index)); // Display their grade
        } else { // If the student is not found
            System.out.println("Student not found.");
        }
    }


}
