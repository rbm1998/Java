package bankingapplication.com;

public class Icici {
	private double balnce;
	private long accNo;
	static int otp;
	Icici(double balance,long accNo)
	{
		this.balnce=balance;
		this.accNo=accNo;	
	}
	public double getbalance()
	{
		return balnce;
	}
	public long accNo()
	{
		return accNo;
	}
	public void setbalace(double balance)
	{
		this.balnce=balance;
	}
	public static void genereteOtp()
	{
		int max=1000;
		int min=1;
		int rand=(max-min)+1;
		otp=(int)(Math.random()*rand)+max;
		
	}
}
