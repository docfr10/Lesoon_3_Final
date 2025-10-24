fun main() {
    // Try-catch
    divide(6,2)
    divide(3,0)


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