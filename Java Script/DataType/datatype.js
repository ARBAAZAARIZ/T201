let a=12;
let b=23.3;
let c=-90;

console.log(typeof(a));
console.log(typeof(b));
console.log(typeof(c));

// string

let d="hello";
let e="hi";
let f="hello@1234"
console.log(typeof(d));
console.log(typeof(e));
console.log(typeof(f));


// null
let g =null;
console.log(typeof(g));  // object

// array 
let h=[11,"hii",null];
console.log(typeof(h));  // object

// object
let i={"name":"raj","age":20}
console.log(typeof(i));  // object


// array basic methods
let marks=[95,96,92,91];
console.log(marks);

marks.push(99);
console.log(marks); // add items at the end 

marks.unshift(88);
console.log(marks); // add item at the begning

marks.pop(); // remove item from the last
console.log(marks); 

marks.shift();// remove first item
console.log(marks);

console.log(marks[0]);
console.log(marks[10]);

// objects
let emp={"name":"arbaaz","age":21};
console.log(emp['name']);
console.log(emp['age']);

emp['age']=30;
console.log(emp['age']);


// boolean
let j=true;
console.log(j);





