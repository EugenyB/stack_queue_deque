fun main() {
/*    val stack = StackArr<Int>()
    for (i in 1..10) {
        stack.push(i)
    }

    while (!stack.isEmpty) {
        print("${stack.pop()} ")
    }
    println()

    val st2 = StackList<Char>()
    for (c in 'a'..'h') {
        st2.push(c)
    }

    while (!st2.isEmpty) {
        print("${st2.pop()} ")
    }
    println()
    println(st2.pop())

    val q1 = QueueList<Char>()
    for (c in 'a'..'h') {
        q1.push(c)
    }
    while (!q1.isEmpty) {
        print("${q1.poll()} ")
    }
    println()
*/
    val q2 = QueueArr<Int>()
    for (c in 1..10) {
        q2.push(c)
    }
    while (!q2.isEmpty) {
        print("${q2.poll()} ")
    }
    println()


}