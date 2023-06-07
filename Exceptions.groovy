public class Excecptions {
    public static void main (String[]args)
    {
        try {
        def  i = 1/0
    }
    catch (Exception e ){
  println e.getMessage()
    }
    finally{
        println "Allways executes"
    }
}}