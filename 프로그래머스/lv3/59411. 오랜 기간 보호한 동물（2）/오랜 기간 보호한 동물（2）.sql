-- 코드를 입력하세요
SELECT A.ANIMAL_ID, A.NAME 
FROM
(SELECT AI.ANIMAL_ID, AI.NAME, (AO.DATETIME - AI.DATETIME) AS PERIOD
FROM ANIMAL_INS AI 
INNER JOIN ANIMAL_OUTS AO
ON AI.ANIMAL_ID = AO.ANIMAL_ID
ORDER BY PERIOD DESC) A
WHERE ROWNUM < 3