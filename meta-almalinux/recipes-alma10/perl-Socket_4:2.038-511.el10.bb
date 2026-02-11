
PN = "perl-Socket"
PE = "4"
PV = "2.038"
PR = "511.el10"
PACKAGES = "perl-Socket perl-Socket-tests"


URI_perl-Socket = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Socket-2.038-511.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Socket = " \
 glibc \
 perl-Exporter \
 perl-libs \
 perl-Carp \
"

URI_perl-Socket-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Socket-tests-2.038-511.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Socket-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Socket \
 bash \
 perl-Errno \
 perl-interpreter \
"
