window.onload = function () {

    let x = +prompt("Iveskite skaiciu.");
    alert ("Skaicius yra teigiamas ir lyginis " + patikrintiskaiciu(x));
}

function patikrintiskaiciu(x) {
    if (x > 0 && x % 2 == 0)
        return true;
    else
        return false
}