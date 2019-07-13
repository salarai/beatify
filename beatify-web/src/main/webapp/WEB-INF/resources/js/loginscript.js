$(document).ready(function () {

    //Tabs Configuration
    var firstElement  = $('#firstTab');
    var secondElement = $('#secondTab');
    var modalFooter = $('#loginForm .modal-footer');

    firstElement.addClass('active');

    firstElement.click(function(){

        secondElement.removeClass('active');
        firstElement.addClass('active');
        modalFooter.show();

    });

    secondElement.click(function(){

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
});