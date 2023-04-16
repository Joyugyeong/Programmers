-- 코드를 입력하세요
SELECT b.user_id, b.nickname, sum(a.price) as total_sales
from USED_GOODS_BOARD as a
inner join USED_GOODS_USER as b
on a.WRITER_ID = b.USER_ID
where a.status ='DONE'
group by user_id 
having total_sales>=700000
order by total_sales asc