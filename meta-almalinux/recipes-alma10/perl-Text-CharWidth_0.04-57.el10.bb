
inherit dnf-bridge

PN = "perl-Text-CharWidth"
PE = "0"
PV = "0.04"
PR = "57.el10"
PACKAGES = "perl-Text-CharWidth perl-Text-CharWidth-tests"


URI_perl-Text-CharWidth = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Text-CharWidth-0.04-57.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Text-CharWidth = " \
 glibc \
 perl-Exporter \
 perl-libs \
"

URI_perl-Text-CharWidth-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Text-CharWidth-tests-0.04-57.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Text-CharWidth-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Text-CharWidth \
 bash \
 perl-interpreter \
"
