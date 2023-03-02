//Опеределить ф-цию для вывода на экран чисел от 1 до 100
/*function task1(){
    for(let i = 1; i <= 100; i++){
        console.log(i+" ");
    }
}

task1()*/

//Сделайте функцию, которая параметром принимает число и выводит в консоль куб этого числа.

/*function cube(num){
    return num**3;
}

x = prompt("Введите число",1);
console.log(cube(x));*/

//Сделайте функцию, которая параметрами принимает 3 числа и выводит в консоль среднее арифм этих чисел.
/*function task3(num1, num2, num3){
    return (num1+num2+num3)/3;
}

let a = 1;
let b = 5;
let c = 8;
console.log(task3(a,b,c));*/

//Сделайте функцию, которая параметром будет принимать массив с числами, и проверять, что все элементы 
//в этом массиве являются четными числами.

/*function allEven(arr){
    for(let i = 0; i < arr.length; i++){
        if (arr[i] %2 != 0) return false;
    }
    return true;
}

let arr=[2,4,6,8,1]
if (allEven(arr)){
    console.log("Все четные");
}
else{
    console.log("Не все четные");
}*/

/*function allDigitsOdd(num){
    while(num != 0){
        c = num % 10;
        if (c % 2 == 0) return false;
        num = parseInt(num/10);
    }
    return true;
}

let a = parseInt(prompt("Введите целое число", 123));
console.log(allDigitsOdd(a));*/

//Сделайте функцию, которая параметром будет принимать массив и проверять, 
//есть ли в этом массиве два одинаковых элемента подряд.

/*function equals(arr){
    for(let i=0; i < arr.length-1; i++){
        if (arr[i] == arr[i+1]) return true;
    }
    return false;
}

let arr=[2,4,6,8,1]
if (equals(arr)){
    console.log("Есть 2 одинаковых поряд");
}
else{
    console.log("Нету 2 одинаковых поряд");
}*/


/*function func(a, b) {
	return a == b;
}*/

/*function func(a, b) {
	return a != b;
}*/

let sum1 = sum([1, 2, 3, 4, 5]);
console.log(sum1);

function sum(arr) {
	let sum = 0;
	
	for (let elem of arr) {
		sum += elem;
	}
	
	return sum;
}