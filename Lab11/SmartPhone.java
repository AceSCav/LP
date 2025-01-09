import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class SmartPhone extends MobilePhone {
    
    public SmartPhone(String myNumber, int maxSimultaneousApps) {
        super(myNumber, maxSimultaneousApps);
    }
    
    @Override
    public void openApp(String appName) {
        if (!getAppList().contains(appName)) {
            System.out.println("A app " + appName + " não está instalada.");
            return;
        }
        if (getOpenAppsList().size() >= getMaxSimultaneousApps()) {
            System.out.println("Limite de apps abertas atingido. Não é possível abrir " + appName + ".");
            return;
        }
        getOpenAppsList().add(appName);
        System.out.println("A app " + appName + " foi aberta.");
    }
    
    @Override
    public void closeApp(String appName) {
        if (getOpenAppsList().remove(appName)) {
            System.out.println("A app " + appName + " foi fechada.");
        } else {
            System.out.println("A app " + appName + " não estava aberta.");
        }
    }
    
    public void showPhoneApps() {
        System.out.println("Apps instaladas no SmartPhone: " + getAppList());
    }
    
    public void installApp(String appName) {
        if (!getAppList().contains(appName)) {
            getAppList().add(appName);
            System.out.println("A app " + appName + " foi instalada.");
        } else {
            System.out.println("A app " + appName + " já está instalada.");
        }
    }
    
    public void uninstallApp(String appName) {
        if (getAppList().remove(appName)) {
            System.out.println("A app " + appName + " foi desinstalada.");
        } else {
            System.out.println("A app " + appName + " não está instalada.");
        }

        if (getOpenAppsList().contains(appName)) {
            closeApp(appName);
        }
    }
    
    @Override
    public void dial(String number) {
        System.out.println("Telemóvel está a marcar o nº " + number);
    }
    
    @Override
    public boolean answerCall(String number) {
        System.out.println("Telemóvel está a atender a chamada do nº " + number);
        setIsBusy(true);
        setOnCall(true);
        return true;
    
    }
}