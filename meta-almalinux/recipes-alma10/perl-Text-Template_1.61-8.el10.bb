
inherit dnf-bridge

PN = "perl-Text-Template"
PE = "0"
PV = "1.61"
PR = "8.el10"
PACKAGES = "perl-Text-Template perl-Text-Template-tests"


URI_perl-Text-Template = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Text-Template-1.61-8.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Text-Template = " \
 perl-libs \
 perl-Carp \
 perl-Text-Template \
 perl-Exporter \
 perl-base \
"

URI_perl-Text-Template-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Text-Template-tests-1.61-8.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Text-Template-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-vars \
 perl-Text-Template \
 perl-Encode \
 perl-File-Temp \
 bash \
 perl-interpreter \
 perl-lib \
"
