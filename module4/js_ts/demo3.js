//class
console.log(p.firstName);
var Person = /** @class */ (function () {
    function Person(firstName, lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    Person.prototype.print = function () {
        console.log("the person details is ".concat(this.firstName, " and ").concat(this.lastName));
    };
    return Person;
}());
var p = new Person('rajeev', 'gupta');
