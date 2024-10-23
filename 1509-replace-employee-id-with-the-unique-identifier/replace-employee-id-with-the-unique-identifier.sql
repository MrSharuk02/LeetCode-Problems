# Write your MySQL query statement below
SELECT unique_id, name from Employees as e
Left Join EmployeeUNI as euni
on e.id = euni.id;