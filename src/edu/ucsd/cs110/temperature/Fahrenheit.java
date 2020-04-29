package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        Fahrenheit temp = this;
        float convert = temp.getValue();
        convert = convert -32;
        convert = convert *5/9;
        Celsius ans = new Celsius(convert);
        return ans;
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString()
    {
        // TODO: Complete this method
        Fahrenheit temp = this;
        float c = this.getValue();
        String s = String.valueOf(c);
        String ans = "" + s + " F";
        return ans;
    }
}