package template_pattern;

public abstract class DataProcessor{

    public final void process(){
        readData();
        parseData();
        validateData();
        saveData();
    }

    public abstract void readData();

    public abstract void parseData();

    public void validateData(){
        System.out.println("Validating data...");
    }

    public void saveData(){
        System.out.println("Data Saved..");
    }


}