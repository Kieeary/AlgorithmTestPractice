-- 코드를 입력하세요
SELECT board_id, writer_id, title, price, case when status = 'DONE' then '거래완료' when status='SALE' then '판매중' when status='RESERVED' then '예약중' end
FROM USED_GOODS_BOARD
WHERE TO_CHAR(CREATED_DATE,'YYYY-MM-DD') = '2022-10-05'
ORDER BY board_id desc