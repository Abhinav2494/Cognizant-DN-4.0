public class Singleton_Logger{
    private static Singleton_Logger instance;

    private  Singleton_Logger(){

    }
    public static Singleton_Logger getInstance() {
        if (instance == null) {
           instance = new Singleton_Logger();
        }
        return instance;
    }
    public void log_message(String msg){
        System.out.println(msg);
    }
}