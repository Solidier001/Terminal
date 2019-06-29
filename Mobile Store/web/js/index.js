var websocket = null;
//判断当前浏览器是否支持WebSocket
    if ('WebSocket' in window) {
        websocket = new WebSocket("ws://localhost:8080/websocket");
    }
    else {
        alert('当前浏览器 Not support websocket')
    }
websocket.onerror = function () {
    alert("WebSocket连接发生错误:"+websocket.errorText);
};
websocket.onmessage = function (event) {
    setMessageInnerHTML(event.data);
}
window.onbeforeunload = function () {
    closeWebSocket();
}

function closeWebSocket() {
    websocket.close();
}
function send() {
    var message = document.getElementById('text').value;
    websocket.send(message);
}