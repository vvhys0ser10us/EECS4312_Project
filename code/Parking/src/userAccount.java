



public class userAccount {
private String firstname;
private String lastname;
private String email;
private String password;

public userAccount(String firstname,String lastname, String email, String password) {
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
	this.password = password;

}
public String getName() {
	return firstname + " " + lastname;
}
public String getEmail() {
	return email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
