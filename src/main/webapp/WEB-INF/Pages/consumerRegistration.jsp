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
   <title>Consumer Registration</title>
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
   <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css"
      media="screen">

   <!--Bootstrap-->

   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
      crossorigin="anonymous"></script>

   <style>

      *{
         margin: 0px;
      }

      html{
         width: 100vw;
      }

      .header_section{
         padding-bottom: 20px;
      }

      .logo{
         display: inline;
      }
      
      .col-md-3{
         
      }

      form {
         display: grid;
         grid-template-columns: repeat(2, 60%);
         gap: 20px;
      }

      label {
         width: 10rem;
         margin-bottom: 0px;
      }

      form>* {
         display: flex;
      }

      .wrapper{
         padding: 40px 0px 0px 0px;
         display: flex;
         flex-direction: column;
         width: 100%;
         align-items: center;
         background-color: lightgray;
         padding: 80px 0px 80px 0px;
      }

      .gender {
         align-items: center;
      }

      .gender>label {
         align-self: center;
      }

      .footer_section{
         margin-top: 0px;
      }

      input{
         border-radius: 5px;
         border: 1px solid darkgray;
      }

      input:focus{
         border: 1px solid lightblue;
         scale: 1.1;
      }

      form>.submitButton>input{
         width: 5rem;
         text-align: center;
         display: block;
         align-self: center;
         background-color: #1a73e8;
         color: white;
         border: 0px;
         padding: 5px;
      }

      .submitButton{
         justify-content: flex-end;
      }

      .copyright_text{
         padding-top: 5px;
      }
   </style>

</head>

<body>
   <!-- section header start -->
   <div class="header_section">
      <div class="container">
         <div class="row">
            <div class="col-md-3">
               <div class="logo"><a href="index.html"><img src="lpgImages/logo1.webp" width="34.5px"></a></div>
               <h4 style="display: inline;">ELPG</h4>
            </div>
         </div>
      </div>
   </div>
   <!-- section header end -->

   <div class="wrapper">

      <h1>Consumer Registration</h1>
      <h4>Enter your Details</h4>
      <br>

      <form action="/saveConsumer" method="post">

         <div class="fname">
            <label for="fname">First Name:</label>
            <input type="text" name="fname" id="fname">
         </div>

         <div class="lname">
            <label for="lname">Last Name:</label>
            <input type="text" name="lname" id="lname">
         </div>

         <div class="birthDate">
            <label for="dateOfBirth">Date of Birth:</label>
            <input type="date" name="dob" id="dateOfBirth">
         </div>

         <div class="phone">
            <label for="phone">Phone No:</label>
            <input type="text" name="phone" id="phone">
         </div>

         <div class="gender">
            <label for="gender">Gender:</label>
            <input type="radio" name="gender" id="gender">Male &nbsp;&nbsp;&nbsp;
            <input type="radio" name="gender" id="gender">Female &nbsp;&nbsp;&nbsp;
            <input type="radio" name="gender" id="gender">Others &nbsp;&nbsp;&nbsp;
         </div>

         <div class="email">
            <label for="email">Email:</label>
            <input type="email" name="email" id="email">
         </div>

         <div class="aadhar">
            <label for="aadhar">Aadhar No:</label>
            <input type="text" name="aadhar">
         </div>

         <div class="location">
            <label for="location">Location:</label>
            <select name="location" id="location">
               <option value=""></option default>
               <option value="kakkanad">Kochi</option>
               <option value="edapally">Edapally</option>
               <option value="kalamassery">Kalamassery</option>
            </select>

         </div>

         <div class="address">
            <label for="address">Address:</label>
            <textarea id="address" name="address"></textarea>
         </div>

         <div class="username">
            <label for="uname">Username:</label>
            <input type="text" name="username" id="uname">
         </div>

         <div class="password">
            <label for="pass">Password:</label>
            <input type="password" name="password" id="pass">
         </div>

         <div class="confirmPass">
            <label for="confirm">Confirm Password:</label>
            <input type="password" id="confirm">
         </div>

         <div class="submitButton">
            <input type="submit" value="Register" class="submitButton">
         </div>

      </form>

   </div>

   <!-- footer section start -->


   <!-- footer section end -->
   <!-- copyright section start -->
   <div class="copyright_section">
      <p class="copyright_text">Copyright 2020 All Right Reserved By<a href="https://html.design"> Free html Templates
      </p>
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
      $(document).ready(function () {
         $(".fancybox").fancybox({
            openEffect: "none",
            closeEffect: "none"
         });

         $(".zoom").hover(function () {

            $(this).addClass('transition');
         }, function () {

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