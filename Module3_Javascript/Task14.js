const books={

    title:'Basics of testing',
    description: 'this is a book that explains the basics of software testing',
    numberOfPages: 103,
    author:'Bukola Adeniran',
    reading:true,
    toggleReadingStatus:function(){
        if(books.reading===true){
           books.reading=false 
        }else{
            books.reading=true
        }
    }
    

}
books.toggleReadingStatus()

console.log(books)