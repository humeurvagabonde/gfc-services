package org.cocktail.gfc.depense.application.sf;

import org.cocktail.gfc.common.beans.immutable.ImmutableStyle;
import org.immutables.value.Value;

public interface ServiceFaitCommand {

    // immutables
    @Value.Immutable
    @ImmutableStyle
    public interface AbstractCreerSfCommand extends ServiceFaitCommand {
      @Value.Parameter      
      Long getExeOrdre();
      @Value.Parameter
      String getReference();
      @Value.Parameter
      String getCommentaire();
      @Value.Parameter
      String getDateSf();
      @Value.Parameter
      Long getPersId();
      @Value.Parameter
      String getNomApplication();
      @Value.Parameter
      String getLignesSf();
    }
    
    
}
