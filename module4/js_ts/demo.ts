// function add(a:number, b: number): number {
//     return a + b;
// }
// console.log(add(2, 6));
// let a:any;
// a='foo'
// a=4;
// let a:number | string;
// a='foo'
// a=4;
// a=true

//how to declare and assign number arrary

// let count : Array<number> = [1,2,3,4];

// for(let a of count){
//     console.log(a)
// }

// let a : boolean=true;

//interface in ts
//a contract bw 2 parties 

interface Person{
    name: string,
    address: string
}
function printDetails(person: Person): void{
    console.log(`the details of person is ${person.name} and ${person.address}`)
}
let p={
    name:"raj",
    address:"delhi"
}
printDetails(p);
