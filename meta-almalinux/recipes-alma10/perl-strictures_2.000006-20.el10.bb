
inherit dnf-bridge

PN = "perl-strictures"
PE = "0"
PV = "2.000006"
PR = "20.el10"
PACKAGES = "perl-strictures"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/perl-strictures-2.000006-20.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-strictures = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-strictures-2.000006-20.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-strictures}"
RDEPENDS:perl-strictures = " \
 perl-libs \
 perl-Carp \
"
