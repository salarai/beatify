$(document).ready(function () {


    $(document).on('pjax:success', function () {

        $(document).pjax('a', '.dynamic', {
            fragment: '.dynamic',
            timeout: 0
        });
    });

    $(function () {

        //Tabs Configuration
        var firstElement = $('#firstTab');
        var secondElement = $('#secondTab');
        var modalFooter = $('#loginForm .modal-footer');


        firstElement.addClass('active');

        firstElement.click(function () {

            secondElement.removeClass('active');
            firstElement.addClass('active');
            modalFooter.show();

        });

        secondElement.click(function () {

            firstElement.removeClass('active');
            secondElement.addClass('active');
            modalFooter.hide();
        });

        // Nice Select Configuration
        $('#nationality').niceSelect();

        // Checking for Errors
        if ($('meta[name="signupErrors"]').attr("content") === "true") {

            secondElement.trigger('click');
            $('#secondTab > a').trigger('click');
        }

        if ($('meta[name="signupSuccess"]').attr("content") === "true") {

            $('#signupdialog').dialog('open');
        }

        $('#firstName, #lastName, #passwordSignup').on('keypress', function (event) {

            var unicode = event.charCode ? event.charCode : event.keyCode;
            if (unicode < 0 || unicode > 127)
                return false;
        });

        $('#phoneNumber').on('keypress', function (event) {

            var unicode = event.charCode ? event.charCode : event.keyCode;
            if (unicode != 8 && (unicode < 48 || unicode > 57))
                return false;
        });
    });
});