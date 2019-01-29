package ExampleInTIJ.Twelve;


import java.util.Collections;

class DepthReading implements Cloneable{
    private double depth;
    public DepthReading(double depth){
        this.depth = depth;
    }
    public Object clone(){
        Object o = null;
        try {
            o = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return o;
    }
}

class TemperatureReading implements Cloneable{
    private long time;
    private double temperature;

    public TemperatureReading(double temperature){
        this.temperature = temperature;
    }

    public Object clone(){
        Object o = null;
        try {
            o = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return  o;

    }
}

class OceanReading implements Cloneable{
    private DepthReading depth;
    private  TemperatureReading temperature;

    public OceanReading(double tdata,double ddate){
        temperature = new TemperatureReading(tdata);
        depth = new DepthReading(ddate);
    }

    public Object clone(){
        OceanReading o=null;
        try {
            o=(OceanReading)super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        o.depth =(DepthReading)o.depth.clone();
        o.temperature = (TemperatureReading)o.temperature.clone();
        return o;
    }
}
public class DeepCopy {
    public static void main(String[] args){
        OceanReading reading = new OceanReading(33.9,100.5);
        OceanReading r = (OceanReading)reading.clone();
    }
}