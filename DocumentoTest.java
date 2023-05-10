package padroescomportamentais_exercicios.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import padroescomportamentais.state.AlunoEstadoFormado;
import padroescomportamentais.state.AlunoEstadoMatriculado;
import padroescomportamentais_exercicios.state.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class DocumentoTest {

    Documento documento;

    @BeforeEach
    public void setUp() {
        documento = new Documento();
    }

    @Test
    public void naoDeveAprovarDocumentoAprovado() {
        documento.setEstado(DocumentoEstadoAprovado.getInstance());
        assertFalse(documento.aprovar());
    }

    @Test
    public void naoDeveAnalisaeDocumentoAnalisado() {
        documento.setEstado(DocumentoEstadoAnalisado.getInstance());
        assertFalse(documento.analisar());
    }

    @Test
    public void naoDeveEnviarDocumentoEnviado() {
        documento.setEstado(DocumentoEstadoEnviado.getInstance());
        assertFalse(documento.enviar());
    }
    @Test
    public void naoDeveAnalisarDocumentoAprovado() {
        documento.setEstado(DocumentoEstadoAprovado.getInstance());
        assertFalse(documento.analisar());
    }

    @Test
    public void deveAnalisarDocumentoEnviado() {
        documento.setEstado(DocumentoEstadoEnviado.getInstance());
        assertTrue(documento.analisar());
        assertEquals(DocumentoEstadoAnalisado.getInstance(), documento.getEstado());
    }

    @Test
    public void naoDeveAprovarDocumentoEnviado() {
        documento.setEstado(DocumentoEstadoEnviado.getInstance());
        assertFalse(documento.aprovar());
    }

    @Test
    public void deveAprovarDocumentoAnalisado() {
        documento.setEstado(DocumentoEstadoAnalisado.getInstance());
        assertTrue(documento.aprovar());
        assertEquals(DocumentoEstadoAprovado.getInstance(), documento.getEstado());
    }

    @Test
    public void naoDeveEnviarDocumentoAnalisado() {
        documento.setEstado(DocumentoEstadoAnalisado.getInstance());
        assertFalse(documento.enviar());
    }

    @Test
    public void deveEnviarDocumentoAprovado() {
        documento.setEstado(DocumentoEstadoAprovado.getInstance());
        assertFalse(documento.enviar());
    }


}
