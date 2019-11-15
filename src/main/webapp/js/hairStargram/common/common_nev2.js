
function loadMenu() {
    $('#menuContents').load('../main/index-menu.html', function (e) {
        var userId = getCookie('userId');
        if (userId != null && userId != "") {
          $('#menuContents #menuLogin').html('Logout');
          $('#menuContents #menuUserId').html(userId);
        }
      });

    $('#index-footer').load('../main/index-footer.html');
}