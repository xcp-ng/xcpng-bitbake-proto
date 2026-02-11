
inherit dnf-bridge

PN = "perl-Canary-Stability"
PE = "0"
PV = "2013"
PR = "20.el10"
PACKAGES = "perl-Canary-Stability perl-Canary-Stability-tests"


URI_perl-Canary-Stability = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Canary-Stability-2013-20.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Canary-Stability = " \
 perl-ExtUtils-MakeMaker \
 perl-libs \
"

URI_perl-Canary-Stability-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Canary-Stability-tests-2013-20.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Canary-Stability-tests = " \
 perl-interpreter \
 perl-Test-Harness \
 bash \
 perl-Canary-Stability \
"
