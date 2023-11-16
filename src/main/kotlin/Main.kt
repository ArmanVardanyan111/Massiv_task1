import  kotlin.random.Random

fun rand(start: Int, end: Int): Int {
    require(start <= end) { "Illegal Argument" }
    return (start..end).random()
}

fun main(args: Array<String>) {
    var n = readln().toInt() //количество строк
    var m = readln().toInt() //количество столбцов
    val x = readln().toInt() //количество чисел

    var numbers = Array(x, {rand(0, 9)});

    var arr = Array(n, {Array(m, {rand(0, 9)})})

    for (i in 0 .. n-1)
    {
        for (j in 0 .. m-1)
        {
            var a = 0
            while(true)
            {
                a = rand(0, 9)
                var bool_ = false

                for (p in 0 .. x-1)
                {
                    if (a == numbers[p])
                    {
                        bool_ = true
                    }
                }

                if (bool_ == true)
                {
                    break
                }
            }

            var b = 0
            while(true)
            {
                b = rand(0, 9)
                var bool_ = false

                for (p in 0 .. x-1)
                {
                    if (b == numbers[p])
                    {
                        bool_ = true
                    }
                }

                if (bool_ == true)
                {
                    break
                }
            }

            var c = 0
            while(true)
            {
                c = rand(0, 9)
                var bool_ = false

                for (p in 0 .. x-1)
                {
                    if (c == numbers[p])
                    {
                        bool_ = true
                    }
                }

                if (bool_ == true)
                {
                    break
                }
            }

            arr[i][j] = a*100 + b*10 + c;

            print(arr[i][j])
            print(" ")
        }
        println()
    }


}