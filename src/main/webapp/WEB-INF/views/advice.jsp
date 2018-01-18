<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

<style>
.backbeige {
	BACKGROUND-COLOR: beige;
}
</style>
<!-- Menu Container -->
<div class="w3-container" id="menu" style="margin-bottom: 70px">
	<div class="w3-content" style="max-width: 700px">

		<h1 class="w3-center w3-padding-48">
			<span class="w3-tag w3-light-blue w3-hover-gray w3-wide" style="border-radius:20px">Food and Nutrition</span>
		</h1>
		<h3 class="w3-center">
			<span class="w3-tag w3-light-blue w3-hover-gray w3-wide" style="border-radius:20px">Weight loss is 75% nutrition</span>
		</h3>

		<div class="w3-row w3-center w3-card-2 w3-padding"
			style="background-color: lightblue;">
			<a href="javascript:void(0)" onclick="openMenu(event, 'Toyin');"
				id="myLink">
				<div class="w3-col s4 tablink">Toyin</div>
			</a> <a href="javascript:void(0)" onclick="openMenu(event, 'Tobi');">
				<div class="w3-col s4 tablink">Tobi</div>
			</a> <a href="javascript:void(0)" onclick="openMenu(event, 'Stefano');">
				<div class="w3-col s4 tablink">Stefano</div>
			</a>
		</div>

		<div id="Toyin"
			class="w3-container menu w3-padding-28 w3-card-2 backbeige">
			<c:forEach items="${ToyinList}" var="toyinlist" varStatus="rowStatus">

				<h4>Breakfast</h4>
				<p class="w3-text-grey">${toyinlist.breakfast }</p>
				<hr class="w3-border-grey" style="margin: auto; width: 70%">

				<h4>Lunch</h4>
				<p class="w3-text-grey">${toyinlist.lunch }</p>
				<hr class="w3-border-grey" style="margin: auto; width: 70%">

				<h4>Dinner</h4>
				<p class="w3-text-grey">${toyinlist.dinner }</p>
				<hr class="w3-border-grey" style="margin: auto; width: 70%">

				<h4>Snacks</h4>
				<p class="w3-text-grey">${toyinlist.snacks }</p>
				<hr class="w3-border-grey" style="margin: auto; width: 70%">

				<h4>Supplements</h4>
				<p class="w3-text-grey">${toyinlist.supplements }</p>
				<hr class="w3-border-grey" style="margin: auto; width: 70%">

				<h4>Tips</h4>
				<p class="w3-text-grey">${toyinlist.tips }</p>
			</c:forEach>
			<c:if test="${name eq 'Toyin'}">
				<a class="btn btn-success glyphicon glyphicon-plus"
					href="/add-advice.do?name=Toyin">Advice</a><br>
			</c:if>
		</div>

		<div id="Tobi"
			class="w3-container menu w3-padding-28 w3-card-2 backbeige">
			<c:forEach items="${TobiList}" var="tobilist" varStatus="rowStatus">

				<h4>Breakfast</h4>
				<p class="w3-text-grey">${tobilist.breakfast }</p>
				<hr class="w3-border-grey" style="margin: auto; width: 70%">


				<h4>Lunch</h4>
				<p class="w3-text-grey">${tobilist.lunch }</p>
				<hr class="w3-border-grey" style="margin: auto; width: 70%">


				<h4>Dinner</h4>
				<p class="w3-text-grey">${tobilist.dinner }</p>
				<hr class="w3-border-grey" style="margin: auto; width: 70%">


				<h4>Snacks</h4>
				<p class="w3-text-grey">${tobilist.snacks }</p>
				<hr class="w3-border-grey" style="margin: auto; width: 70%">


				<h4>Supplements</h4>
				<p class="w3-text-grey">${tobilist.supplements }</p>
				<hr class="w3-border-grey" style="margin: auto; width: 70%">


				<h4>Tips</h4>
				<p class="w3-text-grey">${tobilist.tips }</p>
			</c:forEach>
			<c:if test="${name eq 'Tobi'}">
				<a class="btn btn-success glyphicon glyphicon-plus"
					href="/add-advice.do?name=Tobi">Advice</a><br>
			</c:if>
		</div>
		<div id="Stefano"
			class="w3-container menu w3-padding-28 w3-card-2 backbeige">
			<c:forEach items="${StefanoList}" var="stefanolist"
				varStatus="rowStatus">

				<h4>Breakfast</h4>
				<p class="w3-text-grey">${stefanolist.breakfast }</p>
				<hr class="w3-border-grey" style="margin: auto; width: 70%">

				<h4>Lunch</h4>
				<p class="w3-text-grey">${stefanolist.lunch }</p>
				<hr class="w3-border-grey" style="margin: auto; width: 70%">

				<h4>Dinner</h4>
				<p class="w3-text-grey">${stefanolist.dinner }</p>
				<hr class="w3-border-grey" style="margin: auto; width: 70%">

				<h4>Snacks</h4>
				<p class="w3-text-grey">${stefanolist.snacks }</p>
				<hr class="w3-border-grey" style="margin: auto; width: 70%">

				<h4>Supplements</h4>
				<p class="w3-text-grey">${stefanolist.supplements }</p>
				<hr class="w3-border-grey" style="margin: auto; width: 70%">

				<h4>Tips</h4>
				<p class="w3-text-grey">${stefanolist.tips }</p>
			</c:forEach>
			<c:if test="${name eq 'Stefano'}">
				<a class="btn btn-success glyphicon glyphicon-plus"
					href="/add-advice.do?name=Stefano">Advice</a><br>
			</c:if>
		</div>
		<img src="/resources/images/food2.jpg"
			style="width: 100%; max-width: 1000px; margin-top: 32px;">
	</div>
</div>



<script>
	// Tabbed Menu
	function openMenu(evt, menuName) {
		var i, x, tablinks;
		x = document.getElementsByClassName("menu");
		for (i = 0; i < x.length; i++) {
			x[i].style.display = "none";
		}
		tablinks = document.getElementsByClassName("tablink");
		for (i = 0; i < x.length; i++) {
			tablinks[i].className = tablinks[i].className.replace(
					" w3-dark-grey", "");
		}
		document.getElementById(menuName).style.display = "block";
		evt.currentTarget.firstElementChild.className += " w3-dark-grey";
	}
	document.getElementById("myLink").click();
</script>


<%@ include file="../common/footer.jspf"%>
