window.onload = function () {

    let a = +prompt("Iveskite pirmos krastines reiksme");
    let b = +prompt("Iveskite antros krastines reiksme");
    let c = +prompt("Iveskite trecios krastines reiksme");
    alert("Trikampis yra statusis: " + arTrikampisyraStatusis(a, b, c));
}

function arTrikampisyraStatusis(a, b, c) {
    if ((c * c) == (a * a) + (b * b)) {
        return true;
    }
    else {
        return false;
    }
}