<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

<link href="<c:url value="/resources/css/mobileaid.css" />" rel="stylesheet">


<div class="table-responsive">

	<table class="table table-striped table-hover"
		style="max-width: 1300px;" align="center">
		<br>
		<br>
		<header class="w3-container w3-text-white w3-center">
					<H1>${name}, You selected ${allworkoutsnum} workouts</H1>
		</header>
		<thead>
			<th class="one1">Target</th>
			<th>Level</th>
			<th>Name</th>
			<th>Tutorial</th>
			<th>Range</th>
			<th>Select</th>
		</thead>
		<tbody>
			<c:forEach items="${personalworkouts}" var="workout">
				<tr>
					<td class="one1" width="10%">${workout.bodypart}</td>
					<c:if test="${workout.difficulty eq 'Expert'}">
						<td width="10%"><span class="label label-danger"><span
								class="glyphicon glyphicon-volume-up"></span></span></td>
					</c:if>
					<c:if test="${workout.difficulty eq 'Intermediate'}">
						<td width="10%"><span class="label label-warning"><span
								class="glyphicon glyphicon-volume-down"></span></span></td>
					</c:if>
					<c:if test="${workout.difficulty eq 'Beginner'}">
						<td width="10%"><span class="label label-primary"><span
								class="glyphicon glyphicon-volume-off"></span></span></td>
					</c:if>
					<td width="20%">${workout.workoutname}</td>
					<td width="10%"><a class "btn
						btn-success" href=" ${workout.videolink}">View</a></td>
					<td width="10%">${workout.reps}X ${workout.sets}</td>
					<td width="10%">&nbsp; &nbsp;&nbsp;&nbsp; <a
						class="btn btn-danger glyphicon glyphicon-trash"
						href="/delete-workout.do?workoutname=${workout.workoutname}&username=${name}"></a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<p align="center">
		<a href="/delete-workout.do?workoutname=everything&username=${name}"
			class="btn btn-danger glyphicon glyphicon-trash"> Delete All</a>

	</p>
</div>

<%@ include file="../common/footer.jspf"%>
