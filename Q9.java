public class Q9
{
  public int squareDigits(int n) {
    String result = ""; 
    
    while (n != ) {
      int digit = n % 10 ;
      result = digit*digit + result ;
      n /= 10 ;
    }
    
    return Integer.parseInt(result) ;
  }

}
