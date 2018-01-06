package model;

public class Busdata
{
 private String busId;
 private String source;
 private String destination;
 private String busType;
 private String onwardDate;
 private String returnDate;
 private String departure;
 private String arrival;
 private String fare;
 private int seats;

 public int getSeats() {
	return seats;
}
public void setSeats(int seats) {
	this.seats = seats;
}
public String getBusId() {
	return busId;
}
public void setBusId(String busId) {
	this.busId = busId;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public String getBusType() {
	return busType;
}
public void setBusType(String busType) {
	this.busType = busType;
}
public String getOnwardDate() {
	return onwardDate;
}
public void setOnwardDate(String onwardDate) {
	this.onwardDate = onwardDate;
}
public String getReturnDate() {
	return returnDate;
}
public void setReturnDate(String returnDate) {
	this.returnDate = returnDate;
}
public String getDeparture() {
	return departure;
}
public void setDeparture(String departure) {
	this.departure = departure;
}
public String getArrival() {
	return arrival;
}
public void setArrival(String arrival) {
	this.arrival = arrival;
}
public String getFare() {
	return fare;
}
public void setFare(String fare) {
	this.fare = fare;
}
@Override
public String toString() {
	return "Busdata [busId=" + busId + ", source=" + source + ", destination=" + destination + ", busType=" + busType
			+ ", onwardDate=" + onwardDate + ", returnDate=" + returnDate + ", departure=" + departure + ", arrival="
			+ arrival + ", fare=" + fare + "]";
}



}
