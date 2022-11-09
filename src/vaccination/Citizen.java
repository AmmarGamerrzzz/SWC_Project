package vaccination;

public class Citizen {

	public String IC;
	public String name;
	public int age;
	public String state;
	public String category;
	public String firstDoseStatus;
	public String secondDoseStatus;
	public String certificate;
	
	public Citizen() {
		
		name = "";
		IC = "";
		state = "";
		age = 0;
		category = "";
		firstDoseStatus = null;
		secondDoseStatus = null;
		certificate = null;
		
	}
	public Citizen (String name,String IC, String state,int age,String category, String firstDoseStatus, String secondDoseStatus, String certificate) {
		
		name = "";
		IC = "";
		state = "";
		age = 0;
		category = "";
		firstDoseStatus = null;
		secondDoseStatus = null;
		certificate = null;
	}
	public void setInformationCitizen (String n,String i,String s, int a, String c, String fds, String sds, String cer) {
		
		name = n;
		IC = i;
		state = s;
		age = a;
		category = c;
		firstDoseStatus = fds;
		secondDoseStatus = sds;
		certificate = cer;
	}
	public String getName(String n) {
		return name;
	}
	public String getIC(String i) {
		return IC;
	}
	public String getState(String s) {
		return state;
	}
	public int getAge(int a) {
		return age;
	}
	public String getCategory(String c) {
		return category;
	}
	public String getFirstDoseStatus(String fds) {
		return firstDoseStatus;
	}
	public String getSecondDoseStatus(String sds) {
		return secondDoseStatus;
	}
	public String getCertificate(String cer) {
		return certificate;
	}
	public void setName(String n) {
		name = n;
	}
	public void setIC(String i) {
		IC = i;
	}
	public void setState(String s) {
		state = s;
	}
	public void setAge(int a) {
		age = a;
	}
	public void setCategory(String c) {
		category = c;
	}
	public void setFirstDoseStatus(String fds) {
		firstDoseStatus = fds;
	}
	public void setSecondDoseStatus(String sds) {
		secondDoseStatus = sds;
	}
	public void setCertificate(String cer) {
		certificate = cer;
	}
	public String toString() {
		return "\n\nName : "+name + "\nIc : "+IC+"\nState : "+state+"\nAge : "+age+"\nCategory : " +category+"\n1st Dose Status : "+firstDoseStatus+ "\n2nd Dose Status : "+secondDoseStatus+ "\nCertificate : "+certificate;
	}
	
}
