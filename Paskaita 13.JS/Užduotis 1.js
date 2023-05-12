window.onload = function () {
    let x = +prompt("Įveskite skaičių");
    alert("Skaičius yra lyginis: " + arLyginis(x)); 
      
}

function arLyginis(skaicius) {
    return skaicius % 2 == 0;
}