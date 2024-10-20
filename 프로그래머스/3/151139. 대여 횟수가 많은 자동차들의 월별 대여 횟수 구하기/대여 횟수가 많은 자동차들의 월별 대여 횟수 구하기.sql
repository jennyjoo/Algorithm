-- 코드를 입력하세요
SELECT month(START_DATE) AS MONTH, CAR_ID, count(CAR_ID) AS RECORDS
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY h
WHERE month(START_DATE) BETWEEN 8 AND 10 AND
      CAR_ID IN (
          SELECT CAR_ID
          FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
          WHERE MONTH(START_DATE) BETWEEN 8 AND 10
          GROUP BY CAR_ID
          HAVING COUNT(CAR_ID) >= 5
      )
GROUP BY month(START_DATE), CAR_ID
ORDER BY month(START_DATE) ASC, CAR_ID DESC;