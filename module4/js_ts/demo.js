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
function printDetails(person) {
    console.log("the details of person is ".concat(person.name, " and ").concat(person.address));
}
var p = {
    fName: "raj",
    address: "delhi"
};
printDetails(p);
