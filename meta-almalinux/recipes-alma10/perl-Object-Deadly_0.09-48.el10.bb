
PN = "perl-Object-Deadly"
PE = "0"
PV = "0.09"
PR = "48.el10"
PACKAGES = "perl-Object-Deadly perl-Object-Deadly-tests"


URI_perl-Object-Deadly = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Object-Deadly-0.09-48.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Object-Deadly = "
 perl-Scalar-List-Utils
 perl-libs
 perl-Carp-Clan
 perl-vars
 perl-Object-Deadly
 perl-overload
 perl-English
 perl-Devel-StackTrace
 perl-Devel-Symdump
 perl-B
"

URI_perl-Object-Deadly-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Object-Deadly-tests-0.09-48.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Object-Deadly-tests = "
 perl-Test-Harness
 perl-Test-Simple
 perl-Scalar-List-Utils
 perl-overload
 perl-Symbol
 bash
 perl-Object-Deadly
 perl-interpreter
 perl-Test-Exception
"
