window.onload = function () {

    let d = +prompt("Iveskite kas kelinta skaiciu norite isvesti");
    let pradzia = +prompt("Iveskite ciklo pradzia");
    let pabaiga = +prompt("Iveskite ciklo pabaiga");
    isvestiSkaiciucikle(pradzia, pabaiga, d);
}

function isvestiSkaiciucikle(pradzia, pabaiga, d) {
    for (let i = pradzia; i <= pabaiga; i += d) {
        console.log(i);
    }
}