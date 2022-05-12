package kt_Tutorials

import java.util.*

val MAX_ARRAY:Int = 100
var arrayLotto = Array(MAX_ARRAY, {IntArray(6, {0})})
var idxCurrent = -1

fun main() {
    val scn = Scanner(System.`in`)
    var menu = -1
    while(menu != 0){
        printMenu()
        menu = scn.nextInt()
        when(menu){
            0 -> println("프로그램을 종료합니다")
            1 -> makeLotto1()
            2 -> makeLotto2()
            3 -> showLottoList()
            else -> {}
        }
    }
}
fun printMenu(){
    println("+------------------------------+")
    println("|     1.로또 번호 생성(중복 허용)    |")
    println("|     2.로또 번호 생성(정복 불가)    |")
    println("|     3.생성된 로또 번호 보기       |")
    println("|     0.종료                    |")
    println("+------------------------------+")
    println(" 메뉴를 선택하세요: ")
}
fun makeLotto1(){
    val rnd = Random()
    var lotto = IntArray(6,{0})
    for(i in 0 until lotto.size){
        lotto[i] = rnd.nextInt(45)+1
    }
    saveLotto(lotto)
}
fun saveLotto(lotto:IntArray){
    idxCurrent++
    if(idxCurrent == MAX_ARRAY){
        println("저장 범위를 벗어났습니다")
        return
    }
    for(i in 0 until lotto.size){
        arrayLotto[idxCurrent][i] = lotto[i]
        println("${i+!} : ${lotto[i]}")
    }
}
fun showLottoList(){
    for(i in 0 until MAX_ARRAY){
        println("${i+1}번째 로또번호")
        for(j in 0 until .size)
    }
}
fun makeLotto2(){

}