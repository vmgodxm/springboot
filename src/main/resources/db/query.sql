INSERT INTO userLevel VALUES (0, 'normal');
INSERT INTO userLevel VALUES (1, 'designer');

INSERT INTO region VALUES (0, '서울');
INSERT INTO region VALUES (1, '경기');
INSERT INTO region VALUES (2, '부산');

-- 사용자
INSERT INTO userRegist
        VALUES(USERREGIST_USERNO_SEQ.nextVal,
                'test@test.com', 
                'testName', 
                0, 
                '000-0000-0000',
                'nickName',
                null,
                null,
                null,
                0);
                
                
INSERT INTO company values (COMPANY_COMNO_SEQ.nextVal,0,'리안헤어','서울 강남점','test@test.com');
             
INSERT INTO preCompany values(PRECOMPANY_PRECOMNO_SEQ.nextVal, '주노헤어 강남점', 'test@test.com');
INSERT INTO preCompany values(PRECOMPANY_PRECOMNO_SEQ.nextVal, '차홍룸 분당점', 'test@test.com');

INSERT INTO userRegist
        VALUES(USERREGIST_USERNO_SEQ.nextVal,
                'test@test2.com', 
                'testName2', 
                0, 
                '000-0000-0000',
                'nickName',
                null,
                null,
                null,
                0);
                
                
INSERT INTO company values (COMPANY_COMNO_SEQ.nextVal,0,'블루클럽','서울 강남점','test@test.com');
             
INSERT INTO preCompany values(PRECOMPANY_PRECOMNO_SEQ.nextVal, '주노헤어 강남점', 'test@test.com');
INSERT INTO preCompany values(PRECOMPANY_PRECOMNO_SEQ.nextVal, '차홍룸 분당점', 'test@test.com');



INSERT INTO userRegist
        VALUES(USERREGIST_USERNO_SEQ.nextVal,
                'test@test3.com', 
                'testName3', 
                0, 
                '000-0000-0000',
                'nickName',
                null,
                null,
                null,
                0);
                
                
INSERT INTO company values (COMPANY_COMNO_SEQ.nextVal,0,'리안헤어','서울 강남점','test@test.com');
             
INSERT INTO preCompany values(PRECOMPANY_PRECOMNO_SEQ.nextVal, '블루클럽 강남점', 'test@test.com');
INSERT INTO preCompany values(PRECOMPANY_PRECOMNO_SEQ.nextVal, '동네미용실 분당점', 'test@test.com');

-- 파일스토리지
INSERT INTO fileStorage values (1, 'web/test/' , 'test1.png', 'AKSEJWQE.png');
INSERT INTO fileStorage values (2, 'web/test/' , 'test2.png', '멍충이.png');

-- 디자이너
INSERT INTO userRegist
        VALUES(USERREGIST_USERNO_SEQ.nextVal,
                'designer1@test.com', 
                'testName4', 
                1, 
                '000-0000-0000',
                'nickName',
                '000-00-00000',
                0,
                1,
                1);
                
INSERT INTO userRegist
        VALUES(USERREGIST_USERNO_SEQ.nextVal,
                'designer2@test.com', 
                'testName5', 
                1, 
                '000-0000-0000',
                'nickName',
                '000-00-00000',
                0,
                1,
                1);
                
INSERT INTO userRegist
        VALUES(USERREGIST_USERNO_SEQ.nextVal,
                'designer3@test.com', 
                'testName6', 
                1, 
                '000-0000-0000',
                'nickName',
                '000-00-00000',
                0,
                1,
                1);                

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
INSERT INTO hairStyle VALUES (HAIRSTYLE_STYLENO_SEQ.nextVal, 
                                0, 
                                '핑크 스타일 염색(여성)',
                                150000,
                                12, 30,
                                '핑크 염색',
                                1,
                                2,
                                'test@test.com');
                                
                                
            
-- 예약 내역
INSERT INTO reservation VALUES(RESERVATION_RESNO_SEQ.nextVal, 2019, 11, 29,
                                12, 13, 00, 30, '이쁘게 해주세요', 0, 1, 'designer1@test.com', 'test@test.com');

-- 사용자 후기
INSERT INTO useReply VALUES(USEREPLY_REPLYNO_SEQ.nextVal, '핑크염색 후기', '망헀어요', sysdate, 'designer1@test.com', 'test@test.com', 1, 1);


-- 디자이너 즐겨찾기
INSERT INTO designerFavorite VALUES(DESIGNERFAVORITENO_SEQ.nextVal, 'designer1@test.com', 'test@test.com');
INSERT INTO designerFavorite VALUES(DESIGNERFAVORITENO_SEQ.nextVal, 'designer2@test.com', 'test@test.com');
INSERT INTO designerFavorite VALUES(DESIGNERFAVORITENO_SEQ.nextVal, 'designer3@test.com', 'test@test.com');


-- 헤어스타일 즐겨찾기
INSERT INTO hairStyleFavorite VALUES(HAIRSTYLEFAVORITE_STYLENO_SEQ.nextVal, 'designer1@test.com', 'test@test.com', 1);

-- 어드민
INSERT INTO admin VALUES (ADMIN_ADMINNO_SEQ.nextVal, 'admin', '1111', 'admin@admin.com', 'Admin', '000-0000-0000', 'SEOUL');
--admin 전체
SELECT * FROM admin;
--한명
SELECT * FROM admin WHERE adminUserId = 'admin';
--등록
INSERT INTO admin VALUES (ADMIN_ADMINNO_SEQ.nextVal, 'admin2', '2222', 'admin2@admin.com', 'Admin2', '000-2222-0000', 'SEOUL');
INSERT INTO admin VALUES (ADMIN_ADMINNO_SEQ.nextVal, 'admin3', '3333', 'admin3@admin.com', 'Admin3', '000-3333-0000', 'SEOUL');
INSERT INTO admin VALUES (ADMIN_ADMINNO_SEQ.nextVal, 'admin4', '4444', 'admin4@admin.com', 'Admin4', '000-4444-0000', 'SEOUL');
INSERT INTO admin VALUES (ADMIN_ADMINNO_SEQ.nextVal, 'admin5', '5555', 'admin5@admin.com', 'Admin5', '000-5555-0000', 'SEOUL');

--수정
UPDATE admin set adminuserid = 'admin2',password = '2222', email = 'admin2@admin.com',phone ='000-2222-0000' ,address = 'BUSAN' 
       where adminUserId = 'admin2';
--삭제
delete from admin where adminuserid = 'admin2';

commit; 

        
        