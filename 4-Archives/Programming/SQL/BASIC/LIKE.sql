/*
"" --works the same as ''
% --Wildcard
_ --Substitute
ILIKE --unlike LIKE it ignores case when matching values
*/

SELECT *
  FROM tutorial.billboard_top_100_year_end
 WHERE "group" LIKE 'Snoop%'
 
 SELECT *
  FROM tutorial.billboard_top_100_year_end
 WHERE "group" ILIKE 'snoop%'
 
 SELECT *
  FROM tutorial.billboard_top_100_year_end
 WHERE artist ILIKE 'dr_ke'
 
 SELECT *
 FROM tutorial.billboard_top_100_year_end
 WHERE "group" ILIKE '%Ludacris%'
 
SELECT *
 FROM tutorial.billboard_top_100_year_end
 WHERE "artist" LIKE 'DJ%'