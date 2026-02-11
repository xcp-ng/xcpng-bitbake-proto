
PN = "perl-Package-Generator"
PE = "0"
PV = "1.106"
PR = "34.el10"
PACKAGES = "perl-Package-Generator perl-Package-Generator-tests"


URI_perl-Package-Generator = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Package-Generator-1.106-34.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Package-Generator = " \
 perl-Symbol \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Carp \
"

URI_perl-Package-Generator-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Package-Generator-tests-1.106-34.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Package-Generator-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Package-Generator \
 bash \
 perl-interpreter \
"
