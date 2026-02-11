
inherit dnf-bridge

PN = "perl-Text-WrapI18N"
PE = "0"
PV = "0.06"
PR = "51.el10"
PACKAGES = "perl-Text-WrapI18N"


URI_perl-Text-WrapI18N = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Text-WrapI18N-0.06-51.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Text-WrapI18N = " \
 perl-Text-CharWidth \
 perl-Exporter \
 perl-libs \
 perl-vars \
"
