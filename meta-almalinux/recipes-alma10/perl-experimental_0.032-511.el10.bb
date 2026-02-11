
PN = "perl-experimental"
PE = "0"
PV = "0.032"
PR = "511.el10"
PACKAGES = "perl-experimental perl-experimental-tests"


URI_perl-experimental = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-experimental-0.032-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-experimental = "
 perl-experimental
 perl-libs
 perl-Carp
 perl-version
"

URI_perl-experimental-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-experimental-tests-0.032-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-experimental-tests = "
 perl-Test-Harness
 perl-libs
 perl-Test-Simple
 perl-experimental
 bash
 perl-interpreter
"
