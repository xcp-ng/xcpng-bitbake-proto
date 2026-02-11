
inherit dnf-bridge

PN = "perl-Data-Dump"
PE = "0"
PV = "1.25"
PR = "13.el10"
PACKAGES = "perl-Data-Dump perl-Data-Dump-tests"


URI_perl-Data-Dump = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Data-Dump-1.25-13.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Data-Dump = " \
 perl-subs \
 perl-libs \
 perl-Carp \
 perl-vars \
 perl-overload \
 perl-Term-ANSIColor \
 perl-Exporter \
 perl-Data-Dump \
 perl-base \
"

URI_perl-Data-Dump-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Data-Dump-tests-1.25-13.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Data-Dump-tests = " \
 perl-Test \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-vars \
 perl-IO \
 perl-Symbol \
 bash \
 perl-interpreter \
 perl-Data-Dump \
"
