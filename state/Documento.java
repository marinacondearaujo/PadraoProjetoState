package padroescomportamentais_exercicios.state;

public class Documento {
    private String numero;
    private DocumentoEstado estado;

    public Documento() {
        this.estado = DocumentoEstadoAnalisado.getInstance();
    }

    public void setEstado(DocumentoEstado estado) {
        this.estado = estado;
    }


    public boolean aprovar() {
        return estado.aprovar(this);
    }


    public boolean analisar() {
        return estado.analisar(this);
    }

    public boolean enviar() {
        return estado.enviar(this);
    }


    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNome() {
        return numero;
    }

    public void setNome(String nome) {
        this.numero = numero;
    }

    public DocumentoEstado getEstado() {
        return estado;
    }
}
