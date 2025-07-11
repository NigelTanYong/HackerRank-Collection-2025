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
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

function timeConversion(s) {
    // Write your code here
    let amPm = s.slice(s.length-2);
    let parts = s.slice(0,8).split(":");
    let hour = parseInt(parts[0]);
    
    if(amPm === "AM"){
        if(hour === 12){
            parts[0] ="00";
        }
    }
    else{
        if(hour !== 12){
            parts[0] = String(hour + 12);
        }
    }
    return parts.join(":");

}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const s = readLine();

    const result = timeConversion(s);

    ws.write(result + '\n');

    ws.end();
}
