package StudentDb;

import java.util.ArrayList;

public class Student {

	//class variables
	
	private static int iD = 1000;
	
	//Instance variables
	
	private String name;
	private String sSn;
	private String eMail;
	private final String userId;
	private ArrayList<String> enrolledCourses;
	private double balance;
	private String city;
	private String phoneNum;
	private String state;
	
	Student(String name, String sSn) {
		
		this.name = name;
		this.sSn = sSn;
		setEmail();
		userId = setId();
		iD++;
		enrolledCourses = new ArrayList<>();
		balance = 0;
		//System.out.println(userId);
	}

	//getters and setters
	
	public void setCity(String city) {
		
		this.city = city;
	}
	
	public void setphoneNum(String phoneNum) {
		
		this.phoneNum = phoneNum;
	}
	public void setState(String state) {
	
		this.state = state;
	}
	
	public String getCity() {
		
		return city;
	}
	
	public String getPhoneNum() {
		
		return phoneNum;
	}

	public String getState() {
	
		return state;
	}
	
	//public methods
	
	public void checkBalance() {
		
		System.out.println("Current balance for " + name + ": $" + balance);
	}
	
	public void enroll(String courseName, double courseCost) {
		
		enrolledCourses.add(courseName);
		balance += courseCost;
		System.out.println(name + " enrolled in " + courseName + ". At a cost of $" + courseCost + ".");
	}
	
	public void pay(double amount) {
		
		if(amount > balance) {
			
			amount -= balance;
			balance = 0;
			System.out.println(name + " overpaid. The excess amount of $" + amount + " has been refunded.");
			checkBalance();
		} else {
			
			System.out.println(name + " paid the amount of $" + amount + " off their balance.");
			checkBalance();
		}
	}
	
	public void showCourses() {
		
		if(enrolledCourses.isEmpty()) {
			
			System.out.println(name + " is currently not enrolled in any classes");
		} else {
			
			System.out.print(name + " is enrolled in the following courses: ");
			for(int i = 0; i < enrolledCourses.size(); i++) {
				
				if(i == enrolledCourses.size() - 1) {
				
					System.out.println(enrolledCourses.get(i) + ".");
				} else {
					
					System.out.print(enrolledCourses.get(i) + ", ");
				}
			}
		}
	}
	//overwritten methods
	
	public String toString() {
		
		return "Student name: " + name + "\nEmail: " + eMail + "\nSSN: " + sSn + "\nUserId: " + userId + "\nOutstanding balance: $" + balance;
	}
	
	//private methods
	
	private void setEmail() {
		
		//use regex to remove all whitespace from name, remove trailing whitespace, add university domain, finally all to lowercase
		eMail = name.replaceAll("\\s", "").trim().concat("@college.com").toLowerCase();				
	}

	private String setId() {
		
		int randomNum = (int) (Math.random() * 8000) + 1000;  
		return Integer.toString(iD) + randomNum + sSn.substring(sSn.length() - 4, sSn.length());
	}
}
