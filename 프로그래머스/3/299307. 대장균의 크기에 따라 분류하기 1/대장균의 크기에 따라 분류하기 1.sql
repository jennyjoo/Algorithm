-- 코드를 작성해주세요
select d.ID,
(case
    when d.size_of_colony <= 100 then 'LOW'
    when d.size_of_colony <= 1000 then 'MEDIUM'
    else 'HIGH'
END)
as SIZE
from ECOLI_DATA d
