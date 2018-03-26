package br.com.maniadecaneca

class PrecoProduto {

    Produto produto

    String tipoPreco
    String porcentagem

    Double precoVenda

    static constraints = {
        produto nullable: false
        tipoPreco nullable: false
        porcentagem nullable: false
        precoVenda nullable: false
    }
}
