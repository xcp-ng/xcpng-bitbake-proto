
inherit dnf-bridge

PN = "perl-TermReadKey"
PE = "0"
PV = "2.38"
PR = "24.el10"
PACKAGES = "perl-TermReadKey perl-TermReadKey-tests"


URI_perl-TermReadKey = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-TermReadKey-2.38-24.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-TermReadKey = " \
 perl-libs \
 perl-vars \
 perl-DynaLoader \
 glibc \
 perl-Exporter \
"

URI_perl-TermReadKey-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-TermReadKey-tests-2.38-24.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-TermReadKey-tests = " \
 perl-TermReadKey \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Fcntl \
 bash \
 perl-interpreter \
"
