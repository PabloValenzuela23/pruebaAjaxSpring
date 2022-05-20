<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" 
    xmlns:th="http://www.thymeleaf.org" 
    xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3"
    xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout"><head>
<meta charset="ISO-8859-1">

<title>Cascading Dropdown List with Ajax in Spring MVC Framework and Spring Data JPA</title>
<script src="${pageContext.request.contextPath }/resources/js/jquery-1.7.1.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){

	$('#comboboxSede').on('change', function(){
		var sedeId = $(this).val();
		$.ajax({
			type: 'GET',
			url: '${pageContext.request.contextPath }/demo/loadPisosBySede/' + sedeId,
			success: function(result) {
				var result = JSON.parse(result);
				var s = '';
				for(var i = 0; i < result.length; i++) {
					s += '<option value="' + result[i].id + '">' + result[i].name + '</option>';
				}
				$('#comboboxPiso').html(s);
			}
		});
	});




});
</script>
</head>
<body>

	<form>
		<table>
			<tr>
				<td>Country</td>
				<td>
					<select id="comboboxSede" style="width:200px">
						<c:forEach var="sede" items="${sede }">
							<option value="${sede.id }">${sede.name }</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td>State</td>
				<td>
					<select id="comboboxPiso" style="width:200px"></select>
				</td>
			</tr>
			<tr>
				<td>City</td>
				<td>
					<select id="comboboxCity" style="width:200px"></select>
				</td>
			</tr>
		</table>
	</form>

</body>
</html>