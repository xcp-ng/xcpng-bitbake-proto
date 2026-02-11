
inherit dnf-bridge

PN = "perl-IO-Tty"
PE = "0"
PV = "1.20"
PR = "7.el10"
PACKAGES = "perl-IO-Tty perl-IO-Tty-tests"


URI_perl-IO-Tty = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-IO-Tty-1.20-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-IO-Tty = " \
 perl-IO-Tty \
 perl-libs \
 perl-Carp \
 perl-vars \
 perl-IO \
 perl-POSIX \
 perl-DynaLoader \
 glibc \
 perl-Exporter \
"

URI_perl-IO-Tty-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-IO-Tty-tests-1.20-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-IO-Tty-tests = " \
 perl-IO-Tty \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-POSIX \
 bash \
 perl-interpreter \
"
