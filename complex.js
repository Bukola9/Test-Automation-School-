const person = {
    name: 'Saraki',
    age: 20,
    siblings:[
     { name: 'Noah',
       age:20,
      },
      { name: 'Sanjo',
       age:10,
      },
      { name: 'Bose',
       age:29,
      },
    ],
    addSibling: function(name){
        person.siblings.push(name)
    }

}
person.addSibling({
    name:'Henry',
    age:0

})

//door.toggleOpenAndClose()
//person.addSibling('sanjo')
//console.log(person.siblings[1])
console.log(person)