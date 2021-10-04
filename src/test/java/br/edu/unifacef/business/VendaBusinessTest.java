package br.edu.unifacef.business;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import br.edu.unifacef.dao.VendaDAO;
import br.edu.unifacef.model.Venda;

@RunWith(MockitoJUnitRunner.class)
public class VendaBusinessTest {

    @Mock
    private VendaDAO vendaDAO;


    @Test
    public void deveriaSalvarVendaSucesso() {

        Venda vendaMock = new Venda();
        vendaMock.setId(9584L);
        vendaMock.setIdVendedor(853L);
        vendaMock.setIdCliente(9986L);
        vendaMock.setValorBruto(64.99);
        vendaMock.setValorFinal(50.00);

        Mockito.when(vendaDAO.salvar(vendaMock)).thenReturn(vendaMock);

        assertEquals(new Long(9584L), vendaMock.getId());
    }

    @Test
    public void deveriaCalcularDescontoSucesso(){

        Double valorBruto = 100.00;
        Double desconto = 10.00;
        Double resultadoEsperado = 90.00;
        Mockito.when(vendaDAO.definirDesconto(valorBruto, desconto)).thenReturn(resultadoEsperado);

        assertEquals(resultadoEsperado, vendaDAO.definirDesconto(valorBruto, desconto));

    }

    @Test
    public void deveriaRetornarIdFuncionarioResponsavelSucesso(){

        Long idVenda = 555L;
        Long resultadoEsperado = 351L;
        Mockito.when(vendaDAO.pesquisarVendedor(idVenda)).thenReturn(resultadoEsperado);

        assertEquals(resultadoEsperado, vendaDAO.pesquisarVendedor(idVenda));

    }



}
