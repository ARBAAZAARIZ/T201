let root = document.getElementById("root")

let myh1=document.createElement("h1")
myh1.textContent="Hello arbaaz"
root.appendChild(myh1)

for(let i=0;i<=5;i++){
    let myh1=document.createElement("h1")
myh1.textContent=i;
root.appendChild(myh1) 
}