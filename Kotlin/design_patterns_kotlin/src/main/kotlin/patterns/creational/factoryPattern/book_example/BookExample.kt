package patterns.creational.factoryPattern.book_example

import java.lang.IllegalArgumentException


interface Book {

    fun getInfo()
    fun order()
    fun rate()
}

enum class Genre {

    SCIENCE,LITERATURE
}

object BookFactory {

    fun createBook(genre: Genre) : Book = when(genre) {

        Genre.SCIENCE -> object :Book {
            private val title = "theory of computation"
            override fun getInfo() = println(title)
            override fun order() = println("1st")
            override fun rate() = println("5 stars")
        }

        Genre.LITERATURE -> object : Book
        {
            private val title = "hunger Games "
            override fun getInfo() = println(title)
            override fun order() = println("2nd")
            override fun rate() = println("4.3 stars")
        }

        else -> throw IllegalArgumentException("There is no such genre")
    }
}


fun main() {
    val book1 = BookFactory.createBook(Genre.SCIENCE)
    val book2 = BookFactory.createBook(Genre.LITERATURE)

    println("Book1 info ")
    book1.getInfo()
    book1.order()
    book1.rate()

    println("\nBook2 info ")
    book2.getInfo()
    book2.order()
    book2.rate()
}


