package br.com.maniadecaneca

class Pedido {

    Cliente cliente

    Date dataPedido

    Date dataArte
    Date dataAprovação
    Date dataEntrega

    String localEntrega

    Double valorPagamentoAdiantamento
    Date dataPagamentoAdiantamento

    Double valorPagamento
    Date dataPagamento

    static constraints = {
        localEntrega size: 1..1000
    }
}
