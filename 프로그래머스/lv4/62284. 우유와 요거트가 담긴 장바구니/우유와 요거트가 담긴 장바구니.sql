-- -- 코드를 입력하세요

-- SELECT cart_id FROM CART_PRODUCTS
-- WHERE name = 'Yogurt'
-- UNION
-- SELECT cart_id FROM CART_PRODUCTS
-- WHERE name = 'Milk'
-- ORDER BY cart_id

SELECT cart_id FROM CART_PRODUCTS
WHERE name = 'Milk' 
AND cart_id IN (SELECT cart_id FROM CART_PRODUCTS
WHERE name = 'Yogurt')