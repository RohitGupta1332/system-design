package adapter_pattern;

public class Main {

    public static void main(String[] args){

        
        WeatherService service = new LegacyWeatherAdapter(new LegacyTemperature());

        System.out.println(service.getTemperature());
    }
    
}
