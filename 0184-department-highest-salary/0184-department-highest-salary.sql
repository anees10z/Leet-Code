# Write your MySQL query statement below

WITH highest as(
    select d.name as Department,
    e.name as Employee,
    e.salary as Salary,
    DENSE_RANK() OVER(PARTITION BY e.departmentId Order by salary desc)
    as rnk
    from Employee as e 
    INNER JOIN 
    Department as d
    on e.departmentId = d.id
)

select Department, Employee, Salary from highest where rnk = 1;