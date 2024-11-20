    let student={
        name:"raj",
        age:20,
        activity:function(){
            console.log("playing");
        },
        add:(x,y)=>{console.log(x+y);
        },
        marks:[95,98,96,92],

        address:{city:"pune",pincode:"769003"},
        subjectMarks:[{py:95},{java:98}]
    }

    console.log(student.name);
    console.log(student.age);
    student.activity();
    student.add(10,4);
    console.log(student.marks);
    console.log(student.marks[1]);
    console.log(student.address.city);
    console.log(student.subjectMarks[0]);
    console.log(student.subjectMarks[0].py);
    
    
    
    

    
    
    
    
    
    