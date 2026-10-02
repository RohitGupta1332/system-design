package template_pattern;

public class JsonProcessor extends DataProcessor {

    @Override
    public void readData() {
        System.out.println("Reading data using json...");
    }

    @Override
    public void parseData() {
        System.out.println("Parsed data using json...");
    }
    
}
