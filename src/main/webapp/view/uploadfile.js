


function loadFileContent(uploadpage) {
	 var content = `<div class="col-lg-9 mb-4">
	        <h2>Section Heading</h2>
	        	<div> 
	        		<form id="uploadForm" enctype="multipart/form-data" method="POST" action="/pentode/upload.do"> 
		        		<label for="file1">파일 첫 번째</label> 
		        			<div>
		        				<input type="file" id="file1" name="file" required="required" />
		        			</div>
		        		<label for="file2">파일 두 번째</label> 
		        			<div>
		        				<input type="file" id="file2" name="file" required="required" />
		        			</div> 
	        		</form> 
	        	</div> 
	        	
	        	<div>
	        		<button id="btn-upload">파일 업로드</button>
	        	</div>
	
	
	
	      </div>`;
	      
	      return content
	      }