
PN = "perl-TimeDate"
PE = "1"
PV = "2.33"
PR = "16.el10"
PACKAGES = "perl-TimeDate perl-TimeDate-tests"


URI_perl-TimeDate = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-TimeDate-2.33-16.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-TimeDate = " \
 perl-TimeDate \
 perl-libs \
 perl-Carp \
 perl-vars \
 perl-Exporter \
 perl-base \
 perl-Time-Local \
"

URI_perl-TimeDate-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-TimeDate-tests-2.33-16.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-TimeDate-tests = " \
 perl-TimeDate \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 bash \
 perl-interpreter \
 perl-Time-Local \
"
