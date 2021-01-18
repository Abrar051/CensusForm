import java.util.Scanner;
public class UserInfo  {
	private String email;
	private String userName;
	private String passWord;
	private int serialNumber;
	private int result;
	/*public  void setCensus(Census census) {
	}*/
	
	
	
    UserInfo (String email , String userName , String passWord , int serialNumber , int result)
	{
		this.email=email;
		this.userName=userName;
		this.passWord=passWord;
		this.serialNumber=serialNumber;
		this.result=result;
	}
	
   /* public int Login ()
	{
    	@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
    	System.out.print ("Enter your user : ");
		this.setUserName(input.nextLine());
		System.out.print ("Enter your password : ");
		this.setPassWord(input.nextLine());
		System.out.println ("Enter your serial number : ");
		this.serialNumber = input.nextInt();
		return this.serialNumber;
	}*/
	public void printData ()
	{
		System.out.println ("Your user is : "+this.userName);
		//System.out.println ("Your serial number is : "+this.serialNumber);
		System.out.println ("Your result is : "+this.result);
		//System.out.println("Please remember serial number for login ");
	}
    public int checkUser (String email , String password)
    {
    	if (this.email.equals(email) && this.passWord.equals(password))
    	{
    		System.out.println("Data match !!");
    		//return this.serialNumber;
    		System.out.println("Serial number "+this.serialNumber);
    		return this.serialNumber;
    	}
    	else
    	{
    		System.out.println("No data found");
    		return 0;
    	}
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@SuppressWarnings("resource")
	public static int getMarks ()
	{
		Scanner input = new Scanner (System.in);
		int q1=0;
		int q2=0;
		int q3=0;
		System.out.println("Please answer the following question");
		System.out.println("Marking will be based on answer : ");
		System.out.println("Enter 1 for option a , 2 for b and 3 for c ");
		System.out.println("/n/n");
		System.out.println("1. Have u tried IE 10 ? a. Yes b.No c. Maybe : ");
		int ans1 = input.nextInt();
		switch (ans1) {
		case 1 :
			q1=5;
		case 2 :
			q1=0;
		case 3 :
			q1=2;
		}
		System.out.println(" 2. Which browser do you use? a. Firefox b. Chrome c. IE : ");
		int ans2= input.nextInt();
		switch (ans2) {
		case 1 :
			q2=5;
		case 2 :
			q2=0;
		case 3 :
			q2=2;
		}
		System.out.println("3. Will you switch your current browser? a. Yes b. No c. Maybe : ");
		int ans3= input.nextInt();
		switch (ans3) {
		case 1 :
			q3=5;
		case 2 :
			q3=0;
		case 3 :
			q3=2;
		}
		int result = q1+q2+q3;
		return result;
		
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPassWord() {
		return passWord;
	}



	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
}

