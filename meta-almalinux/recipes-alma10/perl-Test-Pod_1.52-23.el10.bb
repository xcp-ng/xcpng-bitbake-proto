
PN = "perl-Test-Pod"
PE = "0"
PV = "1.52"
PR = "23.el10"
PACKAGES = "perl-Test-Pod perl-Test-Pod-tests"


URI_perl-Test-Pod = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Test-Pod-1.52-23.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test-Pod = "
 perl-File-Find
 perl-libs
 perl-Pod-Simple
 perl-Test-Simple
"

URI_perl-Test-Pod-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Test-Pod-tests-1.52-23.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test-Pod-tests = "
 perl-Test-Harness
 perl-libs
 perl-Test-Simple
 bash
 perl-interpreter
 perl-Test-Pod
"
