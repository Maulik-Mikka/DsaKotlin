package com.practical.kotlinconcepts.Easy.Strings

fun main() {
    defangIPaddr("1.1.1.1")
}


fun defangIPaddr(address: String): String {
    var defangIp = ""
    for (i in address.indices) {
        if (address[i].equals('.')) {
            defangIp += "[.]"
        } else {
            defangIp += address[i]
        }
    }

    return defangIp
}