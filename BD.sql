/*drop table Evenement;
drop table Utilisateur;
drop table Fournisseur;
drop table Produit;
drop table CommandeFourn;
drop table RetourVidange;
drop table LigneProduit;*/

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
(Reference int not NULL constraint Produit_Pk primary key 
 GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),
Libelle varchar(30) not NULL,
PrixBase numeric(5,2) not NULL,
PrixVidange numeric(5,2),
TVA numeric(4) not NULL,
Reduction BOOLEAN not NULL,
DateFinReduc date,
PourcReduc numeric(5,2),
QteStock numeric(5) not NULL,
QteMinStock numeric(5) not NULL);
 
CREATE TABLE CommandeFourn
(Numéro int not NULL constraint CommandeFourn_Pk primary key
 GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),
DateCommande date not NULL,
Utilisateur varchar(20) not NULL,
Fournisseur varchar(20) not NULL,
Etat varchar(12) not NULL,
constraint CommandeFourn_FK_Utilisateur foreign key(Utilisateur) references Utilisateur,
constraint CommandeFourn_FK_Fournisseur foreign key(Fournisseur) references Fournisseur);
 
CREATE TABLE RetourVidange
(Fournisseur varchar(20) not NULL,
Produit int not NULL,
Utilisateur varchar(20) not NULL,
DateRetVid date not NULL,
Quantite numeric(4) not NULL,
constraint RetourVidange_Pk primary key (Fournisseur, Produit, Utilisateur),
constraint RetourVidange_FK_Utilisateur foreign key(Utilisateur) references Utilisateur,
constraint RetourVidange_FK_Produit foreign key(Produit) references Produit,
constraint RetourVidange_FK_Fournisseur foreign key(Fournisseur) references Fournisseur);
 
CREATE TABLE LigneProduit
(Produit int not NULL,
CommandeFourn int not NULL,
Quantite numeric(3) not NULL,
constraint LigneProduit_Pk primary key (CommandeFourn, Produit),
constraint LigneProduit_FK_Produit foreign key(Produit) references Produit,
constraint LigneProduit_FK_CommandeFourn foreign key(CommandeFourn) references CommandeFourn);

CREATE TABLE Evenement
(Nom varchar(50) not NULL constraint Evenement_Pk primary key,
Lieu varchar(50) not NULL,
DateEvenement date not NULL,
Thematique varchar(50) not NULL,
NbPersAttendues numeric(8));
