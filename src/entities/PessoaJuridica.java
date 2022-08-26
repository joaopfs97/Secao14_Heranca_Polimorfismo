package entities;

public class PessoaJuridica extends Contribuinte{
    private Integer numeroFunc;
    
    public PessoaJuridica(){
        super();
    }

    public PessoaJuridica(Integer numeroFunc, String nome, Double rendaAnual) {
        super(nome, rendaAnual);
        this.numeroFunc = numeroFunc;
    }

    public Integer getNumeroFunc() {
        return numeroFunc;
    }

    public void setNumeroFunc(Integer numeroFunc) {
        this.numeroFunc = numeroFunc;
    }
    
    @Override
    public Double impostoPago() {
        double imp = 0.16;
        
        if(numeroFunc > 10){
            imp = 0.14;
        }
        
        return rendaAnual * imp;
    }
    
}
