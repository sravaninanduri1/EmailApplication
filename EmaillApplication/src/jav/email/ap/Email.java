package jav.email.ap;

import java.util.Scanner;

public class Email {
   private String firstName;
   private String lastName;
   private String department;
   private String password;
   private int defaultPasswordLength=10;
   private String email;
   private String companySuffix="techcompany.com";
   private String alternateEmail;
   private int mailBoxCapacity=500;
   
   public Email(String firstName,String lastName){
	   this.firstName=firstName;
	   this.lastName=lastName;
	   //System.out.println("Email Created:" +this.firstName+" "+this.lastName);
	   //asking for an user to enter department
	   this.department=setDepartment();
	   System.out.println("Department:"+this.department);
	   //call a method to generate random password
	   this.password=randomPassword(defaultPasswordLength);
	   System.out.println("Your password is: "+this.password);
	   //combine elements to generate email
	   email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
	   //System.out.println("Your email is: "+ email);
   }
   
   private String setDepartment(){
       System.out.println("New Worker: " +firstName+".DEPARTMENT CODES:\n1 for sales\n2 for Accounting\n3 for Marketing\n4 for Advertising\n0 for None\nEnter your department:");
       Scanner sc=new Scanner(System.in);
       int depCode=sc.nextInt();
       if(depCode==1){ return "sales";}
       else if(depCode==2){ return "Accounting";}
       else if(depCode==3){ return "Marketing";}
       else if(depCode==4){ return "Advertising";}
       else{return " ";}
 }
   
  private String randomPassword(int length){
	  String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
	  char[] password=new char[length];
	  for(int i=0;i<length;i++){
		  int rand=(int) (Math.random() * passwordSet.length());
		  password[i]=passwordSet.charAt(rand);
	  }
	  return new String(password);
  }
  
  //set mailBox capacity
  public void setMailBoxCapacity(int capacity){
	  this.mailBoxCapacity=capacity;
  }
  
  //set alternate email
  public void setAlternateEmail(String altEmail){
	  this.alternateEmail=altEmail;
  }
  
  //change password
  public void changePassword(String password){
	  this.password=password;
  }
  
  public int getMailBoxCapacity(){
	  return mailBoxCapacity;
  }
  public String getAlternateEmail(){
	  return alternateEmail;
  }
  public String getPassword(){
	  return password;
  }
  
  //display name, email and mailbox capacity
  public String showInfo(){
	  return "DISPLAY NAME: " +firstName+" "+lastName+
			  "\nCOMPANY EMAIL: " +email+
			  "\nMAILBOX CAPACITY: " +mailBoxCapacity+ "mb";
  }
}
