
<%@ page isELIgnored="false" %><%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="../common/menu.jspf" %>
<h2>Welcome tidiani </h2>


<div class="container-fluid">
<table class="table table-hover">
	<thead class="thead-dark">
		<tr>
			<th>ID</th>
            <th>Brand</th>
            <th>Description</th>
            <th>Price</th>
            <th>Image</th>
            
            <th>Action </th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${laptops}" var="laptop">
			<tr>
				<td>${laptop.getId()}</td>
				<td>${laptop.getBench()}</td>
				<td>${laptop.getDescription()}</td>
				<td>${laptop.getPrice()}</td>
				<td><img src="${laptop.getPicture()}"/></td>
				
				<td><a class = "btn btn-danger" href="/droplist?id=${laptop.getId()}"> Delete</a> 
				<a class = "btn btn-warning" href="/updateForm?description=${laptop.getDescription()}&id=${laptop.getId()}&picture=${laptop.getPicture()}"> Update</a></td>	
		
			</tr>
		</c:forEach>
	</tbody>
</table>
</div>
<!-- <div class="container">
<form action="/addlist" method="post">
	<label for="id" >ID</label>
	<input type="number" name="id" id="id">
	<label for="name" >Benchmark</label>
	<input type="text" name="name" id="name">
	<label for="desc" >Description</label>
	<input type="text" name="desc" id="desc">
	<label for="date" >Price</label>
	<input type="date" name="date" id="date">
	<label for="isDone" >Image Ref</label>
	<input type="radio" name="isDone" id="isDone">
	<button type="submit" > Ajouter</button>
</form>

</div> -->