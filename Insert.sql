/* UTILISATEURS  */

INSERT
into Utilisateur
VALUES ('MSeb','1','Lagnaule', 'Sebastian', 'Manager');

INSERT
into Utilisateur
VALUES ('GLo','1','Cheron','Loic','Gestionnaire de stock');

INSERT
into Utilisateur
VALUES ('CGhi','1','Muret','Ghislain','Comptable');

/* PRRODUITS */

INSERT
into Produits (Libelle, PrixBase, PrixVidange, TVA, Reduction, QteStock, QteMinStock)
Values ('Bac Jupiler 25',10,'4,5',21,false,10,5);

INSERT
into Produits (Libelle, PrixBase, TVA, Reduction, DateFinReduc, PourcReduc, QteStock, QteMinStock)
Values ('Kidibull fraise','5,5',21,true,date('05/08/2015'),12,50,10);


/* FOURNISSEURS */

INSERT
into Fournisseur
VALUES ('John Claude', 'Rue du poulet 24', 5310, 'Eghezee');

INSERT
into Fournisseur
VALUES ('Dupont', 'Rue du pont 42', 5000, 'Namur');

INSERT
into Fournisseur
VALUES ('Kevin', 'Rue des Bosquets', 6000, 'Charleroi');

/* EVENEMENTS */

INSERT
into Evenement
VALUES ('Fetes Wallonies','Namur', date('12/09/2015'),'Peket', 200000);

INSERT
into Evenement
VALUES ('Jeux Intervillages','Grand-Leez', date('29/06/2016'),'Jeux', 70000);

INSERT
into Evenement
VALUES ('Bal des bières','Namur', date('19/10/2015'),'Bières spéciales', 10000);
