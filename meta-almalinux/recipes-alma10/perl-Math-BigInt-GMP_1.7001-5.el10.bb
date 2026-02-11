
PN = "perl-Math-BigInt-GMP"
PE = "0"
PV = "1.7001"
PR = "5.el10"
PACKAGES = "perl-Math-BigInt-GMP perl-Math-BigInt-GMP-tests"


URI_perl-Math-BigInt-GMP = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Math-BigInt-GMP-1.7001-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Math-BigInt-GMP = " \
 glibc \
 gmp \
 perl-Math-BigInt \
 perl-libs \
"

URI_perl-Math-BigInt-GMP-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Math-BigInt-GMP-tests-1.7001-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Math-BigInt-GMP-tests = " \
 perl-threads \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Math-BigInt \
 bash \
 perl-Math-BigInt-GMP \
 perl-Exporter \
"
