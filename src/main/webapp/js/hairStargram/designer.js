// 1. 디자이너 목록을 서버로 부터 가져오고

// 2. 목록을 메인 페이지에 표시
// 2-1. 자바스크립트 파일을 따로 만들어서(현재파일) 함수로 만든 다음
//      html 태그를 반복문을 이용해서 만들어서 리턴

//<div class="col-lg-2 col-sm-6 portfolio-item">
//        <div class="card h-100">
//          <a href="hairStyles.html"><img class="card-img-top" src="images/남자펌.jpg" alt=""></a>
//          <div class="card-body">
//            <h5 class="card-title">
//              <a href="#">Project Three</a>
//            </h5>
//            <p class="card-text">#남자펌 #가을머리스타일</p>
//          </div>
//        </div>
//      </div>



function makeDesignerList() {
	
	$.ajax({
		url:'/hairStyleJoin',
		method:'GET',
		dataType:'json',
		success:function(jsonArray){
			alert('success'+jsonArray);
			window.data = jsonArray;
			
			var html = "";
			//for (var designer of data) {
			for (var i = 1; i < 6; i++) {
				var list = data[i];
				var hairstyleImage=list.thumbNailFileName;
				var hairstyleName=list.styleName;
				var hairstyleComment=list.styleComment;
				var hairstylePrice=list.price;
				
				
				html += 
				`<div class="col-lg-2 col-sm-6 portfolio-item">
		      <div class="card h-100 text-center">
		        <a href="hairStyles.html"><img class="card-img-top" src="/images/${hairstyleImage}" alt=""></a>
		        <div class="card-body">
		        <h4 class="card-title">${hairstyleName}</h4>
		        <h6 class="card-subtitle mb-2 text-muted"></h6>
		        <p class="card-text">${hairstyleComment}</p>
		      </div>
		      <div class="card-footer">
		        <a href="#">${hairstylePrice}</a>
		      </div>
		      </div>
		    </div>` ;
			}
			document.getElementById('desingerrr').innerHTML=html;
			return html;	
			
			
			
		}	
	});
	
	
	
	
}

function randomBestList() {
	
	var html = "";
	//for (var designer of data) {
	for (var i = 0; i < 10; i++) {
		html += 
		`<div class="col-lg-2 col-sm-6 portfolio-item">
      <div class="card h-100 text-center">
        <a href="hairStyles.html"><img class="card-img-top" src="images/단발 보니펌.jpg" alt=""></a>
        <div class="card-body">
        <h4 class="card-title">Team Member</h4>
        <h6 class="card-subtitle mb-2 text-muted"></h6>
        <p class="card-text">#굵은웨이브펌 #가을머리스타일</p>
      </div>
      <div class="card-footer">
        <a href="#">30,000원</a>
      </div>
      </div>
    </div>` ;
	}
	document.getElementById('randombest').innerHTML=html;
	return html;
}