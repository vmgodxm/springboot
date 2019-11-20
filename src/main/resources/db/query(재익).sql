commit;

------------------------------------------------------
-- Reservation Table
------------------------------------------------------
INSERT INTO reservation VALUES (RESERVATION_RESNO_SEQ.nextVal, '2019-11-20T18:30', '아무거나~~', 0, 28, 'hairstargramtester1@outlook.com', 'hairstargramtester3@outlook.com');

SELECT 
    *
FROM reservation R1
WHERE designerId = 'hairstargramtester1@outlook.com' AND  TO_DATE(SUBSTR(R1.resDate, 1,10), 'YYYY-MM-DD') = '2019-11-25';

-- 예약날짜에서 월 정보만 가져오기
SELECT R.resNo, HS.categoryNo, R.resDate, R.useComment, U.userName, HS.styleName
FROM (	
    SELECT resNo, resDate, useComment, userId, styleNo
    FROM reservation R1
    WHERE	
        designerId = 'hairstargramtester1@outlook.com' AND
        getResMonth(R1.resDate) = 11
    ) R
JOIN userRegist U
ON U.userId = R.userId

JOIN hairStyle HS
ON HS.styleNo = R.styleNo;

SELECT * 
FROM reservation R
WHERE designerId = 'hairstargramtester1@outlook.com' AND
    getResMonth(R.resDate) = 11;

-- 날짜의 월 정보만 가져오는 함수
CREATE OR REPLACE FUNCTION getResMonth (resDate IN VARCHAR2) 
RETURN NUMBER 
IS 
    retVal VARCHAR2(10);
BEGIN
  retVal := EXTRACT(MONTH FROM TO_DATE(SUBSTR(resDate, 1,10), 'YYYY-MM-DD'));
RETURN retVal;
END;

SELECT 
	H.styleNo, 
    H.styleName, 
    H.styleComment,
    H.hour AS hairUseHour, 
    H.minute AS hairUseMinute, 
    H.price AS hairPrice, 
    D.userNo AS designerNo, 
    D.nickName AS designerNickName, 
    D.phone AS designerPhone, 
    D.userId AS designerEmail,
    C.companyName || ' ' || C.companyAddress AS designerCompanyName, 
    OP.startTime, 
    OP.endTime, 
    HF.thumbnailFileName AS hairThumbNailFileName, 
    DF.thumbnailFileName AS designerThumbNailFileName,
    R.resNo,
    R.resDate, 
    R.useComment
FROM(
        SELECT resNo, styleNo, useComment, designerId, resDate
        FROM reservation
        WHERE userId = 'hairstargramtester1@outlook.com' AND useComplete = 0
    ) R
LEFT OUTER JOIN hairStyle H
    ON H.styleNo = R.styleNo

LEFT OUTER JOIN fileStorage HF
    ON HF.fileNo = H.fileNo

LEFT OUTER JOIN userRegist D
    ON D.userId = R.designerId

LEFT OUTER JOIN fileStorage DF
    ON DF.fileNo = D.fileNo

LEFT OUTER JOIN company C
    ON C.userId = D.userId

LEFT OUTER JOIN companyOperation OP
    ON OP.userId = D.userId;