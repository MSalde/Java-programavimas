window.onload = function () {

    let x = +prompt("Iveskite pirma skaiciu");
    let y = +prompt("Iveskite antra skaiciu");
    alert("arSandaugaDidesneuzSuma: " + sumaDidesne(x, y));

}

function sumaDidesne(x, y) {
    if ((x * y) > (x + y)) {
        return true;
    }
    else {
        return false;
    }
}
