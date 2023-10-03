/*var num = parseInt(prompt("Введите положительное число", 0));
var k = 0;

while(num > 0){
    k++;
    num = parseInt(num/10);
    //console.log(num);
}
alert("Кол-во цифр " + k);*/
/*5 Запросить у пользователя 10 чисел и подсчитать, сколько
он ввел положительных, отрицательных и нулей. При этом
также посчитать, сколько четных и нечетных. Вывести
статистику на экран. Учтите, что достаточно одной переменной (не 10) для ввода чисел пользователем.*/
/*var pol = 0;
var otr = 0;
var nuli = 0;
var chet = 0;
var nechet = 0;

for(let i = 1; i <=10; i++){
    let num = parseInt(prompt("Введите число", 0));
    if (num > 0) pol++;
    else if (num < 0) otr++;
    else if (num == 0) nuli++;
    if(num % 2 == 0) chet++;
    else nechet++;

}*/

/*
6 Зациклить калькулятор. Запросить у пользователя 2 числа
и знак, решить пример, вывести результат и спросить, хочет ли он решить еще один пример. И так до тех пор, пока
пользователь не откажется.
*/
/*
answer = "yes";
do{
    var num1 = parseInt(prompt("Введите число", 0));
    var num2 = parseInt(prompt("Введите число", 0));
    var sign = prompt("Введите знак операции", '+');
    var res = 0;
    switch(sign){
        case "+": res = num1+num2;break;
        case "-": res = num1-num2;break;
        case "/": res = num1/num2;break;
        case "*": res = num1*num2;break;
        default: res = "Нет такого знака";/*
    }
    console.log(res);
    answer = prompt("Введите yes для продолжения и любое другое для выхода", 'yes');
}while(answer == "yes");*/

