public class singleton_Test {
    public static void main(String[] args) {
        Singleton_Logger instance1 =  Singleton_Logger.getInstance();
        Singleton_Logger instance2 =  Singleton_Logger.getInstance();

        instance1.log_message("This is first log message");
        instance2.log_message("This is second log message \n");

        if(instance1 == instance2){
            System.out.println("Both instance are same");
        }
        else{
            System.out.println("Both are different");
        }
    }
}
