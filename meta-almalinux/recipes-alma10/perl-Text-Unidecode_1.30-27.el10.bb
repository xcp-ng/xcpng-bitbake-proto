
PN = "perl-Text-Unidecode"
PE = "0"
PV = "1.30"
PR = "27.el10"
PACKAGES = "perl-Text-Unidecode perl-Text-Unidecode-tests"


URI_perl-Text-Unidecode = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Text-Unidecode-1.30-27.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Text-Unidecode = " \
 perl-Exporter \
 perl-libs \
 perl-vars \
"

URI_perl-Text-Unidecode-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Text-Unidecode-tests-1.30-27.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Text-Unidecode-tests = " \
 perl-Test \
 perl-Test-Harness \
 perl-libs \
 perl-Text-Tabs+Wrap \
 perl-Text-Unidecode \
 bash \
 perl-interpreter \
"
