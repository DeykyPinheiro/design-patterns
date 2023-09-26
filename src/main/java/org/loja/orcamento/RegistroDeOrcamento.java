package org.loja.orcamento;

import org.loja.exception.BusinessException;
import org.loja.http.HttpAdapter;
import org.w3c.dom.DOMException;

import java.io.IOException;
import java.util.Map;
import java.util.Objects;

public class RegistroDeOrcamento {

    private HttpAdapter httpAdapter;

    public RegistroDeOrcamento(HttpAdapter httpAdapter) {
        this.httpAdapter = httpAdapter;
    }


    //    aplicacao de adapter
    public void registrar(Orcamento orcamento) throws IOException {
        if (!orcamento.isFinalizado()) {
            throw new BusinessException("Orcamento nao finalizado");
        }
        String url = "http/api.externa/orcamento";
        Map<String, Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "quantidadeItens", orcamento.getQuantidadeDeItens());
        httpAdapter.post(url, dados);
    }
}
