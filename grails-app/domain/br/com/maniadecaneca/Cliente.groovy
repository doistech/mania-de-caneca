package br.com.maniadecaneca

class Cliente {

    String nome
    String email
    String telefone
    String celular

    static constraints = {
        email nullable: true
        telefone nullable: true
        celular nullable: true
    }
}
