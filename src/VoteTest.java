import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VoteTest {
	Candidate c1,c2;
	Cast_vote v1;
	@Before
	public void setUp() throws Exception {
		c1 = new Candidate ("shetty","panjim","100",0);
		c2 = new Candidate ("umesh","st.cruz","100",0);
		v1 = new Cast_vote("neeta");
		v1.addVote(new Vclass(c1));
		v1.addVote(new Vclass(c2));
		System.out.println(v1.vote_result());

	}

	@Test
	public void test() {
		//fail("Not yet implemented");
	}

}
