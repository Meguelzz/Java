package br.edu.etec.model;

public abstract class PagamentoCartao extends Pagamento{
    String numeroCartao;

    public PagamentoCartao(Double valor, String numeroCartao){
        super(valor);
        this.numeroCartao = numeroCartao;
    }

    public void processarPagamento() {
        System.out.println("Processando pagamento de R$ " + valor + " com o cartão terminando em " + numeroCartao.substring(numeroCartao.length() - 4));
        this.status = StatusPagamento.CONCLUIDO;
    }
}
