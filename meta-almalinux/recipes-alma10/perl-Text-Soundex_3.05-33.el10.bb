
inherit dnf-bridge

PN = "perl-Text-Soundex"
PE = "0"
PV = "3.05"
PR = "33.el10"
PACKAGES = "perl-Text-Soundex perl-Text-Soundex-tests"


URI_perl-Text-Soundex = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Text-Soundex-3.05-33.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Text-Soundex = " \
 perl-libs \
 perl-Carp \
 perl-deprecate \
 perl-Text-Unidecode \
 perl-if \
 glibc \
 perl-Exporter \
"

URI_perl-Text-Soundex-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Text-Soundex-tests-3.05-33.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Text-Soundex-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Text-Soundex \
 bash \
 perl-interpreter \
"
