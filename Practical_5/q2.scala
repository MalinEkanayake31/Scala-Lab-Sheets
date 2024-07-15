object q2{
    
    case class Book(title: String , author: String , isbn: String)
    var books: Set[Book] = Set()

    //Library Management
    def AddBook(title: String , author: String , isbn: String):Set[Book]={
        val newBook: Book = Book(title , author , isbn)
        books += newBook
        println(s"${title} added to the library")
        books
    }

    def Removebook(isbn: String):Set[Book]={
        for(book <- books){
            if(book.isbn == isbn){
                println(s"${book.title} removed from the library")
                books -= book
            }
        }
        books
    }

    def CheckBook(isbn: String):Unit={
        for(book <- books){
            if(book.isbn == isbn){
                println(s"${book.title} is already in the Library!")
               
            }
        }
        println(s"$isbn is Not in the Library!")
    }

    def DisplayBooks():Unit={
        println("\nLibrary")
        println("[Book Title]\t[Author]\t[ISBN]")
        for(book <- books){
            println(s"${book.title}\t${book.author}\t${book.isbn}")
        }
        println()
    }

    def SearchBookByTitle(title: String):Unit={
        for(book <- books){
            if(book.title == title){
                println(s"$title")
                println(s"Author: ${book.author}\nISBN: ${book.isbn}")
                
            }
        }
        println(s"$title is Not in the Library!")
    }

    def main(args: Array[String]):Unit={
        
        AddBook("Madol duwa" , "Martin W" , "Book1")
        AddBook("Ape gama" , "Martin W" , "Book2")
        AddBook("Heen saraya" , "K Munidasa" , "Book3") 
        DisplayBooks()

        
        CheckBook("Book2")       

       
        Removebook("Book2")
        DisplayBooks()

        
        SearchBookByTitle("Madol duwa")
    }
}