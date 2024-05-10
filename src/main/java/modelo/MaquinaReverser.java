package modelo;

public class MaquinaReverser extends MaquinaTuring{
    private String programa;

    public MaquinaReverser(String programa){
        super();
        this.programa = programa;
    }

    public MaquinaReverser (Maquina next, String programa){
        this(programa);
        this.setNext(next);
    }

    public boolean gestionar(){
    setNext(new MaquinaHaltchecker(programa,programa));
    if(next.gestionar()){
        while(true){
            break; //esto habria que eliminarlo en el problema de la parada
        }
    }
        return true;

    }
}
