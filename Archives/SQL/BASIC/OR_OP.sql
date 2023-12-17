SELECT *
  FROM tutorial.billboard_top_100_year_end
 WHERE year_rank = 5 OR artist = 'Gotye'
 
 SELECT *
  FROM tutorial.billboard_top_100_year_end
 WHERE year = 2013
   AND ("group" ILIKE '%macklemore%' OR "group" ILIKE '%timberlake%')
   

SELECT *
FROM tutorial.billboard_top_100_year_end
WHERE year_rank <= 10
AND ("group" ILIKE '%katy perry%' OR "group" ILIKE '%bon jovi%')

SELECT *
FROM tutorial.billboard_top_100_year_end
WHERE song_name LIKE '%California%'
AND (year BETWEEN 1970 AND 1979 OR year BETWEEN 1990 AND 1999)

SELECT *
FROM tutorial.billboard_top_100_year_end
WHERE "group" ILIKE '%dr. dre%'
AND (year <= 2000 OR year >= 2010)