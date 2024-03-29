-- 코드를 입력하세요
SELECT TO_CHAR(SALES_DATE, 'YYYY') AS YEAR,
       TO_CHAR(SALES_DATE, 'MM') AS MONTH,
       U.GENDER, 
       COUNT(DISTINCT U.USER_ID)
FROM ONLINE_SALE O INNER JOIN USER_INFO U
ON O.USER_ID = U.USER_ID
WHERE U.GENDER IS NOT NULL
GROUP BY TO_CHAR(SALES_DATE, 'YYYY'), TO_CHAR(SALES_DATE, 'MM'), U.GENDER
ORDER BY YEAR, MONTH, U.GENDER