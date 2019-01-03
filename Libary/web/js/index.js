function checkdata() {
    var uno=document.forms["sign_in"]["Uno"].value;
    var password=document.forms["sign_in"]["password"].value;
    if (uno==null||uno==""||password==""||password==null) {
        alert("姓名和密码必须填写");
        return false;
    }
}