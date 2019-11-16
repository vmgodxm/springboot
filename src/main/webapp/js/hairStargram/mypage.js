
function reservation() {
  $("#change").load("./mypage/mypages-reservation.html");
}

function hairStyleFav() {
  $("#change").load("./mypage/mypages-hairFav.html");
}

function designerFav() {
  $("#change").load("./mypage/mypages-designerFav.html");
}

function history() {
  $("#change").load("./mypage/mypages-history.html");
}

// 사용자 정보
function myInfo() {
  $("#change").load("./mypage/mypages-info.html", function (e) {
    var userId = getCookie('userId');
    if (userId != null && userId != "") {
      getUser(userId);
    }
  });
}

function review() {
  $("#change").load("./reply/blog-reply.html");
}

$(function () {
  $("#btnHairRev").on('click', function (e) {
    $("#change").load("./hair/hairStyles-rev.html");
    e.preventDefault();
  });
});
$(function () {
  $("#btnRev").on('click', function (e) {
    $("#change").load("./hair/hairStyles-done.html");
    e.preventDefault();
  });
});

// 회원탈퇴
function leave() {
  $("#change").load("./mypage/mypages-leave.html", function (e) {
    var userId = getCookie('userId');
    if (userId != null && userId != "") {
      getUser(userId);
    }
  });
}