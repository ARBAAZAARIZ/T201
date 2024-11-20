let root=document.getElementById("root")

fetch("https://api.github.com/users")
                            .then((response)=>{
                                response.json()
                                .then((data)=>
                                    {
                                        console.log(data);
                                        for(let user of data){
                                            let myimg=document.createElement("img")
                                            myimg.setAttribute("src",user.avatar_url)
                                            myimg.setAttribute("height",200)
                                            myimg.setAttribute("width",200)
                                            root.appendChild(myimg)
                                        }

                                    })
                                .catch((error)=>
                                    {console.log(error);

                                    })
                                })
.catch((error)=>{console.log(error);})