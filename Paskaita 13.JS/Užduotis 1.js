window.onload = function () {
    // let x = +prompt("Įveskite skaičių");
    // alert("Skaičius yra lyginis: " + arLyginis(x));

    let x = +prompt ("Įveskite skaičių");
    alert("Skaičius yra 3 kartotinis: " + arKartotinis(x));

}

// function arLyginis(skaicius) {
//     return skaicius % 2 == 0;
// }

function arKartotinis(skaicius){
    return skaicius % 3 == 0;
}