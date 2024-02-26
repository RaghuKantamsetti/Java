<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
    <style>
       .demo li {
        margin-left: 30px;
      }
      .demo a{
          text-decoration: none;
          color: white;
      }
    </style>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
      crossorigin="anonymous"
    />
  </head>
  <body>
   <header
  style="display: flex; flex-direction: row; justify-content: space-between;background-color: black;color: whitesmoke;"
>
  <div style="display: flex">
    <div>
      <a href="#"><img class="img-fluid" 
        src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRWvHwr0e8_720Om847vN_Q7bGKWLTcw6TSxQ&usqp=CAU"
        height="100"
        width="100"
      /> </a>
    </div>
    <ul
      class="demo"
      style="display: inline; display: flex; list-style: none;margin-top: 26px;font-size: unset;
      font-family: inherit;
      font-weight: 500;"
    >
      <a href="#"><li>New Arrivals</li></a>
      <a href="/EcommerceMain/plp/men"><li>Men</li></a>
      <a href="/EcommerceMain/plp/women"><li>Women</li></a>
      <a href="/EcommerceMain/plp/kids"> <li>Kids</li></a>
      <a href="#"><li>Collaborations</li></a>
      <a href="#"> <li>Sport</li></a>
      <a href="#"><li>Outlet</li></a>
     
    </ul>
  </div>
  <div>
   
    <ul style="display: inline; display: flex; list-style: none;margin-top: 26px;margin-right: 30px;">
        <form  style="padding-right: 70px;"class="d-flex" role="search">
            <input class="form-control me-2" type="search" placeholder="Search For brands" aria-label="Search">
            <button style="color: white;border-color: white;" class="btn btn-outline-success" type="submit">Search</button>
          </form>
          
        <a href="/EcommerceMain/cart-details-page" title="Cart"><li style="color:white;padding-right: 20px;">
        <svg
          xmlns="http://www.w3.org/2000/svg"
          width="24"
          height="24"
          fill="currentColor"
          class="bi bi-cart2"
          viewBox="0 0 16 16"
        >
          <path
            d="M0 2.5A.5.5 0 0 1 .5 2H2a.5.5 0 0 1 .485.379L2.89 4H14.5a.5.5 0 0 1 .485.621l-1.5 6A.5.5 0 0 1 13 11H4a.5.5 0 0 1-.485-.379L1.61 3H.5a.5.5 0 0 1-.5-.5zM3.14 5l1.25 5h8.22l1.25-5H3.14zM5 13a1 1 0 1 0 0 2 1 1 0 0 0 0-2zm-2 1a2 2 0 1 1 4 0 2 2 0 0 1-4 0zm9-1a1 1 0 1 0 0 2 1 1 0 0 0 0-2zm-2 1a2 2 0 1 1 4 0 2 2 0 0 1-4 0z"/>
        </svg>
      </li></a>
      
     
       <a href="/EcommerceMain/order-details-page" title="Orders List"> <li style="color:white;padding-right:20px;"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="currentColor" class="bi bi-bag-check" viewBox="0 0 16 16">
  <path fill-rule="evenodd" d="M10.854 8.146a.5.5 0 0 1 0 .708l-3 3a.5.5 0 0 1-.708 0l-1.5-1.5a.5.5 0 0 1 .708-.708L7.5 10.793l2.646-2.647a.5.5 0 0 1 .708 0z"/>
  <path d="M8 1a2.5 2.5 0 0 1 2.5 2.5V4h-5v-.5A2.5 2.5 0 0 1 8 1zm3.5 3v-.5a3.5 3.5 0 1 0-7 0V4H1v10a2 2 0 0 0 2 2h10a2 2 0 0 0 2-2V4h-3.5zM2 5h12v9a1 1 0 0 1-1 1H3a1 1 0 0 1-1-1V5z"/>
</svg></li></a>




      <a href="/EcommerceMain/logout" title="Logout"> <li style="color:white;padding-right:20px;"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="currentColor" class="bi bi-box-arrow-left" viewBox="0 0 16 16">
  <path fill-rule="evenodd" d="M6 12.5a.5.5 0 0 0 .5.5h8a.5.5 0 0 0 .5-.5v-9a.5.5 0 0 0-.5-.5h-8a.5.5 0 0 0-.5.5v2a.5.5 0 0 1-1 0v-2A1.5 1.5 0 0 1 6.5 2h8A1.5 1.5 0 0 1 16 3.5v9a1.5 1.5 0 0 1-1.5 1.5h-8A1.5 1.5 0 0 1 5 12.5v-2a.5.5 0 0 1 1 0v2z"/>
  <path fill-rule="evenodd" d="M.146 8.354a.5.5 0 0 1 0-.708l3-3a.5.5 0 1 1 .708.708L1.707 7.5H10.5a.5.5 0 0 1 0 1H1.707l2.147 2.146a.5.5 0 0 1-.708.708l-3-3z"/>
</svg></li></a>


    <a href="/EcommerceMain/profile" title="Profile"> <li style="color:white;padding-right:20px;"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="currentColor" class="bi bi-person-circle" viewBox="0 0 16 16">
      <path d="M11 6a3 3 0 1 1-6 0 3 3 0 0 1 6 0z"/>
       <path fill-rule="evenodd" d="M0 8a8 8 0 1 1 16 0A8 8 0 0 1 0 8zm8-7a7 7 0 0 0-5.468 11.37C3.242 11.226 4.805 10 8 10s4.757 1.225 5.468 2.37A7 7 0 0 0 8 1z"/>
    </svg></li></a>
      
     
    </ul>
  </div>
</header><br><br>
  </body>
</html>