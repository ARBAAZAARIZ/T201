//  find sum of 2 no
function add(){
    let a=10;
    let b=20;
    console.log(a+b);
}

add();

//  functiomn with parameters
function multi(x,y) {
    console.log(x*y); 
}

multi(10,2);

// return statemet
function div(x,y){
    let result;
    result=x/y;
    return result; // result value from where the method is called
}

div(20,10);

console.log(div(30,4));
let output=div(10,3);
console.log(output);

//  default parameter in function
function sub(x,y=0){
    console.log(x-y); 
}

sub(10);
sub(10,5);

// without rest parameter in function
function avgMarks(name,s1,s2,s3) {
    let avg=(s1+s2+s3)/3;
    console.log(`${name} has got ${avg}`);    
}
avgMarks("raj",95,96,98,88);

// with rest parameter in function
function avgMarks2(name,...marks) {
    console.log(marks);
    let sum=0;
    let avg;
    for(let mark of marks){
        sum+=mark;
    }
    avg=sum/marks.length;
    console.log(`${name} has got ${avg}`);
    
      
}
avgMarks2("raj",95,96,98,88); 



// typw of function  => nmaed ,anonymus and arrow
// named function
function display1() {
    console.log("display 1 called");
    
}
display1();

//  anonymous function
let display2=function (x) {
    console.log(x);
    console.log("i am anonymous");
}

display2(10);

//  arrow function
let display3=(p)=>{
    console.log(p);
    console.log("i am arrow function");
}

display3(90);
