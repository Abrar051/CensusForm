import java.util.Scanner;
public class CensusForm {
    public static void main (String args[]) {
        //@SuppressWarnings("resource")
        Scanner input = new Scanner (System.in);
        String email;
        String userName;
        String passWord;
        int serial = 0;
        int serialNumber = 0;
        UserInfo[] user = new UserInfo[10];
        //user = null;

        while (true)
        {

            System.out.println ("\nHi user do you want login or register input 1 for login , 2 for register : ");
            int option = input.nextInt();
            //register 2 and login 1

            if (option==2) ///register
            {
                int primaryResult=0;
                emailInput();
                email=input.next();
                userInput();
                userName=input.next();
                passwordInput();
                passWord=input.next();
                user[serialNumber] = new UserInfo(email, userName, passWord, serialNumber, primaryResult);
                user[serialNumber].printData();
                System.out.print("Your serial number is "+(serialNumber+1));
                serialNumber++;
            }
            else if (option==1)
            {
                //login
                emailInput();
                email=input.next();
                userInput();
                userName=input.next();
                passwordInput();
                passWord=input.next();
                //System.out.println("Enter your serial number : ");
                for (int i = 0;i<serialNumber;i++)
                {
                    //if (email==this.email)
                    //serial = user[i].checkUser(email,passWord);
                    //System.out.print(serial);
                    if (user[i].checkUser(email,passWord)==1)
                    {
                        System.out.println("Your serial number is "+(i+1));
                        serial=i;
                        break;
                    }

                }
                //serial=input.nextInt();
                System.out.println("Do you want to survey or see profile : 1 survey / 2 see profile ");
                int opt = input.nextInt();
                if (opt==1)//survey answer questions
                {
                    int result = getMarks();
                    user[serial] = new UserInfo(email, userName, passWord, serialNumber, result);
                    //user.printData();
                }
                else if (opt==2)
                {
                    user[serial].printData();
                    //System.out.println("Your serial number is : "+serial);
                }
            }
            else
            {
                System.out.println("Invalid input");
            }
            //serialNumber++;
            //user[serialNumber].printData();
        }
    }
    public static int getMarks ()
    {
        Scanner input = new Scanner (System.in);
        int q1 = 0;
        int q2 = 0;
        int q3 = 0;
        System.out.println("Please answer the following question");
        System.out.println("Marking will be based on answer : ");
        System.out.println("Enter 1 for option a , 2 for b and 3 for c ");
        System.out.println("/n/n");
        System.out.print("1. Have u tried IE 10 ? a. Yes b.No c. Maybe : ");
        int ans1 = input.nextInt();
        if (ans1==1)
        {
            q1=q1+5;
        }
        else if (ans1==2)
        {
            q1=q1+0;
        }
        else if (ans1==3)
        {
            q1=q1+2;
        }
        System.out.print(" 2. Which browser do you use? a. Firefox b. Chrome c. IE : ");
        int ans2= input.nextInt();
        if (ans2==1)
        {
            q2=q2+5;
        }
        else if (ans2==2)
        {
            q2=q2+0;
        }
        else if (ans2==3)
        {
            q2=q2+2;
        }
        System.out.print("3. Will you switch your current browser? a. Yes b. No c. Maybe : ");
        int ans3= input.nextInt();
        if (ans3==1)
        {
            q3=q3+5;
        }
        else if (ans3==2)
        {
            q3=q3+0;
        }
        else if (ans3==3)
        {
            q3=q3+2;
        }
        int result = (q1+q2+q3);
        return result;

    }
    public static void emailInput()
    {
        System.out.println("Enter email : ");
    }
    public static void userInput()
    {
        System.out.println("Enter user : ");
    }
    public static void passwordInput()
    {
        System.out.println("Enter password : ");
    }

}
