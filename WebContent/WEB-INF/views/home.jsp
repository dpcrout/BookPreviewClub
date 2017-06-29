<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<meta charset = "utf-8">
<meta http-equiv = "X-UA-Compatible" content = "IE = edge">
<meta name = "viewport" content = "width = device-width, initial-scale = 1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="<c:url value="/resources/bpccss/bpc.css" />"></script>


<html lang = "en">
   <head>
     <title>Book Preview Club</title>
      
	 <style>
  		.jumbotron
  		 {
     		 background-color: #f4511e;
      		color: #fff;
 		 }
 	 </style>   
   </head>
   
   <body>
     <div class="jumbotron text-center">
    		<h1>Welcome to Book Preview Club</h1> 
    			<p>We specialize in Books</p> 
  	</div>	
     
    <div class="container-fluid bg-blue">
    	<row>
  			<input type="button" class="btn btn-default btn-lg" value="Home" onclick="location.href = '/bpc';">
  			<input type="button" class="btn btn-default btn-lg" value="Authors" onclick="location.href = '/bpc/authors';">
  			<input type="button" class="btn btn-default btn-lg" value="Books" onclick="location.href = '/bpc/books';">
  			<input type="button" class="btn btn-default btn-lg" value="Browse Horror" onclick="location.href = '/bpc/books/horror';">
    		<input type="button" class="btn btn-default btn-lg" value="Browse Comedy" onclick="location.href = '/bpc/books/comedy';">
  		  	<input type="button" class="btn btn-default btn-lg" value="Browse Romance" onclick="location.href = '/bpc/books/romance';">	
  		  	<input type="button" class="btn btn-default btn-lg" value="Browse SciFi" onclick="location.href = '/bpc/books/science-fiction';">
  		</row>
  		
  		<row>
  		</row>
  		</div>
  		
    <!-- Carousel data-toggle="tooltip" title="text" -->
    <div class="container bg-black">
    <div id="myCarousel" class="carousel slide" data-ride="carousel" data-interval="2000" data-pause="hover">

  <!-- Wrapper for slides -->
  <div class="carousel-inner">
    <div class="item active">
      <img src="resources/bookcovers/cover1.jpg" alt="A Time For Penance" width="333" height="500" data-toggle="tooltip" title="A chance to live her life again.For 20 years, wealthy socialite Eva Dennehy has borne the guilt of murdering her first husband Charlie, who was planning to leave her for his mistress.When Eva is offered the opportunity to travel back in time, and undo her crime as penance, she accepts – what does ... ">
           <div class="carousel-caption">
          <h3>A Time For Penance</h3>
        </div>
    </div>

    <div class="item">
      <img src="resources/bookcovers/cover2.jpg" alt="How To Capture A String Quartet" width="313" height="500">
            <div class="carousel-caption">
          <h3>How To Capture A String Quartet</h3>
        </div>
    </div>

    <div class="item">
      <img src="resources/bookcovers/cover3.jpg" alt="Gold For Horses" width="313" height="500">
            <div class="carousel-caption">
          <h3>Gold For Horses</h3>
        </div>
    </div>
  </div>

  <!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
</div>
<!-- /Carousel
 -->
  		
    
   </body>
</html>