package com.classes;
class BasicPhone {

    void makeCall() {
       System.out.println("make call..");
    }

    void receiveCall() {
	 System.out.println("receive call..");
    }

    void sendMessage() {
        System.out.println("send sms..");
    }

    void receiveMessage() {
       System.out.println("receive sms..");
    }

 }

 class SmartPhone extends BasicPhone {

   void clickCamera() {
       System.out.println("camera click..");
    }
   
   void browseInternet() {
       System.out.println("browse internet..");
   }   

 }

public class InheritanceDemo {

	public static void main(String[] args) {
		SmartPhone smartphone=new SmartPhone();
		smartphone.makeCall();
		smartphone.receiveCall();
		smartphone.sendMessage();
		smartphone.receiveMessage();
		smartphone.clickCamera();
		smartphone.browseInternet();

	}

}
