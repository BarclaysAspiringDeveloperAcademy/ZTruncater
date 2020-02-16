package truncator;

public class LoanAgent {
	
	ICreditAgency  agency;

	public void setAgency(ICreditAgency agency) {
		this.agency = agency;
	}

	public boolean processLoan()  {
		boolean result = false;
		
		int creditScore = agency.getScore();
						
		if (creditScore >720)  
			{result = true;}
		
		return result;
	}

}
