import java.util.*;
class MeanOfDigits
{
    public static void main(String args[])
{
Scanner sc = new Scanner(System.in); 
int number = sc.nextInt();
int sum = 0; 
int input = number;
int count =0;
int mean;
while (input != 0) 
{ 
    int lastdigit = input % 10; 
    sum += lastdigit; 
    input /= 10; 
    count++;
} 
mean = sum/count;
System.out.printf("Mean of digits of number %d is %d", number, mean); 
sc.close();
}
}


