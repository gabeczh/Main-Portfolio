SELECT *
  FROM tutorial.billboard_top_100_year_end
 WHERE year = 2013
   AND year_rank NOT BETWEEN 2 AND 3
   
/*  Nonsense
SELECT *
  FROM tutorial.billboard_top_100_year_end
 WHERE year = 2013
   AND year_rank NOT > 3
   */
   
   SELECT *
  FROM tutorial.billboard_top_100_year_end
 WHERE year = 2013
   AND year_rank <= 3
   
   SELECT *
  FROM tutorial.billboard_top_100_year_end
 WHERE year = 2013
   AND "group" NOT ILIKE '%macklemore%'
   
   SELECT *
  FROM tutorial.billboard_top_100_year_end
 WHERE year = 2013
   AND artist IS NOT NULL
   
   SELECT *
   FROM tutorial.billboard_top_100_year_end
   WHERE year = 2013
   AND song_name NOT ILIKE '%a%'