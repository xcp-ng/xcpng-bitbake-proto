
PN = "perl-Test-Inter"
PE = "0"
PV = "1.10"
PR = "5.el10"
PACKAGES = "perl-Test-Inter perl-Test-Inter-tests"


URI_perl-Test-Inter = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Test-Inter-1.10-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test-Inter = " \
 perl-libs \
 perl-IO \
 perl-File-Basename \
 perl-PathTools \
 perl-lib \
"

URI_perl-Test-Inter-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Test-Inter-tests-1.10-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test-Inter-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Inter \
 bash \
 perl-interpreter \
 perl-lib \
"
