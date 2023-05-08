window.onload = function () {
    let a = prompt("reiksme");
    let b = prompt("reiksme");
    let c = prompt("reiksme");
    alert(veiksmas(a, b, c));



    console.log(1);
    console.log(2);
    console.log(3 * 2);
    console.log(4 * 3 * 2);
    console.log(5 * 4 * 3 * 2);

    let dinozauras = prompt("rezultatas");
    let krokodilas = prompt("rezultatas");

    console.log(veiksmas1(dinozauras, krokodilas));
    
    let x = getRandomInt(10, 20);
    console.log(x);
}

function veiksmas(a, b, c) {
    return (a + " " + b + " " + c)
}

function veiksmas1(a, b) {
    return Math.abs(a) + Math.abs(b);
}

function getRandomInt(min, max) {
    min = Math.ceil(min);
    max = Math.floor(max);
    return Math.floor(Math.random() * (max - min) + min);
}