package br.com.maniadecaneca

class PedidoProduto {

    Pedido pedido
    Produto produto

    Double valorProduto

    String caminhoImagem

    static constraints = {
        caminhoImagem size: 1..300
    }
}
