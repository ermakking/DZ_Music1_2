import java.util.Scanner

fun main() {
    var price: Int = 0
    val discount = 100
    val regularClient = ArrayList<String>()
    regularClient.add("Kolya")
    regularClient.add("Vova")
    regularClient.add("Lisa")
    regularClient.add("Nastya")

    val name: String
    val scan = Scanner(System.`in`)
    println("Введите имя")
    name = scan.nextLine()
    println("Введите сумму покупки")
    price = scan.nextInt()
    if (price < 0) {
        println("Сумма покупки не может быть меньше 0!")
    } else if (price > 1000 && price <= 10000) {
        price = price - discount
    } else {
        price = price - (price / 100 * 5)
    }
    for (i in regularClient) {
        if (name == i) {
            price = price - (price / 100)
        }
    }
    println("Сумма вашей покупки составит: " + price)
}