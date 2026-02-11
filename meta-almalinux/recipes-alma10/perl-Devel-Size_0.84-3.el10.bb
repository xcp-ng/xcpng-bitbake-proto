
PN = "perl-Devel-Size"
PE = "0"
PV = "0.84"
PR = "3.el10"
PACKAGES = "perl-Devel-Size perl-Devel-Size-tests"


URI_perl-Devel-Size = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Devel-Size-0.84-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Devel-Size = " \
 glibc \
 perl-Exporter \
 perl-libs \
 perl-vars \
"

URI_perl-Devel-Size-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Devel-Size-tests-0.84-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Devel-Size-tests = " \
 perl-constant \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-vars \
 perl-Scalar-List-Utils \
 perl-Devel-Size \
 bash \
 perl-Tie \
 perl-interpreter \
"
