
import java.time.LocalDate;

// Nível 2
public class ObraClassica extends ObraArte {

   
    private String epoca;

    public ObraClassica (String nome, String genero, LocalDate dataCriacao , double preco, String epoca ) { 
        super(nome, genero, dataCriacao, preco);
        this.epoca = verificaEpoca(epoca);
    }

     private String verificaEpoca(String epoca) {
            return (epoca != null && !epoca.isEmpty()) ? epoca : "Época desconhecida";
    }

    public String getEpoca() {
        return epoca;
    }

    public void setEpoca(String epoca) {

        this.epoca= verificaEpoca(epoca);

    }
    
    public double getValorActual(double valorizacao){
        double valorizacaoFinal = 0.15 + 0.05;
        return super.getValorActual(valorizacaoFinal);
    }
}