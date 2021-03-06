package br.com.house.digital.exception

class Carrinho{
    val listaCombosSimples = mutableListOf<ComboSimples>()
    val listaCombosFamiliares = mutableListOf<ComboFamiliar>()
    val listaProdutos = mutableListOf<Produto>()
    var precoTotal: Double = 0.0

    fun adicionarProdutos(vararg produtos: Produto){
        listaProdutos.addAll(produtos)
        produtos.forEach {
            precoTotal += it.precoProduto
        }
    }

    fun adicionarCombosSimples(vararg combosS: ComboSimples){
        listaCombosSimples.addAll(combosS)
        combosS.forEach {
            precoTotal += it.precoProduto
        }
    }

    fun adicionarCombosFamiliares(vararg combosF: ComboFamiliar){
        listaCombosFamiliares.addAll(combosF)
        combosF.forEach {
            precoTotal += it.precoProduto
        }
    }

    fun exibirItens(){
        println("Produtos avulsos: ")
        listaProdutos.forEach {
            println("Nome: ${it.nomeProduto} - R$${it.precoProduto}")
        }

        println()
        println("Combos simples: ")
        listaCombosSimples.forEach {
            println("Nome: ${it.nomeProduto} - R$${it.precoProduto}")
        }

        println()
        println("Combos familiares: ")
        listaCombosFamiliares.forEach {
            println("Nome: ${it.nomeProduto} - R$${it.precoProduto}")
        }

        println()
        println("Preço total com descontos: R$$precoTotal")
    }
}