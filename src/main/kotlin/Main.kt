

fun main() {
println(words("SUZAN","CARL"))
     numbers(arrayOf(23,45,67,89,26))
    sentences("j o y e u s e")
    var calculator = Calculator(78,30)
    calculator.addition()
    calculator.subtraction()
    calculator.division()
    calculator.Multiplication()
    println( phrase(arrayOf("joy","mary","grace")))
}

class Calculator(var num1: Int, var num2: Int) {
    fun addition() {
        var sum = num1 + num2
        println(" the addition of two numbers is:" + sum)
    }

    fun subtraction() {
        var minus = num1 - num2
        println(" the subtraction of two numbers is:" + minus)
    }

    fun division() {
        var divide = num1 / num2
        println(" the division of two numbers is:" + divide)
    }

    fun Multiplication() {
        var product = num1 * num2
        println(" the division of two numbers is:" + product)
    }

}

fun words(word1:String,word2:String):String{
    if (word2.length>word1.length){
        return word2[0].toString()
    }
    else if (word1.length>word2.length){
        return word1[0].toString()
    }
    else{
        return word1[0].toString()
    }
}


fun numbers(number:Array<Int>):String{
   var smallest = number.min()
    var largest = number.max()
    var avg = number.average()

    var answer = println("the smallest is:$smallest the largest is:$largest and the average is $avg")

    return answer.toString()
}

fun sentences(sent:String){
  println(sent.split(' '))
}


fun phrase(ph:Array<String>):String{
    for (i in ph) {
        var b = i + i
        return "the new string is:" + b

    }
}




