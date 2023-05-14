window.onload = function () {
    let a = +prompt("Iveskite pirmos krastines ilgi");
    let b = +prompt("Iveskite antros krastines ilgi");
    let c = +prompt("Iveskite trecios krastines ilgi");

    alert("Pagal ivestu krastiniu duomenis trikampis yra: " + patikrintiTrikampi(a, b, c));

}

function patikrintiTrikampi(a, b, c) {
    if (a == b && b == c && a == c) {
        return "lygiakrastis";
    }
    else if (a == b && a == c) {
        return "lygiasonis";
    }
    else {
        return "paprastas";
    }

}