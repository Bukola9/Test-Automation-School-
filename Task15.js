const books=[ {title:'Basics of testing',
description: 'this is a book that explains the basics of software testing',
numberOfPages: 103,
author:'Bukola Adeniran',
reading:false,
},

{title:'Basics of coding',
description: 'this is a book that explains the basics of coding',
numberOfPages: 1030,
author:'Noah Adeniran',
reading:true,
},

{title:'Basics of Accounting',
description: 'this is a book that explains the basics of accounting',
numberOfPages: 1000,
author:'Noah Adeniran',
reading:false,
},
]

for (let i = 0; i < books.length; i++) {
    if(books[i].reading==true) {
        console.log(books[i])
    }   
}


   


