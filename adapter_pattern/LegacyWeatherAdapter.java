package adapter_pattern;

public class LegacyWeatherAdapter implements WeatherService{

    private LegacyTemperature legacyTemperature;
    
    public LegacyWeatherAdapter(LegacyTemperature legacyTemperature){
        this.legacyTemperature = legacyTemperature;
    }
    @Override 
    public double getTemperature(){
        return legacyTemperature.getTemperatureInFahrenheit();
    }
    
}
