const emptyArray=[]

emptyArray.push('one','two', 'three','four')
emptyArray.push('pushed element')

for(let start=0; start<=emptyArray.length; start=start+1){
    emptyArray.pop()
}
//emptyArray.pop()
console.log(emptyArray)