
PN = "perl-Import-Into"
PE = "0"
PV = "1.002005"
PR = "29.el10"
PACKAGES = "perl-Import-Into perl-Import-Into-tests"


URI_perl-Import-Into = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Import-Into-1.002005-29.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Import-Into = " \
 perl-Module-Runtime \
 perl-libs \
"

URI_perl-Import-Into-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Import-Into-tests-1.002005-29.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Import-Into-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Import-Into \
 bash \
 perl-base \
 perl-interpreter \
 perl-Exporter \
"
