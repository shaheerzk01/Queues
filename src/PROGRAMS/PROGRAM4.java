package PROGRAMS;

public class PROGRAM4 {
	
	public String Designation;
    public int rank;
          
    public PROGRAM4(String Designation, int rank) {
      
        this.Designation = Designation;
        this.rank = rank;
    }
      
    public Object getName() {
        return Designation + " rank number is " + rank;
        
    } 
    
    

}
