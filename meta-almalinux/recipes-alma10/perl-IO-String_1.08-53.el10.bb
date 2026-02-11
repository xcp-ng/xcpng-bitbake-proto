
PN = "perl-IO-String"
PE = "0"
PV = "1.08"
PR = "53.el10"
PACKAGES = "perl-IO-String perl-IO-String-tests"


URI_perl-IO-String = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-IO-String-1.08-53.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-IO-String = "
 perl-libs
 perl-vars
 perl-IO
 perl-Symbol
 perl-Data-Dumper
"

URI_perl-IO-String-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-IO-String-tests-1.08-53.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-IO-String-tests = "
 perl-Test
 perl-Test-Harness
 perl-libs
 perl-vars
 bash
 perl-interpreter
 perl-IO-String
"
