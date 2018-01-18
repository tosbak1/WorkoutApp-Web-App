<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%><br>
<br>
<br>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link href="<c:url value="/resources/css/mobileaid.css" />"
	rel="stylesheet">

<style>
@media only screen and (max-width: 500px) {
	.col-xxs-12 {
		width: 100%;
	}
}
</style>
<div class="container" style="margin-bottom: 50px">
	<header class="w3-container w3-text-white w3-center">
		<h1>Choose A Coach</h1>
	</header>



	<div class="row">
		<div class="col-xxs-12 col-xs-4 col-sm-4 col-md-4 col-lg-4">
			<div class="thumbnail">
				<a href="/view-coaches-workouts.do?name=Toyin" target="_self"> <img
					src="<c:url value="/resources/images/avatar.png" />"
					alt="Toyin's Profile" class="img-responsive" style="width: 100%" />
					<div class="caption">
						<p align="center">
							<a href="mailto:tydcool@gmail.com"><i
								class="fa fa-envelope-square fa-3x social"></i></a> <a
								href="https://www.instagram.com/coach.to/?hl=en"><i
								class="fa fa-instagram fa-3x social"></i></a>
						</p>
						<p>"Toyin!!! Lorem ipsum dolor sit amet, consectetur
							adipiscing elit, sed do eiusmod tempor incididunt ut labore et
							dolore magna aliqua. Ut enim ad minim veniam, quis nostrud
							exercitation</p>

					</div>
				</a>
			</div>
		</div>
		<div class="col-xxs-12 col-xs-4 col-sm-4 col-md-4 col-lg-4">
			<div class="thumbnail">
				<a href="/view-coaches-workouts.do?name=Tobi" target="_self"> <img
					src="<c:url value="/resources/images/avatar.png" />"
					alt="Tobi's Profile" class="img-responsive" style="width: 100%" />
					<div class="caption">
						<p align="center">
							<a href="mailto:tobi@gmail.com"><i
								class="fa fa-envelope-square fa-3x social"></i></a> <a
								href="https://www.instagram.com/tobi_tobe/"><i
								class="fa fa-instagram fa-3x social"></i></a>
						</p>
						<p>"Tobi!!! Lorem ipsum dolor sit amet, consectetur adipiscing
							elit, sed do eiusmod tempor incididunt ut labore et dolore magna
							aliqua. Ut enim ad minim veniam, quis nostrud exercitation</p>

					</div>
				</a>
			</div>
		</div>
		<div class="col-xxs-12 col-xs-4 col-sm-4 col-md-4 col-lg-4">
			<div class="thumbnail">
				<a href="/view-coaches-workouts.do?name=Stefano" target="_self">
					<img src="<c:url value="/resources/images/avatar.png" />"
					alt="Stefano's Profile" class="img-responsive" style="width: 100%" />
					<div class="caption">
						<p align="center">
							<a href="mailto:stefano@gmail.com"><i
								class="fa fa-envelope-square fa-3x social"></i></a> <a
								href="https://www.instagram.com/coach.to/?hl=en"><i
								class="fa fa-instagram fa-3x social"></i></a>
						</p>
						<p>"Stefano!!! Lorem ipsum dolor sit amet, consectetur
							adipiscing elit, sed do eiusmod tempor incididunt ut labore et
							dolore magna aliqua. Ut enim ad minim veniam, quis nostrud
							exercitation</p>

					</div>
				</a>
			</div>
		</div>
	</div>
</div>

<%@ include file="../common/footer.jspf"%>


</html>


