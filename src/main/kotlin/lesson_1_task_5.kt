package org.example

fun main() {

    val seconds = 6480
    val minutes = seconds / 60
    val hours = minutes / 60

    val hoursClock = seconds / 60 / 60
    val minutesClock = (seconds / 60) - (hours * 60)
    val secondsClock = (6480 - (minutes * 60))

    var hh = hoursClock.toString()
    var mm = minutesClock.toString()
    var ss = minutesClock.toString()

    if (hoursClock < 10) {
        hh = "0$hoursClock"
    }
    if (minutesClock < 10) {
        mm = "0$minutesClock"
    }
    if (secondsClock < 10) {
        ss = "0$secondsClock"
    }

    println("$hh:$mm:$ss")

}