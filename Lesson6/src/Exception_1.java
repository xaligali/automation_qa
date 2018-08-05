public class Exception_1 extends Throwable{

   private String home_;
   public void gethome(){ System.out.printf(home_);}

   public Exception_1(String message){

       super(message);
   }
    public Exception_1(String message, String home){

        super(message);
        home_ =home;
    }

}

