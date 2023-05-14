window.onload = function () {
    let a = +prompt("Iveskite pirmos krastines ilgi.");
    let b = +prompt("Iveskite pirmos krastines ilgi.");
    let c = +prompt("Iveskite pirmos krastines ilgi.");

    alert ("Trikampi galima sudaryti " + patikrintiArGalimaSudarytiTrikampi(a, b, c));

}

function patikrintiArGalimaSudarytiTrikampi(a, b, c) {
    if ((a < b + c) && (b < a + c) && (c < b + a))
    return true
    else
    return false
}
