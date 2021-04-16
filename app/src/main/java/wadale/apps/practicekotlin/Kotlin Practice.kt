package wadale.apps.practicekotlin


fun main () {

    val s = "Example" // basic declaration of variables

    for (i in s) {

        println(i)
    }

    var x = 3 // var used to declare a variable mutable.

    x *= 10

    println("The new value of x is $x") // print to the console the new value of x

    while(x > 21){ // This is a conditional test in a while loop

        x += -1

        println(x)
    }

    val name = "Comran" // reassigned "Comran" to the declared variable name

    for (i in 1..10){

        println("i is now $i")
    }

// Conditonal Statements

    when (x) {
        19 -> {

            println("I LOVE MFM") // this won't print because x is not 19
        }

        20 -> {

            println("Coding is getting interesting") // this won't also print because x is not 19
        }

        else -> {

            println("The answer should be on the console by now. $x is the answer $name")
        }
    }
    when (name) {
        "Comoran" -> {

            println("What a wierd name $name")
        }

        "Comran" -> {

            println("Some names ehn $name")
        }

        else -> {

            println("At Last I knew It No Name actually is $name")
        }
    }

    var f = 4 // assign 4 to f

    while (f >= 0){

        println(f)

        f -= 1
    }

    var z = 10

    while(z > 0){

        z -= 2

        println(z)
    }

    var b = 5 // assign 1 to b

    println("Before the Loop. b = $b")

    while (b > 1 ){

        println("While in the loop. b = $b")

        b -= 1
    }

    println("After the loop. b = $b")

    val e = 5

    val w = 3

    println(if (e > w) "e is greater than w" else "e is not greater than w" ) // A more concise if statement with one line of code

    println("This line runs no matter what")

    var r = 1

    while (r < 3){

        print(if (r == 1)"Yab" else "Dab")

        print("ba")

        r += 1
    }

    if (r == 3){

        println("Do")
    }

    val k = 9

    val u = 4

    println(if (k < u) k else u)

    var d = 1
    while (d < 10){
        d = d - 1
        if (d > 3 ){
            println("big x")
        } else {
            println("Wrong inputs")
        }
    }
}

