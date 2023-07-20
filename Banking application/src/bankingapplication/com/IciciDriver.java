package bankingapplication.com;

import java.util.Scanner;

public class IciciDriver {
	public static void main(String[] args)
	{
		IciciBusnessLogicClass iblc=new IciciBusnessLogicClass();
		Scanner sc=new Scanner(System.in);
		boolean exit=true;
		while(exit)
		{
			System.out.println("******Welcome To ICICI Banking Application");
			System.out.println("Enter Your Choice: ");
			System.out.println("1.Create Account");
			System.out.println("2.Withdraw Money");
			System.out.println("3.Deposit Money");
			System.out.println("4.Check Balance");
			System.out.println("5.Account Details");
			System.out.println("6.Exit");
			
			int options=sc.nextInt();
			switch(options)
			{
			case 1:
			{
				iblc.createAccount();
			}
			break;
			case 2:
			{
				iblc.withdrawMoney();
			}
			break;
			case 3:
			{
				iblc.depositMoey();
			}
			break;
			case 4:
			{
				iblc.checkBalance();
			}
			break;
			case 5:
			{
				iblc.showAccountDetails();
			}
			case 6:
			{
				exit=false;
				System.out.println("Thank You For Using This Application"+iblc.u.getusername());
			}
			default:
			{
				System.out.println("Invalid Input try again later"+iblc.u.getusername());
			}
			}
		}
		
		
	}

}
