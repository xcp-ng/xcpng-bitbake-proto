
PN = "perl-XML-Catalog"
PE = "0"
PV = "1.03"
PR = "32.el10"
PACKAGES = "perl-XML-Catalog perl-XML-Catalog-tests"


URI_perl-XML-Catalog = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-XML-Catalog-1.03-32.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-XML-Catalog = " \
 perl-libs \
 perl-libwww-perl \
 perl-vars \
 perl-URI \
 perl-Text-ParseWords \
 perl-XML-Parser \
"

URI_perl-XML-Catalog-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-XML-Catalog-tests-1.03-32.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-XML-Catalog-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-XML-Catalog \
 bash \
 perl-PathTools \
 perl-interpreter \
"
