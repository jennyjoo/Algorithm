-- 코드를 작성해주세요
SELECT d1.id, count(d2.id) as 'CHILD_COUNT'
from ECOLI_DATA d1
left join ECOLI_DATA d2
on d1.id = d2.parent_id
group by d1.id
order by 1;