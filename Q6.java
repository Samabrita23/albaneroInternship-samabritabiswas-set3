import java.util.Scanner;  
public class RepdigitNumber
{  
//function to check if a number is a Repdigit number or not  
static boolean isRepdigitNumber(int num, int b)  
{  
//variable stores the previous digit initially assigned -1 because it is less than any digit  
int prev = -1;  
 if (num < 0)
   return false;
 else if (num == 0)
   return true;
 else if (nuum>0)
 {
//loop traverse over the given number from the right to left  
while (num != 0)  
{  
//determins the last digit of the given number      
int lastdigit = num % b;  
//divides the number by base (b)  
num = num/b;  
//execute if prev is not equal to -1  
if (prev != -1 && lastdigit != prev)  
return false;  
prev = lastdigit;  
}  
return true;  
} 
}
//driver code  
public static void main(String args[])  
{  
int num, b;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the number: ");  
num = sc.nextInt();  
System.out.print("Enter the base: ");  
b = sc.nextInt();  
if(isRepdigitNumber(num, b))  
{  
System.out.print("It is a repdigit number.");  
}  
else  
{  
System.out.print("It is not a repdigit number.");  
}  
}  
}   
