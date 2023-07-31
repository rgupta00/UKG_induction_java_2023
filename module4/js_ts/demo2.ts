
// interface IPerson { 
//     firstName:string, 
//     lastName:string, 
//     sayHi: ()=>string 
//  } 

//  let customer:IPerson = { 
//     firstName:"ravi",
//     lastName:"kumar", 
//     sayHi: ():string =>{return "Hi there"} 
//  } 

interface Person { 
    age:number 
 } 

 interface Musician extends Person { 
    instrument:string 
 } 

// let drummer:Musician={
//     age:21,
//     instrument:'tabla'
// }

 let drummer=<Musician>{};
 drummer.age=23;
 drummer.instrument='tabla';
 



//  let drummer = <Musician>{}; 
//  drummer.age = 27 
//  drummer.instrument = "Drums" 
//  console.log("Age:  "+drummer.age) 
//  console.log("Instrument:  "+drummer.instrument)
