
PN = "perl-Date-Calc"
PE = "0"
PV = "6.4"
PR = "30.el10"
PACKAGES = "perl-Date-Calc perl-Date-Calc-tests"


URI_perl-Date-Calc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Date-Calc-6.4-30.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Date-Calc = " \
 perl-libs \
 perl-Carp-Clan \
 perl-vars \
 perl-POSIX \
 perl-overload \
 perl-Exporter \
 perl-Bit-Vector \
 perl-Date-Calc \
"

URI_perl-Date-Calc-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Date-Calc-tests-6.4-30.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Date-Calc-tests = " \
 perl-Test-Harness \
 perl-libs \
 bash \
 perl-interpreter \
 perl-Date-Calc \
"
