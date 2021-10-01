package br.edu.unifacef.business;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import br.edu.unifacef.dao.FuncionarioDAO;
import br.edu.unifacef.model.Funcionario;

@RunWith(MockitoJUnitRunner.class)
public class FuncionarioBusinessTest {

    @Mock
    private FuncionarioDAO funcionarioDAO;


    @Test
    public void deveriaSalvarFuncionarioSucesso() {

        Funcionario funcionarioMock = new Funcionario();
        funcionarioMock.setId(555L);
        funcionarioMock.setNome("Alessandro Rodrigues");
        funcionarioMock.setDocumento("203.589.898-99");
        funcionarioMock.setCargo("Gerente de Projetos");
        funcionarioMock.setEmail("alessandro@teste.com.br");

        Mockito.when(funcionarioDAO.salvar(funcionarioMock)).thenReturn(funcionarioMock);

        assertEquals(new Long(555), funcionarioMock.getId());
    }

    @Test
    public void deveriaRetornarNovoCargoSucesso(){

        Long idFuncionario = 123L;
        String resultadoEsperado = "Desenvolvedor";
        Mockito.when(funcionarioDAO.atualizarCargoFuncionario(idFuncionario, resultadoEsperado)).thenReturn(resultadoEsperado);

        assertEquals(resultadoEsperado, funcionarioDAO.atualizarCargoFuncionario(idFuncionario, resultadoEsperado));

    }

    @Test
    public void deveriaRetornarIdFuncionarioExcluidoSucesso(){

        Long idFuncionario = 555L;
        Long resultadoEsperado = 555L;
        Mockito.when(funcionarioDAO.excluirFuncionario(idFuncionario)).thenReturn(idFuncionario);

        assertEquals(resultadoEsperado, funcionarioDAO.excluirFuncionario(idFuncionario));

    }


}
