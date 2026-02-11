
PN = "perl-FCGI"
PE = "1"
PV = "0.82"
PR = "13.1.el10_0"
PACKAGES = "perl-FCGI perl-FCGI-tests"


URI_perl-FCGI = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-FCGI-0.82-13.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-FCGI = " \
 glibc \
 perl-libs \
 perl-Carp \
"

URI_perl-FCGI-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-FCGI-tests-0.82-13.1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-FCGI-tests = " \
 perl-Test \
 perl-Test-Harness \
 perl-FCGI \
 bash \
 perl-interpreter \
"
