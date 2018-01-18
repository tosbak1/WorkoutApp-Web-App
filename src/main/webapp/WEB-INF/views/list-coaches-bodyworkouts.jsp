<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>
<style>
@media only screen and (max-width: 450px) {
	.one1 {
		display: none;
	}
}

@media only screen and (max-width: 450px) {
	h1 {
		font-size: 24px;
	}
}

tr:nth-child(even) {
	background-color: #ADD8E6;
	border: 1px solid black;
	opacity: 0.8;
	filter: alpha(opacity = 80); /* For IE8 and earlier */
}

th {
	background-color: #4286f4;
	color: white;
}
</style>
<div class="table-responsive">
	<table class="table table-striped table-hover"
		style="max-width: 1300px;" align="center">
<br><br>
			<header class="w3-container w3-text-white w3-center">
						<H1>${name} ${allworkoutsnum} workout to complete</H1>
			<h1>${fullbody}BODY TIME</h1>
		</header>
		<thead>
			<th class="one1">Target</th>
			<th>Level</th>
			<th>Name</th>
			<th>Tutorial</th>
			<th>Reps</th>
			<th>Sets</th>
		</thead>
		<tbody>
			<c:forEach items="${coachesworkout}" var="workout">
				<tr>
					<td class="one1">${workout.bodypart}</td>
					<c:if test="${workout.difficulty eq 'Expert'}">
						<td><span class="label label-danger"><span
								class="glyphicon glyphicon-volume-up"></span></span></td>
					</c:if>
					<c:if test="${workout.difficulty eq 'Intermediate'}">
						<td><span class="label label-warning"><span
								class="glyphicon glyphicon-volume-down"></span></span></td>
					</c:if>
					<c:if test="${workout.difficulty eq 'Beginner'}">
						<td><span class="label label-primary"><span
								class="glyphicon glyphicon-volume-down"></span></span></td>
					</c:if>
					<td>${workout.workoutname}</td>
					<td><a class "btn btn-success" href=" ${workout.videolink}">View</a></td>
					<td>${workout.reps}</td>
					<td>${workout.sets}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>

<%@ include file="../common/footer.jspf"%>
