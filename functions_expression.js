//greet("Bukola")

//function greet(name){    //function declaration can be access before decalaration
   // console.log("Good morning "+name)
//}
myGreet("Nick")  //function expression cant be access before declaration
const myGreet =function(name){
    console.log("Good morning " + name)
}
//myGreet("Nick")