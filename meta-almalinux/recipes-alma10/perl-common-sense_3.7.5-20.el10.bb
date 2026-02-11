
inherit dnf-bridge

PN = "perl-common-sense"
PE = "0"
PV = "3.7.5"
PR = "20.el10"
PACKAGES = "perl-common-sense perl-common-sense-tests"


URI_perl-common-sense = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-common-sense-3.7.5-20.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-common-sense = " \
 perl-libs \
"

URI_perl-common-sense-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-common-sense-tests-3.7.5-20.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-common-sense-tests = " \
 perl-interpreter \
 perl-Test-Harness \
 bash \
 perl-common-sense \
"
