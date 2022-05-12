package kt_Tutorials

import java.util.*

fun main(args: Array<String>){
    val scn = Scanner(System.`in`)
    print("이름을 입력하세요 :")
    val name = scn.next()
    print("${name}님 키(cm)를 입력하세요:")
    val height = scn.nextInt()
    print("${name}님 체중(kg)을 입력하세요:")
    val weight = scn.nextInt()
    val bmi: Double = weight / Math.pow(height * 0.01 , 2.0)
    var msg : String = ""
    if(bmi < 20){
        msg = "저체중입니다."
    }else if(bmi >= 20 && bmi < 25){
        msg = "정상입니다."
    }else if(bmi >= 25 && bmi < 30){
        msg = "과체중입니다."
    }else{
        msg = "비만입니다."
    }
    print("%s님의 BMI수치는 %.2f입니다.\n%s".format(name,bmi,msg))
}