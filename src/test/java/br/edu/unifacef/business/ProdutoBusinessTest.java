package br.edu.unifacef.business;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import br.edu.unifacef.dao.ProdutoDAO;
import br.edu.unifacef.model.Produto;

@RunWith(MockitoJUnitRunner.class)
public class ProdutoBusinessTest {

    @Mock
    private ProdutoDAO produtoDAO;


    @Test
    public void deveriaSalvarProdutoSucesso() {

        Produto produtoMock = new Produto();
        produtoMock.setId(35L);
        produtoMock.setDescricao("Mouse Gamer");
        produtoMock.setValorCompra(50.00);
        produtoMock.setValorVenda(64.99);
        produtoMock.setFornecedor("Logitec");

        Mockito.when(produtoDAO.salvar(produtoMock)).thenReturn(produtoMock);

        assertEquals(new Long(35L), produtoMock.getId());
    }

    @Test
    public void deveriaAtualizarDescricaoProdutoSucesso(){

        Long idProduto = 35L;
        String resultadoEsperado = "Mouse Logitec Gamer";
        Mockito.when(produtoDAO.atualizarDescricaoProduto(idProduto, resultadoEsperado)).thenReturn(resultadoEsperado);

        assertEquals(resultadoEsperado, produtoDAO.atualizarDescricaoProduto(idProduto, resultadoEsperado));

    }

    @Test
    public void deveriaAlterarValorVendaProdutoSucesso(){

        Long idProduto = 35L;
        Double resultadoEsperado = 79.90;
        Mockito.when(produtoDAO.alterarValorVenda(idProduto, resultadoEsperado)).thenReturn(resultadoEsperado);

        assertEquals(resultadoEsperado, produtoDAO.alterarValorVenda(idProduto, resultadoEsperado));

    }


}
