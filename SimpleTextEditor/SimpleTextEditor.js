function processData(input) {
    //Enter your code here
     const lines = input.trim().split('\n');
    const q = parseInt(lines[0]);
    
    let current = '';
    const history = [];

    for (let i = 1; i <= q; i++) {
        const [op, arg] = lines[i].split(' ');

        switch (op) {
            case '1': // Append
                history.push(current);
                current += arg;
                break;

            case '2': // Delete
                history.push(current);
                const k = parseInt(arg);
                current = current.slice(0, -k);
                break;

            case '3': // Print
                const index = parseInt(arg) - 1;
                console.log(current[index]);
                break;

            case '4': // Undo
                if (history.length > 0) {
                    current = history.pop();
                }
                break;
        }
    }
} 

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
   processData(_input);
});
