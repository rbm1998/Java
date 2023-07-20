package bankingapplication.com;

import java.util.Scanner;

public class IciciBusnessLogicClass  implements IciciBusnessLogicInterface{
	User u;
	Icici i;
	Scanner input=new Scanner(System.in);
	
	@Override
	public void createAccount() {
		System.out.println("Enter your Name : ");
		String username=input.nextLine();
		System.out.println("Enter your Password : ");
		String pwd=input.next();
		System.out.println("Enter your Phone Number : ");
		long phoneNo=input.nextLong();
		
		//object and reference is created in class so use that reference only
		
		u=new User(username,pwd,phoneNo);
		
		System.out.println("********************************************");
		System.out.println("Account Created Successfully : "+u.getusername());
		
		System.out.println("Enter your Balance : ");
		double balance=input.nextDouble();
		System.out.println("Enter Account Number : ");
		long accNo=input.nextLong();
		
		i=new Icici(balance,accNo);
		System.out.println("Successfully new ICICI Account created : ");
	}
	
	@Override
	public void withdrawMoney() {
		System.out.println("Enter your phone number to withdraw : ");
		long phoneNo=input.nextLong();
		if(u.getphoneNo()==phoneNo)
		{
			System.out.println("Phone Number matched");
			System.out.println("Enter Money to Withdraw : ");
			double withdrawAmount=input.nextDouble();
			System.out.println("Press s to send otp to "+u.getphoneNo()+"For Withdrawing Money");
			char s=input.next().charAt(0);
			if(s=='S'||s=='s')
			{
				Icici.genereteOtp();
				System.out.println("OTP Sent");
				System.out.println(Icici.otp);
				System.out.println("Enter The OTP You Recieved : ");
				int otp=input.nextInt();
				if(Icici.otp==otp)
				{
					i.setbalace(i.getbalance()-withdrawAmount);
					System.out.println("Successfully Withdrawn : "+withdrawAmount);
					System.out.println("Current Balance of your Account : "+i.getbalance());
				}
				else
				{
					System.out.println("OTP missmatch try again latter");
					
				}
			}
			else
			{
				System.out.println("Invalid Input Try Again Later");
			}
			
		}
		else
		{
		System.out.println("Cannot Proceed To Withdraw Since Phone No dosnot Match");
		}
		
	}
	@Override
	public void depositMoey() {
		System.out.println("Enter phone number to Deposit Money : ");
		long phoneNo=input.nextLong();
		if(u.getphoneNo()==phoneNo)
		{
			System.out.println("Phone Number Matched");
			System.out.println("Enter Money to Deposit : ");
			double depositAmount=input.nextDouble();
			System.out.println("Press s to send OTP to"+u.getphoneNo()+"For Withdrawing Money");
			char s=input.next().charAt(0);
			if(s=='S'||s=='s')
			{
				Icici.genereteOtp();
				System.out.println("OTP sent");
				System.out.println(Icici.otp);
				System.out.println("Enter the OTP you Recived : ");
				int otp=input.nextInt();
				if(Icici.otp==otp)
				{
					i.setbalace(i.getbalance()+depositAmount);
					System.out.println("Successfully Deposited : "+depositAmount);
					System.out.println("Balance Amount in your Account : "+i.getbalance());
				}
				else
				{
					System.out.println("OTP Mismatch try again later");
				}
			}
			else
			{
				System.out.println("Input invalid try again later");
			}
		}
		else
		{
		System.out.println("Cannot proceed to withdraw since phone number dosnot match");	
		}
	}
	@Override
	public void checkBalance() {
		Icici.genereteOtp();
		System.out.println(Icici.otp);
		System.out.println("Enetr the OTP you Recived : ");
		int otp=input.nextInt();
		if(Icici.otp==otp)
		{
			System.out.println("Current Balance : "+i.getbalance());
		}
		else
		{
			System.out.println("OTP Mismatch try again later");
		}
		
	}
	@Override
	public void showAccountDetails() {
		Icici.genereteOtp();
		System.out.println(Icici.otp);
		System.out.println("Enter the OTP you Recived : ");
		int otp=input.nextInt();
		if(Icici.otp==otp)
		{
			System.out.println("Name : "+u.getusername());
			System.out.println("Phone Number : "+u.getphoneNo());
			System.out.println("Current Password : "+u.getpwd());
			System.out.println("Account Numbsr : "+i.accNo());
		}
		else
		{
			System.out.println("OTP Mismatch try again later");
		}
		
	}
	
	

}
