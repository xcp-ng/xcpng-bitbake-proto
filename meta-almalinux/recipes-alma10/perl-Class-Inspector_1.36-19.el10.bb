
inherit dnf-bridge

PN = "perl-Class-Inspector"
PE = "0"
PV = "1.36"
PR = "19.el10"
PACKAGES = "perl-Class-Inspector perl-Class-Inspector-tests"


URI_perl-Class-Inspector = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Class-Inspector-1.36-19.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Class-Inspector = " \
 perl-libs \
 perl-Class-Inspector \
 perl-PathTools \
 perl-Exporter \
 perl-base \
"

URI_perl-Class-Inspector-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Class-Inspector-tests-1.36-19.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Class-Inspector-tests = " \
 perl-constant \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-vars \
 perl-Class-Inspector \
 bash \
 perl-interpreter \
 perl-base \
"
