import java.util.Scanner;
import java.util.*;
class Bank
{
int getbalance()
{
return 0;
}
}
class BankA extends Bank
{
int getbalance(int amt)
{
return amt;
}
}
class BankB extends Bank
{
int getbalance(int amt)
{
return amt;
}
}
class BankC extends Bank
{
int getbalance(int amt)
{
return amt;
}
}
public class Sample{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in)
int a,c,d;
Bank b=new BankA();
a=b.getbalance(1000);
Bank b=new BankB();
c=b.getbalance(1500);
Bank b=new BankC();
d=b.getbalance(200);
}
}
