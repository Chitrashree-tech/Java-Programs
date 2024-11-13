import java.util.*;
public class Quadratic
{
public static void main(String arg[])
{
int a,b,c;
double d,r1,r2;
System.out.println("Chitrashree K\n 1BM23CS081");
Scanner s=new Scanner(System.in);
System.out.println("enter the value of a:");
a=s.nextInt();
System.out.println("enter the value of b:");
b=s.nextInt();
System.out.println("enter the value of c:");
c=s.nextInt();
d=b*b-(4*a*c);
if(d==0)
{
System.out.println("roots are real and equal");
r1=r2=-b/(2*a);
System.out.println("root1=root2="+r1);
}
else if(d>0)
{
System.out.println("roots are real and distinct");
r1=(-b+Math.sqrt(d))/(2*a);
r2=(-b-Math.sqrt(d))/(2*a);
System.out.println("root1="+r1+"and roo12="+r2);
}
else
{
double real=-b/(2*a);
double imaginary=Math.sqrt(-d)/(2*a);
System.out.println("Roots are imaginary:");
System.out.printf("root1=%.2f+%.2fi and root2=%.2f-%.2fi",real,imaginary,real,imaginary);
}
}
}
