
PN = "perl-constant"
PE = "0"
PV = "1.33"
PR = "512.el10"
PACKAGES = "perl-constant perl-constant-tests"


URI_perl-constant = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-constant-1.33-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-constant = "
 perl-libs
 perl-Carp
"

URI_perl-constant-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-constant-tests-1.33-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-constant-tests = "
 perl-constant
 perl-Test-Harness
 perl-libs
 perl-Test-Simple
 perl-vars
 bash
 perl-interpreter
"
