<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h2>New Product</h2>
		<form:form action="newsave" method="post" modelAttribute="newProduct">
			<table>
				<tr>
					<td>SKU:</td>
					<td><form:input path="productSKU" /></td>
				</tr>
				<tr>
					<td>Name:</td>
					<td><form:input path="productName" /></td>
				</tr>
				<tr>
					<td>Price:</td>
					<td><form:input path="productPrice" /></td>
				</tr>
				<tr>
					<td>Weight:</td>
					<td><form:input path="productWeight" /></td>
				</tr>
				<tr>
					<td>Car Desc:</td>
					<td><form:input path="productCartDesc" /></td>
				</tr>
				<tr>
					<td>Short Description:</td>
					<td><form:input path="productShortDesc" /></td>
				</tr>
				<tr>
					<td>Long Description:</td>
					<td><form:input path="productLongDesc" /></td>
				</tr>
				<tr>
					<td>Thumb:</td>
					<td><form:input path="productThumb" /></td>
				</tr>
				<tr>
					<td>Image:</td>
					<td><form:input path="productImage" /></td>
				</tr>
				<tr>
					<td>Category Id:</td>
					<td><select name="customer">
							<c:forEach items="${prodCatList}" var="customer">
								<option value="${customer.categoryId}">
									<c:out value="${customer.categoryName}" />
								</option>

							</c:forEach>
					</select></td>
				</tr>
				<!--
				<tr>
					<td>Update Date:</td>
					<td>
						<form:input path="productUpdateDate" placeholder="yyyy-MM-dd"/>
					</td>
				</tr>
				-->
				 <tr>
					<td>Stock:</td>
					<td><form:input path="productStock" /></td>
				</tr>
				<tr>
					<td>Live:</td>
					<td><form:input path="productLive" /></td>
				</tr>
				<tr>
					<td>Unlimited:</td>
					<td><form:input path="productUnlimited" /></td>
				</tr>
				<tr>
					<td>Location:</td>
					<td><form:input path="productLocation" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Save"></td>
				</tr>
			</table>
		</form:form>
	</div>

</body>
</html>