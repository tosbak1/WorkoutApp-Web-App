<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

<link href="<c:url value="/resources/css/mobileaid.css" />" rel="stylesheet">


<div class="table-responsive">

	<table class="table table-striped table-hover"
		style="max-width: 1300px;" align="center">
		<br>
		<br>


		<header class="w3-container w3-text-white w3-center">
			<H1>${allworkoutsnum} total workouts available</H1>
			<c:if
				test="${name eq 'Toyin' or name eq 'Stefano' or name eq 'Tobi'}">
				<a class="btn btn-success glyphicon glyphicon-plus"
					href="/add-workout.do">Workout</a>
			</c:if>
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
			<c:forEach items="${workouts}" var="workout" varStatus="rowStatus">
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
					<td width="10%">${workout.reps}X${workout.sets}</td>

					<c:if test="${not empty personalWorkouts }">
						<td width="10%"><c:set var="workoutClicked" value="false" />
							<c:forEach items="${personalWorkouts }" var="pwo"
								varStatus="rowCount">
								<c:if test="${pwo.workoutname eq workout.workoutname }">
									<c:set var="workoutClicked" value="true" />
									<a id="${workout.workoutname}"
										class="btn btn-danger glyphicon glyphicon-check"></a>
								</c:if>
							</c:forEach> <c:if test="${workoutClicked eq false }">
								<a id="${workout.workoutname}"
									class="btn btn-success glyphicon glyphicon-transfer"
									href="/addpersonal.do?username=${name}&fullbody=${workout.fullbody}&bodypart=${workout.bodypart}
								&difficulty=${workout.difficulty}&workoutname=${workout.workoutname}&link=${workout.videolink}
								&reps=${workout.reps}&sets=${workout.sets}"></a>
							</c:if></td>
					</c:if>

					<c:if test="${empty personalWorkouts }">
						<td width="10%"><a id="${workout.workoutname}"
							class="btn btn-success glyphicon glyphicon-transfer"
							href="/addpersonal.do?username=${name}&fullbody=${workout.fullbody}&bodypart=${workout.bodypart}
								&difficulty=${workout.difficulty}&workoutname=${workout.workoutname}&link=${workout.videolink}
								&reps=${workout.reps}&sets=${workout.sets}"></a>
						</td>
					</c:if>
				</tr>
			</c:forEach>
		</tbody>

	</table>

	<p>
		<font color="red">${errorMessage}</font>
	</p>
	<p align="center">
		<c:if test="${name eq 'Toyin' or name eq 'Stefano' or name eq 'Tobi'}">
			<a class="btn btn-success glyphicon glyphicon-plus"
				href="/add-workout.do">Workout</a>
		</c:if>
	</p>

</div>

<%@ include file="../common/footer.jspf"%>

