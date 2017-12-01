package cs232project1_bb;

/**
 *
 * @author Brandon Barnes
 */
public abstract class Course {
    //Instance Fields
    private String[] stuff;
    private String courseName;
    private String crnNum;
    private String courseNum;
    private String sectionNum;
    private String creditHours;
    private String courseType;
    private String instructorName;
    
    public Course(String[] stuff){
        this.courseName = stuff[0];
        this.crnNum = stuff[1];
        this.courseNum = stuff[2];
        this.sectionNum = stuff[3];
        this.creditHours = stuff[4];
        this.courseType = stuff[5];
        this.instructorName = stuff[stuff.length-1];
        this.stuff = stuff;
    
    }
    //This method retrives the Course Name
    public String getCourseName(){
        return courseName;
    }
    //This method retrives the CRN Number
    public String getCrnNumber(){
        return crnNum;
    }
    //This method retrives the Course Number
    public String getCourseNumber(){
        return courseNum;
    }
    //This method retrives the Section Number
    public String getSectionNumber(){
        return sectionNum;
    }
    //This method retrives the Credit Hours
    public String getCreditHours(){
        return creditHours;
    }
    //This method retrives the Course Type
    public String getCourseType(){
        return courseType;
    }
    //This method retrives the Instructor Name
    public String getInstructorName(){
        return instructorName;
    }
    
    public abstract boolean conflictsWith(Course c);
    
    @Override //Will space everything nicely
    public String toString(){
        String b = "";
        for(int i = 0; i < stuff.length;i++){
            b +=(stuff[i] + " ");
        }
        return b;
    }
        
}
