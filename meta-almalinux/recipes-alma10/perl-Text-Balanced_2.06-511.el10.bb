
inherit dnf-bridge

PN = "perl-Text-Balanced"
PE = "0"
PV = "2.06"
PR = "511.el10"
PACKAGES = "perl-Text-Balanced perl-Text-Balanced-tests"


URI_perl-Text-Balanced = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Text-Balanced-2.06-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Text-Balanced = " \
 perl-libs \
 perl-Carp \
 perl-vars \
 perl-overload \
 perl-Exporter \
"

URI_perl-Text-Balanced-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Text-Balanced-tests-2.06-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Text-Balanced-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Text-Balanced \
 bash \
 perl-interpreter \
"
