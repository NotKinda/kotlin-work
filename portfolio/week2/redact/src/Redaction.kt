// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(doc: String, target: String, replacementChar: Char = 'X'): String {
    val replacement = replacementChar.toString().repeat(target.length)
    return doc.replace(target, replacement)
}