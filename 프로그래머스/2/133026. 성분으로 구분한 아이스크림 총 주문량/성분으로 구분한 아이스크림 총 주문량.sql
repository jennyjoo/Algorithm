-- 코드를 입력하세요
SELECT i.INGREDIENT_TYPE, sum(f.total_order) as TOTAL_ORDER
FROM FIRST_HALF f
inner join ICECREAM_INFO i
on f.flavor = i.flavor
group by i.INGREDIENT_TYPE
