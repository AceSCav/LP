import java.util.Random;
import java.util.Scanner;

public abstract class Telephone{

    private String myNumber;
    private boolean isBusy;
    private boolean onCall;

    public Telephone(String myNumber) {

        if (myNumber.length() == 9) {
            try {
                this.myNumber = String.valueOf(myNumber);
                this.myNumber = myNumber;
            } catch (Exception e) {
                this.myNumber = setNumber();
            }
        } else {
            this.myNumber = setNumber();
        }

        isBusy = false;
        onCall = false;

    }
    
    public void setMyNumber(String myNumber) {
        this.myNumber = myNumber;
    }

    public void setIsBusy(boolean isBusy) {
        this.isBusy = isBusy;
    }

    public void setOnCall(boolean onCall) {
        this.onCall = onCall;
    }
    
    //seletores
    public String getMyNumber() {
        return myNumber;
    }

    public boolean isIsBusy() {
        return isBusy;
    }

    public boolean isOnCall() {
        return onCall;
    }

    public String setNumber() {
        int n;
        Random rnd = new Random(System.currentTimeMillis());
        n = rnd.nextInt(1000000000) + 100000000;
        System.out.println(String.valueOf(n));
        return String.valueOf(n);
    }

    public void dial(String number) {
        isBusy = true;
        System.out.println("O telefone nº " + myNumber + " está a marcar o nº " + number);
    }

    public void ringging() {
        if (!isBusy) {

            isBusy = true;
            onCall = answerCall(setNumber());
        }
    }

    public boolean answerCall(String number) {
        char answer;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Atender? [S|N]");
            answer = scanner.nextLine().toUpperCase().charAt(0);

        } while (answer != 'S' && answer != 'N');
        if (answer == 'S') {
            System.out.println("Em chamada com o número " + number);
            isBusy = true;

            return true;
        } else {
            isBusy = false;
            return false;
        }
    }

    public void endCall() {
        if (onCall) {
            onCall = false;
            System.out.println("Fim de chamada");
        }
    }

    public boolean call(String number) {

        try {
            if (number.isEmpty()) {
                throw new IllegalArgumentException("Nº inválido");
            }
            if (!this.myNumber.equals(number)) {
                System.out.println("A ligar para o nº" + number);
            for (int i = 0; i < 10; i++) {
                System.out.printf(". ");
                Thread.sleep(500);
            }
                onCall = true;
                isBusy = true;
                return true;
            } else {
                System.out.println("O nº está ocupado");
            }

        } catch (Exception e) {
            System.out.println("Nº inválido");
        }

        isBusy = false;
        onCall = false;
        return false;
    }
    
}
