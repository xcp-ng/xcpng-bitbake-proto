
PN = "perl-File-ReadBackwards"
PE = "0"
PV = "1.06"
PR = "12.el10"
PACKAGES = "perl-File-ReadBackwards perl-File-ReadBackwards-tests"


URI_perl-File-ReadBackwards = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-File-ReadBackwards-1.06-12.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-ReadBackwards = " \
 perl-Fcntl \
 perl-Symbol \
 perl-libs \
 perl-Carp \
"

URI_perl-File-ReadBackwards-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-File-ReadBackwards-tests-1.06-12.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-ReadBackwards-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Carp \
 perl-Fcntl \
 bash \
 perl-interpreter \
 perl-File-ReadBackwards \
 perl-File-Temp \
"
