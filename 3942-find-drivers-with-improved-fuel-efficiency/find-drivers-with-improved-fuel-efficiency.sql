# Write your MySQL query statement below
-- Write your PostgreSQL query statement below
WITH main_process AS (
	SELECT t.driver_id, d.driver_name, round( AVG(t.distance_km / t.fuel_consumed ), 2) first_half_avg,
	round( AVG(t1.distance_km / t1.fuel_consumed ) , 2) second_half_avg,
	round( AVG(t1.distance_km / t1.fuel_consumed) - AVG(t.distance_km / t.fuel_consumed), 2) efficiency_improvement
	FROM trips t INNER JOIN trips t1 ON t.driver_id = t1.driver_id 
		INNER JOIN drivers d ON t.driver_id = d.driver_id
		AND EXTRACT(MONTH FROM t.trip_date) BETWEEN 1 AND 6
		AND EXTRACT(MONTH FROM t1.trip_date) BETWEEN 7 AND 12
	GROUP BY t.driver_id, d.driver_name
	ORDER BY efficiency_improvement DESC, d.driver_name
)
SELECT * FROM main_process WHERE efficiency_improvement > 0