package br.edu.etec.test;

import br.edu.etec.model.PagamentoCartao;

public class Teste {
    public static void main(String[] args) {
        PagamentoCartao pagamento = new PagamentoCartao(150.00, "1234567890123456");

        pagamento.exibirStatus();
        pagamento.processarPagamento();
        pagamento.exibirStatus();

    }
}

