
/*Questão 1
fun main() {
   val numero = 7

   if (numero % 2 == 0) {
        println("$numero é par")
   } else {
       println("$numero é ímpar")
    }
} */


/*Questão 2
fun main() {
    val numero = -5

    if (numero > 0) {
        println("Positivo")
    } else if (numero < 0) {
        println("Negativo")
    } else {
        println("Zero")
    }
}*/

/*Questão 3
fun main() {
    val idade = 20

    when {
        idade < 12 -> println("Criança")
        idade <= 17 -> println("Adolescente")
        idade <= 59 -> println("Adulto")
        else -> println("Idoso")
    }
}*/

/*Questão 4

fun main() {
    val numero = 5

    for (i in 1..10) {
        println("$numero x $i = ${numero * i}")
    }
}*/

/*Questão 5

fun main() {
    val numeros = arrayOf(1, 2, 3, 4)

    var soma = 0

    for (numero in numeros) {
        soma += numero
    }

    println("Soma = $soma")
}*/

/*Questão 6 dd

fun main() {
    val numeros = arrayOf(5, 8, 2, 10, 3)

    var maior = numeros[0]

    for (numero in numeros) {
        if (numero > maior) {
            maior = numero
        }
    }

    println("Maior número = $maior")
}*/

/*Questão 7

fun main() {
    val numero = 10

    for (i in numero downTo 0) {
        println(i)
    }
}*/

/*Questão 8

fun main() {
    val numeros = arrayOf(1, 2, 3, 4)

    var soma = 0

    for (numero in numeros) {
        if (numero % 2 == 0) {
            soma += numero
        }
    }

    println("Soma dos pares = $soma")
}*/

/*Questão 9

fun dobro(numero: Int): Int {
    return numero * 2
}

fun main() {
    println(dobro(10))
}*/

/*Questão 10

fun media(n1: Double, n2: Double, n3: Double): Double {
    return (n1 + n2 + n3) / 3
}

fun main() {
    println(media(7.5, 8.0, 9.5))
}*/

/*Questão 11

fun celParaFah(celsius: Double): Double {
    return celsius * 1.8 + 32
}

fun main() {
    val temperatura = 30.0
    println("${temperatura}°C = ${celParaFah(temperatura)}°F")
}*/

/*Questão 12

fun main() {
    for (i in 1..100) {
        when {
            i % 3 == 0 && i % 5 == 0 -> println("BatataQuente")
            i % 3 == 0 -> println("Batata")
            i % 5 == 0 -> println("Quente")
            else -> println(i)
        }
    }
}*/

/*Questão 13

fun main() {
    val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    val impares = numeros.filter { it % 2 != 0 }

    println(impares)
}*/

/*Questão 14

fun main() {
    val precos = listOf(10.5, 20.0, 15.75, 8.25)

    var total = 0.0

    for (preco in precos) {
        total += preco
    }

    println("Total da compra = R$ $total")
}*/

/*Questão 15

fun main() {
    val idades = listOf(10, 18, 25, 30, 15, 40)

    var soma = 0
    var quantidade = 0

    for (idade in idades) {
        if (idade >= 18) {
            soma += idade
            quantidade++
        }
    }

    val media = soma.toDouble() / quantidade

    println("Média = $media")
}*/

/*Questão 16

fun main() {
    val numero = 5
    var fatorial = 1

    for (i in 1..numero) {
        fatorial *= i
    }

    println("$numero! = $fatorial")
}*/

/*Questão 17

class Pessoa(val nome: String, val idade: Int, val cidade: String) {

    fun apresentar() {
        println("$nome tem $idade anos e mora em $cidade.")
    }
}

fun main() {
    val pessoa = Pessoa("Maria", 25, "São Paulo")
    pessoa.apresentar()
}*/

/*Questão 18

data class Produto(val nome: String, val preco: Double)

fun main() {

    val produtos = arrayOf(
        Produto("Notebook", 3500.0),
        Produto("Mouse", 80.0),
        Produto("Celular", 2500.0)
    )

    var maisCaro = produtos[0]

    for (produto in produtos) {
        if (produto.preco > maisCaro.preco) {
            maisCaro = produto
        }
    }

    println("Produto mais caro: ${maisCaro.nome}")
}*/

/*Questão 19

class ContaBancaria(val nomeTitular: String, private var saldo: Double) {

    fun depositar(valor: Double) {
        saldo += valor
    }

    fun sacar(valor: Double) {
        if (valor <= saldo) {
            saldo -= valor
        } else {
            println("Saldo insuficiente!")
        }
    }

    fun consultarSaldo() {
        println("Saldo: R$ $saldo")
    }
}

fun main() {
    val conta = ContaBancaria("João", 1000.0)

    conta.depositar(500.0)
    conta.sacar(300.0)
    conta.consultarSaldo()
}*/

/*Questão 20

open class Funcionario(val nome: String, protected val salario: Double) {

    open fun calcularSalario(): Double {
        return salario
    }
}

class Gerente(nome: String, salario: Double) : Funcionario(nome, salario) {

    override fun calcularSalario(): Double {
        return salario * 1.20
    }
}

fun main() {
    val funcionario = Funcionario("Carlos", 3000.0)
    val gerente = Gerente("Ana", 5000.0)

    println("Salário do funcionário: R$ ${funcionario.calcularSalario()}")
    println("Salário do gerente: R$ ${gerente.calcularSalario()}")
}*/