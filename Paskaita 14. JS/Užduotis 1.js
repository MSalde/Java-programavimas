window.onload = function () {

    let amzius = +prompt("Iveskite savo amziu.");
    alert ("Jusu amzius yra tinkamas " + nustatytiAmziu(amzius));

}

function nustatytiAmziu(amzius) {
    if (amzius > 0 && amzius < 120)
        return true;
    else
        return false;
}