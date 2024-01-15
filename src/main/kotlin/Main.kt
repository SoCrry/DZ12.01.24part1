package ru.netology

fun main() {
    val timeOnline = agoToText(45000)
    println(timeOnline)


}

fun calculationMinutes(timeMinutes: Int) = when (timeMinutes) {
    11, 12, 13, 14 -> "минут"
    1 -> "минуту"
    2, 3, 4 -> "минуты"
    else -> "минут"
}

fun calculationHour(timeHour: Int) = when (timeHour) {
    11, 12, 13, 14 -> "часов"
    1 -> "час"
    2, 3, 4 -> "часа"
    else -> "часов"
}

fun agoToText(time: Int): String {
    val timeMinutes = when ((time / 60) % 100) {
        11 -> 11
        12 -> 12
        13 -> 13
        14 -> 14
        else -> (time / 60) % 10
    }
    val timeHour = when ((time / 3600) % 100) {
        11 -> 11
        12 -> 12
        13 -> 13
        14 -> 14
        else -> (time / 3600) % 10
    }
    val minutes = time / 60
    val hour = time / 3600
    return when {
        time < 60 -> "был(а) только что"
        time < 3600 -> "был(а) $minutes ${calculationMinutes(timeMinutes)} назад"
        time < 86400 -> "был(а) $hour ${calculationHour(timeHour)} назад"
        time < 172800 -> "был(а) вчера"
        time < 259200 -> "был(а) позавчера"
        else -> "был(а) давно"
    }
}