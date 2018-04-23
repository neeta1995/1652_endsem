
public class Voter {

		String voter_name;
		Boolean vote;
		
		Voter(String voter_name,Boolean vote)
		{
			this.voter_name=voter_name;
			this.vote=vote;
		}

		public String getVoter_name() {
			return voter_name;
		}

		public void setVoter_name(String voter_name) {
			this.voter_name = voter_name;
		}

		public Boolean getVote() {
			return vote;
		}

		public void setVote(Boolean vote) {
			this.vote = vote;
		}
		
}
