package jav.email.ap;

public class EmailApi {

	public static void main(String[] args) {
		//creating email for new workers
		 Email emi=new Email("Pavan","Nanduri");
		 /*emi.setAlternateEmail("sravanikarnati1@gmail.com");
		 System.out.println("Your alternate email is: "+emi.getAlternateEmail());*/
		 System.out.println(emi.showInfo());
	}
}
