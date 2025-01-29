function name () {
let value = prompt("What is your numbers to be combined? ");
sum = 0;

while (value) {
    sum += value % 10;
    value = Math.floor(value / 10);
}

console.log(sum);
}

name();



