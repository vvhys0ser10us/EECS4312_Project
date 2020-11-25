
public class Space {
private String Id;
private String address;
private boolean occupied=false;
public Space(String id,String address) {
	this.Id = id;
	this.address = address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getAddress() {
	return this.address;
}
public void setId(String id) {
	this.Id = id;
}
public String getId() {
	return this.Id;
}
public void setOccupited(boolean occupied) {
	this.occupied = occupied; 
}
public boolean getOccupied() {
	return this.occupied;
}
}
