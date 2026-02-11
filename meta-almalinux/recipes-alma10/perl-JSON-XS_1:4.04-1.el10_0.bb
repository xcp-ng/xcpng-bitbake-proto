
PN = "perl-JSON-XS"
PE = "1"
PV = "4.04"
PR = "1.el10_0"
PACKAGES = "perl-JSON-XS perl-JSON-XS-tests"


URI_perl-JSON-XS = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-JSON-XS-4.04-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-JSON-XS = " \
 perl-libs \
 perl-interpreter \
 perl-JSON-XS \
 perl-Types-Serialiser \
 perl-Storable \
 perl-Getopt-Long \
 perl-common-sense \
 perl-Encode \
 glibc \
 perl-Exporter \
"

URI_perl-JSON-XS-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-JSON-XS-tests-4.04-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-JSON-XS-tests = " \
 perl-Test \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-JSON-XS \
 perl-Types-Serialiser \
 perl-Encode \
 bash \
 perl-Tie \
 perl-interpreter \
 perl-Data-Dumper \
"
