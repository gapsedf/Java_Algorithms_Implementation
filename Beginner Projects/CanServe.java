
public class CanServe {

	public static void main(String[] args) {
		/*
		 
		 Citizenship
		 
		 If you dont have Citizenship
		 you have Green Card and Speak,read,write English Fluently
		 
		 
		Age Limits
		Air Force: 17 - 42
		Army: 17 - 35
		Coast Guard: 17 - 41
		Marine Corps: 17 - 28
		Navy: 17 - 41
		Space Force: 17 - 42
	
		Earned College Credits
		Scored higher on ASVAB
		
		Physically Fit
		Mentally Fit
		
		
		*/
		
		
		// Our Volunteer Data
		String targetForce = "Air Force";
		boolean mentallyFit = true;
		boolean physicallyFit = true;
		boolean citizen = true;
		boolean hasGreenCard = false;
		boolean fluentInEnglish = true;
		int age = 25;
		String asvabScore="High";
		String collegeCredits = "Earned";
		
		int eligibility = 0;
		
		// Check Target Force Age Limit 
		if(targetForce == "Air Force")
		{
			if( 17<=age || age<=42) 
			{
				eligibility += 1;
			}
		}else if(targetForce == "Army")
		{
			if( 17<=age || age<=35) 
			{
				eligibility += 1;
			}
		}else if(targetForce == "Coast Guard")
		{
			if( 17<=age || age<=41) 
			{
				eligibility += 1;
			}
		}else if(targetForce == "Marine Corps")
		{
			if( 17<=age || age<=28) 
			{
				eligibility += 1;
			}
		}else if(targetForce == "Navy")
		{
			if( 17<=age || age<=41) 
			{
				eligibility += 1;
			}
		}else if(targetForce == "Space Force")
		{
			if( 17<=age || age<=42) 
			{
				eligibility += 1;
			}
		}
		
		
		if(mentallyFit == true)
		{
			eligibility += 1;
		}
		
		if(physicallyFit == true)
		{
			eligibility += 1;
		}
		
		if(asvabScore == "High")
		{
			eligibility += 1;
		}
		
		if(collegeCredits == "Earned")
		{
			eligibility += 1;
		}
		
		if(citizen == true || (hasGreenCard == true && fluentInEnglish == true) )
		{
			eligibility += 1;
		}
		
		
		if(eligibility==6)
		{
			System.out.print("This volunteer can join => ");
			System.out.print(targetForce);
		}
		
	}

}
