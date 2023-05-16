import java.util.Scanner

fun main() {
    var price: Int = 0
    val discount = 100
    val regularClient = ArrayList<String>()
    regularClient.add("Kolya@netology.ru")
    regularClient.add("Vova@netology.ru")
    regularClient.add("Lisa@netology.ru")
    regularClient.add("Nastya@netology.ru")

    val name: String
    val scan = Scanner(System.`in`)
    println("Введите ваш адрес электронной почты")
    name = scan.nextLine()
    println("Введите сумму покупки")
    price = scan.nextInt()
    when {
        (price < 0) -> println("Сумма покупки не может быть меньше 0!")
        (price in 0..1000) -> price = price
        (price in 1001..10000) -> price = price - discount // знаю что можно короче, но пока мне так понятнее)
        (price > 10001) -> price = price - (price / 100 * 5)
    }
    for (i in regularClient) {
        if (name == i) {
            price = price - (price / 100)
        }
    }

    println("Сумма вашей покупки составит: " + price)
}