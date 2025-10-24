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

    // Дженерики
    val box1 = Box("String")
    val box2 = Box(1)

    // Автоматическое определение типов данных свойств класса
    val item1 = box1.item
    val item2 = box2.item

    println(item1::class)
    println(item2::class)
}

// Класс дженерик
class Box<T>(val item: T)

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