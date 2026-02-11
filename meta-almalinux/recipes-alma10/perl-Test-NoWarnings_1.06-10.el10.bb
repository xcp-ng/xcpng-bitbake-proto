
PN = "perl-Test-NoWarnings"
PE = "0"
PV = "1.06"
PR = "10.el10"
PACKAGES = "perl-Test-NoWarnings perl-Test-NoWarnings-tests"


URI_perl-Test-NoWarnings = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Test-NoWarnings-1.06-10.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test-NoWarnings = "
 perl-libs
 perl-Test-Simple
 perl-Carp
 perl-Exporter
 perl-Test-NoWarnings
"

URI_perl-Test-NoWarnings-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Test-NoWarnings-tests-1.06-10.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test-NoWarnings-tests = "
 perl-Test-Harness
 perl-libs
 perl-Test-Simple
 bash
 perl-interpreter
 perl-Test-NoWarnings
"
