var init2 = {
	
	gotoview: function (styleNo) {
		localStorage.setItem('styleNo', styleNo);
		location.href = 'hairStyles.html';
	},
	
	makeDesignerList2 : async function(){
		var result = await fetch('/hairStyleJoin');
		var jsonArray = await result.json();
		init.data = jsonArray;
		init.datalength = jsonArray.length;
		init.numberArray = new Array(jsonArray.length);
		var html = "";
		for (var i = 0; i < 5; i++){
			var list = init.data[i];
			var hairstyleImage = list.thumbNailFileName;
			var hairstyleName = list.styleName;
			var hairstyleComment = list.styleComment;
			var hairstylePrice = list.price;
				
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
				    </div>`;
			
			}
		document.getElementById('desingerrr').innerHTML = html;
	
	},
	sortByCut: function(){
		var html1 = "";
		for (var i = 0; i < datalength; i++) {
			var list = init.data[i];
			if (list.categoryNo == 0 || list.categoryNo == 3) {
				var hairstyleImage = list.thumbNailFileName;
				var hairstyleName = list.styleName;
				var hairstyleComment = list.styleComment;
				var hairstylePrice = list.price;

				html1 +=
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
			</div>`;
			}
		}
		document.getElementById('Weekly').innerHTML =
			`<h1 class="my-4" id="Weekly">Hair Style - Cut</h1>`;
		document.getElementById('desingerrr').innerHTML = html1;
	}
	
	
	/*
	sortByCut: function () {
		$.ajax({
			url:'/hairStyleJoin',
			method:'GET',
			async: false,
			datatype:'json',
			success: function(){
					init.date = jsonArray;
					init.datelength = jsonArray.length;
					init.numberArray = new Array(jsonArray.length);
					var html1 = "";
					for (var i = 0; i < jsonArray.length; i++) {
						var list = init.data[i];
						if (list.categoryNo == 0 || list.categoryNo == 3) {
							var hairstyleImage = list.thumbNailFileName;
							var hairstyleName = list.styleName;
							var hairstyleComment = list.styleComment;
							var hairstylePrice = list.price;
							
							html1 +=
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
								</div>`;
						}
					}
					
					
					document.getElementById('Weekly').innerHTML =
						`<h1 class="my-4" id="Weekly">Hair Style - Cut</h1>`;
					document.getElementById('desingerrr').innerHTML = html1;
					
					
			document.getElementById('Random').innerHTML =
				`<h2 class="my-3" id="Random">Random Gentleman Best</h2>`;
			document.getElementById('randombest').innerHTML = html2;
					 
			}
			

		});
	}
	*/
	/*
	sortByladies: function () {
		var html1 = "";
		for (var i = 1; i < 11; i++) {
			var list = init.data[i];
			if (list.gender == 1) {
				var hairstyleImage = list.thumbNailFileName;
				var hairstyleName = list.styleName;
				var hairstyleComment = list.styleComment;
				var hairstylePrice = list.price;

				html1 +=
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
			</div>`;
			}
		}

		var html2 = "";
		for (var i = 0; i < init.datalength; i++) {
			var j = init.numberArray[i];

			var list = init.data[j];

			if (list.gender == 1) {
				var hairstyleImage = list.thumbNailFileName;
				var hairstyleName = list.styleName;
				var hairstyleComment = list.styleComment;
				var hairstylePrice = list.price;

				html2 += `<div class="col-lg-2 col-sm-6 portfolio-item">
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
				    </div>`


			}


		}


		document.getElementById('Weekly').innerHTML =
			`<h1 class="my-4" id="Weekly">Ladies Best</h1>`;
		document.getElementById('desingerrr').innerHTML = html1;


		document.getElementById('Random').innerHTML =
			`<h2 class="my-3" id="Random">Random Ladies Best</h2>`;
		document.getElementById('randombest').innerHTML = html2;
	}






*/



};

//function makeDesignerList() {
//	
//	$.ajax({
//		url:'/hairStyleJoin',
//		method:'GET',
//		dataType:'json',
//		async:false,
//		success:function(jsonArray){
//			//alert('success'+jsonArray);
//			window.data = jsonArray;
//			window.datalength=jsonArray.length;
//			window.numberArray =new Array(jsonArray.length);
//			var html = "";
//			//for (var designer of data) {
//			for (var i = 1; i < 6; i++) {
//				var list = data[i];
//				var hairstyleImage=list.thumbNailFileName;
//				var hairstyleName=list.styleName;
//				var hairstyleComment=list.styleComment;
//				var hairstylePrice=list.price;
//				
//				
//				html += 
//				`<div class="col-lg-2 col-sm-6 portfolio-item">
//		      <div class="card h-100 text-center">
//		        <a href="hairStyles.html"><img class="card-img-top" src="/images/${hairstyleImage}" alt=""></a>
//		        <div class="card-body">
//		        <h4 class="card-title">${hairstyleName}</h4>
//		        <h6 class="card-subtitle mb-2 text-muted"></h6>
//		        <p class="card-text">${hairstyleComment}</p>
//		      </div>
//		      <div class="card-footer">
//		        <a href="#">${hairstylePrice}</a>
//		      </div>
//		      </div>
//		    </div>` ;
//			}
//			document.getElementById('desingerrr').innerHTML=html;
//			return html;	
//			
//			
//			
//		}	
//		
//	});
//	
//}




//function randomBestList() {
//			//window.generateListRandom();
//			var html = "";
//			//for (var designer of data) {
//			for (var i = 1; i <  11; i++) {
//				//		var j=numberArray[i]
//				//if(!(i==0)){
//					//var list = window.data[i];
//				
//					var hairstyleImage=window.data[i].thumbNailFileName;
//					var hairstyleName=window.data[i].styleName;
//					var hairstyleComment=window.data[i].styleComment;
//					var hairstylePrice=window.data[i].price;
//				
//				html += 
//					`<div class="col-lg-2 col-sm-6 portfolio-item">
//				      <div class="card h-100 text-center">
//				        <a href="hairStyles.html"><img class="card-img-top" src="/images/${hairstyleImage}" alt=""></a>
//				        <div class="card-body">
//				        <h4 class="card-title">${hairstyleName}</h4>
//				        <h6 class="card-subtitle mb-2 text-muted"></h6>
//				        <p class="card-text">${hairstyleComment}</p>
//				      </div>
//				      <div class="card-footer">
//				        <a href="#">${hairstylePrice}</a>
//				      </div>
//				      </div>
//				    </div>` ;
//				
//				}
//			//}
//			document.getElementById('randombest').innerHTML=html;
//			return html;
//	
//			
//			
//}