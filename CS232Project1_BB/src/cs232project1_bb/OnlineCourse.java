package cs232project1_bb;

/**
 *
 * @author Brandon Barnes
 */
public class OnlineCourse extends Course {
    
    
        
    public OnlineCourse(String[] stuff){
        super(stuff);
    }
      
    
    
    @Override
    public boolean conflictsWith(Course c){
        return false;
    }
    

    
}