
inherit dnf-bridge

PN = "perl-Test-Deep"
PE = "0"
PV = "1.204"
PR = "9.el10"
PACKAGES = "perl-Test-Deep perl-Test-Deep-tests"


URI_perl-Test-Deep = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Test-Deep-1.204-9.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test-Deep = " \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Carp \
 perl-Test-Simple \
 perl-Test-Deep \
 perl-overload \
 perl-Exporter \
 perl-base \
"

URI_perl-Test-Deep-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Test-Deep-tests-1.204-9.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test-Deep-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Scalar-List-Utils \
 perl-Test-Deep \
 perl-Test-Simple \
 perl-overload \
 bash \
 perl-if \
 perl-interpreter \
 perl-base \
 perl-lib \
"
