
PN = "perl-Exporter-Tiny"
PE = "0"
PV = "1.006002"
PR = "7.el10"
PACKAGES = "perl-Exporter-Tiny perl-Exporter-Tiny-tests"


URI_perl-Exporter-Tiny = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Exporter-Tiny-1.006002-7.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Exporter-Tiny = " \
 perl-Exporter-Tiny \
 perl-libs \
 perl-Carp \
"

URI_perl-Exporter-Tiny-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Exporter-Tiny-tests-1.006002-7.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Exporter-Tiny-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Test-Warnings \
 perl-Test-Fatal \
 bash \
 perl-interpreter \
 perl-Exporter-Tiny \
 perl-Data-Dumper \
 perl-base \
 perl-lib \
"
