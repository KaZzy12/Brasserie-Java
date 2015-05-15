CREATE VIEW RechDateCmd
		("Date", "Numero Commande", "Nom Fournisseur", "Nom Gestionnaire", "Etat")
	as select c.Numero, f.Nom, u.Nom, c.ValidationCommande
	from Fournisseur f join CommandeFourn c
		on (f.Nom = c.NomFourn)
		
	where c.DateCommande = (?);
