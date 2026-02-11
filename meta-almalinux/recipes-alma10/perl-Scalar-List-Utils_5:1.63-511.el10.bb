
PN = "perl-Scalar-List-Utils"
PE = "5"
PV = "1.63"
PR = "511.el10"
PACKAGES = "perl-Scalar-List-Utils perl-Scalar-List-Utils-tests"


URI_perl-Scalar-List-Utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Scalar-List-Utils-1.63-511.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Scalar-List-Utils = " \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Carp \
 glibc \
 perl-Exporter \
"

URI_perl-Scalar-List-Utils-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Scalar-List-Utils-tests-1.63-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Scalar-List-Utils-tests = " \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-overload \
 perl-Symbol \
 perl-B \
 perl-threads \
 perl-threads-shared \
 perl-Test-Harness \
 perl-Test-Simple \
 perl-Carp \
 perl-vars \
 perl-IO \
 perl-Tie \
 perl-Math-BigInt \
 bash \
 perl-base \
 perl-constant \
 perl-if \
 perl-interpreter \
"
