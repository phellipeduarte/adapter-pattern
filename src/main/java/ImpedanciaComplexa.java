public class ImpedanciaComplexa {

    private Double real;
    private Double imaginaria;

    public Double getReal() {
        return real;
    }

    public Double getImaginaria() {
        return imaginaria;
    }

    public void setComplexa(Double real, Double imaginaria){
        this.real = real;
        this.imaginaria = imaginaria;
    }

    public String getImpedancia(){
        return this.getReal().toString() + " + j" + this.getImaginaria().toString();
    }
}
