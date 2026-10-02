package template_pattern;

public class CSVProcessor extends DataProcessor {

    @Override 
    public void readData(){
        System.out.println("Reading data using csv...");
    }

    @Override 
    public void parseData(){
        System.out.println("Parsed data using csv...");
    }
    
}
