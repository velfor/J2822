//var num = parseInt(prompt("Введите положительное число", 0));

//Array1. Дано целое число N (>0). Сформировать и вывести целочисленный массив размера N, содержащий N 
//первых положительных  нечетных чисел: 1, 3, 5, ... .

/*let arr = [];
let n = parseInt(prompt("Введите положительное число", 0));
for(let i =0; i < n; i++){
    arr.push(2*i + 1);
}
alert(arr);*/

/*
Array2. Дано целое число N (>0). Сформировать и вывести целочисленный массив размера N, содержащий степени 
двойки от первой до N-й: 2, 4, 8, 16, ... .
*/
/*let arr = [];
let n = parseInt(prompt("Введите положительное число", 1));
for(let i =0; i < n; i++){
    arr.push(2**(i + 1));
}
alert(arr);*/

/*Array3. Дано целое число N (>1), а также первый член A и разность D арифметической прогрессии. 
Сформировать и вывести массив размера N, содержащий N первых членов данной прогрессии: 
A + 0*D, A+ 1*D, A+2*D, A+3*D, ... .*/
/*let arr = [];
let a = parseInt(prompt("Введите a - первый член прогрессии", 1));
let d = parseInt(prompt("Введите d - разность прогрессии", 1));
let n = parseInt(prompt("Введите n - кол-во элементов прогрессии", 2));
for(let i = 0; i < n; i++){
    arr.push(a+d*i);
}
alert(arr);*/

/*Array5. Дано целое число N (>2). Сформировать и вывести целочисленный массив размера N, содержащий N первых
 элементов последовательности чисел Фибоначчи FK: F1 = 1, F2 = 1, FK = FK−2 +FK−1, K = 3,4,... . */

/*let arr = [1,1];
let n = parseInt(prompt("Введите n - кол-во элементов прогрессии", 3));
for(let i=2; i < n; i++){
    arr.push(arr[i-1]+arr[i-2]);
}
alert(arr);*/

/*let arr = [];
let a = parseInt(prompt("Введите a - первый элемент", 1));
let b = parseInt(prompt("Введите b - второй элемент", 1));
let n = parseInt(prompt("Введите n - кол-во элементов", 3));
arr.push(a);
arr.push(b);
for(let i = 2; i < n; i++){
    let sum = 0;
    for(let j = 0; j < i; j++){
        sum += arr[j];
    }
    arr.push(sum);
}
alert(arr);*/

/* Array18. Дан массив A ненулевых целых чисел размера 10. Вывести значение первого из тех его элементов A[K], 
которые удовлетворяют неравенству A[K] < A[9]. Если таких элементов нет, то вывести 0.*/

/*let arr = [];
for(let i = 0; i < 10; i++){
    let x = Math.floor(Math.random()*11);
    arr.push(x);
}
console.log(arr);
con = false;
for(let i = 0; i < arr.length; i++){
    if(arr[i] < arr.at(-1)){
        con = true;
        console.log(arr[i] + " " + i);
        break;
    }
}
if (!con) console.log(0);*/

/*Array19. Дан целочисленный массив A размера 10. Вывести порядковый номер последнего из тех его элементов 
A[K], которые удовлетворяют двойному неравенству A[0] < A[K] < A[9]. Если таких элементов нет, то вывести 0.*/
let arr = [];
for(let i = 0; i < 10; i++){
    let x = Math.floor(Math.random()*11);
    arr.push(x);
}
console.log(arr);
con = false;
num = 0;
for(let i = 0; i < arr.length; i++){
    if(arr[i] > arr[0] && arr[i] < arr.at(-1)){//arr[arr.length-1]
        con = true;
        num = i;
    }
}
if (!con) console.log("no such elements");
else console.log("num = " + num);
