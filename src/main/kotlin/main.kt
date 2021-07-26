fun main(args: Array<String>) {
    var authorName: String? = null
    var nameLength = authorName?.length
    var nonNullableAuthor = authorName
    var nullableInt: Int? = 10
    var mustHaveResult = nullableInt ?: 0


    println("Author's name has length $nameLength")
    authorName?.let {
        nameLength = authorName.length
    }
    println(mustHaveResult)
}
