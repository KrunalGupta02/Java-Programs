package com.company;

interface MyCamera{
    void takeSnap();
    void recordVideo();
    private void greet(){                                   // We cannot directly used the private method
        System.out.println("Good Morning!");
    }
    default void record4kvideo(){
        greet();
        System.out.println("Recording in 4K");
    }
}
interface MyWifi{
    String [] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling"+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone extends MyCellPhone implements MyWifi,MyCamera{

        public void takeSnap(){
            System.out.println("Taking Snap");
        }
        public void recordVideo(){
            System.out.println("Taking Video");
        }
//        public void record4kvideo(){                      // -> This will override the previously default methods
//        System.out.println("Recording in 4K and taking Snap");
//        }

        public String[] getNetworks(){
            System.out.println("Getting List of Networks");
            String [] networkList = {"Krunal", "Harry", "Rocky"};
            return networkList;
        }
        public void connectToNetwork(String networks){
            System.out.println("Connecting to..."+networks);
        }
        
}
public class Default_Methods {
    public static void main(String[] args) {

        MySmartPhone ms = new MySmartPhone();
        String[] arr = ms.getNetworks();

        for (String item:arr) {
            System.out.println(item);
        }
        ms.record4kvideo();
        // ms.greet();          // --> Throws an Error!
    }
    
}
