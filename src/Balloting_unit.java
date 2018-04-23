
public class Balloting_unit {

	Candidate candidate;
	
	
	
	public Balloting_unit(Candidate candidate)
	{
		this.candidate=candidate;
		
		
	}


	public Candidate getCandidate() {
		return candidate;
	}


	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public static void displayMainMenu()
	
	    {
	
	        System.out.println("Options are:");
	
	        //System.out.println("    To vote for: "+Candidate.getCandidate_name()+" Enter 1");
	        //System.out.println("    To vote for: "+Candidate.getCandidate_name()+" Enter 2");
	
	
	       
	
	        System.out.println("To close    Enter 0");
	
	    }

	
	
}


