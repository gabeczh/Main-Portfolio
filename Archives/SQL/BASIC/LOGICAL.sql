/*
LIKE --matches similar values
IN --specifies a list of values to be included
BETWEEN --selects rows in a range
IS NULL --selects rows with no data in a column
AND --selects rows that satisfies two conditions
OR --selects rows that satisfies either conditions
NOT --selects rows that do not match a certain condition
*/

SELECT * FROM tutorial.billboard_top_100_year_end

SELECT *
  FROM tutorial.billboard_top_100_year_end
 ORDER BY year DESC, year_rank