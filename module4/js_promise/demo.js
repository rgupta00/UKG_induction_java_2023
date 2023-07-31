
// let promiseToCleanTheRoom=new Promise(function(resolve, reject){
//     let isClean=false;
//     if(isClean)
//         resolve('clean')
//     else
//         reject('not clean')
// })
// promiseToCleanTheRoom.then(function(fromResolve){
//     console.log(fromResolve)
// }).catch(function(reject){
//     console.log(reject)
// })



// let promiseToCleanTheRoom=new Promise(function(resolve, reject){
//     let isClean=false;
//     if(isClean)
//         resolve('clean')
//     else
//         reject('not clean')
// })
// promiseToCleanTheRoom
// .then(fromResolve=>console.log(fromResolve))
// .catch(reject=> console.log(reject));

let cleanRoom=function(){
	return new Promise(function(resolve, reject){
		reject('clean the room')
	});
};

let removeGarbage=function(p){
	return new Promise( function(resolve, reject){
		resolve('i am not clean the garable');
	});
}

let winTheIceCream=function(p){
	return new Promise( function(resolve, reject){
		resolve('win icecream');
	});
}
//nested promise : once room is clean , remove the garbage and get ice cream
// cleanRoom().then(function(){
// 	return removeGarbage();
// }).then(function(){
// 	return winTheIceCream();
// }).then(function(){
// 	console.log('finished');
// }).catch(function(){
//     console.log('some error')
// })

const result =async ()=>{
    console.log('1')
    const r1= await cleanRoom();
    console.log('2')
    const r2= await removeGarbage();
    console.log('3')
    const r3= await winTheIceCream();
    console.log('4')
    return r3;
}
result().then(console.log('done')).catch('error')