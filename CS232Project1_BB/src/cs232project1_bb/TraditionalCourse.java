package cs232project1_bb;
import java.time.LocalTime;

/**
 *
 * @author Brandon Barnes
 */
public class TraditionalCourse extends Course {
    //Instance Fields
    private LocalTime startingTime;
    private LocalTime stoppingTime;
    private String days;
       
    public TraditionalCourse(String[] stuff){
        super(stuff);
        this.startingTime = LocalTime.parse(stuff[5]);
        this.stoppingTime = LocalTime.parse(stuff[6]);
        this.days = stuff[7];
    }
    
    public LocalTime getStartingTime(){
        return startingTime;
    }
    
    public LocalTime getStoppingTime(){
        return stoppingTime;
    }
    
    public String getDays(){
        return days;
    }
    
    @Override
    public boolean conflictsWith(Course c){
        if(c instanceof OnlineCourse){
            return false;
        }
        boolean boogy = false;
        TraditionalCourse t = (TraditionalCourse)c;
        if(this.startingTime.isBefore(t.getStoppingTime()) && this.stoppingTime.isAfter(t.getStoppingTime())){
            boogy = true;
        }
        if(this.stoppingTime.equals(t.getStartingTime()) || this.stoppingTime.equals(t.getStoppingTime())){
            boogy = true;
        }
        if(this.startingTime.equals(t.getStartingTime()) || this.startingTime.equals(t.getStoppingTime())){
            boogy = true;
        }
        if(this.startingTime.isAfter(t.getStartingTime()) && this.startingTime.isBefore(t.getStoppingTime())){
            boogy = true;
        }
        if(this.stoppingTime.isAfter(t.getStartingTime()) && this.stoppingTime.isBefore(t.getStoppingTime())){
            boogy = true;
        }
        return boogy;
    }
          
    
}
