package cs232project1_bb;

import java.nio.file.Paths;
import java.util.ArrayList;

import java.util.*;
import java.util.Scanner;

/**
 *
 * @author Brandon Barnes
 */
public class Controller {
    //Creating ArrayLists to store the courses and schedule
    private static List<Course> courses = new ArrayList<>();
    private static List<Course> schedule = new ArrayList<>();
    
    public static void main(String[] args) {
       
        
            /* Attempt to open input file */
        try{
            //scanning the document
            Scanner in = new Scanner(Paths.get("project1input.csv"), "UTF-8");
            
            while(in.hasNextLine()){
                String[] stuff = (in.nextLine()).split("\t");
                
                
                //creating the courses
                if(stuff[stuff.length-2].equals("Lecture")){
                    TraditionalCourse t = new TraditionalCourse(stuff);
                    courses.add(t);                    
                }
                else{
                    OnlineCourse o = new OnlineCourse(stuff);
                    courses.add(o);
                }
            }
            
            boolean finished = false;
            //Loop to forever run until the user is done with their schedule
            while(finished == false){
                System.out.println("1) Search Courses");
                System.out.println("2) Register for Course");
                System.out.println("3) View Trial Schedule");
                System.out.println("4) Quit");
                System.out.println("");
                System.out.println("Your choice?");
                Scanner userInput = new Scanner(System.in);
                String menuChoice = userInput.nextLine();

                switch(menuChoice){
                    case "1":
                        System.out.println("Enter course number in the format SSNNN(for example, CS201): ");
                        String input = userInput.nextLine();
                        for (Course c: courses) {
                            if (c.getCourseNumber().equals(input)) {
                                System.out.println(c.toString());
                            }   
                        }
                        break;
                    case "2":
                        System.out.println("Enter CRN Number: ");
                        String input2 = userInput.nextLine();
                        boolean conflicts = false;
                        Course s = null;
                        
                        for (Course c: courses) {
                            
                            if (c.getCrnNumber().equals(input2)) {
                                for(Course z:schedule){
                                    if(c.conflictsWith(z)){
                                        conflicts = true;
                                        System.out.println("ERROR: Either the course was not found, or it conflicts with your current schedule!");
                                    }
                                    
                                }
                                if(conflicts == false){
                                    schedule.add(c);
                                    System.out.println("Course added successfully!");
                                }
                            }
                        }
                        
                        break;
                    case "3":
                        for(int i = 0;i<schedule.size();i++){
                            System.out.println(schedule.get(i).toString());
                        }
                        break;
                    case "4":
                        System.out.println("Thanks for using the Student Registration System!");
                        finished = true;
                        break;
                    default:
                        System.out.println("Invalid Option. Please select another.");
                        break;
                }
            }
           
        }catch (Exception e) {
            System.err.println(e.toString());
        }
        
        
    }           
}


    

