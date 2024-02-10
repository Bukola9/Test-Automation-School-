const myObject ={
    name:'car', 
    color:'red',
    price:25000
}

const door ={
    isOpen:'false',
    materia:'wood',
    height : 8,
    toggleOpenAndClose:function(){
        if(door.isOpen===true){
            door.isOpen=false
        }else{
            door.isOpen=true
        }
    }
}

const person = {
    name: 'Saraki',
    age: 20,
    siblings:['Noah', 'Janet', 'Bose', 'toyin'],
    addSibling: function(name){
        person.siblings.push(name)
    }




}

//door.toggleOpenAndClose()
person.addSibling('sanjo')
console.log(person)