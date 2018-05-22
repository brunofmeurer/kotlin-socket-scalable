package br.com.wydmaster.estrutura.pacotes

import br.com.wydmaster.estrutura.pacotes.anotacoes.Posicao
import br.com.wydmaster.estrutura.pacotes.anotacoes.Tamanho
import br.com.wydmaster.estrutura.pacotes.dependencias.Cabecalho

/**
 * Criado por bruno-meurer em 27/08/17.
 */
/*Pacote 3*/
class QuantidadePersonagem {
    @Posicao(1)
    var cabecalho: Cabecalho = Cabecalho(3)

    @Posicao(3)
    var numeroPersonagens:Byte = 0
}