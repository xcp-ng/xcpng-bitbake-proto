
inherit dnf-bridge

PN = "perl-Data-OptList"
PE = "0"
PV = "0.114"
PR = "7.el10"
PACKAGES = "perl-Data-OptList perl-Data-OptList-tests"


URI_perl-Data-OptList = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Data-OptList-0.114-7.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Data-OptList = " \
 perl-Sub-Install \
 perl-Params-Util \
 perl-Scalar-List-Utils \
 perl-libs \
"

URI_perl-Data-OptList-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Data-OptList-tests-0.114-7.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Data-OptList-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-ExtUtils-MakeMaker \
 perl-Test-Simple \
 perl-Sub-Install \
 perl-PathTools \
 bash \
 perl-interpreter \
 perl-Data-OptList \
"
