public class ImpedanciaFasor implements IImpedancia {

    private Double modulo;
    private Double fase;

    public Double getModulo() {
        return modulo;
    }

    public Double getFase() {
        return fase;
    }

    public void setFasor(Double modulo, Double fase) {
        this.modulo = modulo;
        this.fase = fase;
    }

    public String getFasor(){
        return this.getModulo().toString() + ", fase: " + this.getFase().toString();
    }
}
