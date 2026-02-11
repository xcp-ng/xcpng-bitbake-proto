
PN = "perl-Pod-Coverage"
PE = "0"
PV = "0.23"
PR = "36.el10"
PACKAGES = "perl-Pod-Coverage perl-Pod-Coverage-tests"


URI_perl-Pod-Coverage = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Pod-Coverage-0.23-36.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Pod-Coverage = "
 perl-constant
 perl-libs
 perl-vars
 perl-Pod-Coverage
 perl-Pod-Parser
 perl-Devel-Symdump
 perl-B
 perl-interpreter
 perl-base
"

URI_perl-Pod-Coverage-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Pod-Coverage-tests-0.23-36.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Pod-Coverage-tests = "
 perl-Test-Harness
 perl-libs
 perl-Test-Simple
 perl-vars
 perl-Pod-Coverage
 bash
 perl-base
 perl-interpreter
 perl-Exporter
 perl-lib
"
