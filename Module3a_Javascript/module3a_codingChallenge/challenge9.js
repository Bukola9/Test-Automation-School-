function findVowels(inputString) {
    
    const vowels = inputString.match(/[aeiou]/gi);

    
    if (vowels) {
        return vowels.join('');
    } else {
        return "No vowels found in the string.";
    }
}


const inputString = "Hello, World!";
const result = findVowels(inputString);
console.log(result);
