
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.YearMonth;


// Nível 1
public class ObraArte {

    private final LocalDate dataActual = LocalDate.now();
    private String nome;
    private String genero;
    private LocalDate dataCompra;
    private double precoCompra;
    
    public ObraArte(String nome, String genero, LocalDate dataCompra , double precoCompra) {
        this.nome = verificaNome(nome);
        this.genero = verificaGenero(genero);
        this.dataCompra = verificaDataCompra(dataCompra);
        this.precoCompra = verificaPrecoCompra(precoCompra);
    }
    
    private String verificaNome(String nome) {
        return (nome != null) ? nome : "";
    }

    private String verificaGenero(String genero) {
        return (genero != null) ? genero : "";
    }

    private LocalDate verificaDataCompra(LocalDate dataCompra) {
        return (dataCompra != null) ? dataCompra : LocalDate.now();
    }

    private double verificaPrecoCompra(double precoCompra) {
        return this.precoCompra = (precoCompra >= 0.0) ? precoCompra : 0.0;
    }
    
    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setNome(String nome) {
        this.nome = verificaNome(nome);
    }

    public void setGenero(String genero) {
        this.genero = verificaGenero(genero);
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = verificaDataCompra(dataCompra);

    }

    public void setPrecoCompra(double precoCompra) {
        verificaPrecoCompra(precoCompra);
    }

    //nivel 3
    public long ObterMesesCompra() {
      YearMonth startMonth = YearMonth.from(getDataCompra());
      YearMonth endMonth = YearMonth.from(dataActual);
      long meses = ChronoUnit.MONTHS.between(startMonth, endMonth) + 1; 
      return meses;
    }
    
    
    public double getValorActual(double valorizacao) {
        if (valorizacao > 0) {
            return getPrecoCompra() * valorizacao; 
        } else if (valorizacao < 0) {
            return getPrecoCompra() * valorizacao;
        } else {
            return getPrecoCompra();
    }
}
    
    @Override
    public String toString() {
        return getNome() + getGenero() + getDataCompra().toString() + getPrecoCompra();
    }
}
