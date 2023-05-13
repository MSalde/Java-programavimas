window.onload = function () {
    let x = +prompt("Iveskite skaiciu");
    alert("Skaicius didesnis uz 100" + patikrintiskaiciu(x));
}

function patikrintiskaiciu(x) {
    if (x < -100 || x > 100)
        return true
    else
        return false
}