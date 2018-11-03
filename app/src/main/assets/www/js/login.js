function ValidateFunction() {

    var var_username = document.getElementById("username");
    var var_pass = document.getElementById("pass");

    if(var_username.value == "") {
        JSScript.showToast('Please enter user name');
        var_username.focus();
        return false;
    }
    else if(var_pass.value == "") {
        JSScript.showToast('Please enter password');
        var_pass.focus();
        return false;
     }

    return true;
}