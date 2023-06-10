package hackerrank
fun hourglassSum(arr: Array<Array<Int>>): Int {
    var max = Int.MIN_VALUE
    for(i in 0 until 4)
    {
        for(j in 0 until 4){
            val sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+
                    arr[i+2][j+2]
            if(sum>max) max = sum
        }
    }

    return max

}

fun main(args: Array<String>) {

    val arr = Array<Array<Int>>(6, { Array<Int>(6, { 0 }) })

    for (i in 0 until 6) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = hourglassSum(arr)

    println(result)
}
