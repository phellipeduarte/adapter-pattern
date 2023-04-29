public class Circuito {

    IImpedancia impedanciaFasor;
    ImpedanciaAdapter persistencia;

    public Circuito(){
        impedanciaFasor = new ImpedanciaFasor();
        persistencia = new ImpedanciaAdapter(impedanciaFasor);
    }

    public void setImpedancia(Double modulo, Double fase) {
        impedanciaFasor.setFasor(modulo, fase);
        persistencia.salvarImpedancia();
    }

    public String getImpedancia(){ return persistencia.recuperarImpedancia(); }

    public String getComplexa(){ return persistencia.getImpedancia(); }

}
