<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="../common/menu.jspf" %>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<div class="container-fluid">
<form:form  method="post" action="/update?previous_id=${previous_id }" modelAttribute="laptop">

 <fieldset>
 
 	<form:label path="description">Description</form:label>
 	<form:input path="description"/>
 	
 	<form:label path="price">Price</form:label>
 	<form:input path="price"/>
 	<form:label path="picture">Picture</form:label>
 	<form:input path="picture"/>
 	<input type="submit" class="btn btn-warning"/>
 
 </fieldset>		
	
</form:form>

</div>