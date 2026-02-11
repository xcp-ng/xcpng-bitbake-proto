
PN = "perl-Role-Tiny"
PE = "0"
PV = "2.002004"
PR = "14.el10"
PACKAGES = "perl-Role-Tiny perl-Role-Tiny-tests"


URI_perl-Role-Tiny = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Role-Tiny-2.002004-14.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Role-Tiny = "
 perl-libs
 perl-Carp
 perl-mro
 perl-Class-Method-Modifiers
 perl-Role-Tiny
 perl-Exporter
"

URI_perl-Role-Tiny-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Role-Tiny-tests-2.002004-14.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Role-Tiny-tests = "
 perl-constant
 perl-Test-Harness
 perl-libs
 perl-Test-Simple
 perl-overload
 bash
 perl-base
 perl-Role-Tiny
 perl-B
 perl-interpreter
 perl-Exporter
 perl-lib
"
