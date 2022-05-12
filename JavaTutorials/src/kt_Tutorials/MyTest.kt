package kt_Tutorials

import java.util.*

fun main() {
    val JJ = arrayOf("정보시스템","프로그래밍 활용","데이터베이스 활용")
    var SCORE = IntArray(3)
    val scn = Scanner(System.`in`)
    print("이름 : ")
    val name = scn.nextInt()

    for(i in 0 until SCORE.size){
        print("${JJ[i]} 점수:")
        SCORE[i] = scn.nextInt()
    }
    print("------------------------------------")
    for(i in 0 until SCORE.size){
        println(SCORE[i])
    }
    var total:Int = 0

    for(s in SCORE){
        total += s
    }
    val avg:Double = (total / SCORE.size).toDouble()

    var isPass : Boolean = false
    if(avg >= 60){
        isPass = true
        for(i in 0 until SCORE.size){
            if(SCORE[i] < 40){
                isPass = false
            }
        }
    }
    if(isPass){
        println("합격")
    }
    else{
        println("불합격")
    }


//    for(i in 1..5){
//        // 1 2 3 4 5
//    }
//    for(i in 1 until  5){
//        // 1 2 3 4
//    }
//    for(i in 2 ..10 step 2){
//        // 2 4 6 8 10
//    }
//    for(i in 10 downTo 1){
//        // 10 9 8 7 6 5 4 3 2 1
//    }

}