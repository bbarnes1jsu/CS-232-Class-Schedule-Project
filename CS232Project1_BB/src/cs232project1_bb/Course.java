package cs232project1_bb;

/**
 *
 * @author Brandon Barnes
 */
public abstract class Course {
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
    
    public String getCourseName(){
        return courseName;
    }
    
    public String getCrnNumber(){
        return crnNum;
    }
    
    public String getCourseNumber(){
        return courseNum;
    }
    
    public String getSectionNumber(){
        return sectionNum;
    }
    
    public String getCreditHours(){
        return creditHours;
    }
    
    public String getCourseType(){
        return courseType;
    }
    
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
