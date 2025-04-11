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
        
      ArrayList<String> StudentNames = new ArrayList<>();
       ArrayList<Double> StudentGrades = new ArrayList<>();
       
        Scanner scanner = new Scanner(System.in);
         
      while(true){
         
           System.out.println("Welcome to grade tracker app");
           System.out.println("1. Add a student name and grade");
           System.out.println("2. View all students and Grades");
           System.out.println("3. Calculate average grade");
           System.out.println("4. Search for a student grade");
           System.out.println("5. Exit program");
           System.out.println("Please choose an option (1-5):");
           
           String Choice = scanner.nextLine();
           switch (Choice){
               case"1":
                   AddStudent(StudentNames, StudentGrades, scanner);
                   break;
               case"2":
                   DisplayStudents(StudentNames, StudentGrades);
                   break;
               case"3":
                   CalculateAverageGrade(StudentGrades);
                   break;
               case"4":
                   SearchStudent(StudentNames, StudentGrades, scanner);
                   break;
               case"5":
                   System.out.println("Exit The app");
                   scanner.close();
                   return; 
               default:
                   System.out.println("Your Choice is not valid. Choose a valid option");
                   
               
           }
      }
        
        
        
    }
    private static void AddStudent(ArrayList<String> StudentNames, ArrayList<Double>StudentGrades, Scanner scanner){
     
         System.out.print("Enter student Name: ");
         String name= scanner.nextLine();
         System.out.print("Enter student Grade: ");
         try{
             double grade = Double.parseDouble(scanner.nextLine());
             if (grade< 0|| grade> 100){
                 System.out.println("Error: Grade needs to be between 0 and 100");
                 return;
             }
             StudentNames.add(name);
             StudentGrades.add(grade);
             System.out.println("Student and grade added.");
             
             
         }catch(NumberFormatException e){
             System.out.println("Invalid Grade, please enter a number.");
             
         }
         
    }
     private static void DisplayStudents(ArrayList<String> StudentNames, ArrayList<Double> StudentGrades){
         
         if (StudentNames.isEmpty()){
         System.out.println("No student added");
         return;
     }
         System.out.println("Student List");
         for (int i = 0; i < StudentNames.size(); i++){
             System.out.println(StudentNames.get(i) + ":" + StudentGrades.get(i));
             
         }
     }
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
