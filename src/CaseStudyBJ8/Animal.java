package CaseStudyBJ8;

public abstract class Animal {
	protected String name;
	protected String genus;
	protected String mood;
	protected String gender;

	public Animal(String name, String genus, String mood, String gender) {
		this.name = name;
		this.genus = genus;
		this.mood = mood;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenus() {
		return genus;
	}

	public void setGenus(String genus) {
		this.genus = genus;
	}

	public String getMood() {
		return mood;
	}

	public void setMood(String mood) {
		this.mood = mood;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
