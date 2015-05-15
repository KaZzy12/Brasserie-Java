CREATE TABLE Utilisateur
(Login varchar2(20) not NULL constraint Utilisateur_Pk primary key,
Password varchar(20) not NULL,
Nom varchar2(30) not NULL,
Prenom varchar2(30) not NULL,
Fonction varchar2(30) not NULL);
 
CREATE TABLE Fournisseur
(Nom varchar2(20) not NULL constraint Fournisseur_Pk primary key,
Rue varchar2(50) not NULL,
CodePostal number(4) not NULL,
Localite varchar1(50) not NULL);
 
CREATE TABLE Produit
(Reference number(4) not NULL constraint Produit_Pk primary key,
Libelle varchar2(30) not NULL,
PrixBase number(3,2) not NULL,
PrixVidange number(4,2),
TVA number(4) not NULL,
Reduction number(3,2),
DateFinReduc date,
PourcReduc number(4,2),
QteStock number(5));
 
CREATE TABLE CommandeFourn
(Numéro number(5) not NULL constraint CommandeFourn_Pk primary key,
DateCommande date not NULL,
Utilisateur varchar2(20) not NULL constraint Utilisateur_FK foreign key,
Fournisseur varchar2(20) not NULL,
constraint CommandeFourn_FK_Utilisateur foreign key(Utilisateur) references Utilisateur,
constraint CommandeFourn_FK_Fournisseur foreign key(Fournisseur) references Fournisseur);
 
CREATE TABLE RetourVidange
(Fournisseur varchar2(20) not NULL,
Produit number(4) not NULL,
Utilisateur varchar2(20) not NULL,
DateRetour date not NULL,
Quantite number(4) not NULL,
constraint RetourVidange_FK_Utilisateur foreign key(Utilisateur) references Utilisateur,
constraint RetourVidange_FK_Produit foreign key(Produit) references Produit,
constraint RetourVidange_FK_Fournisseur foreign key(Fournisseur) references Fournisseur);
 
CREATE TABLE LigneProduit
(Produit number(4) not NULL,
CommandeFourn number(5) not NULL,
Quantite number(3) not NULL,
constraint LigneProduit_FK_Produit foreign key(Produit) references Produit,
constraint LigneProduit_FK_CommandeFourn foreign key(CommandeFourn) references CommandeFourn);

CREATE TABLE Evenement
(Nom varchar2(50) not NULL constraint Evenement_Pk primary key,
Lieu varchar2(50) not NULL,
Date date not NULL,
Thematique varchar2(50) not NULL,
NbPersAttendues number(5));
