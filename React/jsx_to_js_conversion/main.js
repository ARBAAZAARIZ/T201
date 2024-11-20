"use strict";

function Display() {
    return React.createElement(
        "h1",
        null,
        " Hello react "
    );
}

var container = document.getElementById("root");
var root = ReactDOM.createRoot(container);
root.render(React.createElement(Display, null));