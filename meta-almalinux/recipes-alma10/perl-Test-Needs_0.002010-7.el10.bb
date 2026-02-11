
PN = "perl-Test-Needs"
PE = "0"
PV = "0.002010"
PR = "7.el10"
PACKAGES = "perl-Test-Needs perl-Test-Needs-tests"


URI_perl-Test-Needs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Test-Needs-0.002010-7.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test-Needs = "
 perl-libs
"

URI_perl-Test-Needs-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Test-Needs-tests-0.002010-7.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test-Needs-tests = "
 perl-Test-Harness
 perl-libs
 perl-Test-Simple
 perl-IPC-Open3
 bash
 perl-Test-Needs
 perl-interpreter
 perl-lib
"
