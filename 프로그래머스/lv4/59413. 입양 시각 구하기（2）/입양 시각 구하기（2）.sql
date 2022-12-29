-- 코드를 입력하세요
SELECT A.HOUR, NVL(B.CNT, 0) as HOUR FROM (
(SELECT (LEVEL -1) AS HOUR FROM DUAL CONNECT BY LEVEL <= 24) A
LEFT OUTER JOIN (
SELECT TO_CHAR(DATETIME, 'HH24') AS HOUR, COUNT(*) AS CNT
FROM ANIMAL_OUTS
GROUP BY TO_CHAR(DATETIME, 'HH24')) B
ON A.HOUR = B.HOUR
)
ORDER BY A.HOUR
    
