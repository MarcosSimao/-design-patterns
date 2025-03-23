package patterns.criacao.prototype;

public abstract class NotaMusical implements Cloneable{
    @Override
    public NotaMusical clone() {
        Object clone;
        try {
           clone=super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
        return (NotaMusical) clone;
    }
    public abstract void desenha();


}
