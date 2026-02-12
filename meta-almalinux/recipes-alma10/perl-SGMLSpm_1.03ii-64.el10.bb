
inherit dnf-bridge

PN = "perl-SGMLSpm"
PE = "0"
PV = "1.03ii"
PR = "64.el10"
PACKAGES = "perl-SGMLSpm"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/perl-SGMLSpm-1.03ii-64.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-SGMLSpm = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-SGMLSpm-1.03ii-64.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-SGMLSpm}"
RDEPENDS:perl-SGMLSpm = " \
 perl-libs \
 perl-Carp \
 perl-interpreter \
 openjade \
 perl-Exporter \
"
