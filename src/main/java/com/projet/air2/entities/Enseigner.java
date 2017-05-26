package com.projet.air2.entities;

// Generated 1 f�vr. 2017 02:18:12 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Enseigner generated by hbm2java
 */
@Entity
@Table(name = "enseigner", catalog = "projetair")
public class Enseigner implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EnseignerId id;
	private Cours cours;
	private Moniteur moniteur;
	private Eleve eleve;
	private Boolean etatMoniteur;
	private Boolean etatEtudiant;

	public Enseigner() {
	}

	public Enseigner(EnseignerId id, Cours cours, Moniteur moniteur, Eleve eleve) {
		this.id = id;
		this.cours = cours;
		this.moniteur = moniteur;
		this.eleve = eleve;
	}

	public Enseigner(EnseignerId id, Cours cours, Moniteur moniteur,
			Eleve eleve, Boolean etatMoniteur, Boolean etatEtudiant) {
		this.id = id;
		this.cours = cours;
		this.moniteur = moniteur;
		this.eleve = eleve;
		this.etatMoniteur = etatMoniteur;
		this.etatEtudiant = etatEtudiant;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idmoniteur", column = @Column(name = "IDMONITEUR", nullable = false)),
			@AttributeOverride(name = "ideleve", column = @Column(name = "IDELEVE", nullable = false)),
			@AttributeOverride(name = "idcours", column = @Column(name = "IDCOURS", nullable = false)) })
	public EnseignerId getId() {
		return this.id;
	}

	public void setId(EnseignerId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDCOURS", nullable = false, insertable = false, updatable = false)
	public Cours getCours() {
		return this.cours;
	}

	public void setCours(Cours cours) {
		this.cours = cours;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDMONITEUR", nullable = false, insertable = false, updatable = false)
	public Moniteur getMoniteur() {
		return this.moniteur;
	}

	public void setMoniteur(Moniteur moniteur) {
		this.moniteur = moniteur;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDELEVE", nullable = false, insertable = false, updatable = false)
	public Eleve getEleve() {
		return this.eleve;
	}

	public void setEleve(Eleve eleve) {
		this.eleve = eleve;
	}

	@Column(name = "ETAT_MONITEUR")
	public Boolean getEtatMoniteur() {
		return this.etatMoniteur;
	}

	public void setEtatMoniteur(Boolean etatMoniteur) {
		this.etatMoniteur = etatMoniteur;
	}

	@Column(name = "ETAT_ETUDIANT")
	public Boolean getEtatEtudiant() {
		return this.etatEtudiant;
	}

	public void setEtatEtudiant(Boolean etatEtudiant) {
		this.etatEtudiant = etatEtudiant;
	}

}
