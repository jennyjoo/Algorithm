-- 코드를 작성해주세요
select count(*) as 'FISH_COUNT'
from fish_info i
inner join FISH_NAME_INFO n
on i.fish_type = n.fish_type
where n.fish_name = 'BASS' or n.fish_name = 'SNAPPER'
