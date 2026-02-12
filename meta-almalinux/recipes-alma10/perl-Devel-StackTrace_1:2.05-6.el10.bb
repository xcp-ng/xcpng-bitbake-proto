
inherit dnf-bridge

PN = "perl-Devel-StackTrace"
PE = "1"
PV = "2.05"
PR = "6.el10"
PACKAGES = "perl-Devel-StackTrace perl-Devel-StackTrace-tests"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/perl-Devel-StackTrace-2.05-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Devel-StackTrace = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Devel-StackTrace-2.05-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Devel-StackTrace}"
RDEPENDS:perl-Devel-StackTrace = " \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-overload \
 perl-PathTools \
 perl-Devel-StackTrace \
"

URI_perl-Devel-StackTrace-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Devel-StackTrace-tests-2.05-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Devel-StackTrace-tests}"
RDEPENDS:perl-Devel-StackTrace-tests = " \
 perl-Test \
 perl-Test-Harness \
 perl-libs \
 perl-ExtUtils-MakeMaker \
 perl-Test-Simple \
 perl-overload \
 perl-PathTools \
 bash \
 perl-Devel-StackTrace \
 perl-interpreter \
 perl-base \
"
