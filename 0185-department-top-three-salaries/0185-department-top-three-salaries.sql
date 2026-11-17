# Write your MySQL query statement below

# using SubQueries + window function
SELECT
    d.name AS Department,
    ranked.Employee,
    ranked.Salary
FROM (
    SELECT
        e.name AS Employee,
        e.salary AS Salary,
        e.departmentId,
        DENSE_RANK() OVER (
            PARTITION BY e.departmentId
            ORDER BY e.salary DESC
        ) AS rnk
    FROM Employee AS e
) AS ranked
LEFT JOIN Department AS d
    ON ranked.departmentId = d.id
WHERE ranked.rnk <= 3;

# using CTE and Window function
-- with cte as (
--     select
--         d.name as Department,
--         e.name as Employee,
--         e.salary as Salary,
--         dense_rank() over(partition by e.departmentId order by salary desc) as rnk
--     from Employee as e
--     left join Department as d
--     on e.departmentId = d.id
-- )

-- select Department, Employee, Salary
-- from cte 
-- where rnk = 1 or rnk = 2 or rnk = 3;

