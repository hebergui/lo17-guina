#!/usr/bin/perl
#****************************************************************************************#
#*                			LO17 - tronc.pl					*#
#*											*#
#* date   : 28/09/2013									*#
#*											*#
#* Ce script permet de g�n�rer la liste des successeurs pour chaque lettre des		*#
#* mots d�une liste de mots.								*#
#* Le corpus doit avoir �t� pr�alablement tri� et sans doublon (sort -u nom_fichier)	*#
#*											*#
#****************************************************************************************#

#$t1 = time;

@mots=<>;							# Lecture des mots du corpus
$size = @mots;							# Nombre de mots du corpus
$begin_mot = 0;							# initialisation de l'index de d�but des mots du corpus � analyser
foreach $m (@mots)						# Pour chaque mots du corpus (= mot analys�)
{								#
	$m =~ s/\n/ /;						# Remplacement du retour chariot par un espace
	$m =~ tr/A-Z/a-z/;					# normalisation en minuscules
	@lettre=split(//,$m);					# Extraction des lettres du mot dans une table
	$rac="";						# Initialisation de la racine du mot � vide (racine = lecture du mot jusqu'� une certaine lettre)
	$begin=$begin_mot;					# Initialisation de l'index de d�but des mots du corpus qui seront compar�s au mot analys�
	$find=0;						# Initialisation du bool�en qui permettra de savoir qu'un premier mot avec un successeur diff�rent a �t� trouv�
	foreach (@lettre)					# Pour chaque lettre du mot analys� (= lettre courante)
	{							#
	unless($_ eq ' ') {					# � moins qu'on ait lu toutes les lettres
		$rac=$rac.$_;					# Ajout de la lettre courante � la racine du mot
		%nb_succ=();					# Initialisation d'un tableau associatif qui contiendra les lettres successeurs (cl�)
		$nb_succ=0;					# Initialisation de la variable qui contiendra le nombre de successeurs d'une lettre
		$i=$begin;					# Initialisation de la recherche � l'index du premier mot du corpus � comparer au mot � analyser
		while (($i<$size) && ($nb_succ<9))		# Pour chaque mots du corpus (� partir de begin)
		{						#	
			$elt = @mots[$i];			# mot du corpus � comparer = mot courant
			$elt =~ s/\n/ /;			#
			$elt =~ tr/A-Z/a-z/;			# normalisation en minuscules
			if ($elt =~ /^$rac(.)/)			# Si le mot courant lu jusqu'� la lettre courante est identique au mot analys� lu jusqu'� la lettre courante
			{					#
				 if (!exists($nb_succ{$1}))	# Si une lettre successeur diff�rente de la lettre courante du mot courant n'a pas encore �t� rencontr�e
				{				#
					$nb_succ{$1}++;		# cr�ation d'une cl� = lettre successeur de la lettre courante et d'une valeur associ�e
					@nb_succ = keys(%nb_succ); # tableau des diff�rentes lettres successeurs de la lettre courante
					$nb_succ =@nb_succ;	# nombre de cl�s (= le nombre de lettres successeurs diff�rentes trouv�es)
					if ($nb_succ == 1)	# si c'est la premi�re lettre successeur trouv�e
					{			#
						if ($find == 0) # si c'est la premi�re fois qu'on trouve cette lettre successeur de la lettre courante
						{		*
							$begin_mot=$i; # ce sera n�cessairement le prochain mot du corpus � analyser qui servira � initialiser le $begin correspondant
							 $find++;	# et on bloque cet indice pour la prochaine analyse
						}		#
						$begin=$i;	# on incr�ments l'indice du prochain mot courant � analyser
					}			#
				}				#
			}					#
			elsif ($nb_succ >=1)		# Sinon (le mot courant lu jusqu'� la lettre courante) si on avait d�j� trouv� au moins une lettre successeur diff�rente
			{					#
				$i = $size;			# inutile de continuer � chercher dans la liste
			}					#
			$i++;					# incr�mentation du compteur du while sur la liste des mots
		}						#
		@nb_succ = keys(%nb_succ);			# on met � jour la table des cl�s de %nb_succ
		$nb_succ = @nb_succ;				# juste pour compter le nombre de cl�s (= le nombre de lettres successeurs diff�rentes trouv�es)
		print ("$nb_succ");				# on imprime le nombre de successeurs de la lettre courante du mot analys�
	}							# fin du unless : inutile de continuer � explorer la liste
	}							#
	print "0\t$m\n";					# on imprime le mot pr�c�d� d'un nombre de successeurs = 0 qui marque la fin des successeurs du mot
}								#

# $t2 = time;
# print "R�sultat retourn� en ".($t2-$t1)." s\n";
