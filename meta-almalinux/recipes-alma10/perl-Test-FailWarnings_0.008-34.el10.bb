
inherit dnf-bridge

PN = "perl-Test-FailWarnings"
PE = "0"
PV = "0.008"
PR = "34.el10"
PACKAGES = "perl-Test-FailWarnings"


URI_perl-Test-FailWarnings = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Test-FailWarnings-0.008-34.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test-FailWarnings = " \
 perl-PathTools \
 perl-libs \
 perl-Test-Simple \
 perl-Carp \
"
