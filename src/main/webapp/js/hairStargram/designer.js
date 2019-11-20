var init = {

	gotoview: function (styleNo,designerId) {
		localStorage.setItem('styleNo', styleNo);
		localStorage.setItem('designerId', designerId);
		location.href = 'hairStyles.html';
	},
	
	
	printHairStyle : function (hairStyle) {
    	
    	return `<div class="col-lg-2 col-sm-6 portfolio-item">
    			  <div class="card h-100 text-center">
    			<a href="javascript:gotoviewf(${hairStyle.styleNo},'${hairStyle.userId}');"><img class="card-img-top" src="/images/${hairStyle.thumbNailFileName}" alt=""></a>
    			<div class="card-body">
    			<h5 class="card-title" style="font-weight: bold">${hairStyle.styleName}</h5>
    			<h6 class="card-subtitle mb-2 text-muted"></h6>
    			<p class="card-text">${hairStyle.styleComment}</p>
    		  </div>
    		  <div class="card-footer">
    			<a href="#">${hairStyle.price}</a>
    		  </div>
    		  </div>
    		</div>`;
    },

    makeDesignerList : function () {
		
		$.ajax({
			 	url: '/hairStyleJoin',
			 	method: 'GET',
			 	async: false,
			 	dataType: 'json',
			 	success: function (jsonArray) {
//		var result = await fetch('/hairStyleJoin');
//		var jsonArray = await result.json();
		
		init.data = jsonArray;
		init.datalength = jsonArray.length;
		init.numberArray = new Array(jsonArray.length);
		
		var html = "";
		//for (var designer of data) {
		for (var i = 3; i < 8; i++) {
			html += init.printHairStyle(init.data[i]);
		
			
//			var hairstyleImage = list.thumbNailFileName;
//			var hairstyleName = list.styleName;
//			var hairstyleComment = list.styleComment;
//			var hairstylePrice = list.price;
//			var styleNo = list.styleNo;
//
//			html +=
//				`<div class="col-lg-2 col-sm-6 portfolio-item">
//			  <div class="card h-100 text-center">
//				<a href="javascript:gotoviewf(${styleNo});"><img class="card-img-top" src="/images/${hairstyleImage}" alt=""></a>
//				<div class="card-body">
//				<h4 class="card-title">${hairstyleName}</h4>
//				<h6 class="card-subtitle mb-2 text-muted"></h6>
//				<p class="card-text">${hairstyleComment}</p>
//			  </div>
//			  <div class="card-footer">
//				<a href="#">${hairstylePrice}</a>
//			  </div>
//			  </div>
//			</div>`;
				}
		document.getElementById('desingerrr').innerHTML = html;
			}
		});
		this.generateListRandom();
		init.randomBestList();

		// $.ajax({
		// 	url: '/hairStyleJoin',
		// 	method: 'GET',
		// 	async: false,
		// 	dataType: 'json',
		// 	success: function (jsonArray) {
		// 		//alert('success'+jsonArray);
		// 		init.data = jsonArray;
		// 		init.datalength = jsonArray.length;
		// 		init.numberArray = new Array(jsonArray.length);
		// 		var html = "";
		// 		//for (var designer of data) {
		// 		for (var i = 0; i < 5; i++) {
		// 			var list = init.data[i];
		// 			var hairstyleImage = list.thumbNailFileName;
		// 			var hairstyleName = list.styleName;
		// 			var hairstyleComment = list.styleComment;
		// 			var hairstylePrice = list.price;
		// 			var styleNo = list.styleNo;

		// 			html +=
		// 				`<div class="col-lg-2 col-sm-6 portfolio-item">
		// 		      <div class="card h-100 text-center">
		// 		        <a href="javascript:gotoviewf(${styleNo});"><img class="card-img-top" src="/images/${hairstyleImage}" alt=""></a>
		// 		        <div class="card-body">
		// 		        <h4 class="card-title">${hairstyleName}</h4>
		// 		        <h6 class="card-subtitle mb-2 text-muted"></h6>
		// 		        <p class="card-text">${hairstyleComment}</p>
		// 		      </div>
		// 		      <div class="card-footer">
		// 		        <a href="#">${hairstylePrice}</a>
		// 		      </div>
		// 		      </div>
		// 		    </div>`;
		// 		}
		// 		document.getElementById('desingerrr').innerHTML = html;
		// 		return html;
		// 	}

		// });
		// this.generateListRandom();
		// init.randomBestList();

	},
	generateListRandom: function () {
		var length = init.datalength;
		for (var i = 0; i < length; i++) {

			var tempNo = Math.floor(Math.random() * length);
			//alert(typeof tempNo);
			init.numberArray[i] = tempNo;

			for (var j = 0; j < i; j++) {

				if (init.numberArray[i] == init.numberArray[j]) {
					i--;
					break;
				}
			}
		}
	},

	randomBestList: function () {

		var html = "";
		//for (var designer of data) {
		for (var i = 0; i < init.datalength; i++) {
			var j = init.numberArray[i];

			var list = init.data[j];
//			var hairstyleImage = list.thumbNailFileName;
//			var hairstyleName = list.styleName;
//			var hairstyleComment = list.styleComment;
//			var hairstylePrice = list.price;
//			var styleNo = list.styleNo;
			
			html += init.printHairStyle(init.data[j]);
			
//			html +=
//				`<div class="col-lg-2 col-sm-6 portfolio-item">
//			      <div class="card h-100 text-center">
//			        <a href="javascript:gotoviewf(${styleNo});"><img class="card-img-top" src="/images/${hairstyleImage}" alt=""></a>
//			        <div class="card-body">
//			        <h4 class="card-title">${hairstyleName}</h4>
//			        <h6 class="card-subtitle mb-2 text-muted"></h6>
//			        <p class="card-text">${hairstyleComment}</p>
//			      </div>
//			      <div class="card-footer">
//			        <a href="#">${hairstylePrice}</a>
//			      </div>
//			      </div>
//			    </div>`;

		}

		document.getElementById('randombest').innerHTML = html;
		
	},

	sortBygentleman: function () {
		this.generateListRandom();
		
		var html1 = "";
		for (var i = 3; i < 12; i++) {
			var list = init.data[i];
			if (list.gender == 0) {
				
				html1 += this.printHairStyle(list);
			}
		}

		var html2 = "";
		for (var i = 0; i < init.datalength; i++) {
			var j = init.numberArray[i];

			var list = init.data[j];

			if (list.gender == 0) {
				html2 += this.printHairStyle(list);
			}

		}


		document.getElementById('Weekly').innerHTML =
			`<h1 class="my-4" id="Weekly">Gentleman Best</h1>`;
		document.getElementById('desingerrr').innerHTML = html1;


		document.getElementById('Random').innerHTML =
			`<h2 class="my-3" id="Random">Random Gentleman Best</h2>`;
		document.getElementById('randombest').innerHTML = html2;


	},

	sortByladies: function () {
		this.generateListRandom();
		
		var html1 = "";
		for (var i = 1; i < 14; i++) {
			var list = init.data[i];
			if (list.gender == 1) {
				html1 += this.printHairStyle(list);
			}
		}

		var html2 = "";
		for (var i = 0; i < init.datalength; i++) {
			var j = init.numberArray[i];

			var list = init.data[j];

			if (list.gender == 1) {
				html2 += this.printHairStyle(list);
			}
		}


		document.getElementById('Weekly').innerHTML =
			`<h1 class="my-4" id="Weekly">Ladies Best</h1>`;
		document.getElementById('desingerrr').innerHTML = html1;


		document.getElementById('Random').innerHTML =
			`<h2 class="my-3" id="Random">Random Ladies Best</h2>`;
		document.getElementById('randombest').innerHTML = html2;
	},
	
	sortByCut: function(){
		var html1 = "";
		for (var i = 0; i < init.datalength; i++) {
			var list = init.data[i];
			
			if (list.categoryNo == 0 || list.categoryNo == 3) {
				html1 += this.printHairStyle(list);
			}
		}
		document.getElementById('Weekly').innerHTML =
			`<h1 class="my-4" id="Weekly">Hair Style - Cut</h1>`;
		document.getElementById('desingerrr').innerHTML = html1;
		document.getElementById('Random').innerHTML ="";
		document.getElementById('randombest').innerHTML = "";
	},
	
	sortByPerm: function(){
		var html1 = "";
		for (var i = 0; i < init.datalength; i++) {
			var list = init.data[i];
			if (list.categoryNo == 1 || list.categoryNo == 4) {
				html1 += this.printHairStyle(list);
			}
		}
		document.getElementById('Weekly').innerHTML =
			`<h1 class="my-4" id="Weekly">Hair Style - Perm</h1>`;
		document.getElementById('desingerrr').innerHTML = html1;
		document.getElementById('Random').innerHTML ="";
		document.getElementById('randombest').innerHTML = "";
	},
	sortByColor: function(){
		var html1 = "";
		for (var i = 0; i < init.datalength; i++) {
			var list = init.data[i];
			if (list.categoryNo == 2 || list.categoryNo == 5) {
				html1 += this.printHairStyle(list);
			}
		}
		document.getElementById('Weekly').innerHTML =
			`<h1 class="my-4" id="Weekly">Hair Style - Color</h1>`;
		document.getElementById('desingerrr').innerHTML = html1;
		document.getElementById('Random').innerHTML ="";
		document.getElementById('randombest').innerHTML = "";
	},

	sortByRecommend: async function(){
		var result = await fetch('/hairStyleList')
		var jsonArray = await result.json();
//		init.data = jsonArray;
//		init.datalength = jsonArray.length;
//		init.numberArray = new Array(jsonArray.length);
		var html1 = "";
		for (var i = 0; i < jsonArray.length; i++) {
			var list = jsonArray[i];
				html1 += this.printHairStyle(list);
			
		}
		document.getElementById('Weekly').innerHTML =
			`<h1 class="my-4" id="Weekly">Recommend</h1>`;
		document.getElementById('desingerrr').innerHTML = html1;
		document.getElementById('Random').innerHTML ="";
		document.getElementById('randombest').innerHTML = "";
	},
	
	sortByPrice: async function(){
		var result = await fetch('/hairStylePrice')
		var jsonArray = await result.json();
			
		
		var html1 = "";
		for (var i = 0; i < jsonArray.length; i++) {
			var list = jsonArray[i];
				html1 += this.printHairStyle(list);
			
		}
		document.getElementById('Weekly').innerHTML =
			`<h1 class="my-4" id="Weekly">Price</h1>`;
		document.getElementById('desingerrr').innerHTML = html1;
		document.getElementById('Random').innerHTML ="";
		document.getElementById('randombest').innerHTML = "";
	}
	









 


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