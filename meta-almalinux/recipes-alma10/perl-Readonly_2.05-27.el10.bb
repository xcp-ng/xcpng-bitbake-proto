
PN = "perl-Readonly"
PE = "0"
PV = "2.05"
PR = "27.el10"
PACKAGES = "perl-Readonly perl-Readonly-tests"


URI_perl-Readonly = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Readonly-2.05-27.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Readonly = "
 perl-libs
 perl-Carp
 perl-vars
 perl-Storable
 perl-Exporter
"

URI_perl-Readonly-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Readonly-tests-2.05-27.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Readonly-tests = "
 perl-Test-Harness
 perl-libs
 perl-Test-Simple
 perl-vars
 perl-Readonly
 bash
 perl-interpreter
 perl-lib
"
