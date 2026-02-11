
inherit dnf-bridge

PN = "perl-Test-Pod-Coverage"
PE = "0"
PV = "1.10"
PR = "32.el10"
PACKAGES = "perl-Test-Pod-Coverage perl-Test-Pod-Coverage-tests"


URI_perl-Test-Pod-Coverage = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Test-Pod-Coverage-1.10-32.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test-Pod-Coverage = " \
 perl-Pod-Coverage \
 perl-libs \
 perl-Test-Simple \
"

URI_perl-Test-Pod-Coverage-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Test-Pod-Coverage-tests-1.10-32.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test-Pod-Coverage-tests = " \
 perl-Test-Pod-Coverage \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 bash \
 perl-interpreter \
 perl-base \
 perl-lib \
"
