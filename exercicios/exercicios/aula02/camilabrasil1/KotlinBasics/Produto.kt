package exercicios.aula02.camilabrasil1.KotlinBasics

//Criando a data class de produto
data class Produto(
//definindo atributos
    val nome: String,
    var preco: Double,
    var estoque: Int
) {
    //Definindo as funções/métodos: vender, repor e exibir informações
    fun vender(qtd: Int) {
        if (qtd <= estoque) {
            estoque -= qtd
            println("Foram vendidas $qtd de $nome, venda bem sucedida")
        } else {
            println("Não é possível realizar a venda, estoque insuficiente")
        }
    }

    fun repor(qtd: Int) {
        estoque += qtd
        println("Foram adicionados $qtd de unidades ao estoque de $nome com sucesso.")
        println("Novo estoque de $nome: $estoque")
    }

    fun exibirInfo() {
        println("★ Informações do aula02.Produto ★")
        println("Nome: $nome || Preço: $preco || Estoque: $estoque")
    }

}

//testando
fun main() {
    val produtos = arrayOf(
        Produto("Copo c/ canudo", 25.80, 8),
        Produto("Garrafa Hello Kitty", 18.0, 3),
        Produto("Jarro de Licor", 87.70, 10),
        Produto("Unicórnio de pelúcia", 45.0, 2),
        Produto("Vaso de vidro", 180.0, 15),
    )
    for (p in produtos) {
        println("\n---- Testando: ${p.nome} ----")
        p.exibirInfo()
        p.vender(3)
        p.repor(4)
        p.exibirInfo()
    }

}
