package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        Celsius temp = this;
        float convert = temp.getValue();
        convert = convert *9/5 + 32;
        Fahrenheit fa = new Fahrenheit(convert);
        return fa;
}

    public String toString()
    {
        // TODO: Complete this method
        Celsius temp = this;
        float c = this.getValue();
        String s = String.valueOf(c);
        String ans = "" + s + " C";
        return ans;
    }
}