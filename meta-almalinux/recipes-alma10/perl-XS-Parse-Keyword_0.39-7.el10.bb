
inherit dnf-bridge

PN = "perl-XS-Parse-Keyword"
PE = "0"
PV = "0.39"
PR = "7.el10"
PACKAGES = "perl-XS-Parse-Keyword perl-XS-Parse-Keyword-Builder perl-XS-Parse-Keyword-tests"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/perl-XS-Parse-Keyword-0.39-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-XS-Parse-Keyword = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-XS-Parse-Keyword-0.39-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_perl-XS-Parse-Keyword}"
RDEPENDS:perl-XS-Parse-Keyword = " \
 glibc \
 perl-XS-Parse-Keyword \
 perl-libs \
"

URI_perl-XS-Parse-Keyword-Builder = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-XS-Parse-Keyword-Builder-0.39-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_perl-XS-Parse-Keyword-Builder}"
RDEPENDS:perl-XS-Parse-Keyword-Builder = " \
 perl-constant \
 perl-libs \
 perl-XS-Parse-Keyword \
 perl-interpreter \
 perl-XS-Parse-Keyword-Builder \
"

URI_perl-XS-Parse-Keyword-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-XS-Parse-Keyword-tests-0.39-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_perl-XS-Parse-Keyword-tests}"
RDEPENDS:perl-XS-Parse-Keyword-tests = " \
 perl-constant \
 perl-Test-Harness \
 perl-libs \
 perl-Test2-Suite \
 perl-XS-Parse-Keyword \
 perl-B \
 perl-overload \
 bash \
 glibc \
 perl-interpreter \
 perl-lib \
"
