
inherit dnf-bridge

PN = "perl-bignum"
PE = "0"
PV = "0.67"
PR = "512.el10"
PACKAGES = "perl-bignum perl-bignum-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-bignum-0.67-512.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-bignum = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-bignum-0.67-512.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-bignum}"
RDEPENDS:perl-bignum = " \
 perl-constant \
 perl-Math-BigInt \
 perl-libs \
 perl-Carp \
 perl-overload \
 perl-Exporter \
"

URI_perl-bignum-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-bignum-tests-0.67-512.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-bignum-tests}"
RDEPENDS:perl-bignum-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 bash \
 perl-Math-BigInt-GMP \
 perl-interpreter \
 perl-bignum \
"
