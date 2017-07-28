package org.cocktail.gfc.depense.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link ServiceFaitCommand.AbstractMajSfCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code MajSfCommand.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code MajSfCommand.of()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "ServiceFaitCommand.AbstractMajSfCommand"})
public final class MajSfCommand
    implements ServiceFaitCommand.AbstractMajSfCommand {
  private final Long exeOrdre;
  private final String reference;
  private final String commentaire;
  private final String dateSf;
  private final Long persId;
  private final String nomApplication;
  private final String lignesSf;

  private MajSfCommand(
      Long exeOrdre,
      String reference,
      String commentaire,
      String dateSf,
      Long persId,
      String nomApplication,
      String lignesSf) {
    this.exeOrdre = Objects.requireNonNull(exeOrdre, "exeOrdre");
    this.reference = Objects.requireNonNull(reference, "reference");
    this.commentaire = Objects.requireNonNull(commentaire, "commentaire");
    this.dateSf = Objects.requireNonNull(dateSf, "dateSf");
    this.persId = Objects.requireNonNull(persId, "persId");
    this.nomApplication = Objects.requireNonNull(nomApplication, "nomApplication");
    this.lignesSf = Objects.requireNonNull(lignesSf, "lignesSf");
  }

  private MajSfCommand(MajSfCommand.Builder builder) {
    this.exeOrdre = builder.exeOrdre;
    this.reference = builder.reference;
    this.commentaire = builder.commentaire;
    this.dateSf = builder.dateSf;
    this.persId = builder.persId;
    this.nomApplication = builder.nomApplication;
    this.lignesSf = builder.lignesSf;
  }

  /**
   * @return The value of the {@code exeOrdre} attribute
   */
  @Override
  public Long getExeOrdre() {
    return exeOrdre;
  }

  /**
   * @return The value of the {@code reference} attribute
   */
  @Override
  public String getReference() {
    return reference;
  }

  /**
   * @return The value of the {@code commentaire} attribute
   */
  @Override
  public String getCommentaire() {
    return commentaire;
  }

  /**
   * @return The value of the {@code dateSf} attribute
   */
  @Override
  public String getDateSf() {
    return dateSf;
  }

  /**
   * @return The value of the {@code persId} attribute
   */
  @Override
  public Long getPersId() {
    return persId;
  }

  /**
   * @return The value of the {@code nomApplication} attribute
   */
  @Override
  public String getNomApplication() {
    return nomApplication;
  }

  /**
   * @return The value of the {@code lignesSf} attribute
   */
  @Override
  public String getLignesSf() {
    return lignesSf;
  }

  /**
   * This instance is equal to all instances of {@code MajSfCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof MajSfCommand
        && equalTo((MajSfCommand) another);
  }

  private boolean equalTo(MajSfCommand another) {
    return exeOrdre.equals(another.exeOrdre)
        && reference.equals(another.reference)
        && commentaire.equals(another.commentaire)
        && dateSf.equals(another.dateSf)
        && persId.equals(another.persId)
        && nomApplication.equals(another.nomApplication)
        && lignesSf.equals(another.lignesSf);
  }

  /**
   * Computes a hash code from attributes: {@code exeOrdre}, {@code reference}, {@code commentaire}, {@code dateSf}, {@code persId}, {@code nomApplication}, {@code lignesSf}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + exeOrdre.hashCode();
    h += (h << 5) + reference.hashCode();
    h += (h << 5) + commentaire.hashCode();
    h += (h << 5) + dateSf.hashCode();
    h += (h << 5) + persId.hashCode();
    h += (h << 5) + nomApplication.hashCode();
    h += (h << 5) + lignesSf.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code MajSfCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "MajSfCommand{"
        + "exeOrdre=" + exeOrdre
        + ", reference=" + reference
        + ", commentaire=" + commentaire
        + ", dateSf=" + dateSf
        + ", persId=" + persId
        + ", nomApplication=" + nomApplication
        + ", lignesSf=" + lignesSf
        + "}";
  }

  /**
   * Construct a new immutable {@code MajSfCommand} instance.
   * @param exeOrdre The value for the {@code exeOrdre} attribute
   * @param reference The value for the {@code reference} attribute
   * @param commentaire The value for the {@code commentaire} attribute
   * @param dateSf The value for the {@code dateSf} attribute
   * @param persId The value for the {@code persId} attribute
   * @param nomApplication The value for the {@code nomApplication} attribute
   * @param lignesSf The value for the {@code lignesSf} attribute
   * @return An immutable MajSfCommand instance
   */
  public static MajSfCommand of(Long exeOrdre, String reference, String commentaire, String dateSf, Long persId, String nomApplication, String lignesSf) {
    return new MajSfCommand(exeOrdre, reference, commentaire, dateSf, persId, nomApplication, lignesSf);
  }

  /**
   * Creates a builder for {@link MajSfCommand MajSfCommand}.
   * @return A new MajSfCommand builder
   */
  public static MajSfCommand.Builder builder() {
    return new MajSfCommand.Builder();
  }

  /**
   * Builds instances of type {@link MajSfCommand MajSfCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_EXE_ORDRE = 0x1L;
    private static final long INIT_BIT_REFERENCE = 0x2L;
    private static final long INIT_BIT_COMMENTAIRE = 0x4L;
    private static final long INIT_BIT_DATE_SF = 0x8L;
    private static final long INIT_BIT_PERS_ID = 0x10L;
    private static final long INIT_BIT_NOM_APPLICATION = 0x20L;
    private static final long INIT_BIT_LIGNES_SF = 0x40L;
    private long initBits = 0x7fL;

    private Long exeOrdre;
    private String reference;
    private String commentaire;
    private String dateSf;
    private Long persId;
    private String nomApplication;
    private String lignesSf;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AbstractMajSfCommand} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ServiceFaitCommand.AbstractMajSfCommand instance) {
      Objects.requireNonNull(instance, "instance");
      exeOrdre(instance.getExeOrdre());
      reference(instance.getReference());
      commentaire(instance.getCommentaire());
      dateSf(instance.getDateSf());
      persId(instance.getPersId());
      nomApplication(instance.getNomApplication());
      lignesSf(instance.getLignesSf());
      return this;
    }

    /**
     * Initializes the value for the {@link ServiceFaitCommand.AbstractMajSfCommand#getExeOrdre() exeOrdre} attribute.
     * @param exeOrdre The value for exeOrdre 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder exeOrdre(Long exeOrdre) {
      this.exeOrdre = Objects.requireNonNull(exeOrdre, "exeOrdre");
      initBits &= ~INIT_BIT_EXE_ORDRE;
      return this;
    }

    /**
     * Initializes the value for the {@link ServiceFaitCommand.AbstractMajSfCommand#getReference() reference} attribute.
     * @param reference The value for reference 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder reference(String reference) {
      this.reference = Objects.requireNonNull(reference, "reference");
      initBits &= ~INIT_BIT_REFERENCE;
      return this;
    }

    /**
     * Initializes the value for the {@link ServiceFaitCommand.AbstractMajSfCommand#getCommentaire() commentaire} attribute.
     * @param commentaire The value for commentaire 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder commentaire(String commentaire) {
      this.commentaire = Objects.requireNonNull(commentaire, "commentaire");
      initBits &= ~INIT_BIT_COMMENTAIRE;
      return this;
    }

    /**
     * Initializes the value for the {@link ServiceFaitCommand.AbstractMajSfCommand#getDateSf() dateSf} attribute.
     * @param dateSf The value for dateSf 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder dateSf(String dateSf) {
      this.dateSf = Objects.requireNonNull(dateSf, "dateSf");
      initBits &= ~INIT_BIT_DATE_SF;
      return this;
    }

    /**
     * Initializes the value for the {@link ServiceFaitCommand.AbstractMajSfCommand#getPersId() persId} attribute.
     * @param persId The value for persId 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder persId(Long persId) {
      this.persId = Objects.requireNonNull(persId, "persId");
      initBits &= ~INIT_BIT_PERS_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link ServiceFaitCommand.AbstractMajSfCommand#getNomApplication() nomApplication} attribute.
     * @param nomApplication The value for nomApplication 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder nomApplication(String nomApplication) {
      this.nomApplication = Objects.requireNonNull(nomApplication, "nomApplication");
      initBits &= ~INIT_BIT_NOM_APPLICATION;
      return this;
    }

    /**
     * Initializes the value for the {@link ServiceFaitCommand.AbstractMajSfCommand#getLignesSf() lignesSf} attribute.
     * @param lignesSf The value for lignesSf 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder lignesSf(String lignesSf) {
      this.lignesSf = Objects.requireNonNull(lignesSf, "lignesSf");
      initBits &= ~INIT_BIT_LIGNES_SF;
      return this;
    }

    /**
     * Builds a new {@link MajSfCommand MajSfCommand}.
     * @return An immutable instance of MajSfCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MajSfCommand build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new MajSfCommand(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_EXE_ORDRE) != 0) attributes.add("exeOrdre");
      if ((initBits & INIT_BIT_REFERENCE) != 0) attributes.add("reference");
      if ((initBits & INIT_BIT_COMMENTAIRE) != 0) attributes.add("commentaire");
      if ((initBits & INIT_BIT_DATE_SF) != 0) attributes.add("dateSf");
      if ((initBits & INIT_BIT_PERS_ID) != 0) attributes.add("persId");
      if ((initBits & INIT_BIT_NOM_APPLICATION) != 0) attributes.add("nomApplication");
      if ((initBits & INIT_BIT_LIGNES_SF) != 0) attributes.add("lignesSf");
      return "Cannot build MajSfCommand, some of required attributes are not set " + attributes;
    }
  }
}
