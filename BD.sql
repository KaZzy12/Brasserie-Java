CREATE TABLE Utilisateur
(Login varchar(20) not NULL constraint Utilisateur_Pk primary key,
Password varchar(20) not NULL,
Nom varchar(30) not NULL,
Prenom varchar(30) not NULL,
Fonction varchar(30) not NULL);
 
CREATE TABLE Fournisseur
(Nom varchar(20) not NULL constraint Fournisseur_Pk primary key,
Rue varchar(50) not NULL,
CodePostal numeric(4) not NULL,
Localite varchar(50) not NULL);
 
CREATE TABLE Produit
(Reference numeric(4) not NULL constraint Produit_Pk primary key,
Libelle varchar(30) not NULL,
PrixBase numeric(3,2) not NULL,
PrixVidange numeric(4,2),
TVA numeric(4) not NULL,
Reduction numeric(3,2),
DateFinReduc date,
PourcReduc numeric(4,2),
QteStock numeric(5));
 
CREATE TABLE CommandeFourn
(Numéro numeric(5) not NULL constraint CommandeFourn_Pk primary key,
DateCommande date not NULL,
Utilisateur varchar(20) not NULL,
Fournisseur varchar(20) not NULL,
Etat varchar(12) not NULL,
constraint CommandeFourn_FK_Utilisateur foreign key(Utilisateur) references Utilisateur,
constraint CommandeFourn_FK_Fournisseur foreign key(Fournisseur) references Fournisseur);
 
CREATE TABLE RetourVidange
(Fournisseur varchar(20) not NULL,
Produit numeric(4) not NULL,
Utilisateur varchar(20) not NULL,
DateRetour date not NULL,
Quantite numeric(4) not NULL,
constraint RetourVidange_Pk primary key (Fournisseur, Produit, Utilisateur),
constraint RetourVidange_FK_Utilisateur foreign key(Utilisateur) references Utilisateur,
constraint RetourVidange_FK_Produit foreign key(Produit) references Produit,
constraint RetourVidange_FK_Fournisseur foreign key(Fournisseur) references Fournisseur);
 
CREATE TABLE LigneProduit
(Produit numeric(4) not NULL,
CommandeFourn numeric(5) not NULL,
Quantite numeric(3) not NULL,
constraint LigneProduit_Pk primary key (CommandeFourn, Produit),
constraint LigneProduit_FK_Produit foreign key(Produit) references Produit,
constraint LigneProduit_FK_CommandeFourn foreign key(CommandeFourn) references CommandeFourn);

CREATE TABLE Evenement
(Nom varchar(50) not NULL constraint Evenement_Pk primary key,
Lieu varchar(50) not NULL,
Date date not NULL,
Thematique varchar(50) not NULL,
NbPersAttendues numeric(5));
