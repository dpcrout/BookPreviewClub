<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<meta charset = "utf-8">
<meta http-equiv = "X-UA-Compatible" content = "IE = edge">
<meta name = "viewport" content = "width = device-width, initial-scale = 1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>



<html lang = "en">
<head>
	<title>Spring MVC Form Handling Example</title>

</head>

<spring:url value="/" var="urlHome" />
<spring:url value="/authors" var="urlAuthorList" />

<script>
    $(document).ready(function () {
        $('.dropdown-toggle').dropdown();
    });
</script>

<body>

 
       <sql:setDataSource var = "snapshot" driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver"
         url = "jdbc:sqlserver://bookpreviewclub.cltt3zxjc2ub.us-east-1.rds.amazonaws.com;databasename=BookPreviewClub"
         user = "BubbaC"  password = "Polarbear123"/>
         
         <sql:query dataSource = "${snapshot}" var = "result">
         	SELECT * From dbo.RequestType
         </sql:query>
         
         
              
    <div class="dropdown">
       <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Browse Genres<span class="caret"></span></button>
          <ul class="dropdown-menu">
            <c:forEach var = "row" items = "${result.rows}">
            <li><a href="${row.LocalRedirectURL}">${row.RequestTypeDesc}</a></li>
            </c:forEach>
          </ul>
    </div>
    
    
          

</body>

</html>
