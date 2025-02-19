import java.util.*;
class Motorvehicle
{
String modelname;
int modelno,modelprice;
Motorvehicle(String mname,int mno,int mp)
{
modelname=mname;
modelno=mno;
modelprice=mp;
}
public void display()
{
System.out.println("MODELNAME"+modelname);
System.out.println("MODELNO"+modelno);
System.out.println("MODELPRICE"+modelprice);
}
}
class Car extends Motorvehicle{
double discountrate,dr;
Car(double d)
{
discountrate=d;
}
public void discount()
{
dr=discountrate*modelprice;
System.out.println("DISCOUNT"+dr);
}
public void display()
{
Motorvehicle m= new Motorvehicle();
m.display();
discount();
System.out.println("DISCOUNTRATE"+discountrate);
}
}
public class Demo{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
String modelname;
int modelno,modelprice;
double discountrate;
System.out.println("ENTER MODELNAME");
modelname=sc.nextLine();
System.out.println("ENTER MODELNUMBER AND PRICE");
modelno=sc.nextInt();
modelprice=sc.nextInt();
System.out.println("ENTER DISCOUNTRATE");
discountrate=sc.nextDouble();
Car obj= new Car();
obj.display();
}
}
