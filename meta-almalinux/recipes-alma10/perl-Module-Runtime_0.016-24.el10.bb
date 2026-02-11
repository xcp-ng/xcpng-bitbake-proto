
PN = "perl-Module-Runtime"
PE = "0"
PV = "0.016"
PR = "24.el10"
PACKAGES = "perl-Module-Runtime perl-Module-Runtime-tests"


URI_perl-Module-Runtime = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Module-Runtime-0.016-24.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-Runtime = "
 perl-libs
"

URI_perl-Module-Runtime-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Module-Runtime-tests-0.016-24.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-Runtime-tests = "
 perl-Test-Harness
 perl-libs
 perl-Test-Simple
 perl-Module-Runtime
 bash
 perl-interpreter
"
