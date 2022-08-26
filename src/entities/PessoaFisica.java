package entities;

public class PessoaFisica extends Contribuinte{
    private Double gastosSaude;
    
    public PessoaFisica(){
        super();
    }

    public PessoaFisica(Double gastosSaude, String nome, Double rendaAnual) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }
    
    
    @Override
    public Double impostoPago() {
        double imp = 0;
        double totalPago;
        if(rendaAnual < 20000){
            imp = 0.15;
        }
        else{
            imp = 0.25;
        }
        
        if(gastosSaude > 0){
            totalPago = (rendaAnual * imp) - (gastosSaude * 0.5);
        }
        else{
            totalPago = rendaAnual * imp;
        }
        
        return totalPago;
    }
    
}
