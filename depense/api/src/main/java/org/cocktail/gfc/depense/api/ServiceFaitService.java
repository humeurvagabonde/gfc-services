package org.cocktail.gfc.depense.api;

public interface ServiceFaitService {
    
    Long creer(CreerSfCommand command);
    
    void mettreAJour(Long idDepSf, String reference, String commentaire, String dateSf, 
            Long persId, Long persOdModification, String lignesSf);

    void supprimer(Long idDepSf);
    
    void constater(Long idDepSf, Long persIdModification);
    
    void annulerConstatation(Long idDepSf, Long persIdModification);
    
    void certifier(Long idDepSf, Long persIdModification);
    
    void annulerCertification(Long idDepSf, Long persIdModification);
    
    /*
        PROCEDURE ins_repart_budget_lignesf (
          a_repartbudget_id IN OUT   DEP_REPART_BUDGET.ID_DEP_REPART_BUDGET%TYPE,
          a_sf_id                DEP_SF.ID_DEP_SF%TYPE,
          a_sfligne_id               DEP_REPART_BUDGET.ID_DEP_SF_LIGNE%TYPE,
          a_eb_id                    DEP_REPART_BUDGET.ID_ADM_EB%TYPE,
          a_nat_dep_id               DEP_REPART_BUDGET.ID_ADM_NATURE_DEP%TYPE,
          a_ope_id                   DEP_REPART_BUDGET.ID_OPE_OPERATION%TYPE,
          a_dest_dep_id              DEP_REPART_BUDGET.ID_ADM_DESTINATION_DEPENSE%TYPE,
          a_prorata_id               DEP_REPART_BUDGET.ID_ADM_TAUX_PRORATA%TYPE,
          a_mt_ht                    DEP_REPART_BUDGET.MONTANT_HT%TYPE,
          a_pco_num                  DEP_REPART_BUDGET.PCO_NUM%TYPE);

        PROCEDURE maj_repart_budget_lignesf (
          a_repartbudget_id IN OUT   DEP_REPART_BUDGET.ID_DEP_REPART_BUDGET%TYPE,
          a_sf_id                DEP_SF.ID_DEP_SF%TYPE,
          a_sfligne_id               DEP_REPART_BUDGET.ID_DEP_SF_LIGNE%TYPE,
          a_eb_id                    DEP_REPART_BUDGET.ID_ADM_EB%TYPE,
          a_nat_dep_id               DEP_REPART_BUDGET.ID_ADM_NATURE_DEP%TYPE,
          a_ope_id                   DEP_REPART_BUDGET.ID_OPE_OPERATION%TYPE,
          a_dest_dep_id              DEP_REPART_BUDGET.ID_ADM_DESTINATION_DEPENSE%TYPE,
          a_prorata_id               DEP_REPART_BUDGET.ID_ADM_TAUX_PRORATA%TYPE,
          a_mt_ht                    DEP_REPART_BUDGET.MONTANT_HT%TYPE,
          a_pco_num                  DEP_REPART_BUDGET.PCO_NUM%TYPE);

        PROCEDURE suppr_repart_budget_lignesf (
          a_repartbudget_id          DEP_REPART_BUDGET.ID_DEP_REPART_BUDGET%TYPE,
          a_sf_id                DEP_SF.ID_DEP_SF%TYPE);

        PROCEDURE suppr_all_reparts_budget_sf (
          a_sf_id                    DEP_SF.ID_DEP_SF%TYPE);

        PROCEDURE calc_total_repart_bud_lignesf (
          a_sfligne_id                 DEP_REPART_BUDGET.ID_DEP_SF_LIGNE%TYPE,
          a_montant_ht IN OUT          DEP_REPART_BUDGET.MONTANT_HT%TYPE,
          a_montant_ttc IN OUT         DEP_REPART_BUDGET.MONTANT_HT%TYPE,
          a_montant_budgetaire IN OUT  DEP_REPART_BUDGET.MONTANT_HT%TYPE);
          
    */
}
