
inherit dnf-bridge

PN = "perl-Crypt-DES"
PE = "0"
PV = "2.07"
PR = "40.el10"
PACKAGES = "perl-Crypt-DES"


URI_perl-Crypt-DES = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Crypt-DES-2.07-40.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Crypt-DES = " \
 perl-libs \
 perl-Carp \
 perl-vars \
 perl-DynaLoader \
 glibc \
 perl-Exporter \
"
