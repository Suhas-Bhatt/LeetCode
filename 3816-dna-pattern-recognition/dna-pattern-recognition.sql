# Write your MySQL query statement below
SELECT sample_id, dna_sequence, species,
    (CASE WHEN dna_sequence LIKE "ATG%" THEN 1 ELSE 0 END) AS  has_start ,
    (CASE WHEN regexp_like (dna_sequence,"TAA$|TAG$|TGA$") THEN 1 ELSE 0 END) AS  has_stop ,
    (CASE WHEN dna_sequence like "%ATAT%" THEN 1 ELSE 0 END) AS  has_atat ,
    (CASE WHEN dna_sequence like "%GGG%" THEN 1 ELSE 0 END) AS  has_ggg 
FROM Samples
GROUP BY sample_id