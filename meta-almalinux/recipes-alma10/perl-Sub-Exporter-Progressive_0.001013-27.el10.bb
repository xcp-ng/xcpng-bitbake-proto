
PN = "perl-Sub-Exporter-Progressive"
PE = "0"
PV = "0.001013"
PR = "27.el10"
PACKAGES = "perl-Sub-Exporter-Progressive perl-Sub-Exporter-Progressive-tests"


URI_perl-Sub-Exporter-Progressive = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Sub-Exporter-Progressive-0.001013-27.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Sub-Exporter-Progressive = " \
 perl-Exporter \
 perl-libs \
 perl-Carp \
 perl-Sub-Exporter \
"

URI_perl-Sub-Exporter-Progressive-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Sub-Exporter-Progressive-tests-0.001013-27.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Sub-Exporter-Progressive-tests = " \
 perl-constant \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Carp \
 bash \
 perl-Sub-Exporter-Progressive \
 perl-interpreter \
 perl-lib \
"
