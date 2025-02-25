import java.util.*;
class Degree
{
void getdegree(int rno,String name)
{
System.out.println("I GOT A DEGREE");
}
}
class Undergraduate extends Degree
{
void getdegree(int rno,String name,int m)
{
System.out.println("I AM AN UNDERGRADUATE");
}
}
class Postgraduate extends Degree
{
void getdegree(int rno,String name,int m,int cgpa)
{
System.out.println("I AM AN POSTGRADUATE");
}
}
public class Student{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("ENTER ROLLNO,NAME,MARK,CGPA");
int rollno=sc.nextInt();
String name=sc.nextLine();
int m=sc.nextInt();
int cgpa=sc.nextInt();
Postgraduate p=new Postgraduate();
p.getdegree(rollno,name,m,cgpa);
Undergraduate u=new Undergraduate();
u.getdegree(rollno,name,m);
}
}
