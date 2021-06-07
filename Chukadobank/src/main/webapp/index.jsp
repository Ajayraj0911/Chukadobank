<%@page import="com.bean.CustomerBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
  <!-- Site made with Mobirise Website Builder v5.3.5, https://mobirise.com -->
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="generator" content="Mobirise v5.3.5, mobirise.com">
  <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1">
  <meta name="description" content="">
  
  
  <title>Home</title>
  <link rel="stylesheet" href="assets/web/assets/mobirise-icons2/mobirise2.css">
  <link rel="stylesheet" href="assets/tether/tether.min.css">
  <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
  <link rel="stylesheet" href="assets/bootstrap/css/bootstrap-grid.min.css">
  <link rel="stylesheet" href="assets/bootstrap/css/bootstrap-reboot.min.css">
  <link rel="stylesheet" href="assets/dropdown/css/style.css">
  <link rel="stylesheet" href="assets/socicon/css/styles.css">
  <link rel="stylesheet" href="assets/theme/css/style.css">
  <link rel="preload" href="https://fonts.googleapis.com/css2?family=Jost:ital,wght@0,400;0,700;1,400;1,700&display=swap&display=swap" as="style" onload="this.onload=null;this.rel='stylesheet'">
  <noscript><link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Jost:ital,wght@0,400;0,700;1,400;1,700&display=swap&display=swap"></noscript>
  <link rel="preload" as="style" href="assets/mobirise/css/mbr-additional.css"><link rel="stylesheet" href="assets/mobirise/css/mbr-additional.css" type="text/css">
  
  
  
  
</head>
<body>
 <%CustomerBean customerBean = (CustomerBean) session.getAttribute("customerBean");%>
  <section class="menu menu2 cid-szgCIDc2Di" once="menu" id="menu2-1">
    
    <nav class="navbar navbar-dropdown navbar-fixed-top navbar-expand-lg">
        <div class="container">
            <div class="navbar-brand">
                
                <span class="navbar-caption-wrap"><a class="navbar-caption text-black display-7" href="https://mobiri.se">Hello, <%=customerBean.getName() %></a></span>
            </div>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                <div class="hamburger">
                    <span></span>
                    <span></span>
                    <span></span>
                    <span></span>
                </div>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav nav-dropdown" data-app-modern-menu="true"><li class="nav-item"><a class="nav-link link text-black text-primary display-4" href="#top">Available Balance Rs <%=customerBean.getBalance() %></a></li></ul>
                
                <div class="navbar-buttons mbr-section-btn"><a class="btn btn-primary display-4" href="LogoutController">Log Out</a></div>
            </div>
        </div>
    </nav>
</section>

<section class="features4 cid-szhb6p4vxv" id="features4-b">
    
    
    <div class="container">
        <div class="mbr-section-head">
            <h4 class="mbr-section-title mbr-fonts-style align-center mb-0 display-2">
                <strong>Services</strong></h4>
            
        </div>
        <div class="row mt-4">
            <div class="item features-image сol-12 col-md-6 col-lg-4">
                <div class="item-wrapper">
                    <div class="item-img">
                        <img src="assets/images/mbr-10.jpg" alt="" title="">
                    </div>
                    <div class="item-content">
                        
                        
                        <p class="mbr-text mbr-fonts-style mt-3 display-7">Add Funds to your bank Account</p>
                    </div>
                    <div class="mbr-section-btn item-footer mt-2"><a href="AddBalance.jsp" class="btn item-btn btn-black display-7" >ADD FUNDS</a></div>
                </div>
            </div>
            <div class="item features-image сol-12 col-md-6 col-lg-4">
                <div class="item-wrapper">
                    <div class="item-img">
                        <img src="assets/images/mbr-12.jpg" alt="" title="">
                    </div>
                    <div class="item-content">
                        
                        
                        <p class="mbr-text mbr-fonts-style mt-3 display-7">See all Your Transaction History</p>
                    </div>
                    <div class="mbr-section-btn item-footer mt-2" ><a href="TransactionController" class="btn item-btn btn-black display-7" >TRANSACTION HISTORY</a></div>
                </div>
            </div>
            <div class="item features-image сol-12 col-md-6 col-lg-4">
                <div class="item-wrapper">
                    <div class="item-img">
                        <img src="assets/images/mbr-11.jpg" alt="" title="">
                    </div>
                    <div class="item-content">
                        
                        
                        <p class="mbr-text mbr-fonts-style mt-3 display-7">Transfer Fund To anyone in sec.<br></p>
                    </div>
                    <div class="mbr-section-btn item-footer mt-2"><a href="NetBanking.jsp" class="btn item-btn btn-black display-7" >NET BANKING</a></div>
                </div>
            </div>

        </div>
    </div>
</section>

<section class="info2 cid-szhe0ghgfd" id="info2-d">
    
    
    <div class="align-center container-fluid">
        <div class="row justify-content-center">
            <div class="card col-12 col-lg-6">
                <div class="wrapper">
                    <h3 class="mbr-section-title mb-4 mbr-fonts-style display-5">
                        <strong>Learn More</strong></h3>
                    <p class="mbr-text mb-4 mbr-fonts-style display-4">
                        Best and Safes Way to transfer money. Safe and secure way to send money to anyone. Try chukado bank today and send money to any one</p>
                    <div class="mbr-section-btn"><a class="btn btn-white display-4" href="NetBanking.jsp">Net Banking</a></div>
                </div>
            </div>
            <div class="col-12 col-lg-6">
                <div class="wrapper">
                    <h3 class="mbr-section-title mbr-fonts-style mb-4 display-5">
                        <strong>Transfer Now</strong></h3>
                    <p class="mbr-text mbr-fonts-style mb-4 display-4">
                        Best and Safes Way to transfer money. Safe and secure way to send money to anyone. Try chukado bank today and send money to any one</p>
                    <div class="mbr-section-btn"><a class="btn btn-white display-4" href="TransactionController">Transaction History</a></div>
                </div>
            </div>
        </div>
    </div>
</section>

<section class="contacts2 cid-szho75Ncle" id="contacts2-e">
    <!---->
    
    
    <div class="container">
        <div class="mbr-section-head">
            <h3 class="mbr-section-title mbr-fonts-style align-center mb-0 display-2">
                <strong>Contacts</strong>
            </h3>
            
        </div>
        <div class="row justify-content-center mt-4">
            <div class="card col-12 col-md-6">
                <div class="card-wrapper">
                    <div class="image-wrapper">
                        <span class="mbr-iconfont mobi-mbri-phone mobi-mbri"></span>
                    </div>
                    <div class="text-wrapper">
                        <h6 class="card-title mbr-fonts-style mb-1 display-5">
                            <strong>Phone</strong>
                        </h6>
                        <p class="mbr-text mbr-fonts-style display-7">9568231475</p>
                    </div>
                </div>
            </div>
            <div class="card col-12 col-md-6">
                <div class="card-wrapper">
                    <div class="image-wrapper">
                        <span class="mbr-iconfont mobi-mbri-letter mobi-mbri"></span>
                    </div>
                    <div class="text-wrapper">
                        <h6 class="card-title mbr-fonts-style mb-1 display-5">
                            <strong>Email</strong>
                        </h6>
                        <p class="mbr-text mbr-fonts-style display-7">
                            <a href="mailto:info@site.com" class="text-primary">info@</a>chukado.com</p>
                    </div>
                </div>
            </div>
            <div class="card col-12 col-md-6">
                <div class="card-wrapper">
                    <div class="image-wrapper">
                        <span class="mbr-iconfont mobi-mbri-globe mobi-mbri"></span>
                    </div>
                    <div class="text-wrapper">
                        <h6 class="card-title mbr-fonts-style mb-1 display-5">
                            <strong>Address</strong>
                        </h6>
                        <p class="mbr-text mbr-fonts-style display-7">
                            4100 Jamnagar Gujarat</p>
                    </div>
                </div>
            </div>
            <div class="card col-12 col-md-6">
                <div class="card-wrapper">
                    <div class="image-wrapper">
                        <span class="mbr-iconfont mobi-mbri-bulleted-list mobi-mbri"></span>
                    </div>
                    <div class="text-wrapper">
                        <h6 class="card-title mbr-fonts-style mb-1 display-5">
                            <strong>Working Hours</strong>
                        </h6>
                        <p class="mbr-text mbr-fonts-style display-7">
                            9:00 - 18:00
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

<section class="footer3 cid-szgGV7Vpvy" once="footers" id="footer3-7">

    

    

    <div class="container">
        <div class="media-container-row align-center mbr-white">
            <div class="row row-links">
                <ul class="foot-menu">
                    
                    
                    
                    
                    
                <li class="foot-menu-item mbr-fonts-style display-7">
                        <a class="text-white" href="#" target="_blank">About us</a>
                    </li><li class="foot-menu-item mbr-fonts-style display-7">
                        <a class="text-white" href="#" target="_blank">Services</a>
                    </li><li class="foot-menu-item mbr-fonts-style display-7">
                        <a class="text-white" href="#" target="_blank">Contact Us</a>
                    </li><li class="foot-menu-item mbr-fonts-style display-7">
                        <a class="text-white" href="#" target="_blank">Careers</a>
                    </li><li class="foot-menu-item mbr-fonts-style display-7">
                        <a class="text-white" href="#" target="_blank">Work</a>
                    </li></ul>
            </div>
            <div class="row social-row">
                <div class="social-list align-right pb-2">
                    
                    
                    
                    
                    
                    
                <div class="soc-item">
                        
                            <span class="mbr-iconfont mbr-iconfont-social socicon-twitter socicon"></span>
                        
                    </div><div class="soc-item">
                        
                            <span class="mbr-iconfont mbr-iconfont-social socicon-facebook socicon"></span>
                        
                    </div><div class="soc-item">
                        
                            <span class="mbr-iconfont mbr-iconfont-social socicon-youtube socicon"></span>
                        
                    </div><div class="soc-item">
                        
                            <span class="mbr-iconfont mbr-iconfont-social socicon-instagram socicon"></span>
                        
                    </div><div class="soc-item">
                        
                            <span class="mbr-iconfont mbr-iconfont-social socicon-googleplus socicon"></span>
                        
                    </div><div class="soc-item">
                        
                            <span class="mbr-iconfont mbr-iconfont-social socicon-behance socicon"></span>
                        
                    </div></div>
            </div>
            <div class="row row-copirayt">
                <p class="mbr-text mb-0 mbr-fonts-style mbr-white align-center display-7">
                    © Copyright 2025 Chukado Bank. All Rights Reserved.
                </p>
            </div>
        </div>
    </div>
</section><section style="background-color: rgb(41, 41, 41); font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', 'Roboto', 'Helvetica Neue', Arial, sans-serif; color:#aaa; font-size:12px; padding: 0; align-items: center; display: flex;"><a href="https://mobirise.site/v" style="flex: 1 1; height: 3rem; padding-left: 1rem;"></a><p style="flex: 0 0 auto; margin:0; padding-right:1rem;"> <a href="https://mobirise.site/x" style="color:#aaa;"></a></p></section><script src="assets/web/assets/jquery/jquery.min.js"></script>  <script src="assets/popper/popper.min.js"></script>  <script src="assets/tether/tether.min.js"></script>  <script src="assets/bootstrap/js/bootstrap.min.js"></script>  <script src="assets/smoothscroll/smooth-scroll.js"></script>  <script src="assets/dropdown/js/nav-dropdown.js"></script>  <script src="assets/dropdown/js/navbar-dropdown.js"></script>  <script src="assets/touchswipe/jquery.touch-swipe.min.js"></script>  <script src="assets/theme/js/script.js"></script>  
  
  
</body>
</html>