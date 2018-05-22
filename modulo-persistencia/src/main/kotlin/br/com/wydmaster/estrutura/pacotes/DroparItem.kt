package br.com.wydmaster.estrutura.pacotes

import br.com.wydmaster.estrutura.pacotes.anotacoes.Posicao
import br.com.wydmaster.estrutura.pacotes.anotacoes.Tamanho
import br.com.wydmaster.estrutura.pacotes.comum.Coordenadas
import br.com.wydmaster.estrutura.pacotes.comum.Equipamento
import br.com.wydmaster.estrutura.pacotes.comum.Inventario
import br.com.wydmaster.estrutura.pacotes.dependencias.Cabecalho

/**
 * Criado por bruno-meurer em 21/10/17.
 */
class DroparItem {
    @Posicao(1)
    var cabecalho: Cabecalho = Cabecalho(15)
    @Posicao(3)
    var inventario = Inventario()

    @Posicao(4)
    var coordenadas = Coordenadas()

    @Posicao(5)
    @Tamanho(45)
    var nome = ""
}