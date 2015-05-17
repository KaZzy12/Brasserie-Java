CREATE or replace VIEW RechDateCmd
		("Date", "Numero Commande", "Nom Fournisseur", "Nom Gestionnaire", "Etat")
	as select c.Numero, f.Nom, u.Nom, c.ValidationCommande, c.ValidationManager
	from Fournisseur f, CommandeFourn c, Utilisateur u
	where f.Nom = c.NomFourn and u.Nom = c.NomUser and  c.DateCommande = (?);
