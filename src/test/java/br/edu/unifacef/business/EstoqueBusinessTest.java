package br.edu.unifacef.business;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import br.edu.unifacef.dao.EstoqueDAO;
import br.edu.unifacef.model.Estoque;

@RunWith(MockitoJUnitRunner.class)
public class EstoqueBusinessTest {

    @Mock
    private EstoqueDAO estoqueDAO;


    @Test
    public void deveriaSalvarEstoqueSucesso() {

        Estoque estoqueMock = new Estoque();
        estoqueMock.setId(5400L);
        estoqueMock.setIdProduto(351L);
        estoqueMock.setQuantidade(10);
        estoqueMock.setEstoqueMinimo(5);
        estoqueMock.setEstoqueMaximo(15);

        Mockito.when(estoqueDAO.salvar(estoqueMock)).thenReturn(estoqueMock);

        assertEquals(new Long(5400), estoqueMock.getId());
    }

    @Test
    public void deveriaAumentarEstoqueSucesso(){

        Long idProduto = 5380L;
        Integer novoValor = 3;
        Integer resultadoEsperado = 13;
        Mockito.when(estoqueDAO.aumentarEstoque(idProduto, novoValor)).thenReturn(resultadoEsperado);

        assertEquals(resultadoEsperado, estoqueDAO.aumentarEstoque(idProduto, novoValor));

    }

    @Test
    public void deveriaReduzirEstoqueSucesso(){

        Long idProduto = 5380L;
        Integer novoValor = 5;
        Integer resultadoEsperado = 8;
        Mockito.when(estoqueDAO.diminuirEstoque(idProduto, novoValor)).thenReturn(resultadoEsperado);

        assertEquals(resultadoEsperado, estoqueDAO.diminuirEstoque(idProduto, novoValor));

    }


}
