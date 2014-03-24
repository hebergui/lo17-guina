#!/usr/bin/perl

use Unicode::String qw(utf8 latin1);

# sp�cifie le format par d�faut des cha�nes en entr�e
Unicode::String->stringify_as('utf8');

while(<>) {

  # convertir la ligne DOCTYPE .. UTF-8 en DOCTYPE .. iso8859-1
  # pour que le document converti puisse toujours
  # �tre affich� correctement par un navigateur
  (/DOCTYPE HTML/) && (s/[Uu][Tt][Ff]\-8/iso8859-1/);

  # instancier la cha�ne en objet au format "neutre"
  $u = Unicode::String->new($_);

  # rendre la cha�ne sous un format iso8859-1
  print $u->latin1;

}

