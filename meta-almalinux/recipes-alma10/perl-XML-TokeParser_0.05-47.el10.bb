
inherit dnf-bridge

PN = "perl-XML-TokeParser"
PE = "0"
PV = "0.05"
PR = "47.el10"
PACKAGES = "perl-XML-TokeParser perl-XML-TokeParser-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-XML-TokeParser-0.05-47.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-XML-TokeParser = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-XML-TokeParser-0.05-47.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-XML-TokeParser}"
RDEPENDS:perl-XML-TokeParser = " \
 perl-libs \
 perl-Carp \
 perl-vars \
 perl-IO \
 perl-XML-Catalog \
 perl-XML-Parser \
"

URI_perl-XML-TokeParser-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-XML-TokeParser-tests-0.05-47.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-XML-TokeParser-tests}"
RDEPENDS:perl-XML-TokeParser-tests = " \
 perl-Test \
 perl-Test-Harness \
 bash \
 perl-XML-TokeParser \
 perl-interpreter \
"
