<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>  


<!DOCTYPE html>
<html lang="en">

<jsp:include page="fragments/header.jsp" />

<body>
	<body style="background-color:#80779C;">
	<div class="container">

		<c:if test="${not empty msg}">
			<div class="alert alert-${css} alert-dismissible" role="alert">
				<button type="button" class="close" data-dismiss="alert" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<strong>${msg}</strong>
			</div>
		</c:if>

		<h1>BookList</h1>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>Book Id</th>
					<th>Author Id</th>
					<th>Genre Id</th>
					<th>Publisher</th>
					<th>Publication Year</th>
					<th>ISBN</th>		
					<th>Title</th>
					<th>ASIN</th>
					<th>CoverImage</th>
					<th>DownloadLink</th>					
				</tr>
			</thead>
			

			<c:forEach var="books" items="${books}">
				<tr>
					<td>${books.bookID}</td>
					<td>${books.authorID}</td>
					<td>${books.genreID}</td>
					<td>${books.publisher}</td>
					<td>${books.publicationYear}</td>
					<td>${books.isbn}</td>
					<td>${books.title}</td>
					<td>${books.asin}</td>
					<td>${books.coverImage}</td>
					<td>${books.downloadLink}</td>
					
					<!-- 
					<spring:url value="/person/${user.id}" var="userUrl" />
						<spring:url value="/person/${user.id}/delete" var="deleteUrl" /> 
						<spring:url value="/users/${user.id}/update" var="updateUrl" />

						<button class="btn btn-info" onclick="location.href='${userUrl}'">Query</button>
						<button class="btn btn-primary" onclick="location.href='${updateUrl}'">Update</button>
						<button class="btn btn-danger" onclick="this.disabled=true;post('${deleteUrl}')">Delete</button></td>
					-->	
				</tr>
			</c:forEach>
		</table>

	</div>

	<jsp:include page="fragments/footer.jsp" />

</body>
</html>