package model;

public class Registration 
{

  private String userID;
  private String firstName;
  private String lastName;
  private String gender;
  private String dateOfBirth;
  private String mobileNumber;
  private String emailID;
  private String age;
  private String password;
  private String reenterPassword;

  
@Override
public String toString() {
	return "Registration [userID=" + userID + ", firstName=" + firstName + ", lastName=" + lastName + ", gender="
			+ gender + ", dateOfBirth=" + dateOfBirth + ", mobileNumber=" + mobileNumber + ", emailID=" + emailID
			+ ", age=" + age + ", password=" + password + ", reenterPassword=" + reenterPassword + "]";
}
public String getUserID() {
	return userID;
}
public void setUserID(String userID) {
	this.userID = userID;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(String dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public String getEmailID() {
	return emailID;
}
public void setEmailID(String emailID) {
	this.emailID = emailID;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getReenterPassword() {
	return reenterPassword;
}
public void setReenterPassword(String reenterPassword) {
	this.reenterPassword = reenterPassword;
}

}

