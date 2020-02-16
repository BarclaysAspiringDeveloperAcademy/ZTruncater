package test;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import truncator.LoanAgent;

public class LoanAgemtTest {
	
	LoanAgent agent;
	
	@Before
	public void setUp()  {
		agent = new LoanAgent();
	}

	@Test
	public void testWithScoreof719() {
		
		TestingCreditAgency creditAgency = new TestingCreditAgency();
		creditAgency.setScore(719);
		
		agent.setAgency(creditAgency);
		
		Assert.assertFalse(agent.processLoan());
	}
	
	@Test
	public void testWithScoreof720() {
		
		TestingCreditAgency creditAgency = new TestingCreditAgency();
		creditAgency.setScore(720);
		
		agent.setAgency(creditAgency);
		
		Assert.assertFalse(agent.processLoan());
	}
	
	@Test
	public void testWithScoreof721() {
		
		TestingCreditAgency creditAgency = new TestingCreditAgency();
		creditAgency.setScore(721);
		
		agent.setAgency(creditAgency);
		
		Assert.assertTrue(agent.processLoan());
	}

}
