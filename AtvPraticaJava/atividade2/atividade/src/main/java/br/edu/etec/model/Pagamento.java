package br.edu.etec.model;

abstract class Pagamento {
double valor;
StatusPagamento status;

    public Pagamento(double valor) {
        this.valor = valor;
        this.status = StatusPagamento.PENDENTE;
    }

    public abstract void processarPagamento();

    public void exibirStatus() {
        System.out.println("Status do pagamento: " + status);
    }

    public enum StatusPagamento {
    PENDENTE,
    PROCESSANDO,
    CONCLUIDO,
    FALHA
}

}
