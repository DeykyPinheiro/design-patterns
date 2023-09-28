import org.loja.http.HttpAdapter;
import org.loja.http.HttpAdapterImpl;
import org.loja.orcamento.ItemOrcamento;
import org.loja.orcamento.Orcamento;
import org.loja.orcamento.RegistroDeOrcamento;

import java.io.IOException;
import java.math.BigDecimal;

public class TestHttpAdapter {

    public static void main(String[] args) throws IOException {
        HttpAdapter httpAdapter = new HttpAdapterImpl();
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrcamento registroDeOrcamento = new RegistroDeOrcamento(httpAdapter);
        registroDeOrcamento.registrar(orcamento);
    }
}
