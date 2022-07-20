import java.util.*;
class store
{

public static void main(String args[])

{
	Scanner amit=new Scanner(System.in);
	System.out.println(" Enter the mobile model ");
	String Mmodel=amit.nextLine();
	System.out.println(" Enter the mobile Company ");
	String Mcompany=amit.nextLine();
	System.out.println(" Enter the mobile Price ");
	int Mprice=amit.nextInt();
	Mobile M1=new Mobile();
	M1.AddMobile(Mmodel,Mcompany,Mprice);
	M1.displayMobile();

}

}