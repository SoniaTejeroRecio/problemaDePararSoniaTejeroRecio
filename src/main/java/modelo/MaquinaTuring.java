package modelo;

public abstract class MaquinaTuring implements Maquina {
    protected Maquina next;

    public MaquinaTuring(Maquina next) { //contructor
        this.next = next;
    }

    public MaquinaTuring() {
        this.next = null;
    }

    public void setNext(Maquina maquina) {
        this.next = maquina;
    }

    public Maquina getNext() {
        return this.next;
    }

    public abstract boolean gestionar();
}

