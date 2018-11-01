function ValidateFunction() {

     var var_username = document.getElementById("username");

     if var_username.value == "") {
         alert("Please enter user name");
         return false;
     }

     return true;
 }