'use strict';

const fs = require('fs');

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
 * Complete the 'caesarCipher' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. STRING s
 *  2. INTEGER k
 */

function caesarCipher(s, k) {
    // Write your code here
    const upperCaseA = 'A'.charCodeAt(0);
    const upperCaseZ = 'Z'.charCodeAt(0);
    const lowerCaseA = 'a'.charCodeAt(0);
    const lowerCaseZ = 'z'.charCodeAt(0);
    k = k % 26;

    let result = "";
    for(let c of s){
        const code = c.charCodeAt(0);
        if(code >= upperCaseA && code <= upperCaseZ){
            let shift = String.fromCharCode((code-upperCaseA+k)%26 + upperCaseA);
            result+=shift;
        }
        else if(code >= lowerCaseA && code <= lowerCaseZ){
            let shift = String.fromCharCode((code-lowerCaseA+k)%26 + lowerCaseA);
            result+=shift;
        }
        else{
            result+=c;
        } 
    }
    return result;
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const n = parseInt(readLine().trim(), 10);

    const s = readLine();

    const k = parseInt(readLine().trim(), 10);

    const result = caesarCipher(s, k);

    ws.write(result + '\n');

    ws.end();
}
