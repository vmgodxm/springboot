------------------------------------------------------
-- Reservation Table
------------------------------------------------------

SELECT 
    *
FROM reservation R1
WHERE designerId = 'hairstargramtester1@outlook.com' AND  TO_DATE(SUBSTR(R1.resDate, 1,10), 'YYYY-MM-DD') = '2019-11-25';

-- 예약날짜에서 월 정보만 가져오기
SELECT R.resNo, R.resDate, R.useComment, U.userName, HS.styleName
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



