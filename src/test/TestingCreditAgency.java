package test;

import truncator.ICreditAgency;

public class TestingCreditAgency implements ICreditAgency {
	
	int score;
	
	public void setScore(int score)  {
		this.score = score;
	}

	@Override
	public int getScore() {
		return score;
	}

}
