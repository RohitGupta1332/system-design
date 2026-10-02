package singleton_pattern;

public class Main {

    public static void main(String[] args){
        ConfigurationManager a = ConfigurationManager.getInstance();
        ConfigurationManager b = ConfigurationManager.getInstance();

        System.out.println(a == b);
    }
    
}
