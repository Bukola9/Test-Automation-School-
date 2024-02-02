//const myName = "Bukola" global

function greet(){
    const myName = "Bukola" //local 
    console.log ("Good morning, "+myName)

function innerGreet(){
    console.log("Good evening, "+myName)
}
innerGreet()
}

console.log(myName)
greet()