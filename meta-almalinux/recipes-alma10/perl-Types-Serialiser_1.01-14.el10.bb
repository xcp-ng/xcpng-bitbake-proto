
inherit dnf-bridge

PN = "perl-Types-Serialiser"
PE = "0"
PV = "1.01"
PR = "14.el10"
PACKAGES = "perl-Types-Serialiser perl-Types-Serialiser-tests"


URI_perl-Types-Serialiser = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Types-Serialiser-1.01-14.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Types-Serialiser = " \
 perl-libs \
 perl-Carp \
 perl-Types-Serialiser \
 perl-common-sense \
 perl-overload \
"

URI_perl-Types-Serialiser-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Types-Serialiser-tests-1.01-14.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Types-Serialiser-tests = " \
 perl-Types-Serialiser \
 perl-interpreter \
 perl-Test-Harness \
 bash \
"
