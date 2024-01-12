package ru.netology

fun main() {
val timeOnline = agoToText(661)
println(timeOnline)


}
fun calculationMinutes(timeMinutes:Int) = when(timeMinutes){
11->"минут"
1->"минуту"
2->"минуты"
3->"минуты"
4->"минуты"
    else -> "минут"
}
fun calculationHour(timeHour:Int) = when(timeHour){
    11->"часов"
    1->"час"
    2->"часа"
    3->"часа"
    4->"часа"
    else -> "часов"
}
fun agoToText (time: Int):String{
    val timeMinutes = if ((time/60) % 100 === 11 ) 11 else (time/60) % 10
    val timeHour = if ((time/3600) % 100 === 11 ) 11 else (time/3600) % 10
    val minutes= time/60
    val hour= time/3600
    return when{
      time<60->"был(а) только что"
      time <3600-> "был(а) $minutes ${calculationMinutes(timeMinutes)} назад"
       time<86400-> "был(а) $hour ${calculationHour(timeHour)} назад"
       time<172800-> "был(а) вчера"
       time<259200->"был(а) позавчера"
else-> "был(а) давно"
   }
}