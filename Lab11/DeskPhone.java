import java.util.Random;
import java.util.Scanner;

public class DeskPhone extends Telephone {

    public DeskPhone(String myNumber) {
        super(myNumber);
    }

    public void dial(String number) {
        setIsBusy(true);
        System.out.println("Telefone fixo nº " + getMyNumber() + " está a marcar o nº " + number);        
        
        if (!call(number)){
            System.out.println("Falha.");
        }
    }
    
    @Override
    public boolean answerCall(String number) {
        char answer;
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.println("Telefone fixo nº " + getMyNumber() + ": atender chamada do número " + number + "? [S|N]");
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
}