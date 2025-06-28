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
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

function plusMinus(arr) {
    // Write your code here
    const ARR_LENGTH = arr.length; 
    let negativesCount = 0, positivesCount = 0, zerosCount = 0;
    let negativesResult = 0, positivesResult = 0, zerosResult = 0;
    
    for(let num of arr){
        if(num<0) negativesCount++;
        else if(num>0) positivesCount++;
        else zerosCount++;
    }
    negativesResult = negativesCount/ARR_LENGTH;
    positivesResult = positivesCount/ARR_LENGTH;
    zerosResult = zerosCount/ARR_LENGTH;
    console.log(positivesResult.toFixed(6));
    console.log(negativesResult.toFixed(6));
    console.log(zerosResult.toFixed(6));
}

function main() {
    const n = parseInt(readLine().trim(), 10);

    const arr = readLine().replace(/\s+$/g, '').split(' ').map(arrTemp => parseInt(arrTemp, 10));

    plusMinus(arr);
}
