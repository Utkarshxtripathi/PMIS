package Inheritance;

class Device
{
    void poweron()
    {
        System.out.println("Device powered on.");

    }
}

class dabbaPhone extends Device
{
    void makeCall()
    {
        System.out.println("Calling the number ..... ");
    }
}

class smartphone extends dabbaPhone
{
    void browsing()
    {
        System.out.println("This Phone is browsing");
    }
}


public class MultipleInheritance {
    public static void main(String[] args) {
        smartphone sansung = new smartphone();
        sansung.browsing();
        sansung.makeCall();
        sansung.poweron();
    }
    
}
