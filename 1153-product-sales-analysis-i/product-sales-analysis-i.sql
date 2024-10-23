# Write your MySQL query statement below
SELECT product_name, year, price from Sales as S
Join Product as P
on P.product_id = S.product_id;