class Subtract
{
  public static void main(String args[])
  {
    int x=Integer.parseInt(args[0]);
    int y=Integer.parseInt(args[1]);
    
    if(x>y)
    {
      System.out.println("Differnce of x-y is : "+(x-y));
    }
    else
    {
      System.out.println("Difference of y-x is :"+(y-x));
    }
  }
}
