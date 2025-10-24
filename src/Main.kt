fun main() {
    // Try-catch
    divide(6, 2)

    // Функции области видимости
    // Позволяет исполнить блок кода и записать результат
    // его выполнения в отдельную переменную

    val name = "Hello"
    // let
    val nameLength = name.let {
        println(it.length)
        it.length
    }
    println(nameLength)

    // run
    val nemName = "Name"
    val nemNameLength = nemName.run {
        println(this.length)
        this.length
    }

    // with
    val string = StringBuilder()
    // Нужно для многократного обращения к переменной,
    // чтобы каждый раз не писать ее название
    with(string) {
        append("Hello")
        append("World")
    }
}

fun divide(a: Int, b: Int): Int {
    return try {
        // В блоке try происходит исполняемый код
        println(a / b)
        a / b
    } catch (e: Error) {
        // Блок обработчик ошибок
        println("Возникла следующая ошибка: ${e.message}")
        0
    } finally {
        // Блок finally выполнится в любом случае
        println("Блок finally сработал")
    }
}