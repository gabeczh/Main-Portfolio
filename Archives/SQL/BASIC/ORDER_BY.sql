SELECT * FROM tutorial.billboard_top_100_year_end

SELECT *
  FROM tutorial.billboard_top_100_year_end
 ORDER BY artist
 
 SELECT *
  FROM tutorial.billboard_top_100_year_end
 WHERE year = 2013
 ORDER BY year_rank
 
 SELECT *
  FROM tutorial.billboard_top_100_year_end
 WHERE year = 2013
 ORDER BY year_rank DESC
 
 SELECT *
 FROM tutorial.billboard_top_100_year_end
 WHERE year = 2012
 ORDER BY song_name DESC
 
 SELECT *
  FROM tutorial.billboard_top_100_year_end
  WHERE year_rank <= 3
 ORDER BY year DESC, year_rank
 
 SELECT *
  FROM tutorial.billboard_top_100_year_end
 WHERE year_rank <= 3
 ORDER BY year_rank, year DESC
 
 /* Doesnt work in every flavor of SQL
 SELECT *
  FROM tutorial.billboard_top_100_year_end
 WHERE year_rank <= 3
 ORDER BY 2, 1 DESC
 */
 
 SELECT *
 FROM tutorial.billboard_top_100_year_end
 WHERE year = 2010
 ORDER BY year_rank, artist
 
 SELECT *  --This comment won't affect the way the code runs
  FROM tutorial.billboard_top_100_year_end
 WHERE year = 2013
 
 /* Here's a comment so long and descriptive that
it could only fit on multiple lines. Fortunately,
it, too, will not affect how this code runs. */
SELECT *
  FROM tutorial.billboard_top_100_year_end
 WHERE year = 2013
 
 SELECT *
 FROM tutorial.billboard_top_100_year_end
 WHERE "group" ILIKE '%t-pain%'
 ORDER BY year_rank DESC
 
SELECT *
  FROM tutorial.billboard_top_100_year_end
 WHERE year IN (2013, 2003, 1993)  --Select the relevant years
   AND year_rank BETWEEN 10 AND 20  --Limit the rank to 10-20
 ORDER BY year, year_rank