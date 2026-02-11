
PN = "perl-Pod-Simple"
PE = "1"
PV = "3.45"
PR = "511.el10"
PACKAGES = "perl-Pod-Simple perl-Pod-Simple-tests"


URI_perl-Pod-Simple = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Pod-Simple-3.45-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Pod-Simple = " \
 perl-libs \
 perl-Carp \
 perl-Text-Tabs+Wrap \
 perl-Getopt-Long \
 perl-File-Basename \
 perl-Encode \
 perl-overload \
 perl-Symbol \
 perl-PathTools \
 perl-if \
 perl-Pod-Escapes \
 perl-Pod-Simple \
"

URI_perl-Pod-Simple-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Pod-Simple-tests-3.45-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Pod-Simple-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-vars \
 perl-FindBin \
 perl-File-Basename \
 bash \
 perl-PathTools \
 perl-base \
 perl-File-Find \
 perl-interpreter \
 perl-File-Path \
 perl-Data-Dumper \
 perl-Exporter \
 perl-Pod-Simple \
"
