
inherit dnf-bridge

PN = "perl-parent"
PE = "1"
PV = "0.241"
PR = "512.el10"
PACKAGES = "perl-parent perl-parent-tests"


URI_perl-parent = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-parent-0.241-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-parent = " \
 perl-libs \
"

URI_perl-parent-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-parent-tests-0.241-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-parent-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 bash \
 perl-parent \
 perl-interpreter \
 perl-lib \
"
