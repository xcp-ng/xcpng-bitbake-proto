
inherit dnf-bridge

PN = "perl-Pod-Escapes"
PE = "1"
PV = "1.07"
PR = "511.el10"
PACKAGES = "perl-Pod-Escapes perl-Pod-Escapes-tests"


URI_perl-Pod-Escapes = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Pod-Escapes-1.07-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Pod-Escapes = " \
 perl-Exporter \
 perl-libs \
 perl-vars \
"

URI_perl-Pod-Escapes-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Pod-Escapes-tests-1.07-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Pod-Escapes-tests = " \
 perl-Test \
 perl-Test-Harness \
 perl-libs \
 bash \
 perl-Pod-Escapes \
 perl-interpreter \
"
