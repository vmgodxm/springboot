
function randomBestList() {
	
	var html = "";
	//for (var designer of data) {
	for (var i = 0; i < 10; i++) {
		html += 
		`<div class="col-lg-2 col-sm-6 portfolio-item">
      <div class="card h-100">
        <a href="hairStyles.html"><img class="card-img-top" src="images/단발 보니펌.jpg" alt=""></a>
        <div class="card-body">
          <h5 class="card-title">
            <a href="#">Project Three</a>
          </h5>
          <p class="card-text">#단발머리 #가을머리스타일</p>
        </div>
      </div>
    </div>` ;
	}
	document.getElementById('randombest').innerHTML=html;
	return html;
}