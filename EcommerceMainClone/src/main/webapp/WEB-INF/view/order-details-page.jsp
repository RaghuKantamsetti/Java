<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.col-4 {
	width: 100%;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Your Order Details</h2>
	<div
		style="background-color: #eee; display: flex; flex-wrap: wrap; margin-left: 80px; margin-right: 80px">
		
		<c:forEach items="${orderData}" var="data">
			
			<div class="row" style="padding-left: 40px; padding-top: 20px;">
				<div class="col-2" style="width: 100%">
					<div class="card" style="border-radius: 10px;">
						<img style="width: 400px; height: 400px;"
							" src="${data.getProductUrl()}" class="card-img-top"
							alt="product" /><br>

						<div class="d-flex justify-content-between mb-3">
							<h5 class="mb-0">${data.getProductName()}</h5>

						</div>
						<div class="d-flex justify-content-between mb-3">
							<h5 class="text-dark mb-0">Actual price:${data.getProductPrice()}</h5>
							<h5 class="text-dark mb-0">Total price:${data.getTotalPrice()}</h5>
						</div>
						<div>
							<h5 class="text-dark mb-0">Total Quantity:${data.getQuantity()}</h5>
<%-- 							<a href="/EcommerceMain/pdp/${data.getProductId()}">Reduce Quantiry</a>
 --%>						</div><br>
						<div class="d-flex justify-content-between mb-2">

							<div class="d-flex flex-row">
								<button type="button" class="btn btn-primary flex-fill me-1"
									data-mdb-ripple-color="dark">
									<a	style="color: black; text-align: center; padding: 12px; text-decoration: none" href="/EcommerceMain/removeOrder/${data.getId()}">Cancel Order</a>
								</button>
								<button type="button" class="btn btn-danger flex-fill ms-1">
									<a
										style="color: black; text-align: center; padding: 12px; text-decoration: none"
										href="">Track Your Order</a>
								</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</c:forEach>
	</div>
	<br>
	<br>
	<br>

</body>
</html>