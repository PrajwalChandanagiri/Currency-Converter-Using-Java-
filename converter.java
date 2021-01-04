import java.util.*;

class currency

{

double inr,usd;
double euro,yen;
double dinar,pound;

Scanner in=new Scanner(System.in);

public void dollartorupee()

{

System.out.print("\nEnter Dollars to convert into Rupees:");

usd=in.nextInt();

inr=usd*73.82;
System.out.println("--------------------------------------------");
System.out.println("\nDollar = " +usd+ " Equal to INR= "+inr);
System.out.println("--------------------------------------------");

}

public void rupeetodollar()

{

System.out.print("\nEnter Rupee to convert into Dollars:");

inr=in.nextInt();

usd=inr/73.82;
System.out.println("--------------------------------------------");
System.out.println("\nRupee = "+inr+ " Equal to Dollars = "+usd);
System.out.println("--------------------------------------------");
}

public void eurotorupee()

{

System.out.print("\nEnter Euro to convert into Rupees:");

euro=in.nextInt();

inr=euro*90.05;
System.out.println("--------------------------------------------");
System.out.println("\nEuro = "+euro + " Equal to INR= "+inr);
System.out.println("--------------------------------------------");

}

public void rupeetoeuro()

{

System.out.print("\nEnter Rupees to convert into Euro:");

inr=in.nextInt();

euro=(inr/90.05);
System.out.println("--------------------------------------------");
System.out.println("\nRupee = "+inr + " Equal to Euro= "+euro);
System.out.println("--------------------------------------------");

}

public void yentorupee()

{

System.out.print("\nEnter Yen to convert into Rupees:");

yen=in.nextInt();

inr=yen*0.71;
System.out.println("--------------------------------------------");
System.out.println("\nYEN = "+yen + " Equal to INR = "+inr);
System.out.println("--------------------------------------------");
}

public void rupeetoyen()

{

System.out.print("Enter Rupees to convert into Yen:");

inr=in.nextInt();

yen=(inr/0.71);
System.out.println("--------------------------------------------");
System.out.println("\nINR = "+inr + " Equal to YEN "+yen);
System.out.println("--------------------------------------------");
}
public void poundtorupee()

{

System.out.print("\nEnter British Pound to convert into Rupees:");

pound=in.nextInt();

inr=pound*100;
System.out.println("--------------------------------------------");
System.out.println("\nBritish Pound = " +pound+ " Equal to INR= "+inr);
System.out.println("--------------------------------------------");

}
public void rupeetopound()

{

System.out.print("\nEnter Rupees to convert into  British Pound:");

inr=in.nextInt();

pound=(inr/100.00);
System.out.println("--------------------------------------------");
System.out.println("\nRupee = " +inr+ " Equal to British Pound= "+pound);
System.out.println("--------------------------------------------");

}
public void dinartorupee()

{

System.out.print("\nEnter Kuwaiti Dinar to convert into Rupees:");

dinar=in.nextInt();

inr=dinar*241.13;
System.out.println("--------------------------------------------");
System.out.println("\nKuwaiti Dinar = " +dinar+ " Equal to INR= "+inr);
System.out.println("--------------------------------------------");

}
public void rupeetodinar()

{

System.out.print("\nEnter Rupee to convert into Kuwaiti Dinar:");

inr=in.nextInt();

dinar=(inr/241.13);
System.out.println("--------------------------------------------");
System.out.println("\nRupee = " +inr+ " Equal to Kuwati Dinar= "+dinar);
System.out.println("--------------------------------------------");

}



}


public class converter //main class//

{

public static void main(String args[])

{

Scanner s =new Scanner(System.in);

int choice,ch;

currency c=new currency();


do

{
System.out.println("\n---------------------------------------------");
System.out.println("\n        WELCOME TO CURRENCY CONVERTER       ");
System.out.println("\n---------------------------------------------");


System.out.println("\n1. Dollars to Rupees" );
System.out.println("\n2. Rupee to Dollars" );
System.out.println("\n3. Euro to Rupees" );
System.out.println("\n4. Rupee to Euros" );
System.out.println("\n5. Yen to Rupees" );
System.out.println("\n6. Rupee to Yen" );
System.out.println("\n7. British Pound to Rupees" );
System.out.println("\n8. Rupee to British Pounds" );
System.out.println("\n9. Kuwaiti Dinar to Rupees " );
System.out.println("\n10.Rupee to Kuwaiti Dinar" );
System.out.println("\n11.Exit");

System.out.println("\n---------------------------------------------");
System.out.print("\nEnter your Choice: ");
choice=s.nextInt();

switch(choice)
{

    case 1:
{
        c.dollartorupee();
        break;

}

case 2:

{

c.rupeetodollar();

break;

}

case 3:

{

c.eurotorupee();

break;

}

case 4:

{

c.rupeetoeuro();

break;

}

case 5:

{c.yentorupee();

break;}

case 6 :

{

c.rupeetoyen();

break;


}
case 7:
{
    c.poundtorupee();
    break;
}
case 8:
{
    c.rupeetopound();
    break;
}
case 9:
{
    c.dinartorupee();
    break;
}
case 10:
{
    c.rupeetodinar();
    break;
}
case 11:
{
    System.out.println("THANK YOU FOR USING OUR CURRENCY CONVERTER\n");
    return;
}
default :
{
    System.out.println("Invalid Choice\n ");
}
}

System.out.print("\nEnter 0 to  Quit and 1 to Continue: ");

ch=s.nextInt();

}while(ch==1);
s.close();
}


}

