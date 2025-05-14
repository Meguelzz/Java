package br.edu.etec.test;

import br.edu.etec.model.Pagamento;
import br.edu.etec.model.PagamentoCartao;

public class Teste {
    public static void main(String[] args) {
        PagamentoCartao pagamentoCartao = new PagamentoCartao(150.00, "1234567890123456");

        pagamentoCartao.exibirStatus();
        pagamentoCartao.processarPagamento();
        pagamentoCartao.exibirStatus();

        Pagamento pagamento = new pagamento (150.00);

        pagamento.exibirStatus();
        pagamento.processarPagamento();
        pagamento.exibirStatus();
    }
}

