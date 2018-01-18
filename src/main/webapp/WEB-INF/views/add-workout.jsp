<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

<style>
	.text-info{
		color: #FFD700;
		        background-color: black;
		        border-radius: 5px;
		        padding: 5px;
		
	}
	
	.back{
	background-color: rgba(255,255,255,0.5);
    padding: 10px;
    border-radius: 10px;
	}
</style>

<c:if test="${not empty errorMessage }">
<br><br><br>
	<div class="container-fluid">
    <div class="row">

        <div class="col-md-10 col-md-offset-1">
            <div class="alert alert-warning alert-dismissible fade in text-center" role="alert">
            <a href="#" class="close" data-dismiss="alert" aria-label="close">×</a>
                <strong>${errorMessage }</strong>
            </div>
        </div>

  </div>
</div>
</c:if>
<div class="container" style="margin-bottom:60px">
<c:if test="${empty errorMessage }">
<br><br><br>
</c:if>
			<header class="w3-container w3-text-gray w3-center">
					<H1 class="text-info">New workout</H1>
			
			</header>
	
	<form action="/add-workout.do" method="post" class="back">
		<br>
		<fieldset class="form-group">
			<label class="text-info">Workout name</label> <input type="text" name="workoutname"
				class="w3-input w3-animate-input" style="width:50px"></input><BR />
		</fieldset>
		<fieldset class="form-group" class="form-control">
			<label class="text-info">Body part</label> <select name="bodypart">
				<option value="Leg">Leg</option>
				<option value="Chest">Chest</option>
				<option value="Arms">Arms</option>
				<option value="Abs">Abs</option>
				<option value="Shoulders">Shoulders</option>
				<option value="Cardio">Cardio</option>
				<option value="Back">Back</option>
			</select>
		</fieldset>
		<fieldset class="form-group" class="form-control">
			<label class="text-info">Range of body</label> <select name="fullbody">
				<option value="upper">Upper Body</option>
				<option value="lower">Lower Body</option>
				<option value="cardio">Cardio</option>

			</select>
		</fieldset>
		<fieldset class="form-group" class="form-control">
			<label class="text-info">Difficulty</label> <select name="difficulty">
				<option value="Beginner">Beginner</option>
				<option value="Intermediate">Intermediate</option>
				<option value="Expert">Expert</option>
			</select>
		</fieldset>
		<fieldset class="form-group">
			<label class="text-info">Video link</label> <input type="url" name="link"
				class="form-control"></input><BR />
		</fieldset>

		<fieldset class="form-group">
			<label class="text-info">Sets</label> <input type="number" min="1" max="100"
				name="sets" size="3" class="form-control" size="3" style="width:100px"></input><BR />

		</fieldset>
		<fieldset class="form-group">
			<label class="text-info">Reps</label> <input type="number" min="1" max="100"
				name="reps" size="3" class="form-control" size="3" style="width:100px"></input><BR />
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
