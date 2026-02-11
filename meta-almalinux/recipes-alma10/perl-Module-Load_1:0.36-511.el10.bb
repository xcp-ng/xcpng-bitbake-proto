
inherit dnf-bridge

PN = "perl-Module-Load"
PE = "1"
PV = "0.36"
PR = "511.el10"
PACKAGES = "perl-Module-Load perl-Module-Load-tests"


URI_perl-Module-Load = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Module-Load-0.36-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-Load = " \
 perl-PathTools \
 perl-libs \
"

URI_perl-Module-Load-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Module-Load-tests-0.36-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-Load-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-vars \
 perl-Module-Load \
 bash \
 perl-interpreter \
 perl-Data-Dumper \
 perl-Exporter \
 perl-lib \
"
