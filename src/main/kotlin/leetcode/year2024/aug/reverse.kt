package leetcode.year2024.aug

fun main() {
    reverse("Parmesh")
}

fun reverse(str: String) {
    for(i in str.length-1 downTo 0) {
        print(str[i])
    }
}