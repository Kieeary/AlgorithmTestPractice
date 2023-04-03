-- 코드를 입력하세요
SELECT car_id, ROUND(AVG((end_date - start_date) + 1),1) as AVERAGE_DURATION 
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
GROUP BY car_id
HAVING AVG(end_date - start_date + 1) >= 7.0
ORDER BY AVERAGE_DURATION desc, car_id desc