
inherit dnf-bridge

PN = "perl-ExtUtils-CChecker"
PE = "0"
PV = "0.11"
PR = "10.el10"
PACKAGES = "perl-ExtUtils-CChecker"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/perl-ExtUtils-CChecker-0.11-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-ExtUtils-CChecker = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-ExtUtils-CChecker-0.11-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-ExtUtils-CChecker}"
RDEPENDS:perl-ExtUtils-CChecker = " \
 perl-Module-Build \
 perl-libs \
 perl-Carp \
 perl-ExtUtils-CBuilder \
"
