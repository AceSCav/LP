public class Main {
    public static void main(String[] args) {
        
        DeskPhone deskPhone = new DeskPhone("999999999");
        deskPhone.dial("999999999");
        deskPhone.ringging();
        deskPhone.endCall();
        deskPhone.setMyNumber("999999999");
        System.out.println("Número do DeskPhone: " + deskPhone.getMyNumber());

        CellPhone cellPhone = new CellPhone("999999999");
        cellPhone.openApp("Snake");
        cellPhone.showActiveApp();
        cellPhone.openApp("Calculadora");
        cellPhone.closeApp("Snake");
        cellPhone.openApp("Calculadora");
        cellPhone.showActiveApp();
    
        System.out.println("Número do CellPhone: " + cellPhone.getMyNumber());

        SmartPhone smartPhone = new SmartPhone("999999999", 3);
        smartPhone.installApp("YouTube");
        smartPhone.showPhoneApps();
        smartPhone.openApp("YouTube");
        smartPhone.openApp("Calculadora");
        smartPhone.closeApp("YouTube");
        smartPhone.openApp("Calculadora");
        System.out.println("Número do SmartPhone: " + smartPhone.getMyNumber());

        deskPhone.call("999999999");
        deskPhone.endCall();
        
        cellPhone.call("999999999");
        cellPhone.endCall();
        
        smartPhone.call("999999999");
        smartPhone.endCall();
    }
}