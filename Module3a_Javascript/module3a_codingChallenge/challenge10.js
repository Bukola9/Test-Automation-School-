function filter(numbers) {
    // return numbers.filter(number => {
    //     return number > 0;
    // })
    let a = [];

    for (let i = 0; i < numbers.length; i++) {
        if(numbers[i] > 0) {
            a.push(numbers[i])
        }   
    }
    return a;
}

console.log(filter([1, 2,4 , 5 , -2, -3 -7]))