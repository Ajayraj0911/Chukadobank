<%@page import="com.bean.CustomerBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<style>

form {
  

  font-family: Arial;

}

::placeholder {

  color: #D7BDE2;
  
}


input[type=number] {
  width: 60%;
  margin-top:20px;
  font-size:50px;
  font-weight: bold;
  border:none;
  padding: 20px;
  text-align:center;
  
  display: inline-block;
  background-color: transparent;
  
  box-sizing: border-box;
}

input[type=submit] {
width: 100%;
  padding: 12px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
	 background-color: #04AA6D;
  color: white;
  border: none;
    

}

button:hover {
animation:none;
opacity: 0.7;

}
.container1 {
  color: #fff;
  
  margin: 0 auto;
  text-align: center;
}
li {
 font-family: Arial;
 font-weight: bold;
  display: inline-block;
  font-size: 20px;
  list-style-type: none;

  text-transform: uppercase;
}

li span {
  display: block;
  font-size: 25px;
}

div.backpayment {
margin-top:50px;
  height: 400px;
  width: 35%;
  background-color: #F2F3F4;
  border-radius: 15px;
  margin-left: auto;
  margin-right:auto;
  box-shadow: 0px 15px 20px rgba(0,0,0,0.5);
}

</style>

<title>Add Fund</title>
</head>
<body>
<%@ include file="header.jsp" %>
<div class="backpayment">
    <div style="padding:40px;">
     <u><b> <h1 align="center" style="font-size:40px; font-weight: bold;">Enter The Amount To Add</h1></u></b>
     <div class="container1">
               <form action="AddBalanceController" class="login">
                 
					<input type="number" name="balance" placeholder="Rs 0.00" required>
					<input type="submit" value="Add Balance" style="font-size:25px;">
		
				</form>	
                  
           
			   </div>
			   <h6 align="center"> 100% Secure Payment. All Copy Right Reserved<h6>
			   </div>
</div>
<br>
<br>
<br>
<div class="container">
        <div class="row justify-content-center">
            <div class="col-12 col-lg-4">
                <div class="image-wrapper">
                    <img src="assets/images/1.PNG" alt="Mobirise">
                    
                </div>
            </div>
        </div>
    </div>
</body>
</html>