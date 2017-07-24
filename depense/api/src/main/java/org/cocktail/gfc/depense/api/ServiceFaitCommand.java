package org.cocktail.gfc.depense.api;

import org.cocktail.gfc.common.configuration.internal.immutable.ImmutableStyle;
import org.immutables.value.Value;

public interface ServiceFaitCommand {

    @Value.Immutable
    @ImmutableStyle
    public interface AbstractCreerSfCommand extends ServiceFaitCommand {
      @Value.Parameter
      Long getEjId();
      @Value.Parameter      
      Integer getExeOrdre();
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
    
    @Value.Immutable
    @ImmutableStyle
    public interface AbstractMajSfCommand extends ServiceFaitCommand {
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
