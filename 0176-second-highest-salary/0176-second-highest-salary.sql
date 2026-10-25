# Write your MySQL query statement below
SELECT(
SELECT salary  
FROM
(SELECT *, DENSE_RANK() OVER(ORDER BY salary DESC) AS rnk FROM Employee)
AS A WHERE rnk=2 LIMIT 1
)AS SecondHighestSalary;

-- WITH CTE as (SELECT salary, DENSE_RANK() OVER(ORDER BY salary DESC) AS rnk FROM Employee)
-- SELECT(
-- SELECT salary FROM CTE WHERE rnk=2 LIMIT 1
-- )AS SecondHighestSalary;

-- SELECT(
--     SELECT DISTINCT salary 
--     FROM Employee
--     ORDER BY salary DESC
--     LIMIT 1,1
-- ) AS SecondHighestSalary;