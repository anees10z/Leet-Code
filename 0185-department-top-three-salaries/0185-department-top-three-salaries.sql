# Write your MySQL query statement below

with cte as (
    select
        d.name as Department,
        e.name as Employee,
        e.salary as Salary,
        dense_rank() over(partition by e.departmentId order by salary desc) as rnk
    from Employee as e
    left join Department as d
    on e.departmentId = d.id
)

select Department, Employee, Salary
from cte 
where rnk = 1 or rnk = 2 or rnk = 3;