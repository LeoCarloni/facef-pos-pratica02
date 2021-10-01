package br.edu.unifacef.business;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import br.edu.unifacef.dao.ClienteDAO;
import br.edu.unifacef.model.Cliente;

@RunWith(MockitoJUnitRunner.class)
public class ClienteBusinessTest {

	@Mock
	private ClienteDAO clienteDAO;

	
	@Test
	public void deveriaSalvarClienteSucesso() {
		
		Cliente clienteMock = new Cliente();
		clienteMock.setId(123L);
		clienteMock.setNome("Leonardo Rosa");
		clienteMock.setDocumento("123.456.789-00");
		clienteMock.setNascimento("01/01/2001");
		clienteMock.setEmail("teste1@teste.com.br");
		
		Mockito.when(clienteDAO.salvar(clienteMock)).thenReturn(clienteMock);

		assertEquals(new Long(123), clienteMock.getId());
	}

	@Test
	public void deveriaRetornarIdClienteExcluidoSucesso(){

		Long idCliente = 123L;
		Long resultadoEsperado = 123L;
		Mockito.when(clienteDAO.excluirCliente(idCliente)).thenReturn(idCliente);

		assertEquals(resultadoEsperado, clienteDAO.excluirCliente(idCliente));

	}

	@Test
	public void deveriaRetornarNomeClienteSucesso(){

		String documento = "111.222.333-44";
		String resultadoEsperado = "João Pedro";

		Mockito.when(clienteDAO.pesquisarCliente(documento)).thenReturn(resultadoEsperado);

		assertEquals(resultadoEsperado, clienteDAO.pesquisarCliente(documento));

	}

}
