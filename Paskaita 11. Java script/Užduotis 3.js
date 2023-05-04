window.onload = function () {

    let rezultatas = trigubaSuma(6, 4);
    console.log(rezultatas);

    let rezultatas1 = trigubaSuma(3, 5);
    console.log(rezultatas1);

    let rezultatas2 = trigubaSuma(-2, 11);
    console.log(rezultatas2);

    let rezultatas3 = trigubaSuma(50, 20);
    console.log(rezultatas3);

}
function trigubaSuma(a, b) {
    return 3 * (a + b);
}
