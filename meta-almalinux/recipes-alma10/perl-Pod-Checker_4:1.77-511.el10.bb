
inherit dnf-bridge

PN = "perl-Pod-Checker"
PE = "4"
PV = "1.77"
PR = "511.el10"
PACKAGES = "perl-Pod-Checker perl-Pod-Checker-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-Pod-Checker-1.77-511.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Pod-Checker = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Pod-Checker-1.77-511.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Pod-Checker}"
RDEPENDS:perl-Pod-Checker = " \
 perl-libs \
 perl-Carp \
 perl-interpreter \
 perl-Getopt-Long \
 perl-Pod-Checker \
 perl-Exporter \
 perl-base \
 perl-Pod-Simple \
 perl-Pod-Usage \
"

URI_perl-Pod-Checker-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Pod-Checker-tests-1.77-511.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Pod-Checker-tests}"
RDEPENDS:perl-Pod-Checker-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Carp \
 perl-vars \
 perl-FileHandle \
 perl-File-Basename \
 bash \
 perl-PathTools \
 perl-Pod-Checker \
 perl-interpreter \
 perl-Exporter \
"
