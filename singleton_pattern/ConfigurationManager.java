package singleton_pattern;

public class ConfigurationManager {

    // volatile ensures changes are immediately visible to other threads
    // and prevents instruction reordering
    private static volatile ConfigurationManager instance;

    private ConfigurationManager(){

    }

    public static ConfigurationManager getInstance(){
        // First check (no locking overhead if already initialized)
        if(instance == null){
            synchronized(ConfigurationManager.class){
                // Second check (ensures only one thread creates it)
                if(instance == null){
                    instance = new ConfigurationManager();
                }
            }
        }
        return instance;
    }
    
}
