<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <meta name="_csrf" content="${_csrf.token}"/>
    <!-- default header name is X-CSRF-TOKEN -->
    <meta name="_csrf_header" content="${_csrf.headerName}"/>
    <title></title>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css?family=Pacifico" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Cabin:500" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/home.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/styles.css"/>">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/pretty-checkbox@3.0/dist/pretty-checkbox.min.css"/>
    <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <link rel="stylesheet" href="<c:url value="/resources/stickyplayer/css/stickyaudioplayerjquery.min.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/niceselect/css/nice-select.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/plyr/dist/plyr.css"/>">
    <script   src="https://code.jquery.com/jquery-3.3.1.js"   integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="   crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.pjax/2.0.1/jquery.pjax.min.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <script type="text/javascript" src="<c:url value="resources/stickyplayer/js/stickyaudioplayerjquery.min.js"/>"></script>
    <script src="<c:url value="/resources/niceselect/js/jquery.nice-select.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/resources/js/loginscript.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/resources/js/homescript.js"/>"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/html5media/1.1.8/html5media.min.js" type="text/javascript"></script>
    <script src="<c:url value="/resources/plyr/dist/plyr.min.js"/>"></script>

</head>
<body>
<div class="dynamic">
    <h3>Content Changed!</h3>
</div>
<script type="text/javascript">

    $(function() {
        $(document).pjax('a', '.dynamic', {
            fragment: '.dynamic',
            timeout: 3000
        });
    });

</script>
</body>
</html>
