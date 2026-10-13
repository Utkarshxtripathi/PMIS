class Bank{
    final void calculateIntrest(){
        System.out.println("Base Intrest Calculation");
    }
}
//final method cannot be overriden
class Branch extends Bank{
    void calculateIntrest() {
        System.out.println("Custom Interest");
    }
}

public class Final1{
    public static void main(String[] args) {
        
    }
}