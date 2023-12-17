SELECT *
  FROM tutorial.billboard_top_100_year_end
 WHERE year = 2012 AND year_rank <= 10
 
 SELECT *
  FROM tutorial.billboard_top_100_year_end
 WHERE year = 2012
   AND year_rank <= 10
   AND "group" ILIKE '%feat%'
   
   SELECT *
  FROM tutorial.billboard_top_100_year_end
 WHERE year_rank <= 10
   AND "group" ILIKE '%ludacris%'
   
SELECT *
  FROM tutorial.billboard_top_100_year_end
 WHERE year_rank = 1
   AND year IN (1990, 2000, 2010)
   

SELECT *
FROM tutorial.billboard_top_100_year_end
WHERE year BETWEEN 1960 AND 1969
 AND song_name ILIKE '%love%'