package org.cocktail.gfc.depense.metier.modele.dp

import org.cocktail.gfc.common.bean.montant.Montant
import javax.persistence.*

@Entity
@Table(name = "DEP_DP", schema = "GFC")
class DemandePaiement(
        @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
        @Column(name = "ID_DEP_DP")
        var id: Long?,

        @Column(name = "NUM_DP")
        var numero: String,

        @Column(name = "ID_DEP_FACTURE")
        var idFacture: Long,

        @Column(name = "MONTANT_FACTURE_TTC")
        var montantFactureTTC: Montant,

        @Column(name = "MONTANT_A_PAYER_TTC")
        var montantAPayerTTC: Montant,

        @Column(name = "LIBELLE")
        var libelle: String?,

        @Column(name = "MONTANT_RAPPROCHER_HT")
        var montantARapprocherHT: Montant,

        @Column(name = "FOU_A_PAYER")
        var idFournisseurAPayer: Long,

        @Column(name = "MONTANT_RETENUE_GARANTIE")
        var montantRetenueGarantie: Montant,

        @Column(name = "PERS_ID_CREATION")
        var idPrsCreateur: Long,

        @Column(name = "DATE_CREATION")
        var dateCreation: String
)


/*

ID_DEP_DP	NUMBER(38,0)	No
NUM_DP	VARCHAR2(20 BYTE)	No
ID_DEP_FACTURE	NUMBER(38,0)	No
FOU_ORDRE	NUMBER(38,0)	No
MONTANT_FACTURE_TTC	NUMBER(12,2)	No
MONTANT_A_PAYER_TTC	NUMBER(12,2)	No
LIBELLE	VARCHAR2(200 BYTE)	Yes
MONTANT_RAPPROCHER_HT	NUMBER(12,2)	No
FOU_A_PAYER	NUMBER(38,0)	No
MONTANT_RETENUE_GARANTIE	NUMBER(12,2)	Yes
PERS_ID_CREATION	NUMBER	No
DATE_CREATION	VARCHAR2(30 BYTE)	No
PERS_ID_MODIFICATION	NUMBER	Yes
DATE_MODIFICATION	VARCHAR2(30 BYTE)	Yes
EXE_ORDRE	NUMBER(4,0)	No
TYET_ID	NUMBER	No
MOD_ORDRE	NUMBER	No
MONTANT_FACTURE_HT	NUMBER(12,2)	No
MONTANT_FACTURE_TVA	NUMBER(12,2)	No
MONTANT_A_PAYER_TTC_APRES_RG	NUMBER(12,2)	No
DATE_ECHEANCE_THEORIQUE	VARCHAR2(30 BYTE)	No
PERS_ID_VALID_OU_REFUS_ORDO	NUMBER	Yes
DATE_VALID_OU_REFUS_ORDO	VARCHAR2(30 BYTE)	Yes
MOTIF_REFUS_ORDO	VARCHAR2(4000 BYTE)	Yes
PERS_ID_VISA_OU_REJET_COMPTAB	NUMBER	Yes
DATE_VISA_OU_REJET_COMPTAB	VARCHAR2(30 BYTE)	Yes
MOTIF_REJET_COMPTAB	VARCHAR2(4000 BYTE)	Yes
RIB_ORDRE_ORDO	NUMBER(38,0)	Yes
RIB_ORDRE_COMPTAB	NUMBER(38,0)	Yes
DATE_PAIEMENT	VARCHAR2(30 BYTE)	Yes
PAI_ORDRE	NUMBER	Yes
EN_ATTENTE	NUMBER(1,0)	No
DATE_EN_ATTENTE	VARCHAR2(30 BYTE)	Yes
OBJ_EN_ATTENTE	VARCHAR2(500 BYTE)	Yes
PERS_ID_EN_ATTENTE	NUMBER	Yes
DATE_ECHEANCE_MODIFIEE	VARCHAR2(30 BYTE)	No
MONTANT_RAPPROCHER_TTC	NUMBER(12,2)	No
LOCK_VERSION	NUMBER(38,0)	No
DATE_DESACTIVATION	VARCHAR2(30 BYTE)	Yes
PERS_ID_DESACTIVATION	NUMBER	Yes

 */