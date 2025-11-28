# Write your MySQL query statement below
SELECT DISTINCT S1.*
FROM Stadium S1 INNER JOIN Stadium S2 INNER JOIN Stadium S3
ON (S1.id=S2.id-1 AND S1.id=S3.id-2) OR
(S1.id=S2.id+1 AND S1.id=S3.id-1) OR 
(S1.id=S2.id+1 AND S1.id=S3.id+2)
WHERE S1.people >=100 AND S2.people>=100 AND S3.people>=100
ORDER BY visit_date ASC