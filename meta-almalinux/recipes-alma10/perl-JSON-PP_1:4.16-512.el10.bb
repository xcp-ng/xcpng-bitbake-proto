
inherit dnf-bridge

PN = "perl-JSON-PP"
PE = "1"
PV = "4.16"
PR = "512.el10"
PACKAGES = "perl-JSON-PP perl-JSON-PP-tests"


URI_perl-JSON-PP = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-JSON-PP-4.16-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-JSON-PP = " \
 perl-constant \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Carp \
 perl-interpreter \
 perl-Math-BigInt \
 perl-Getopt-Long \
 perl-Encode \
 perl-overload \
 perl-JSON-PP \
 perl-Exporter \
 perl-Data-Dumper \
"

URI_perl-JSON-PP-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-JSON-PP-tests-4.16-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-JSON-PP-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-vars \
 perl-Encode \
 perl-overload \
 bash \
 perl-Tie \
 perl-JSON-PP \
 perl-interpreter \
 perl-Data-Dumper \
"
