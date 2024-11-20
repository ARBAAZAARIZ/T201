let mydiv=document.getElementById("mydiv")
let mybtn=document.getElementById("mybtn")

// mydiv.addEventListener("click",()=>{
//     console.log("div clicked");
    
// })

// mybtn.addEventListener("click",()=>{
//     console.log("btn clicked");
    
// })

// caputring propagation -parent to child

// mydiv.addEventListener("click",()=>{
//     console.log("div clicked");
    
// },true)

// mybtn.addEventListener("click",()=>{
//     console.log("btn clicked");
    
// },true)

// stop propogation
mydiv.addEventListener("click",()=>{
    console.log("div clicked");
    
})

mybtn.addEventListener("click",()=>{
    console.log("btn clicked");
    
})

mybtn.addEventListener("click",(event)=>{
    event.stopPropagation()
    console.log("btn clicked2");
    
})
 