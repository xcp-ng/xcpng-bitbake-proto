
inherit dnf-bridge

PN = "perl-Class-XSAccessor"
PE = "0"
PV = "1.19"
PR = "37.el10"
PACKAGES = "perl-Class-XSAccessor perl-Class-XSAccessor-tests"


URI_perl-Class-XSAccessor = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Class-XSAccessor-1.19-37.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Class-XSAccessor = " \
 glibc \
 perl-Class-XSAccessor \
 perl-libs \
 perl-Carp \
"

URI_perl-Class-XSAccessor-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Class-XSAccessor-tests-1.19-37.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Class-XSAccessor-tests = " \
 perl-constant \
 perl-threads \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Class-XSAccessor \
 bash \
 perl-interpreter \
 perl-Data-Dumper \
 perl-Time-HiRes \
"
