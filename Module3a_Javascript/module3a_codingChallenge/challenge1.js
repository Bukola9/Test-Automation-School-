const numbers =[100,200,300,400,500]
// //const addNumbers = numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4]
// const addNumbers = numbers.reduce()
// console.log(addNumbers)

const addNumbers = (numbers)=>{

    function getSum(total, currNum) {
        return total + Math.round(currNum);
      }
    
     const sum = numbers.reduce(getSum, 0);

     return sum
    
}


console.log(addNumbers(numbers))
