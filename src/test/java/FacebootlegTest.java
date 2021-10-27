import org.junit.Test;
import org.junit.Assert;
public class FacebootlegTest {

    @Test
    public void deveRegistrarADataDeInicioDaSessao() {
        final int CARACTERES_CORTADOS_STRING = 7;
        // Arrange
        Sessao sessao = new Sessao();
        String dataEsperada = "2021-10-27T02:05";
        // Act
        String dataRegistrada = sessao.getDataDeInicioDaSessao(); // o que será comparada
        dataRegistrada = dataRegistrada.substring(0, dataRegistrada.length() - CARACTERES_CORTADOS_STRING);
        System.out.println(dataRegistrada);
        System.out.println(dataEsperada);
        // Assert
        boolean valido = dataEsperada.equals(dataRegistrada);
        System.out.println(valido);
        Assert.assertTrue(valido);
    }

    @Test
    public void deveLerEntradasDoUsuarioParaRealizarOLogin() {

    }
    @Test
    public void deveValidarOLogin() {

    }
    @Test
    public void deveMostrarMensagemDeErroAoErrarInformacoesDoLogin() {

    }
    @Test
    public void deveRegistrarOsDadosDoUsuarioAoEscolherCriarNovaConta() {

    }
}
