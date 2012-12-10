<#global spring = JspTaglibs["http://www.springframework.org/tags"]/>
<#global form = JspTaglibs["http://www.springframework.org/tags/form"]>
<!DOCTYPE html>
<html>
<head>
    <title>Papaya</title>

    <link rel="stylesheet" type="text/css" href="<@spring.url value="/resources/css/bootstrap.min.css"/>">
    <script type="text/javascript" src="<@spring.url value="/resources/js/jquery.js"/>"></script> <#-- JQuery Library -->
    <script type="text/javascript" src="<@spring.url value="/resources/js/bootstrap.js"/>"></script> <#-- Twitter Bootstrap -->
</head>
<body>
    Hello world.
    <div class="container">
        <@form.errors cssClass="error" path="apartment"/> <#-- General error message for a bean must be outside of the form -->
        <@form.form action="advertiser" id="apartment_form_id" modelAttribute="apartment" method="post" class="form-horizontal">
        <input type="text" class="input-block-level">
        <input type="password" class="input-block-level">
        <button class="btn btn-large btn-primary" type="submit">Save</button>
    </@form.form>
    </div> <!-- /container -->
</body>
</html>