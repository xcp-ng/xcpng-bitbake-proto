
PN = "perl-Test-Output"
PE = "0"
PV = "1.03.4"
PR = "5.el10"
PACKAGES = "perl-Test-Output perl-Test-Output-tests"


URI_perl-Test-Output = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Test-Output-1.03.4-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test-Output = "
 perl-Exporter
 perl-libs
 perl-Test-Simple
 perl-Capture-Tiny
"

URI_perl-Test-Output-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Test-Output-tests-1.03.4-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test-Output-tests = "
 perl-Test-Harness
 perl-libs
 perl-Test-Simple
 perl-Carp
 bash
 perl-Test-Output
 perl-interpreter
"
