const side1= 2
const side2 =4
const side3 =2

if(side1===side2 && side2===side3 ){
    console.log("Equilateral triangle ")
}

else if(side1 === side2 || side1 === side3 || side2 === side3){
    console.log("Isosceles triangle")
}
else{
console.log("Scalene triangle")
}