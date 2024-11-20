let data=[9,25,365,1,45,54]
for(let i=0;i<data.length;i++){
    if(data[i]>9 && data[i]<100){
        console.log(data[i]);
    }
}

// while
let x=5;
while (x<8) {
    console.log(x);
    x++;   
}

let p=20;
do {
    console.log(p);
    
} while (p>200);

// num has actual value
for(let num of data){
    if(num>9 && num<100){
        console.log(num);
        
    }
}