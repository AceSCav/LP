
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Nivel 1
        ObraArte oa1= new ObraArte("Monalisa","Ren",LocalDate.of(2023,11,20), 1000.0);
        // Nivel 2
        ObraClassica oc1 = new ObraClassica("O Grito", "Edvard Munch", LocalDate.of(1893, 1, 1), 800000.0);
        ObraClassica oc2 = new ObraClassica("A Noite Estrelada", "Vincent van Gogh", LocalDate.of(1889, 6, 1), 1200000.0);
        // Nivel 3 
        ObraContemporanea oc3 = new ObraContemporanea("Campbell's Soup Cans", "Pop Art", LocalDate.of(1962, 7, 9), 1500000.0, 20);
        ObraContemporanea oc4 = new ObraContemporanea("Untitled", "Abstrato", LocalDate.of(2020, 11, 5), 500000.0, 21);
        // Percorrendo e exibindo informações das obras
        // Nível 4
        ArrayList<ObraArte> obras = new ArrayList<>();
        
        obras.add(oa1);
        obras.add(oc1);
        obras.add(oc2);
        obras.add(oc3);
        obras.add(oc4);
        
        //Nível 5
        for (ObraArte obra : obras) {
            System.out.println(obra);
        }}
}
