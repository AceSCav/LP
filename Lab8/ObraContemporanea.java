
import java.time.LocalDate;


// Nível 3
public class ObraContemporanea extends ObraArte{
    private final int SECULOMINIMO = 17;
    private final int SECULOACTUAL = 21;
    private int seculo;

    public ObraContemporanea (String nome, String genero, LocalDate dataCriacao , double preco, int seculo ) { 
        super(nome, genero, dataCriacao, preco);
        this.seculo = verificaSeculo(seculo);
    }

     public int getSeculo() {
        return seculo;
    }
    
    private int verificaSeculo(int seculo) {
        if(seculo>=17&& seculo<=21){return seculo;}
        else{throw new IllegalArgumentException("O século deve estar entre 17 e 21");
    }
}
    
    public void setSeculo(int seculo) {
            this.seculo= verificaSeculo(seculo);}
    
    public double getValorActual(double valorizacao){
        double valorizacaoFinal = 0.15 + 0.01;
        return super.getValorActual(valorizacaoFinal);
    }
 
}
