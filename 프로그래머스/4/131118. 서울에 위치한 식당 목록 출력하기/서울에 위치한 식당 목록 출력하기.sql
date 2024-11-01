# -- 코드를 입력하세요
# SELECT 
#     i.REST_ID, i.REST_NAME, i.FOOD_TYPE, 
#     sum(i.favorites) as 'FAVORITES', 
#     i.ADDRESS, 
#     round(avg(r.review_score), 2) as SCORE
# from REST_INFO i
# inner join REST_REVIEW r
# on i.rest_id = r.rest_id
# where r.REVIEW_TEXT is not NULL
# group by r.rest_id
# having i.address like '서울%'
# order by round(avg(r.review_score), 2) desc, favorites desc


SELECT A.REST_ID    
        ,A.REST_NAME    
        ,A.FOOD_TYPE    
        ,A.FAVORITES    
        ,A.ADDRESS  
        ,ROUND(AVG(B.REVIEW_SCORE),2) AS SCORE
FROM REST_INFO A
INNER JOIN REST_REVIEW B ON A.REST_ID = B.REST_ID
WHERE A.ADDRESS LIKE '서울%'
GROUP BY A.REST_ID
ORDER BY ROUND(AVG(B.REVIEW_SCORE),2)  DESC,A.FAVORITES DESC