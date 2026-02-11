
inherit dnf-bridge

PN = "perl-Math-BigInt"
PE = "1"
PV = "2.0030.03"
PR = "3.el10"
PACKAGES = "perl-Math-BigInt perl-Math-BigInt-tests"


URI_perl-Math-BigInt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Math-BigInt-2.0030.03-3.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Math-BigInt = " \
 perl-constant \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Math-BigInt \
 perl-Carp \
 perl-Math-Complex \
 perl-overload \
 perl-Exporter \
"

URI_perl-Math-BigInt-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Math-BigInt-tests-2.0030.03-3.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Math-BigInt-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Math-BigInt \
 perl-Math-Complex \
 perl-overload \
 bash \
 perl-base \
 perl-interpreter \
 perl-Exporter \
 perl-lib \
"
