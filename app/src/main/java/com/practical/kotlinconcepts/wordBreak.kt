package com.practical.kotlinconcepts

fun main() {
    wordBreak("catsanddog", listOf("cat", "cats", "and", "sand", "dog"))
}

fun wordBreak(s: String, wordDict: List<String>): List<String> {

    var map: HashMap<String, Int> = HashMap()

    var items = wordDict.toHashSet()
    var finallist = mutableListOf<String>()
    for (i in wordDict.indices) {
        if (s.contains(wordDict[i])) {

            if (finallist.isEmpty()) {
                finallist.add(i, wordDict[i])
            } else {
                for (subitem in finallist.indices) {
                    if (wordDict[i].contains(finallist[subitem])|| finallist[subitem].contains(wordDict[i])) {
                        finallist.add(finallist.lastIndex + 1, wordDict[i])
                    } else {

                            finallist[subitem] + " " + wordDict[i]
                        break
                    }
                }
            }


        }

    }
    return finallist


}
