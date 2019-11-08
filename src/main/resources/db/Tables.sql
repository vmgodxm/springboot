DROP TABLE useReply CASCADE CONSTRAINTS;
DROP TABLE hairStyleFavorite CASCADE CONSTRAINTS;
DROP TABLE designerFavorite CASCADE CONSTRAINTS;
DROP TABLE reservation CASCADE CONSTRAINTS;
DROP TABLE hairStyle CASCADE CONSTRAINTS;
DROP TABLE hairCategory CASCADE CONSTRAINTS;
DROP TABLE companyOperation CASCADE CONSTRAINTS;
DROP TABLE admin CASCADE CONSTRAINTS;
DROP TABLE preCompany CASCADE CONSTRAINTS;
DROP TABLE userRegist CASCADE CONSTRAINTS;
DROP TABLE company CASCADE CONSTRAINTS;
DROP TABLE userLevel CASCADE CONSTRAINTS;
DROP TABLE fileStorage CASCADE CONSTRAINTS;
DROP TABLE region CASCADE CONSTRAINTS;
DROP TABLE authenticationHistory CASCADE CONSTRAINTS;
DROP TABLE authentication CASCADE CONSTRAINTS;


/**********************************/
/* Table Name: 인증 정보 테이블 */
/**********************************/
CREATE TABLE authentication(
		authNo                        		NUMBER(10)		 NOT NULL,
		userId                        		VARCHAR2(50)		 NOT NULL,
		apiKey                        		VARCHAR2(255)		 NOT NULL,
		loginTime                     		DATE		 NOT NULL,
		userLevel                     		NUMBER(10)		 NOT NULL
);

DROP SEQUENCE auth_authNo_SEQ;

CREATE SEQUENCE auth_authNo_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

COMMENT ON TABLE authentication is '인증 정보 테이블';
COMMENT ON COLUMN authentication.authNo is '순번';
COMMENT ON COLUMN authentication.userId is '사용자 아이디';
COMMENT ON COLUMN authentication.apiKey is '인증키';
COMMENT ON COLUMN authentication.loginTime is '로그인 시간';
COMMENT ON COLUMN authentication.userLevel is '사용자 등급';


/**********************************/
/* Table Name: 인증 내역 테이블 */
/**********************************/
CREATE TABLE authenticationHistory(
		hisNo                         		NUMBER(10)		 NOT NULL,
		userId                        		VARCHAR2(50)		 NOT NULL,
		apiKey                        		VARCHAR2(255)		 NULL,
		loginTime                     		DATE		 NOT NULL,
		logoutTime                    		DATE		 NULL,
		userLevel                     		NUMBER(10)		 NOT NULL
);

DROP SEQUENCE authHistory_hisNo_SEQ;

CREATE SEQUENCE authHistory_hisNo_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

COMMENT ON TABLE authenticationHistory is '인증 내역 테이블';
COMMENT ON COLUMN authenticationHistory.hisNo is '순번';
COMMENT ON COLUMN authenticationHistory.userId is '사용자 이름';
COMMENT ON COLUMN authenticationHistory.apiKey is '인증키';
COMMENT ON COLUMN authenticationHistory.loginTime is '로그인 시간';
COMMENT ON COLUMN authenticationHistory.logoutTime is '로그아웃 시간';
COMMENT ON COLUMN authenticationHistory.userLevel is '사용자 등급';

/**********************************/
/* Table Name: 지역정보 테이블 */
/**********************************/
CREATE TABLE region(
		regionNo                      		NUMBER(10)		 NOT NULL,
		regionName                    		VARCHAR2(50)		 NULL 
);

COMMENT ON TABLE region is '지역정보 테이블';
COMMENT ON COLUMN region.regionNo is '지역번호';
COMMENT ON COLUMN region.regionName is '지역이름';


/**********************************/
/* Table Name: FILE */
/**********************************/
CREATE TABLE fileStorage(
		fileNo                        		NUMBER(10)		 NOT NULL,
		filePath                      		VARCHAR2(255)		 NOT NULL,
		originFileName                		VARCHAR2(255)		 NOT NULL,
		storageFileName               		VARCHAR2(100)		 NOT NULL
);

DROP SEQUENCE fileStorage_fileNo_SEQ;

CREATE SEQUENCE fileStorage_fileNo_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;



COMMENT ON TABLE fileStorage is 'FILE';
COMMENT ON COLUMN fileStorage.fileNo is '파일번호';
COMMENT ON COLUMN fileStorage.filePath is '파일경로';
COMMENT ON COLUMN fileStorage.originFileName is '원본 파일 이름';
COMMENT ON COLUMN fileStorage.storageFileName is '저장파일 이름';


/**********************************/
/* Table Name: 회원등급 테이블 */
/**********************************/
CREATE TABLE userLevel(
		userLevel                     		NUMBER(10)		 NOT NULL,
		userLevelName                 		VARCHAR2(10)		 NOT NULL
);

COMMENT ON TABLE userLevel is '회원등급 테이블';
COMMENT ON COLUMN userLevel.userLevel is '회원등급';
COMMENT ON COLUMN userLevel.userLevelName is '등급이름';


/**********************************/
/* Table Name: 사업자 등록 테이블 */
/**********************************/
CREATE TABLE company(
		businessNumber                		VARCHAR2(50)		 NOT NULL,
		regionNo                      		NUMBER(10)		 NOT NULL,
		companyName                   		VARCHAR2(50)		 NOT NULL,
		companyAddress                		VARCHAR2(50)		 NULL 
);

COMMENT ON TABLE company is '사업자 등록 테이블';
COMMENT ON COLUMN company.businessNumber is '순번';
COMMENT ON COLUMN company.regionNo is '지역번호';
COMMENT ON COLUMN company.companyName is '사업장 이름';
COMMENT ON COLUMN company.companyAddress is '사업장 주소';


/**********************************/
/* Table Name: 회원등록 테이블 */
/**********************************/
CREATE TABLE userRegist(
		userNo                        		NUMBER(10)		 NOT NULL,
		userId                        		VARCHAR2(100)		 NOT NULL,
		userName                      		VARCHAR2(50)		 NOT NULL,
		gender                        		NUMBER(1)		 NOT NULL,
		phone                         		VARCHAR2(50)		 NOT NULL,
		nickname                      		VARCHAR2(50)		 NOT NULL,
		businessNumber                		VARCHAR2(50)		 NULL ,
		regionNo                      		NUMBER(10)		 NULL ,
		fileNo                        		NUMBER(10)		 NULL ,
		userLevel                     		NUMBER(10)		 NULL 
);

DROP SEQUENCE userRegist_userNo_SEQ;

CREATE SEQUENCE userRegist_userNo_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;



COMMENT ON TABLE userRegist is '회원등록 테이블';
COMMENT ON COLUMN userRegist.userNo is '순번';
COMMENT ON COLUMN userRegist.userId is '사용자 아이디';
COMMENT ON COLUMN userRegist.userName is '사용자 이름';
COMMENT ON COLUMN userRegist.gender is '성별';
COMMENT ON COLUMN userRegist.phone is '연락처';
COMMENT ON COLUMN userRegist.nickname is '별명(닉네임)';
COMMENT ON COLUMN userRegist.businessNumber is '순번';
COMMENT ON COLUMN userRegist.regionNo is '지역번호';
COMMENT ON COLUMN userRegist.fileNo is '파일번호';
COMMENT ON COLUMN userRegist.userLevel is '회원등급';


/**********************************/
/* Table Name: 이전 사업장 테이블 */
/**********************************/
CREATE TABLE preCompany(
		preComNo                      		NUMBER(10)		 NOT NULL,
		companyName                   		VARCHAR2(50)		 NOT NULL,
		userId                        		VARCHAR2(100)		 NULL 
);

DROP SEQUENCE preCompany_preComNo_SEQ;

CREATE SEQUENCE preCompany_preComNo_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;



COMMENT ON TABLE preCompany is '이전 사업장 테이블';
COMMENT ON COLUMN preCompany.preComNo is '순번';
COMMENT ON COLUMN preCompany.companyName is '사업장 이름';
COMMENT ON COLUMN preCompany.userId is '사용자 아이디';


/**********************************/
/* Table Name: 관리자 테이블 */
/**********************************/
CREATE TABLE admin(
		adminNo                       		NUMBER(10)		 NOT NULL,
		adminUserId                   		VARCHAR2(50)		 NOT NULL,
		password                      		VARCHAR2(50)		 NOT NULL,
		email                         		VARCHAR2(100)		 NOT NULL,
		adminName                     		VARCHAR2(50)		 NOT NULL,
		phone                         		VARCHAR2(50)		 NOT NULL,
		address                       		VARCHAR2(100)		 NOT NULL
);

DROP SEQUENCE admin_adminNo_SEQ;

CREATE SEQUENCE admin_adminNo_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;



COMMENT ON TABLE admin is '관리자 테이블';
COMMENT ON COLUMN admin.adminNo is '순번';
COMMENT ON COLUMN admin.adminUserId is '사용자 이름';
COMMENT ON COLUMN admin.password is '비밀번호';
COMMENT ON COLUMN admin.email is '이메일';
COMMENT ON COLUMN admin.adminName is '관리자 이름';
COMMENT ON COLUMN admin.phone is '연락처';
COMMENT ON COLUMN admin.address is '주소';


/**********************************/
/* Table Name: 사업장 운영시간 테이블 */
/**********************************/
CREATE TABLE companyOperation(
		year                          		NUMBER(10)		 NOT NULL,
		month                         		NUMBER(10)		 NOT NULL,
		beginDay                      		NUMBER(10)		 NOT NULL,
		endDay                        		NUMBER(10)		 NOT NULL,
		beginHour                     		NUMBER(10)		 NOT NULL,
		endHour                       		NUMBER(10)		 NOT NULL,
		beginMinute                   		NUMBER(10)		 NOT NULL,
		endMinute                     		NUMBER(10)		 NOT NULL,
		userId                        		VARCHAR2(100)		 NULL 
);

COMMENT ON TABLE companyOperation is '사업장 운영시간 테이블';
COMMENT ON COLUMN companyOperation.year is '연도';
COMMENT ON COLUMN companyOperation.month is '월';
COMMENT ON COLUMN companyOperation.beginDay is '시작날짜';
COMMENT ON COLUMN companyOperation.endDay is '종료날짜';
COMMENT ON COLUMN companyOperation.beginHour is '시작시간';
COMMENT ON COLUMN companyOperation.endHour is '종료시간';
COMMENT ON COLUMN companyOperation.beginMinute is '시작분';
COMMENT ON COLUMN companyOperation.endMinute is '종료분';
COMMENT ON COLUMN companyOperation.userId is '사용자 아이디';


/**********************************/
/* Table Name: 헤어 카테고리 테이블 */
/**********************************/
CREATE TABLE hairCategory(
		categoryNo                    		NUMBER(10)		 NOT NULL,
		categoryName                  		VARCHAR2(50)		 NOT NULL,
		gender                        		NUMBER(10)		 NOT NULL
);

COMMENT ON TABLE hairCategory is '헤어 카테고리 테이블';
COMMENT ON COLUMN hairCategory.categoryNo is '카테고리 번호';
COMMENT ON COLUMN hairCategory.categoryName is '헤어 스타일 분류';
COMMENT ON COLUMN hairCategory.gender is '헤어 스타일 성별 분류';


/**********************************/
/* Table Name: 헤어스타일 */
/**********************************/
CREATE TABLE hairStyle(
		styleNo                       		NUMBER(10)		 NOT NULL,
		gender                        		NUMBER(10)		 NOT NULL,
		styleName                     		VARCHAR2(100)		 NOT NULL,
		price                         		NUMBER(10)		 NOT NULL,
		hour                          		NUMBER(10)		 NOT NULL,
		minute                        		NUMBER(10)		 NOT NULL,
		styleComment                  		VARCHAR2(255)		 NOT NULL,
		fileNo                        		NUMBER(10)		 NULL ,
		categoryNo                    		NUMBER(10)		 NULL ,
		userId                        		VARCHAR2(100)		 NULL 
);

DROP SEQUENCE hairStyle_styleNo_SEQ;

CREATE SEQUENCE hairStyle_styleNo_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;



COMMENT ON TABLE hairStyle is '헤어스타일';
COMMENT ON COLUMN hairStyle.styleNo is '순번';
COMMENT ON COLUMN hairStyle.gender is '성별';
COMMENT ON COLUMN hairStyle.styleName is '스타일 이름';
COMMENT ON COLUMN hairStyle.price is '가격';
COMMENT ON COLUMN hairStyle.hour is '소요시간(시간)';
COMMENT ON COLUMN hairStyle.minute is '소요시간(분)';
COMMENT ON COLUMN hairStyle.styleComment is '스타일 소개';
COMMENT ON COLUMN hairStyle.fileNo is 'SEQ';
COMMENT ON COLUMN hairStyle.categoryNo is '카테고리 번호';
COMMENT ON COLUMN hairStyle.userId is '사용자 아이디';


/**********************************/
/* Table Name: 예약 현황 테이블 */
/**********************************/
CREATE TABLE reservation(
		resNo                         		NUMBER(10)		 NOT NULL,
		year                          		NUMBER(10)		 NOT NULL,
		month                               NUMBER(10)		 NOT NULL,
        day                           		NUMBER(10)		 NOT NULL,
		beginHour                     		NUMBER(10)		 NOT NULL,
		endHour                       		NUMBER(10)		 NOT NULL,
		beingMinute                   		NUMBER(10)		 NOT NULL,
		endMinute                     		NUMBER(10)		 NOT NULL,
		useComment                    		VARCHAR2(255)		 NULL ,
		useComplete                   		NUMBER(2)		 NULL ,
		styleNo                       		NUMBER(10)		 NULL ,
		designerId                    		VARCHAR2(100)		 NULL ,
		userId                        		VARCHAR2(100)		 NULL 
);

DROP SEQUENCE reservation_resNo_SEQ;

CREATE SEQUENCE reservation_resNo_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;



COMMENT ON TABLE reservation is '예약 현황 테이블';
COMMENT ON COLUMN reservation.resNo is '예약번호';
COMMENT ON COLUMN reservation.year is '연도';
COMMENT ON COLUMN reservation.month is '월';
COMMENT ON COLUMN reservation.day is '일';
COMMENT ON COLUMN reservation.beginHour is '시작시간';
COMMENT ON COLUMN reservation.endHour is '종료시간';
COMMENT ON COLUMN reservation.beingMinute is '시작분';
COMMENT ON COLUMN reservation.endMinute is '종료분';
COMMENT ON COLUMN reservation.useComment is '사용자 요청사항';
COMMENT ON COLUMN reservation.useComplete is '시술완료';
COMMENT ON COLUMN reservation.styleNo is '스타일 번호';
COMMENT ON COLUMN reservation.designerId is '디자이너 아이디';
COMMENT ON COLUMN reservation.userId is '사용자 아이디';


/**********************************/
/* Table Name: 디자이너 즐겨찾기 테이블 */
/**********************************/
CREATE TABLE designerFavorite(
		DFavoriteNo                   		NUMBER(10)		 NOT NULL,
		designerId                		VARCHAR2(100)		 NULL ,
		userId                        		VARCHAR2(100)		 NULL 
);

DROP SEQUENCE DESIGNERFAVORITENO_SEQ;

CREATE SEQUENCE DESIGNERFAVORITENO_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;



COMMENT ON TABLE designerFavorite is '디자이너 즐겨찾기 테이블';
COMMENT ON COLUMN designerFavorite.DFavoriteNo is '디자이너 즐겨찾기 번호';
COMMENT ON COLUMN designerFavorite.designerId is '디자이너 아이디';
COMMENT ON COLUMN designerFavorite.userId is '사용자 아이디';


/**********************************/
/* Table Name: 헤어스타일 즐겨찾기 테이블 */
/**********************************/
CREATE TABLE hairStyleFavorite(
		HFavoriteNo                   		NUMBER(10)		 NOT NULL,
		designerId                		VARCHAR2(100)		 NULL ,
		userId                        		VARCHAR2(100)		 NULL ,
		styleNo                       		NUMBER(10)		 NOT NULL
);

DROP SEQUENCE hairStyleFavorite_styleNo_SEQ;

CREATE SEQUENCE hairStyleFavorite_styleNo_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;


COMMENT ON TABLE hairStyleFavorite is '헤어스타일 즐겨찾기 테이블';
COMMENT ON COLUMN hairStyleFavorite.HFavoriteNo is '헤어스타일 즐겨찾기 번호';
COMMENT ON COLUMN hairStyleFavorite.designerId is '디자이너 아이디';
COMMENT ON COLUMN hairStyleFavorite.userId is '사용자 아이디';
COMMENT ON COLUMN hairStyleFavorite.styleNo is '순번';


/**********************************/
/* Table Name: 이용후기 테이블 */
/**********************************/
CREATE TABLE useReply(
		replyNo                       		NUMBER(10)		 NOT NULL,
		resNo                         		NUMBER(10)		 NOT NULL,
		title                         		VARCHAR2(100)		 NOT NULL,
		useContent                    		VARCHAR2(255)		 NOT NULL,
		writeTime                     		DATE		 NOT NULL,
		userId                        		VARCHAR2(100)		 NULL ,
		styleNo                       		NUMBER(10)		 NULL ,
		designerId                    		VARCHAR2(100)		 NULL 
);

DROP SEQUENCE useReply_replyNo_SEQ;

CREATE SEQUENCE useReply_replyNo_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;



COMMENT ON TABLE useReply is '이용후기 테이블';
COMMENT ON COLUMN useReply.replyNo is '후기 번호';
COMMENT ON COLUMN useReply.resNo is '예약번호';
COMMENT ON COLUMN useReply.title is '제목';
COMMENT ON COLUMN useReply.useContent is '후기 내용';
COMMENT ON COLUMN useReply.writeTime is '작성시간';
COMMENT ON COLUMN useReply.userId is '사용자 아이디';
COMMENT ON COLUMN useReply.styleNo is '순번';
COMMENT ON COLUMN useReply.designerId is '디자이너 아이디';



ALTER TABLE region ADD CONSTRAINT IDX_region_PK PRIMARY KEY (regionNo);

ALTER TABLE fileStorage ADD CONSTRAINT IDX_fileStorage_PK PRIMARY KEY (fileNo);

ALTER TABLE userLevel ADD CONSTRAINT IDX_userLevel_PK PRIMARY KEY (userLevel);

ALTER TABLE company ADD CONSTRAINT IDX_company_PK PRIMARY KEY (businessNumber);
ALTER TABLE company ADD CONSTRAINT IDX_company_FK0 FOREIGN KEY (regionNo) REFERENCES region (regionNo);

ALTER TABLE userRegist ADD CONSTRAINT IDX_userRegist_PK PRIMARY KEY (userId);
ALTER TABLE userRegist ADD CONSTRAINT IDX_userRegist_FK0 FOREIGN KEY (regionNo) REFERENCES region (regionNo);
ALTER TABLE userRegist ADD CONSTRAINT IDX_userRegist_FK1 FOREIGN KEY (fileNo) REFERENCES fileStorage (fileNo);
ALTER TABLE userRegist ADD CONSTRAINT IDX_userRegist_FK2 FOREIGN KEY (userLevel) REFERENCES userLevel (userLevel);
ALTER TABLE userRegist ADD CONSTRAINT IDX_userRegist_FK3 FOREIGN KEY (businessNumber) REFERENCES company (businessNumber);

ALTER TABLE preCompany ADD CONSTRAINT IDX_preCompany_FK0 FOREIGN KEY (userId) REFERENCES userRegist (userId);

ALTER TABLE admin ADD CONSTRAINT IDX_admin_PK PRIMARY KEY (adminNo, adminUserId);

ALTER TABLE companyOperation ADD CONSTRAINT IDX_companyOperation_FK0 FOREIGN KEY (userId) REFERENCES userRegist (userId);

ALTER TABLE hairCategory ADD CONSTRAINT IDX_hairCategory_PK PRIMARY KEY (categoryNo);

ALTER TABLE hairStyle ADD CONSTRAINT IDX_hairStyle_PK PRIMARY KEY (styleNo);
ALTER TABLE hairStyle ADD CONSTRAINT IDX_hairStyle_FK0 FOREIGN KEY (fileNo) REFERENCES fileStorage (fileNo);
ALTER TABLE hairStyle ADD CONSTRAINT IDX_hairStyle_FK1 FOREIGN KEY (userId) REFERENCES userRegist (userId);
ALTER TABLE hairStyle ADD CONSTRAINT IDX_hairStyle_FK2 FOREIGN KEY (categoryNo) REFERENCES hairCategory (categoryNo);

ALTER TABLE reservation ADD CONSTRAINT IDX_reservation_PK PRIMARY KEY (resNo, designerId, userId);
ALTER TABLE reservation ADD CONSTRAINT IDX_reservation_FK0 FOREIGN KEY (styleNo) REFERENCES hairStyle (styleNo);

ALTER TABLE designerFavorite ADD CONSTRAINT IDX_designerFavorite_FK0 FOREIGN KEY (designerId) REFERENCES userRegist (userId);
ALTER TABLE designerFavorite ADD CONSTRAINT IDX_designerFavorite_FK1 FOREIGN KEY (userId) REFERENCES userRegist (userId);

ALTER TABLE hairStyleFavorite ADD CONSTRAINT IDX_hairStyleFavorite_PK PRIMARY KEY (HFavoriteNo);
ALTER TABLE hairStyleFavorite ADD CONSTRAINT IDX_hairStyleFavorite_FK0 FOREIGN KEY (designerId) REFERENCES userRegist (userId);
ALTER TABLE hairStyleFavorite ADD CONSTRAINT IDX_hairStyleFavorite_FK1 FOREIGN KEY (userId) REFERENCES userRegist (userId);
ALTER TABLE hairStyleFavorite ADD CONSTRAINT IDX_hairStyleFavorite_FK2 FOREIGN KEY (styleNo) REFERENCES hairStyle (styleNo);

ALTER TABLE useReply ADD CONSTRAINT IDX_useReply_PK PRIMARY KEY (replyNo, resNo);
ALTER TABLE useReply ADD CONSTRAINT IDX_useReply_FK0 FOREIGN KEY (styleNo) REFERENCES hairStyle (styleNo);

ALTER TABLE authentication ADD CONSTRAINT IDX_authentication_PK PRIMARY KEY (authNo, userId);

ALTER TABLE authenticationHistory ADD CONSTRAINT IDX_authenticationHistory_PK PRIMARY KEY (hisNo, userId);


commit;

