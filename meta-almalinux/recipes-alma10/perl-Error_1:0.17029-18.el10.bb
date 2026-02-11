
inherit dnf-bridge

PN = "perl-Error"
PE = "1"
PV = "0.17029"
PR = "18.el10"
PACKAGES = "perl-Error perl-Error-tests"


URI_perl-Error = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Error-0.17029-18.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Error = " \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Carp \
 perl-vars \
 perl-overload \
 perl-Error \
 perl-Exporter \
"

URI_perl-Error-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Error-tests-0.17029-18.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Error-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-vars \
 perl-IO \
 perl-IPC-Open3 \
 bash \
 perl-PathTools \
 perl-Error \
 perl-interpreter \
 perl-base \
 perl-lib \
"
