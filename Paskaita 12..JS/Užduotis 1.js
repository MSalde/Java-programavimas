window.onload = function () {
    let atsakymas = veiksmas(5);
    console.log(atsakymas);

    let atsakymas1 = veiksmas1(6, 9);
    console.log(atsakymas1);

    let zodis = "pirmadienis";
    console.log(veiksmas2(zodis));

    let a = 25;
    let b = 37;
    console.log(veiksmas3(a, b));

    let z = 5;
    console.log(veiksmas4(z));
    z = -144;
    console.log(veiksmas4(z));
}
function veiksmas(x) {
    return (2 * x - 10);
}

function veiksmas1(a, b) {
    return ((a * b) / (a + b));
}

function veiksmas2(zodis) {
    return zodis + " " + zodis + " " + zodis;
}

function veiksmas3(a, b) {
    return "" + a + b;
}

function veiksmas4(z) {
    return z * -1;
}