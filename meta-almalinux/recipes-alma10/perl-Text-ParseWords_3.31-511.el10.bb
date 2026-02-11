
PN = "perl-Text-ParseWords"
PE = "0"
PV = "3.31"
PR = "511.el10"
PACKAGES = "perl-Text-ParseWords perl-Text-ParseWords-tests"


URI_perl-Text-ParseWords = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Text-ParseWords-3.31-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Text-ParseWords = " \
 perl-Exporter \
 perl-libs \
 perl-Carp \
"

URI_perl-Text-ParseWords-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Text-ParseWords-tests-3.31-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Text-ParseWords-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Scalar-List-Utils \
 perl-Text-ParseWords \
 bash \
 perl-interpreter \
"
