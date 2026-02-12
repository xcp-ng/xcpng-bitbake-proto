
inherit dnf-bridge

PN = "perl-Syntax-Keyword-Try"
PE = "0"
PV = "0.29"
PR = "7.el10"
PACKAGES = "perl-Syntax-Keyword-Try perl-Syntax-Keyword-Try-tests"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/perl-Syntax-Keyword-Try-0.29-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Syntax-Keyword-Try = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Syntax-Keyword-Try-0.29-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_perl-Syntax-Keyword-Try}"
RDEPENDS:perl-Syntax-Keyword-Try = " \
 perl-constant \
 perl-libs \
 perl-Carp \
 perl-XS-Parse-Keyword \
 perl-B \
 glibc \
"

URI_perl-Syntax-Keyword-Try-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Syntax-Keyword-Try-tests-0.29-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_perl-Syntax-Keyword-Try-tests}"
RDEPENDS:perl-Syntax-Keyword-Try-tests = " \
 perl-threads \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Test2-Suite \
 perl-overload \
 bash \
 perl-B \
 perl-Syntax-Keyword-Try \
 perl-interpreter \
"
