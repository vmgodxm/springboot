
function loadMenu() {
    $('#menuContents').load('index-menu.html', function (e) {
        var userId = getCookie('userId');
        if (userId != null && userId != "") {
          $('#menuContents #menuLogin').html('Logout');
          $('#menuContents #menuUserId').html(userId);
        }
      });

    $('#index-footer').load('index-footer.html');
}