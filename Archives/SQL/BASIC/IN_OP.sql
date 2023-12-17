SELECT *
  FROM tutorial.billboard_top_100_year_end
 WHERE year_rank IN (1, 2, 3)
 
 SELECT *
  FROM tutorial.billboard_top_100_year_end
 WHERE artist IN ('Taylor Swift', 'Usher', 'Ludacris')
 
 SELECT *
 FROM tutorial.billboard_top_100_year_end
 WHERE "group" IN ('M.C. Hammer', 'Hammer', 'Elvis Presley')