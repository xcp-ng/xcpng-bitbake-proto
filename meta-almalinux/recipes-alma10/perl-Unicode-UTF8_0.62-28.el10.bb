
inherit dnf-bridge

PN = "perl-Unicode-UTF8"
PE = "0"
PV = "0.62"
PR = "28.el10"
PACKAGES = "perl-Unicode-UTF8 perl-Unicode-UTF8-tests"


URI_perl-Unicode-UTF8 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Unicode-UTF8-0.62-28.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Unicode-UTF8 = " \
 glibc \
 perl-Exporter \
 perl-libs \
"

URI_perl-Unicode-UTF8-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Unicode-UTF8-tests-0.62-28.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Unicode-UTF8-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Carp \
 perl-Scalar-List-Utils \
 perl-IO \
 perl-Unicode-UTF8 \
 perl-Encode \
 bash \
 perl-interpreter \
 perl-Test-Fatal \
 perl-lib \
"
