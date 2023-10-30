<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
   <title>Program to dispaly the selected options in a dropdown list</title>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</head>
<body>
   <h2>Using the <i>selectedIndex</i> property.</h2>
   <form name="dropForm">
      <select name="dropSelect" onchange="showDropInfo()">
         <option value="P">Select:</option>
         <option value="A">Option 1</option>
         <option value="B">Option 2</option>
         <option value="C">Option 3</option>
      </select>
   </form>
   <p id="pF"></p>
   <p id="pS"></p>
   <p id="pT"></p>
  <!--  <script>
      function showDropInfo() {
         var sT = dropForm.dropSelect;
         var pF = document.getElementById('pF');
         var pS = document.getElementById('pS');
         var pT = document.getElementById('pT');
         pF.innerHTML = ('Selected option index: ' + sT.selectedIndex);
         pS.innerHTML = ('Selected value: ' + sT[sT.selectedIndex].value);
         pT.innerHTML = ('Selected text: ' + sT[sT.selectedIndex].text);
      }
   </script>-->
</body>
</html>