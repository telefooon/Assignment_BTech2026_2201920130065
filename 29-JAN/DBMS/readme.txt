
Here is a README file explaining the SQL queries:

SQL Queries for Extracting City Names Based on Vowel Conditions
This document explains two SQL queries used to retrieve unique city names from the STATION table, based on whether they start or end with vowels.

Query 1: Cities Starting with a Vowel
sql
Copy
Edit
SELECT DISTINCT(city) AS list FROM station 
WHERE city LIKE 'a%' 
   OR city LIKE 'e%' 
   OR city LIKE 'i%' 
   OR city LIKE 'o%' 
   OR city LIKE 'u%';
Explanation:
This query selects distinct city names from the STATION table.
The LIKE operator is used to filter city names that start with vowels (a, e, i, o, u).
The DISTINCT keyword ensures that duplicate city names are not included in the output.
Example Output:
list
Ahmedabad
Orlando
Udaipur
Indore
Query 2: Cities Ending with a Vowel
sql
Copy
Edit
SELECT DISTINCT(city) AS list FROM station 
WHERE city LIKE '%a'
   OR city LIKE '%e'
   OR city LIKE '%i'
   OR city LIKE '%o'
   OR city LIKE '%u';
Explanation:
This query selects distinct city names that end with vowels.
The LIKE operator is used with a wildcard (%), ensuring that only names ending in a, e, i, o, u are retrieved.
The DISTINCT keyword removes duplicate city names.
Example Output:
list
Pune
Miami
Oslo
Kanpur