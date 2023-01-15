package CaseStudyBJ3;

public class Participant {
	
	private int shareNumber;
	private String Username;
	
	public Participant(int shareNumber, String username) {
		this.shareNumber = shareNumber;
		Username = username;
	}
	
	public int getShareNumber() {
		return shareNumber;
	}
	public void setShareNumber(int shareNumber) {
		this.shareNumber = shareNumber;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
}
