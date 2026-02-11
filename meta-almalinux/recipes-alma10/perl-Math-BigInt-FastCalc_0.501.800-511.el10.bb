
PN = "perl-Math-BigInt-FastCalc"
PE = "0"
PV = "0.501.800"
PR = "511.el10"
PACKAGES = "perl-Math-BigInt-FastCalc perl-Math-BigInt-FastCalc-tests"


URI_perl-Math-BigInt-FastCalc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Math-BigInt-FastCalc-0.501.800-511.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Math-BigInt-FastCalc = " \
 glibc \
 perl-Math-BigInt \
 perl-libs \
 perl-Carp \
"

URI_perl-Math-BigInt-FastCalc-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Math-BigInt-FastCalc-tests-0.501.800-511.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Math-BigInt-FastCalc-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Math-BigInt \
 perl-Math-BigInt-FastCalc \
 bash \
 perl-interpreter \
 perl-Exporter \
"
