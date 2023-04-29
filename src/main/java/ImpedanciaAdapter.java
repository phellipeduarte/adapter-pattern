import static java.lang.Math.*;

public class ImpedanciaAdapter extends ImpedanciaComplexa{

    private IImpedancia impedanciaFasor;

    public ImpedanciaAdapter(IImpedancia impedanciaFasor) {
        this.impedanciaFasor = impedanciaFasor;
    }

    public void salvarImpedancia(){
        Double modulo = impedanciaFasor.getModulo();
        Double fase = impedanciaFasor.getFase();

        Double real = modulo*cos(fase * 0.0174533);
        Double imaginaria = modulo*sin(fase * 0.0174533);

        this.setComplexa(real, imaginaria);
    }

    public String recuperarImpedancia(){
        Double real = this.getReal();
        Double imaginaria = this.getImaginaria();

        Double modulo = pow(pow(real, 2) + pow(imaginaria, 2), 1/2);
        Double fase = atan(imaginaria/real);

        impedanciaFasor.setFasor(modulo, fase);

        return impedanciaFasor.getFasor();
    }
}
