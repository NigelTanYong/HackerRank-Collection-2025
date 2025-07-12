'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', function(inputStdin) {
    inputString += inputStdin;
});

process.stdin.on('end', function() {
    inputString = inputString.split('\n');

    main();
});

function readLine() {
    return inputString[currentLine++];
}

/*
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */
//Time ComplexityO(n), space Complexity: O(1)
function miniMaxSum(arr) {
    // Write your code here
    let total = 0, min=Number.MAX_VALUE, max=Number.MIN_VALUE;
    let minSum = 0, maxSum = 0;
    for(let num of arr){
        total+=num;
        min = Math.min(num, min);
        max = Math.max(num, max);
    }
    minSum = total - max;
    maxSum = total - min;
    
    console.log(minSum, maxSum);
    
    
}

function main() {

    const arr = readLine().replace(/\s+$/g, '').split(' ').map(arrTemp => parseInt(arrTemp, 10));

    miniMaxSum(arr);
}
