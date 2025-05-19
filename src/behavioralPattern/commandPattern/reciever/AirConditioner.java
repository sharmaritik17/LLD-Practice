package behavioralPattern.commandPattern.reciever;

public class AirConditioner {
    public boolean isACOn;
    public int temperature;

    public void turnOnAC(){
        isACOn = true;
        System.out.println("AC is on now");
    }

    public void turnOffAC(){
        isACOn = false;
        System.out.println("AC is off now");
    }

    public void setTemperature(int temp) {
        temperature = temp;
        System.out.println("AC temp is now : "+ temp);
    }
}
