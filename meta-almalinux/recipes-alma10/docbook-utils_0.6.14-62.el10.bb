
PN = "docbook-utils"
PE = "0"
PV = "0.6.14"
PR = "62.el10"
PACKAGES = "docbook-utils docbook-utils-pdf"


URI_docbook-utils = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/docbook-utils-0.6.14-62.el10.noarch.rpm;unpack=0"
RDEPENDS:docbook-utils = "perl(strict) ( ) /usr/bin/sh ( ) /usr/bin/perl ( ) perl(vars) ( ) docbook-dtds ( ) grep ( ) gawk ( ) perl(integer) ( ) text-www-browser ( ) which ( ) docbook-style-dsssl ( >=  1.72) perl(Getopt::Long) ( >=  2.01) perl-SGMLSpm ( >=  1.03ii)"
RPROVIDES:docbook-utils = "docbook-utils ( =  0.6.14-62.el10) stylesheets ( =  0.6.14-62.el10)"

URI_docbook-utils-pdf = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/docbook-utils-pdf-0.6.14-62.el10.noarch.rpm;unpack=0"
RDEPENDS:docbook-utils-pdf = "/usr/bin/sh ( ) texlive-collection-fontsrecommended ( ) tex(dvips) ( ) texlive-collection-htmlxml ( ) docbook-utils ( =  0.6.14) texlive-jadetex ( >=  7)"
RPROVIDES:docbook-utils-pdf = "docbook-utils-pdf ( =  0.6.14-62.el10) stylesheets-db2pdf ( =  0.6.14-62.el10)"
