
fun main(args: Array<String>) {
    println("xd")
}

fun fib(n: Int): Int{
     when(n){
         0 -> return 0
         1, 2 -> return 1
         else -> return fib(n-1) + fib(n-2)
    }
}
