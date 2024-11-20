function Display(){
    return <h1> Hello react </h1>
}

let container=document.getElementById("root");
let root=ReactDOM.createRoot(container);
root.render(<Display/>);