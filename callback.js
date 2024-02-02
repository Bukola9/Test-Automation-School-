function greetings(greet){
greet()
}

function callback(){
    console.log("Good morning")
}
greetings(callback)