window.onload = function () {

    let x = +prompt("Įveskite skaičių 1");
    let y = +prompt("Įveskite skaičių 2");
    alert("Skaicius 1 yra didesnis uz skaiciu 2 : " + didesnisSkaicius(x, y));
}

function didesnisSkaicius(x, y) {
    if (x > y) {
        return -1;
    } 
    else if (x < y) {
        return 1;
    }
    else {
        return 0;
    }
        
}  