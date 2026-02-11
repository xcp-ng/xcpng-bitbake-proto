
PN = "perl-List-MoreUtils-XS"
PE = "0"
PV = "0.430"
PR = "18.el10"
PACKAGES = "perl-List-MoreUtils-XS perl-List-MoreUtils-XS-tests"


URI_perl-List-MoreUtils-XS = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-List-MoreUtils-XS-0.430-18.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-List-MoreUtils-XS = " \
 glibc \
 perl-libs \
 perl-base \
 perl-vars \
"

URI_perl-List-MoreUtils-XS-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-List-MoreUtils-XS-tests-0.430-18.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-List-MoreUtils-XS-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Carp \
 perl-Scalar-List-Utils \
 perl-Math-Complex \
 perl-POSIX \
 perl-overload \
 bash \
 perl-base \
 perl-Tie \
 perl-interpreter \
 perl-List-MoreUtils-XS \
 perl-Exporter \
 perl-lib \
"
