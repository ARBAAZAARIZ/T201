let img1=document.getElementById("img1")
let btn=document.getElementById("btn")
let img2=document.getElementById("img2")


btn.addEventListener("click",()=>{
    let img_src=img1.src;
    let img_src_using_getAttribute=img1.getAttribute("src")
    img2.setAttribute("src",img_src)
})