public class Q7 
{
  public static int[]  arrayOfMultiples(int num, int length)
   {
    int limit = length, multiple = num;
    int[] list = new int[limit];
    for (int index = 0; index < limit; index++)
        
            list[index] = ((index+1)*num);
    
    return list;
    }
 }
