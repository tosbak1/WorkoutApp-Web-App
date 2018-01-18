<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

<style>
.text-info {
	color: #FFD700;
	background-color: black;
	border-radius: 5px;
	padding: 5px;
}

.back {
	background-color: rgba(255, 255, 255, 0.5);
	padding: 10px;
	border-radius: 10px;
}
</style>

<div class="container" style="margin-bottom: 60px">
	<BR>
	<BR>
	<BR>
	<header class="w3-container w3-text-gray w3-center">
		<H1 class="text-info">Add Plan</H1>

	</header>
	<c:if test="${not empty errorMessage }">
		<div class="container-fluid">
			<div class="row">

				<div class="col-md-10 col-md-offset-1">
					<div
						class="alert alert-warning alert-dismissible fade in text-center"
						role="alert">
						<a href="#" class="close" data-dismiss="alert" aria-label="close">×</a>
						<strong>${errorMessage }</strong>
					</div>
				</div>

			</div>
		</div>
	</c:if>

	<form action="/add-advice.do" method="post" class="back">
		<br>
		<fieldset class="form-group">
			<label class="text-info">Breakfast</label> <input type="text"
				name="breakfast" class="w3-input w3-animate-input"
				style="width: 50px"></input><BR />
		</fieldset>
		<fieldset class="form-group">
			<label class="text-info">Lunch</label> <input type="text"
				name="lunch" class="w3-input w3-animate-input" style="width: 50px"></input><BR />
		</fieldset>
		<fieldset class="form-group">
			<label class="text-info">Dinner</label> <input type="text"
				name="dinner" class="w3-input w3-animate-input" style="width: 50px"></input><BR />
		</fieldset>
		<fieldset class="form-group">
			<label class="text-info">Snacks</label> <input type="text"
				name="snacks" class="w3-input w3-animate-input" style="width: 50px"></input><BR />
		</fieldset>
		<fieldset class="form-group">
			<label class="text-info">Supplements</label> <input type="text"
				name="supplements" class="w3-input w3-animate-input"
				style="width: 50px"></input><BR />
		</fieldset>

		<fieldset class="form-group">
			<label class="text-info">Tips</label> <input type="text" name="tips"
				class="w3-input w3-animate-input" style="width: 50px"></input><BR />
		</fieldset>

		<div class="row">
			<div class="col-lg-offset-2 col-lg-2">
				<div class="input-group">
					<span class="input-group-btn"> <input type="submit"
						value="Add" name="add" class="btn btn-success" />
					</span> <span class="input-group-btn"> <input
						class="btn btn-warning" type="reset">Reset </input>
					</span>
				</div>
			</div>
		</div>
	</form>
</div>

<%@ include file="../common/footer.jspf"%>
