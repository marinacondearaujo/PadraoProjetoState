package padroescomportamentais_exercicios.state;

public class DocumentoEstadoAnalisado extends DocumentoEstado{
    private DocumentoEstadoAnalisado() {};
    private static DocumentoEstadoAnalisado instance = new DocumentoEstadoAnalisado();
    public static DocumentoEstadoAnalisado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Analisado";
    }

    public boolean aprovar(Documento documento) {
        documento.setEstado(DocumentoEstadoAprovado.getInstance());
        return true;
    }
}
