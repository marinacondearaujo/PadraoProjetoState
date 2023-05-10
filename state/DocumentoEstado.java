package padroescomportamentais_exercicios.state;


public abstract class DocumentoEstado {

    public abstract String getEstado();


    public boolean aprovar(Documento documento) {
        return false;
    }

    public boolean analisar(Documento documento) {
        return false;
    }

    public boolean enviar(Documento documento) {
        return false;
    }

}
