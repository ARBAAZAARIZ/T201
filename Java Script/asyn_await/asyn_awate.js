let root=document.getElementById("root")

 async function getAllMobiles(){
   let response=await fetch("https://api.restful-api.dev/objects")
  
   console.log(response.ok);
   console.log(response.status);
   
   
   let mobiles=await response.json()
   for(let mobile of mobiles)
    {
        console.log(mobile);
        let myh1 = document.createElement("h1")
        myh1.textContent=mobile.name
        root.appendChild(myh1)
   }
}

getAllMobiles()