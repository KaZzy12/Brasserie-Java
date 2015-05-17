CREATE or REPLACE VIEW RechDateCmd
		("Numero commande", "Date", "Nom Fournisseur", "Nom Gestionnaire", "Etat")
	as select c.Numero, c.DateCommande, f.Nom, u.Nom, c.ValidationManager
	from Fournisseur f, CommandeFourn c, Utilisateur u
	where f.Nom = c.NomFourn and u.Login = c.NomUser and  c.DateCommande = (?);
	
CREATE or REPLACE VIEW RechArtCmd
		("Numero commande", "Date", "Nom Fournisseur", "Nom Gestionnaire")
	as select c.Numero, c.DateCommande, f.Nom, u.Nom
	from CommandeFourn c, Fournisseur f, Utilisateur u, Produit p, LigneProduit l
	where l.RefProduit = p.Reference and c.Numero = l.NumCommande and f.Nom = c.NomFourn and u.Login = c.Utilisateur and p.Reference = (?);
	
CREATE or REPLACE VIEW RechFourn
		("Numero commande", "Date", "Nom Gestionnaire")
	as select c.Numero, c.DateCommande, u.Nom
	from CommandeFourn c, Fournisseur f, Utilisateur u
	where c.NomFourn = f.Nom and u.Login = c.Utilisateur and f.Nom = (?);
