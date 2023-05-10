package padroescomportamentais_exercicios.state;

public class DocumentoEstadoEnviado extends DocumentoEstado{
    private DocumentoEstadoEnviado() {};
    private static padroescomportamentais_exercicios.state. DocumentoEstadoEnviado instance = new padroescomportamentais_exercicios.state. DocumentoEstadoEnviado();
    public static padroescomportamentais_exercicios.state. DocumentoEstadoEnviado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Enviado";
    }

    public boolean analisar(Documento documento) {
        documento.setEstado(DocumentoEstadoAnalisado.getInstance());
        return true;
    }
}
