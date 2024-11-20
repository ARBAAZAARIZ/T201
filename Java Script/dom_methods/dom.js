// manipulating by selecting tag
let all_p_tags=document.getElementsByTagName("p");
console.log(all_p_tags); // return array of p (paragraph)

// changing color of above all p tags

// all_p_tags.style.color="red"; ERROR

// change color by using index
all_p_tags[0].style.color="red";
all_p_tags[1].style.color="red";
all_p_tags[2].style.color="red";


// instede of using index, we can do manipulation using for loop as-
for(let p_tag of all_p_tags)
{
  p_tag.style.color="blue";
}

// manipulating by selecting id
let first_p=document.getElementById("first_p");
console.log(first_p);
first_p.style.backgroundColor="pink";

let second_p=document.getElementById("second_p");
console.log(second_p);
second_p.style.backgroundColor="aqua";


// // manipulating by selecting class
let in_greens=document.getElementsByClassName("in_greens");
console.log(in_greens);


for(let in_green of in_greens)
{
    in_green.style.color="green";
}

// manipulating by query selector
let div_section_h1= document.querySelector("div>section>h1")
// we will get all occurance
div_section_h1.style.color="pink";

// manipulating by querySelectorAll
let all_div_section_h1=document.querySelectorAll("div_section_h1");
for(let section of all_div_section_h1)
{
    section.style.backgroundColor="yellow"; 
}


// Html Manipulaion using JS
let myh1=document.getElementById("myh1");
let mybtn=document.getElementById("mybtn");

mybtn.addEventListener("click" ,()=>{
 myh1.textContent="Suhail"
})


let mydiv=document.getElementById("mydiv")
let mybtn2=document.getElementById("mybtn2")

mybtn2.addEventListener("click",()=>{
    mydiv.innerHTML=<p>Hello Suhail Again</p>
  })

