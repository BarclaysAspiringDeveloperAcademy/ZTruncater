package truncator;

public class ZTruncator {

	public String truncateZInFirstTwoPositions(String s) throws NullPointerException{
		
		if (s.length() == 0)  {
			throw new NullPointerException();
		}
		
		if (s.length() <=2)  {
			return (s.replaceAll("Z", ""));	
		}
		String firstTwoChars = s.substring(0, 2);
		String withoutFirstTwoChars = s.substring(2, s.length());
		
		String truncatedString = firstTwoChars.replaceAll("Z",  "");

		return(truncatedString + withoutFirstTwoChars);
	}

}
