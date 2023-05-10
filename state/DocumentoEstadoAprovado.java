package padroescomportamentais_exercicios.state;


import padroescomportamentais.state.Aluno;
import padroescomportamentais.state.AlunoEstadoTrancado;

public class DocumentoEstadoAprovado extends DocumentoEstado {
    private DocumentoEstadoAprovado() {};
    private static padroescomportamentais_exercicios.state. DocumentoEstadoAprovado instance = new padroescomportamentais_exercicios.state. DocumentoEstadoAprovado();
    public static padroescomportamentais_exercicios.state. DocumentoEstadoAprovado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Aprovado";
    }


}
