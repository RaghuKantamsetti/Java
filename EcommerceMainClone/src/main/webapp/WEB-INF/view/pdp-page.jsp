<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Product Description Page</h2>

	<div style="margin-left: 500px">
		<div class="col-lg-8 border p-3  bg-white">
			<div class="row hedding m-0 pl-3 pt-0 pb-3">
				<b>Product Detail
					<hr>
				</b>
			</div>
			<div style="padding-left: 160px">
				<div>
					<img style="width: 352px; height: 360px;"
						src="${product.getProductUrl() }" class="border p-3">

				</div>
				<div class="col-lg-8">
					<div class="right-side-pro-detail border p-3 m-0">
						<div class="row">
							<div class="col-lg-12">
								<p class="m-0 p-0">
									<b>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp${product.getProductName()
										}</b>
								</p>
							</div>
							<div class="col-lg-12">
								<p class="m-0 p-0 price-pro">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
									Price&nbsp&nbsp:&nbsp&nbsp&nbsp&nbsp
									${product.getProductPrice()}</p>
								<hr class="p-0 m-0">
							</div>
							<div class="col-lg-12 pt-2">
								<h5>Product Detail</h5>
								<span>${product.getProductDesc()}</span>
								<hr class="m-0 pt-2 mt-2">
							</div>
							<div class="col-lg-12">
								<p class="tag-section">
									<strong>Tag : </strong><a href="/EcommerceMain/plp/women">Women</a><a
										href="/EcommerceMain/plp/men">,Men</a>
								</p>
							</div>
							<form action="/EcommerceMain/cart/${product.getId()}" method="post">
								<div class="col-lg-12">
									<h6>Quantity :</h6>
									<input type="number" name=quantity 
										class="form-control text-center w-100" value="1">
								</div>
								<div class="col-lg-12 mt-3">
									<div class="row">
										<div class="col-lg-6 pb-2">
										<input class="btn btn-danger w-100" type="submit" value="Add To Cart">
										</div>
										<div class="col-lg-6">
											<a href="/EcommerceMain/main-page"
												class="btn btn-success w-100">Cancel</a>
										</div>
									</div>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>

		</div>
	</div>
	<br>
	<br>
</body>
</html>