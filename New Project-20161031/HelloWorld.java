public class HelloWorld{

     public static void main(String []args){
        String result = "";
 String v = null;
 try {
 try {
 result += "before";
 v.length();
 result += "after";
 } catch (NullPointerException e) {
 result += "catch";
 throw new Exception("Exception1");
 } finally {
 result += "finally";
 throw new Exception("Exception2");
 }
 } catch (Exception e) {
     System.out.println(e.getMessage());
 result += "done";
 }
 System.out.println(result);
     }
}
