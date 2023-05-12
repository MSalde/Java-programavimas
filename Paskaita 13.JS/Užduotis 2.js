window.onload = function(){

    let x = +prompt ("Įveskite skaičių");
    alert("Skaičius yra 3 kartotinis: " + arKartotinis(x));
}

function arKartotinis(skaicius){
    return skaicius % 3 == 0;
}
