import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public abstract class MobilePhone extends Telephone {
    
    String numberOnDisplay;
    ArrayList<String> appList;
    int maxSimultaneousApps;
    ArrayList<String> openAppsList;    
    
    public MobilePhone(String myNumber, int maxSimultaneousApps) {
        super(myNumber);
        this.numberOnDisplay = "";
        
        if (maxSimultaneousApps > 0) {
            this.maxSimultaneousApps = maxSimultaneousApps;
        } else {
            this.maxSimultaneousApps = 50;
        }
        
        this.appList = new ArrayList<>();
        appList.add("Calculadora");
        appList.add("Contactos");
        appList.add("SMS");

        this.openAppsList = new ArrayList<>();
    }
    
    public ArrayList<String> getAppList(){
        return appList;
    }
    
    public int getMaxSimultaneousApps() {
        return maxSimultaneousApps;
    }
    
    public void setMaxSimultaneousApps(int maxSimultaneousApps) {
        if (maxSimultaneousApps > 0) {
            this.maxSimultaneousApps = maxSimultaneousApps;
        }
    }

    public ArrayList<String> getOpenAppsList() {
        return openAppsList;
    }

    public void setOpenAppsList(ArrayList<String> openAppsList) {
        this.openAppsList = openAppsList;
    }

    public void clearNumber() {
        this.numberOnDisplay = "";
    }
    
    public String getNumberOnDisplay(){
        return numberOnDisplay;
    }

    public void setNumberOnDisplay(String numberOnDisplay){
        this.numberOnDisplay = numberOnDisplay;
    }
    
    public void dial(String number) {
        setNumberOnDisplay(number);
        setIsBusy(true);
        System.out.println("Telefone móvel nº " + getMyNumber() + " está a marcar o nº " + numberOnDisplay); 
    }

    public boolean answerCall(String number) {
        System.out.println("Telefone fixo nº " + getMyNumber() + " está a marcar o nº " + number);        setIsBusy(true);
    
        System.out.println("Telefone móvel nº " + getMyNumber() + ": está a receber uma chamada do número " + number);
        
        char answer;
        Scanner scanner = new Scanner(System.in);
         do {
            System.out.println("Atender chamada? [S|N]");
            answer = scanner.nextLine().toUpperCase().charAt(0);
        } while (answer != 'S' && answer != 'N');

        if (answer == 'S') {
            System.out.println("Em chamada com o número " + number);
            setIsBusy(true);
            setOnCall(true);
            return true;
            } else {
                setIsBusy(false);
                return false;
            }
    }
    
    public abstract void openApp(String appName);
    
    public abstract void closeApp(String appName);
}