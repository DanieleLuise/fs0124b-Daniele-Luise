SELECT * FROM "Esercizio"."Fornitori"
ORDER BY "NumeroFornitore" ASC ;

SELECT "NumeroFattura","Importo","Iva","DataFattura",
"Fornitori"."Denominazione"
FROM
"Esercizio"."Fatture"
INNER JOIN
"Esercizio"."Fornitori"
"Fatture"."NumeroFornitore" = "Fornitori"."NumeroFornitore";
