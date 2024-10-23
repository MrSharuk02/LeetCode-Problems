# Write your MySQL query statement below
SELECT euni.unique_id as unique_id, e.name as name from Employees as e
Left Join EmployeeUNI as euni
on e.id = euni.id;