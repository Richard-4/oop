package CaseStudyBJ5;

public class CustomersRatings {
	private int rate;
	private String comment;

	public CustomersRatings(int rate, String comment) {
		this.rate = rate;
		this.comment = comment;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
