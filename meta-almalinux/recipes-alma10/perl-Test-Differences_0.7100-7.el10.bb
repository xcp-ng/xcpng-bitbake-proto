
PN = "perl-Test-Differences"
PE = "0"
PV = "0.7100"
PR = "7.el10"
PACKAGES = "perl-Test-Differences perl-Test-Differences-tests"


URI_perl-Test-Differences = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Test-Differences-0.7100-7.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test-Differences = " \
 perl-constant \
 perl-libs \
 perl-Carp \
 perl-Text-Diff \
 perl-B \
 perl-Exporter \
 perl-Data-Dumper \
"

URI_perl-Test-Differences-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Test-Differences-tests-0.7100-7.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test-Differences-tests = " \
 perl-Test \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Capture-Tiny \
 bash \
 perl-interpreter \
 perl-Test-Differences \
 perl-Data-Dumper \
 perl-Exporter \
 perl-lib \
"
