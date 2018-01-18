<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%><br>
<br>
<br>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<style>
@media only screen and (max-width: 500px) {
	.col-xxs-12 {
		width: 100%;
	}
}
</style>
<div class="container" style="margin-bottom:50px">
	<header class="w3-container w3-text-white w3-center">

	<h2>Coach ${coachName}</h2>
	<h3>Choose a body group</h3>
	</header>
	<div class="row">
		<div class="col-xxs-12 col-xs-4 col-sm-4 col-md-4 col-lg-4">
			<div class="thumbnail">
				<a
					href="/view-coaches-selected-workouts.do?fullbody=upper&name=${coachName}"> <img
					src="<c:url value="/resources/images/upper1.jpg" />"
					alt="Upper Body" class="img-responsive" style="width: 100%" />
					<div class="caption">
						<p>Get your upper body right!</p>
					</div>
				</a>
			</div>
		</div>
		<div class="col-xxs-12 col-xs-4 col-sm-4 col-md-4 col-lg-4">
			<div class="thumbnail">
				<a
					href="/view-coaches-selected-workouts.do?fullbody=lower&name=${coachName}"> <img
					src="<c:url value="/resources/images/lower1.jpg" />"
					alt="Lower body" class="img-responsive" style="width: 100%" />
					<div class="caption">
						<p>Lower body can be fun when done the right way!</p>
					</div>
				</a>
			</div>
		</div>
		<div class="col-xxs-12 col-xs-4 col-sm-4 col-md-4 col-lg-4">
			<div class="thumbnail">
				<a
					href="/view-coaches-selected-workouts.do?fullbody=cardio&name=${coachName}"> <img
					src="<c:url value="/resources/images/cardio.jpg" />" alt="Cardio"
					class="img-responsive" style="width: 100%" />
					<div class="caption">
						<p>Lets get our cardio in!</p>
					</div>
				</a>
			</div>
		</div>
	</div>
</div>

<%@ include file="../common/footer.jspf"%>

</html>


