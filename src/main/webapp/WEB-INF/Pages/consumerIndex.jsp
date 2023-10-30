<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <!DOCTYPE html>
   <html lang="en">
      <head>
         <!-- basic -->
         <meta charset="utf-8">
         <meta http-equiv="X-UA-Compatible" content="IE=edge">
         <meta name="viewport" content="width=device-width, initial-scale=1">
         <!-- mobile metas -->
         <meta name="viewport" content="width=device-width, initial-scale=1">
         <meta name="viewport" content="initial-scale=1, maximum-scale=1">
         <!-- site metas -->
         <title>eLPG</title>
         <meta name="keywords" content="">
         <meta name="description" content="">
         <meta name="author" content="">
         <!-- bootstrap css -->
         <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
         <!-- style css -->
         <link rel="stylesheet" type="text/css" href="css/style.css">
         <!-- Responsive-->
         <link rel="stylesheet" href="css/responsive.css">
         <!-- fevicon -->
         <link rel="icon" href="images/fevicon.png" type="image/gif" />
         <!-- Scrollbar Custom CSS -->
         <link rel="stylesheet" href="css/jquery.mCustomScrollbar.min.css">
         <!-- Tweaks for older IEs-->
         <link rel="stylesheet" href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
         <!-- owl stylesheets --> 
         <link rel="stylesheet" href="css/owl.carousel.min.css">
         <link rel="stylesheet" href="css/owl.theme.default.min.css">
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css" media="screen">
         <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
         <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>

         <style>
            .header_section{
               background-color: dimgrey;
            }

            .col-sm-5{
               align-self: center;
            }

            .carousel-inner{
               margin: 20px 0px 40px 0px;
            }

            body{
               background-color: dimgrey;
            }

            .logo{
               height: 50px;
               left: -20px;
            }

            .col-md-3{
               display: flex;
               align-items: start;
            }

            .logoHeader{
               font-size: 25px;
               color: white;
            }

            .cylinderBooking{
               font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;
               font-size: 20px;
               color: white;
            }

            .nice-select{
               float: none;
            }

            .bookingDetails>h2{
               color: white;
            }
         </style>
      </head>
      <body>
         <!-- section header start -->
         <div class="header_section">
            <div class="container">
               <div class="row">
                  <div class="col-md-3">
                     <div class="logo"><a href="index.html"><img src="lpgImages/logo1.webp" style="height: 50px;"></a></div>
                     <div class="logoHeader">eLPG</div>
                  </div>
                  <div class="col-md-9">
                     <div class="menu_text">
                        <ul>
                           <li><a href="index.html">HOME</a></li>
                           <li><a href="#book">BOOK CYLINDERS</a></li>
                           <li><a href="#status">DELIVERY STATUS  </a></li>
                           <li><a href="projects.html">PROJECTS</a></li>
                           <li><a href="contact.html">CONTACT US</a></li>
                           <li><a href="contact.html" hidden>CONTACT US</a></li>

                           &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

                           <li><a href="#"><img src="images/search-icon.png"></a></li>
                           <div id="myNav" class="overlay">
                              <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
                              <div class="overlay-content">
                                 <a href="index.html">HOME</a>
                                 <a href="about.html">ABOUT</a>
                                 <a href="#status">DELIVERY STATUS</a>
                                 <a href="projects.html">PROJECTS</a>
                                 <a href="contact.html">CONTACT US</a>
                                 <a href="contact.html">CONTACT US</a>
                              </div>
                           </div>
                           <span style="font-size:33px;cursor:pointer; color: #ffffff;" onclick="openNav()"><img src="images/toggle.png" class="toggle_menu"></span>
                     </div>
                    
                     </ul>
                  </div>
               </div>
            </div>
         </div>
         <!-- section header end -->
         <!-- banner section start -->
         <div class="banner_section">
            <div class="container-fluid">
               <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                  <div class="carousel-inner">
                     <div class="carousel-item active">
                        <div class="row">
                           <div class="col-sm-2">
                              <div class="round"><img src="images/round-icon.png"></div>
                              <p class="number_text">01</p>
                              <div class="line"><img src="images/line.png"></div>
                              <p class="number_text">01</p>
                              <div class="round"><img src="images/round-icon.png"></div>
                           </div>
                           <div class="col-sm-5">
                              <div class="taital_main">
                                 <h2 class="construction_text">Welcome,</h2>
                                 <h1 class="building_text">Username</h1>
                                 <p class="lorem_text">The most trusted website for LPG Cylinder booking, well maintained by world-class developers. Make the process of LPG Cylinder Booking easy through here. </p>
                                 <div class="contact_bt"><a href="#book">BOOK CYLINDERS</a></div>
                                 <div class="get_bt"><a href="#status">VIEW DELIVERY STATUS</a></div>
                              </div>
                           </div>
                           <div class="col-sm-5" style="align-self:center;">
                              <div><img src="lpgImages/cookingGasMain2.jpg"></div>
                           </div>
                        </div>
                     </div>
                  </div>
               </div>
            </div>
         </div>
         <!-- banner section end -->
         

         <!-- about section start -->
         <div class="about_section">
            <div class="container-fluid">
               <div class="row">
                  <div class="col-md-6">
                     <div class="about_taital" id="book">
                        <h1 class="about_text">Booking Section</h1>
                        <p class="long_text"></p>
                        
                        <div class="bookingDetails"><h2>Enter your Booking Details</h2></div>
                        <br><br>

                        <form action="/bookCylinders" class="cylinderBooking" method="post">
                           Enter Username:
                           <br>
                           <input type="text" name="username">

                           <br>

                           <label for="location">Select Location:</label>
                           <select name="location" style="color:black;">
                              <option value="kochi">Kochi</option>
                              <option value="kochi">Kochi</option>
                              <option value="kalamassery">Kochi</option>
                              <option value="edappally">Kochi</option>
                              <option value="kakkanad">Kochi</option>
                           </select>
                           
                           <label for="dateofbooking">Date:</label>
                           <br>
						   <input type="date" name="date" id="dateofbooking">
						   <br>
                           <br>
                           <input type="submit" value="Book Cylinders"></input>
                        </form>
                     </div>
                  </div>
                  <div class="col-md-6 padding_0">
                     <div class="about_img"><img src="lpgImages/booking.webp"></div>
                  </div>
               </div>
            </div>
         </div>
         <!-- about section end -->

         
         <!-- project section start -->
         <div class="project_section layout_padding">
            <div class="container">
               <h1 class="partner_text" id="status">DELIVERY Status</h1>
               <p class="lorem_ipsum_text"></p>
               <div class="choice_main">
               </div>
               <table class="table table-striped">
                  <thead>
                  <tr>
                     <th scope="col">Request ID</th>
                     <th scope="col">Date of Booking</th>
                     <th scope="col">Delivery Status</th>
                  </tr>
                  </thead>
                  <tbody>
                  <tr>
                     <th scope="row">1</th>
                     <td>Mark</td>
                     <td>Otto</td>
                  </tr>
                  <tr>
                     <th scope="row">2</th>
                     <td>Jacob</td>
                     <td>Thornton</td>
                  </tr>
                  <tr>
                     <th scope="row">3</th>
                     <td>Larry the Bird</td>
                     <td>@twitter</td>
                  </tr>
                  </tbody>
               </table>
            </div>
         </div>
         <!-- project section end -->

         <!-- contact section end -->
         <!-- footer section start -->
         <div class="footer_section layout_padding">
            <div class="container">
            </div>
            <div class="footer_section_2">
               <div class="container">
                  <h2 class="addres_text">Address</h2>
                  <div class="row map_addres">
                     <div class="col-sm-12 col-lg-4">
                        <div class="map_text"><img src="images/map-icon.png"><span class="map_icon">No.123 Chalingt Gates, Supper market New York</span></div>
                     </div>
                     <div class="col-sm-12 col-lg-4">
                        <div class="map_text"><img src="images/phone-icon.png"><span class="map_icon">( +71 7986543234 )</span></div>
                     </div>
                     <div class="col-sm-12 col-lg-4">
                        <div class="map_text"><img src="images/email-icon.png"><span class="map_icon">demo@gmail.com</span></div>
                     </div>
                  </div>
                  <div class="social_icon">
                     <ul>
                        <li><a href="#"><img src="images/fb-icon.png"></a></li>
                        <li><a href="#"><img src="images/twitter-icon.png"></a></li>
                        <li><a href="#"><img src="images/in-icon.png"></a></li>
                        <li><a href="#"><img src="images/instagram-icon.png"></a></li>
                     </ul>
                  </div>
               </div>
            </div>
         </div>
         <!-- footer section end -->
         <!-- copyright section start -->
         <div class="copyright_section">
            <p class="copyright_text">Copyright 2020 All Right Reserved By.<a href="https://html.design"> Free  html Templates</a></p>
         </div>
         <!-- copyright section end -->
         <!-- Javascript files-->
         <script src="js/jquery.min.js"></script>
         <script src="js/popper.min.js"></script>
         <script src="js/bootstrap.bundle.min.js"></script>
         <script src="js/jquery-3.0.0.min.js"></script>
         <script src="js/plugin.js"></script>
         <!-- sidebar -->
         <script src="js/jquery.mCustomScrollbar.concat.min.js"></script>
         <script src="js/custom.js"></script>
         <!-- javascript --> 
         <script src="js/owl.carousel.js"></script>
         <script src="https:cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.js"></script>
         <script>
            $(document).ready(function(){
            $(".fancybox").fancybox({
               openEffect: "none",
               closeEffect: "none"
               });
               
               $(".zoom").hover(function(){
               
               $(this).addClass('transition');
               }, function(){
               
               $(this).removeClass('transition');
               });
               });
               
         </script> 
         <script>
            function openNav() {
            document.getElementById("myNav").style.width = "100%";
            }
            
            function closeNav() {
            document.getElementById("myNav").style.width = "0%";
            }
         </script>
      </body>
   </html>    