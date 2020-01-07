public class aa{
    public static void main(String args[])
    {
      
      double doubleValue=20.00d;
      double myDoubleValue=80.00d;
      double operations= (doubleValue+myDoubleValue)*100.00d;
       System.out.println("value is="+operations);

      double remainder= operations % 40.00d;
       System.out.println("remainder="+remainder);

      int value=(remainder==0)?System.out.println("Got some remainder"):System.out.println("no remainder");
      
 
    }
}