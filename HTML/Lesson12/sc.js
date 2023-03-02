/*class Apple{
    #id
    constructor(type, weight,id){
        this.type = type;
        this.weight = weight;
        this.#id = id;
    }
    print(){
        console.log("Сорт: " + this.type + " Вес:" + this.weight +  " id: "+ this.#id +"\n");
    }
    get id(){
       return this.#id;
    }
    set id(id){
        this.#id = id;
    }
}

const apple1 = new Apple("Белый налив", 100, 1);
apple1.print();
apple1.id = 152;
apple1.print();*/

const today = new Date("02/21/2000");
console.log(today);