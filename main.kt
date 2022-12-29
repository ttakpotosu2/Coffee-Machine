package machine

var money = 550
var water = 400
var milk = 540
var coffeeBeans = 120
var disposableCups = 9

fun main() {
    println("Write action (buy, fill, take, remaining, exit):")

    val coffeeMachine = CoffeeMachine()

    do {
        val mainInput = readln()
        coffeeMachine.userInput(mainInput)
    } while (mainInput != "exit")
}
