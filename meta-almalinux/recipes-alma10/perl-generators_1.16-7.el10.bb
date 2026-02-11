
inherit dnf-bridge

PN = "perl-generators"
PE = "0"
PV = "1.16"
PR = "7.el10"
PACKAGES = "perl-generators perl-generators-tests"


URI_perl-generators = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-generators-1.16-7.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-generators = " \
 perl-interpreter \
 perl-macros \
 perl-Fedora-VSP \
 perl-File-Basename \
"

URI_perl-generators-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-generators-tests-1.16-7.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-generators-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 bash \
 perl-generators \
 perl-interpreter \
 perl-Exporter \
 perl-lib \
"
