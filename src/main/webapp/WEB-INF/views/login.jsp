<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

<link href="<c:url value="/resources/css/login.css" />" rel="stylesheet">


<div class="container">
	<div class="row">
		<div class="col-md-6 col-md-offset-3">
			<div class="panel panel-login">
				<div class="panel-heading">
					<div class="row">
						<div class="col-xs-6">
							<a href="#" class="active" id="login-form-link">Login</a>
						</div>
						<div class="col-xs-6">
							<a href="#" id="register-form-link">Register</a>
						</div>
					</div>
					<hr>
				</div>
				<div class="panel-body">
					<div class="row">
						<div class="col-lg-12">
							<form id="login-form" action="/login.do"
								method="post" role="form" style="display: block;">
								<div class="form-group">
								
									<input type="text" name="name" id="username" tabindex="1"
										class="form-control" placeholder="Username" value="">
								</div>
								<div class="form-group">
									<input type="password" name="password" id="password"
										tabindex="2" class="form-control" placeholder="Password">
								</div>
								<div class="form-group text-center">
									<input type="checkbox" tabindex="3" class="" name="remember"
										id="remember"> <label for="remember"> Remember
										Me</label>
								</div>
								<div class="form-group">
									<div class="row">
										<div class="col-sm-6 col-sm-offset-3">
											<input type="submit" name="login-submit" id="login-submit"
												tabindex="4" class="form-control btn btn-login"
												value="Log In">
										</div>
									</div>
								</div>
								<div class="form-group">
									<div class="row">
										<div class="col-lg-12">
											<div class="text-center">
												<a href="#" tabindex="5"
													class="forgot-password">Forgot Password?</a>
											</div>
										</div>
									</div>
								</div>
							</form>
							<form id="register-form"
								action="/register" method="post"
								role="form" style="display: none;">
								<div class="form-group">
									<input type="text" name="name" id="username" tabindex="1"
										class="form-control" placeholder="Username" value="">
								</div>
								<div class="form-group">
									<input type="email" name="email" id="email" tabindex="1"
										class="form-control" placeholder="Email Address" value="">
								</div>
								<div class="form-group">
									<input type="password" name="password" id="password"
										tabindex="2" class="form-control" placeholder="Password">
								</div>
								<div class="form-group">
									<input type="password" name="confirm-password"
										id="confirm-password" tabindex="2" class="form-control"
										placeholder="Confirm Password">
								</div>
								<div class="form-group">
									<div class="row">
										<div class="col-sm-6 col-sm-offset-3">
											<input type="submit" name="register-submit"
												id="register-submit" tabindex="4"
												class="form-control btn btn-register" value="Register Now">
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
</div>
<c:if test="${not empty errorMessage }">
	<div class="container-fluid">
    <div class="row">

        <div class="col-md-10 col-md-offset-1">
            <div class="alert alert-warning alert-dismissible fade in text-center" role="alert">
            <a href="#" class="close" data-dismiss="alert" aria-label="close">�</a>
                <strong>${errorMessage }</strong>
            </div>
        </div>

  </div>
</div>
</c:if>
<%@ include file="../common/footer.jspf"%>
<script src="<c:url value="/resources/js/login.js" />"></script>


