package Temperature;

public class Temperatura {
    private double number;

    public Temperatura(double number) {
        this.number = number;
    }
    
    public double getNumber() {
        return number;
    }
    
    public double kelvin(double number){
        double kelvin = number + 273.15;
        return kelvin;
    }
    
    public double fahrenheit(double number){
        double fahrenheit = (number * 1.8) + 32;
        return fahrenheit;
    }
    
    public double rankine(double number){
        double rankine = (number * 1.8) + 32 + 459.67;
        return rankine;
    }
    
    public double reaumur(double number) {
        double reaumur = number * 0.8;
        return reaumur;
    }
}
