-- 코드를 입력하세요
SELECT A.writer_id as user_id, UU.nickname, A.total_price FROM
(SELECT writer_id, SUM(price) AS TOTAL_PRICE FROM USED_GOODS_BOARD UB
where status = 'DONE'
GROUP BY writer_id
HAVING sum(price) >= 700000) A
INNER JOIN USED_GOODS_USER UU
ON A.writer_id = UU.user_id
ORDER BY total_price