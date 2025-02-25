import employee.Emp;
import java.util.Scanner;
public class Emppay
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Name:");
System.out.println("Category:");
System.out.println("Age");
System.out.println("enter the bp");
String n=sc.nextLine();
String ca=sc.nextLine();
int age=sc.nextInt();
Double bp=sc.nextDouble();
Emp obj=new Emp();
Double hra,da,npay,pf,gp,it,al;
hra=obj.c1(bp);
da=obj.c2(bp);
npay=obj.c3(bp,hra,da);
pf=obj.c4(bp);
gp=obj.c5(bp,np);
it=obj.c6(gp);
al=obj.c7(gp,it);
System.out.println("Name:"+n+"Age:"+age+"Category:"+ca+"hra"+hra+"da"+da+"npay"+npay+"pf"+pf+"gp"+gp+"it"+it+"al"+al);
}
}





