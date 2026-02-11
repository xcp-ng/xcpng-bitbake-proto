
PN = "perl-XML-SAX-Base"
PE = "0"
PV = "1.09"
PR = "25.el10"
PACKAGES = "perl-XML-SAX-Base perl-XML-SAX-Base-tests"


URI_perl-XML-SAX-Base = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-XML-SAX-Base-1.09-25.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-XML-SAX-Base = " \
 perl-libs \
 perl-Carp \
 perl-vars \
 perl-overload \
 perl-XML-SAX-Base \
"

URI_perl-XML-SAX-Base-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-XML-SAX-Base-tests-1.09-25.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-XML-SAX-Base-tests = " \
 perl-Test \
 perl-Test-Harness \
 perl-libs \
 perl-vars \
 bash \
 perl-XML-SAX-Base \
 perl-interpreter \
 perl-base \
"
