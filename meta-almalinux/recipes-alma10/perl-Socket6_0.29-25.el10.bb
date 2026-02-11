
inherit dnf-bridge

PN = "perl-Socket6"
PE = "0"
PV = "0.29"
PR = "25.el10"
PACKAGES = "perl-Socket6 perl-Socket6-tests"


URI_perl-Socket6 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Socket6-0.29-25.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Socket6 = " \
 perl-libs \
 perl-Carp \
 perl-vars \
 perl-DynaLoader \
 glibc \
 perl-Exporter \
 perl-base \
"

URI_perl-Socket6-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Socket6-tests-0.29-25.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Socket6-tests = " \
 perl-Test \
 perl-Test-Harness \
 perl-libs \
 perl-Socket \
 perl-Socket6 \
 bash \
 perl-interpreter \
"
