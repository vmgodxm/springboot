INSERT INTO userLevel VALUES (0, 'normal');
INSERT INTO userLevel VALUES (1, 'designer');

INSERT INTO region VALUES (0, '서울');
INSERT INTO region VALUES (1, '경기');
INSERT INTO region VALUES (2, '부산');

-- 사용자
INSERT INTO userRegist VALUES(USERREGIST_USERNO_SEQ.nextVal, 'test@test.com',  'testName',  0,  '000-0000-0000', 'nickName', null, null, null, 0);
INSERT INTO userRegist VALUES(USERREGIST_USERNO_SEQ.nextVal, 'test2@test.com', 'testName3', 0, '000-3333-0000','nickName2',null,null,null,0);
INSERT INTO userRegist VALUES(USERREGIST_USERNO_SEQ.nextVal, 'test3@test.com', 'testName3', 0, '000-3333-0000','nickName3',null,null,null,0);

INSERT INTO company values ('000-00-00000',0,'리안헤어','서울 강남점');
INSERT INTO company values ('000-01-00000',0,'블루클럽','서울 강남점');
INSERT INTO company values ('000-02-00000',0,'리안헤어','서울 강남점');

-- 파일스토리지
INSERT INTO fileStorage values (1, 'test@test.com', 'web/test/' , 'test1.png', 'AKSEJWQE.png','th_AFVJBjIFuCnJ8s4t.jpg');
INSERT INTO fileStorage values (2, 'test2@test.com', 'images/' , 'test2.png', '멍충이.png', 'th_AFVJBjIFuCnJ8s4t.jpg');
           
-- 디자이너
INSERT INTO userRegist VALUES(USERREGIST_USERNO_SEQ.nextVal, 'designer1@test.com',  'desigName1', 1, '000-0000-0000','desigName1','000-00-00000',0,1,1);
INSERT INTO userRegist VALUES(USERREGIST_USERNO_SEQ.nextVal, 'designer2@test.com', 'desigName2', 1, '000-0000-0000','desigName2','000-00-00000',0,1,1);
INSERT INTO userRegist VALUES(USERREGIST_USERNO_SEQ.nextVal, 'designer3@test.com', 'desigName3', 1, '000-0000-0000','desigName3','000-00-00000',0,1,1); 
              

--delete from company where businessnumber = '0';          
INSERT INTO preCompany values(PRECOMPANY_PRECOMNO_SEQ.nextVal, '주노헤어 강남점', 'designer1@test.com');
INSERT INTO preCompany values(PRECOMPANY_PRECOMNO_SEQ.nextVal, '차홍룸 분당점', 'designer1@test.com');
INSERT INTO preCompany values(PRECOMPANY_PRECOMNO_SEQ.nextVal, '주노헤어 강남점', 'designer2@test.com');
INSERT INTO preCompany values(PRECOMPANY_PRECOMNO_SEQ.nextVal, '차홍룸 분당점', 'designer2@test.com');
INSERT INTO preCompany values(PRECOMPANY_PRECOMNO_SEQ.nextVal, '블루클럽 강남점', 'designer3@test.com');
INSERT INTO preCompany values(PRECOMPANY_PRECOMNO_SEQ.nextVal, '동네미용실 분당점', 'designer3@test.com');




--디자이너 수정
/*UPDATE userRegist set userid = 'designer1@test.com',userName = 'testName4', gender = 1,phone ='010-0000-0000',
                      nickname = 'nickName',businessNumber = '000-00-00000',regionNo = 0, fileNo = 1,userLevel= 1
       where userid = 'designer1@test.com';
*/               
-- 운영 시간
INSERT INTO companyOperation VALUES(2019, 11, 29, 30, 09, 20, 00, 00, 'designer1@test.com');
            
-- 헤어 스타일 카테고리
INSERT INTO hairCategory VALUES (0, '커트', 0);
INSERT INTO hairCategory VALUES (1, '펌', 0);
INSERT INTO hairCategory VALUES (2, '염색', 0);
INSERT INTO hairCategory VALUES (3, '커트', 1);
INSERT INTO hairCategory VALUES (4, '펌', 1);
INSERT INTO hairCategory VALUES (5, '염색', 1);

-- 헤어 스타일
INSERT INTO hairStyle VALUES (HAIRSTYLE_STYLENO_SEQ.nextVal, 0, '핑크 스타일 염색(여성)',150000,12, 30,'핑크 염색',1,2,'designer1@test.com');
            
-- 예약 내역
INSERT INTO reservation VALUES(RESERVATION_RESNO_SEQ.nextVal, 2019, 11, 29, 12, 13, 00, 30, '이쁘게 해주세요', 0, 1, 'designer1@test.com', 'test@test.com');

-- 디자이너 즐겨찾기
INSERT INTO designerFavorite VALUES(DESIGNERFAVORITENO_SEQ.nextVal, 'designer1@test.com', 'test@test.com');
INSERT INTO designerFavorite VALUES(DESIGNERFAVORITENO_SEQ.nextVal, 'designer2@test.com', 'test@test.com');
INSERT INTO designerFavorite VALUES(DESIGNERFAVORITENO_SEQ.nextVal, 'designer3@test.com', 'test@test.com');
INSERT INTO designerFavorite VALUES(DESIGNERFAVORITENO_SEQ.nextVal, 'designer1@test.com', 'test2@test.com');
INSERT INTO designerFavorite VALUES(DESIGNERFAVORITENO_SEQ.nextVal, 'designer2@test.com', 'test3@test.com');


-- 헤어스타일 즐겨찾기
INSERT INTO hairStyleFavorite VALUES(HAIRSTYLEFAVORITE_STYLENO_SEQ.nextVal, 'designer1@test.com', 'test@test.com', 1);
INSERT INTO hairStyleFavorite VALUES(HAIRSTYLEFAVORITE_STYLENO_SEQ.nextVal, 'designer1@test.com', 'test2@test.com', 1);
INSERT INTO hairStyleFavorite VALUES(HAIRSTYLEFAVORITE_STYLENO_SEQ.nextVal, 'designer2@test.com', 'test@test.com', 1);

-- 어드민 등록
INSERT INTO admin VALUES (ADMIN_ADMINNO_SEQ.nextVal, 'admin', '1111', 'admin@admin.com', 'Admin', '000-0000-0000', 'SEOUL');
INSERT INTO admin VALUES (ADMIN_ADMINNO_SEQ.nextVal, 'admin2', '2222', 'admin2@admin.com', 'Admin2', '000-2222-0000', 'SEOUL');
INSERT INTO admin VALUES (ADMIN_ADMINNO_SEQ.nextVal, 'admin3', '3333', 'admin3@admin.com', 'Admin3', '000-3333-0000', 'SEOUL');
INSERT INTO admin VALUES (ADMIN_ADMINNO_SEQ.nextVal, 'admin4', '4444', 'admin4@admin.com', 'Admin4', '000-4444-0000', 'SEOUL');
INSERT INTO admin VALUES (ADMIN_ADMINNO_SEQ.nextVal, 'admin5', '5555', 'admin5@admin.com', 'Admin5', '000-5555-0000', 'SEOUL');



--UPDATE admin set adminuserid = 'admin2',password = '2222', email = 'admin2@admin.com',adminname ='admin2', phone ='000-2222-0000' ,address = 'BUSAN' 
--       where adminUserId = 'admin2';
--삭제
--delete from admin where adminuserid = 'admin2';


-- 사용자 후기
INSERT INTO useReply VALUES(USEREPLY_REPLYNO_SEQ.nextVal,1, '핑크염색 후기', '망헀어요', sysdate, 'test@test.com', 1,'designer1@test.com' );
 

-- 파일 업데이트
-- UPDATE filestorage SET filePath=#{filePath},originFileName=#{originFileName},storageFileName=#{storageFileName}
--		WHERE fileNo=#{fileNo}













--SELECT * FROM USERREGIST;
--SELECT * FROM COMPANY;
INSERT INTO userRegist VALUES(USERREGIST_USERNO_SEQ.nextVal, 'designer4@test.com',  'desigName1', 1, '000-0000-0000','desigName1','000-01-00000',0,1,1);

UPDATE userRegist SET
       businessNumber = ''
WHERE 
       userId = 'designer4@test.com';

DELETE FROM userRegist 
WHERE
       userId = 'designer4@test.com';

DELETE FROM COMPANY
WHERE 
       businessNumber = '000-01-00000';

-- 로그인 인증번호 테이블
INSERT INTO authentication VALUES(auth_authNo_SEQ.nextVal, 'test@test.com', 'wqkejdqowej123', sysdate, 0);
INSERT INTO authentication VALUES(auth_authNo_SEQ.nextVal, 'test2@test.com', 'wqkejdqowej123', sysdate, 0);
INSERT INTO authentication VALUES(auth_authNo_SEQ.nextVal, 'test3@test.com', 'wqkejdqowej123', sysdate, 0);
INSERT INTO authentication VALUES(auth_authNo_SEQ.nextVal, 'test4@test.com', 'wqkejdqowej123', sysdate, 0);
INSERT INTO authentication VALUES(auth_authNo_SEQ.nextVal, 'test5@test.com', 'wqkejdqowej123', sysdate, 0);
INSERT INTO authentication VALUES(auth_authNo_SEQ.nextVal, 'test6@test.com', 'wqkejdqowej123', sysdate, 0);

-- 로그인 내역 테이블
INSERT INTO authenticationHistory VALUES(authHistory_hisNo_SEQ.nextVal, 'test@test.com', 'sdklkqwek23', sysdate, sysdate+1, 0);
INSERT INTO authenticationHistory VALUES(authHistory_hisNo_SEQ.nextVal, 'test2@test.com', 'sdklkqwek23', sysdate, sysdate+1, 0);
INSERT INTO authenticationHistory VALUES(authHistory_hisNo_SEQ.nextVal, 'test3@test.com', 'sdklkqwek23', sysdate, sysdate+1, 0);
INSERT INTO authenticationHistory VALUES(authHistory_hisNo_SEQ.nextVal, 'test4@test.com', 'sdklkqwek23', sysdate, sysdate+1, 0);
INSERT INTO authenticationHistory VALUES(authHistory_hisNo_SEQ.nextVal, 'test5@test.com', 'sdklkqwek23', sysdate, sysdate+1, 0);
INSERT INTO authenticationHistory VALUES(authHistory_hisNo_SEQ.nextVal, 'test6@test.com', 'sdklkqwek23', sysdate, sysdate+1, 0);








commit;

