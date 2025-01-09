public class CellPhone extends MobilePhone {

    public CellPhone(String myNumber) {
        super(myNumber, 1);
        getAppList().add("Snake");
    }
    
    public void openApp(String appName) {
        if (!getAppList().contains(appName)) {
            System.out.println("A app " + appName + " não está instalada.");
            return;
        }
        if (getOpenAppsList().size() >= getMaxSimultaneousApps()) {
            System.out.println("Não é possível abrir " + appName + ". Feche a app aberta primeiro.");
            return;
        }
        getOpenAppsList().add(appName);
        System.out.println("A app " + appName + " foi aberta.");
    }
    
    public void closeApp(String appName) {
        if (getOpenAppsList().remove(appName)) {
            System.out.println("A app " + appName + " foi fechada.");
        } else {
            System.out.println("A app " + appName + " não estava aberta.");
        }
    }
    
    public void showActiveApp() {
        if (getOpenAppsList().isEmpty()) {
            System.out.println("Nenhuma app está ativa.");
        } else {
            System.out.println("App ativa: " + getOpenAppsList().get(0));
        }
    }
    
    @Override
    public void dial(String number) {
        System.out.println("Telemóvel básico está a marcar o nº " + number);
    }
    
    @Override
    public boolean answerCall(String number) {
        System.out.println("Telemóvel básico está a atender a chamada do nº " + number);
        setIsBusy(true);
        setOnCall(true);
        return true;
    }
}