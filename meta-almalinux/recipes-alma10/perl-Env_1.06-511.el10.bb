
PN = "perl-Env"
PE = "0"
PV = "1.06"
PR = "511.el10"
PACKAGES = "perl-Env perl-Env-tests"


URI_perl-Env = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Env-1.06-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Env = "
 perl-libs
 perl-Tie
"

URI_perl-Env-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Env-tests-1.06-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Env-tests = "
 perl-Test-Harness
 perl-libs
 perl-Test-Simple
 perl-vars
 bash
 perl-Env
 perl-interpreter
"
